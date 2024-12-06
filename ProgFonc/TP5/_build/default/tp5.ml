(* Evaluation des expressions simples *)


(* Module abstrayant les expressions *)
module type ExprSimple =
sig
  type t
  val const : int -> t
  val plus : t -> t -> t
  val mult : t-> t -> t
end

(* Module réalisant l'évaluation d'une expression *)
module EvalSimple : ExprSimple with type t = int =
struct
  type t = int
  let const c = c
  let plus e1 e2 = e1 + e2
  let mult e1 e2 = e1 * e2
end


(* Solution 1 pour tester *)
(* A l'aide de foncteur *)

(* Définition des expressions *)
module ExemplesSimples (E:ExprSimple) =
struct
  (* 1+(2*3) *)
  let exemple1  = E.(plus (const 1) (mult (const 2) (const 3)) )
  (* (5+2)*(2*3) *)
  let exemple2 =  E.(mult (plus (const 5) (const 2)) (mult (const 2) (const 3)) )
end

(* Module d'évaluation des exemples *)
module EvalExemples =  ExemplesSimples (EvalSimple)

let%test _ = (EvalExemples.exemple1 = 7)
let%test _ = (EvalExemples.exemple2 = 42)


(*Exercie 1*)
(*PrintSimple: permet de convertir les expressions en chaîne de caractère.*)
module PrintSimple : ExprSimple with type t = string =
struct
  type t = string
  let const c = string_of_int c
  let plus e1 e2 = "("^e1^"+"^e2^")"
  let mult e1 e2 = "("^e1^"*"^e2^")"
end

(* Module d'évaluation des exemples *)
module EvalExemplesString =  ExemplesSimples (PrintSimple)

let%test _ = (EvalExemplesString.exemple1 = "(1+(2*3))")
let%test _ = (EvalExemplesString.exemple2 = "((5+2)*(2*3))")


(*Exercie 2*)
(*CompteSimple: permet de compter les opérations d'un expression*)
module CompteSimple : ExprSimple with type t = int =
struct
  type t = int
  let const _ = 0
  let plus e1 e2 = e1+e2+1
  let mult e1 e2 = e1+e2+1
end

(* Module d'évaluation des exemples *)
module EvalCompteSimple =  ExemplesSimples (CompteSimple)

let%test _ = (EvalCompteSimple.exemple1 = 2)
let%test _ = (EvalCompteSimple.exemple2 = 3)


(*Exercice 3*)
module type ExprVar =
sig
  type t
  val def : string -> t -> t -> t
  val var : string -> t
end

module type Expr =
sig
  type t
  include ExprSimple with type t := t
  include ExprVar with type t := t
end

(*Exercice 4*)
module PrintVar : ExprVar with type t = string =
struct
  type t = string
  let def c e1 e2 = "let "^c^" = "^e1^" in "^e2
  let var c = c
end

module Print : Expr with type t = string =
struct
  include PrintSimple
  include PrintVar
end

module ExemplesVar (E:Expr) =
struct
  (* let x = 1+2 in x*3 *)
  let exemple1  = E.(def "x" (plus (const 1) (const 2)) (mult (var "x") (const 3)))
end

module EvalPrint =  ExemplesVar (Print)
let%test _ = (EvalPrint.exemple1 = "let x = (1+2) in (x*3)")

module EvalPrint2 =  ExemplesSimples (Print)
let%test _ = (EvalPrint2.exemple1 = "(1+(2*3))")
let%test _ = (EvalPrint2.exemple2 = "((5+2)*(2*3))")

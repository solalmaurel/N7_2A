(*  Exercice à rendre **)
(*
pgcd : int -> in -> int
renvoie le pgcd de deux nombres entiers
a : premier entier
b : deuxième entier
précondition : a>0 b>0
postcondition :
*)

let rec pgcd a b =
  if a=b then a
  else if a > b then pgcd (a-b) b
  else pgcd a (a-b)


(*Avec une fonction auxiliaire pour lever la précondition*)
let pgcd a b =
  let rec pgcd_aux a b =
    if a=b then a
    else if a > b then pgcd_aux (a-b) b
    else pgcd_aux a (a-b)
  in pgcd_aux (abs a) (abs b)
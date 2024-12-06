(* Pour les tests *)
(* [eq_perm l l'] retourne true ssi [l] et [l']
   sont égales à à permutation près (pour (=)).
   [l'] ne doit pas contenir de doublon. *)
let eq_perm l l' =
  List.length l = List.length l' && List.for_all (fun x -> List.mem x l) l'


module type StructureDonnees =
sig

  (* Type permettant de stocker le dictionnaire *)
  type dico

  (* Dictionnaire vide *)
  val empty : dico

  (* Ajoute un mot et son encodage au dictionnaire *)
  (* premier parametre : l'encodage du mot *)
  (* deuxième paramètre : le mot *)
  (* troisième paramètre : le dictionnaire *)
  val ajouter : int list -> string -> dico -> dico

  (* Cherche tous les mots associés à un encodage dans un dictionnaire *)
  (* premier parametre : l'encodage du mot *)
  (* second paramètre : le dictionnaire *)
  val chercher : int list -> dico -> string list


  (* Calcule le nombre maximum de mots ayant le même encodage dans un
     dictionnaire *)
  (* paramètre : le dictionnaire *)
  val max_mots_code_identique : dico -> int

  (* Liste tous les mots d'un dictionnaire dont un prefixe de l'encodage est donné en paramètre *)
  (* premier paramètre : le prefixe de l'encodage *)
  (* second paramètre : le dictionnaire *)
  val prefixe : int list -> dico -> string list

end


module ListAssoc : StructureDonnees with type dico = (int list * string list) list =
struct
  type dico = (int list * string list) list

  (* Dictionnaire vide *)
  let empty = []

  (* Ajoute un mot et son encodage au dictionnaire *)
  (* premier parametre : l'encodage du mot *)
  (* deuxième paramètre : le mot *)
  (* troisième paramètre : le dictionnaire *)
  let ajouter enc mot dico =
  List.map(fun (e, s) -> if enc==e then (e, mot::s) else (e, s)) dico


  (* Cherche tous les mots associés à un encodage dans un dictionnaire *)
  (* premier parametre : l'encodage du mot *)
  (* second paramètre : le dictionnaire *)
  let rec chercher enc dico = match dico with
    | [] -> []
    | (e, s)::q -> if e==enc then s else chercher enc q 

  (* Calcule le nombre maximum de mots ayant le même encodage dans un
     dictionnaire *)
  (* paramètre : le dictionnaire *)
  let max_mots_code_identique dico =
    let rec max_aux dico m =
      match dico with
      | [] -> m
      | (_, s)::q -> if List.length s > m then max_aux q (List.length s)
      else max_aux q m
    in
    max_aux dico 0

  (* Liste tous les mots d'un dictionnaire dont un prefixe de l'encodage est donné en paramètre *)
  (* premier paramètre : le prefixe de l'encodage *)
  (* second paramètre : le dictionnaire *)
  let rec prefixe enc dico =
    let rec enc_in_e enc e = match enc, e with
    | [], _ -> true
    | _, [] -> false
    | t1::q1, t2::q2 -> if t1==t2 then enc_in_e q1 q2 else false
  in
  match dico with
  | [] -> []
  | (e,s)::q -> if enc_in_e enc e then s@prefixe enc q else prefixe enc q

  let%test _ = eq_perm (ajouter [2;2] "cc" [([2;2],["bb";"aa"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) [([2;2],["cc";"bb";"aa"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]
  let%test _ = eq_perm (ajouter [9;9] "xx" [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) [([9;9],["xx"]); ([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]
  
  let%test _ = eq_perm (chercher [2;2] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) ["bb";"aa";"cc"]
  let%test _ = eq_perm (chercher [3;3] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) []
  let%test _ = eq_perm (chercher [2;7;3;3] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) ["bref"]
  let%test _ = eq_perm (chercher [2;6;6] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) ["bon"]
  let%test _ = eq_perm (chercher [2;6;6] []) []


  let%test _ = max_mots_code_identique [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])] = 3
  let%test _ = max_mots_code_identique [([2;7;3;3],["bref"]);([2;2],["bb";"aa";"cc"]); ([2;6;6],["bon"])] = 3
  let%test _ = max_mots_code_identique [] = 0
  let%test _ = max_mots_code_identique [([2;7;3;3],["bref"]);([2;2],["bb"]); ([2;6;6],["bon"])] = 1

  let%test _ = eq_perm (prefixe [] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) ["bb";"aa";"cc";"bref";"bon"]
  let%test _ = eq_perm (prefixe [] [([2;7;3;3],["bref"]);([2;2],["bb";"aa";"cc"]); ([2;6;6],["bon"])]) ["bref";"bb";"aa";"cc";"bon"]
  let%test _ = eq_perm (prefixe [] []) []
  let%test _ = eq_perm (prefixe [] [([2;7;3;3],["bref"]);([2;2],["bb"]); ([2;6;6],["bon"])]) ["bref";"bb";"bon"]
  let%test _ = eq_perm (prefixe [2] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) ["bb";"aa";"cc";"bref";"bon"]
  let%test _ = eq_perm (prefixe [2;2] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;6;6],["bon"])]) ["bb";"aa";"cc"]
  let%test _ = eq_perm (prefixe [2;2] [([2;2],["bb";"aa";"cc"]); ([2;7;3;3],["bref"]);([2;2;2],["bac";"bab"]);([2;6;6],["bon"])]) ["bb";"aa";"cc";"bac";"bab"]
end

(*
module Arbre : StructureDonnees with type dico = Noeud of ( string list * ( int * dico) list ) =
struct
  type dico = Noeud of ( string list * ( int * dico) list )

  let dico = Noeud ([], [])

  let ajouter enc mot dico = match dico with
  | Noeud of

end
*)
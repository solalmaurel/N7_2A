open Assoc
open Arbre
open Chaines

(* le type trie :
    triplet arbre,
            fonction de décomposition mot -> liste de caractères,
            fonction de recomposition liste de caractères -> mot *)
type ('a,'b) trie = Trie of ('b arbre) * ('a -> 'b list) * ('b list -> 'a)

(******************************************************************************)
(*   fonction de création d'un nouveau trie                                   *)
(*   signature  : nouveau :                                                   *)
(*          ('a -> 'b list) -> ('b list -> 'a) -> ('a, 'b) trie = <fun>       *)
(*   paramètres : - une fonction de décomposition                             *)
(*                     mot -> liste de caractères                             *)
(*                -  une fonction de recomposition                            *)
(*                     liste de caractères -> mot                             *)
(*   résultat     : un nouveau trie "vide"                                    *)
(******************************************************************************)
let nouveau fd fr = Trie(Noeud(false,[]), fd, fr)

(******************************************************************************)
(*   fonction d'appartenance d'un élément à un trie                           *)
(*   signature  : appartient : 'a -> ('a, 'b) trie -> bool = <fun>            *)
(*   paramètres : - un mot                                                    *)
(*                - un trie                                                   *)
(*   résultat   : le résultat booléen du test                                 *)
(******************************************************************************)
(*
let appartient w (Trie(arbre,decomp,_)) =
  let lc = decomp w in appartient_arbre lc arbre


OU version compliqué (vue en TD) :*)

let appartient mot trie =
  let Trie(a,fd,_)= trie in
  let l_symb = fd mot in

  let rec appartient_arbre l_symb (Noeud(b,lb)) = match (l_symb,lb) with
    |([],_) -> b
    |(_,[]) -> false
    |(s::ql_symb,(s1,a_suivant)::qlb) ->
      if s = s1 then appartient_arbre ql_symb a_suivant
      else if s < s1 then false
      else appartient_arbre l_symb (Noeud(b,qlb))

  in appartient_arbre l_symb a


let%test "mot_vide" = appartient "" (Trie(Noeud(true,[]),decompose_chaine,recompose_chaine)) = true
let%test "ba" = appartient "as" (Trie(Noeud(false,[('a',Noeud(false,[('s',Noeud(true,[]));('t',Noeud(true,[]))]))]),decompose_chaine,recompose_chaine)) = true
let%test "non_a" = appartient "as" (Trie(Noeud(false,[('a',Noeud(false,[('s',Noeud(true,[]));('t',Noeud(true,[]))]))]),decompose_chaine,recompose_chaine)) = false

(******************************************************************************)
(*   fonction d'ajout d'un élément dans un trie                               *)
(*   signature  : ajout : 'a -> ('a, 'b) trie -> ('a, 'b) trie = <fun>        *)
(*   paramètres : - un mot                                                    *)
(*                - un trie                                                   *)
(*   résultat   : le trie avec le mot ajouté                                  *)
(******************************************************************************)
let ajout mot (Trie(arbre, decompose, recompose)) =
  Trie (ajout_arbre (decompose mot) arbre,decompose,recompose)

(*  Pour les tests *)
let trie_sujet =
  List.fold_right ajout
    ["bas"; "bât"; "de"; "la"; "lai"; "laid"; "lait"; "lard"; "le"; "les"; "long"]
    (nouveau decompose_chaine recompose_chaine)

(******************************************************************************)
(*   fonction de retrait d'un élément d'un trie                               *)
(*   signature  : trie_retrait : 'a -> ('a, 'b) trie -> ('a, 'b) trie = <fun> *)
(*   paramètres : - un mot                                                    *)
(*                - un trie                                                   *)
(*   résultat   : le trie avec le mot retiré                                  *)
(******************************************************************************)
let retrait mot (Trie(arbre, decompose, recompose)) =
  Trie(retrait_arbre (decompose mot) arbre, decompose recompose)

(******************************************************************************)
(*   fonction interne au Module qui génère la liste de tous les mots          *)
(*   d'un trie                                                                *)
(*   signature    : trie_dico : ('a, 'b) trie -> 'a list = <fun>              *)
(*   paramètre(s) : le trie                                                   *)
(*   résultat     : la liste des mots                                         *)
(******************************************************************************)
let trie_dico trie = failwith "trie_dico"

(******************************************************************************)
(* procédure d'affichage d'un trie                                            *)
(*   signature  : affiche : ('a -> unit) -> ('a, 'b) trie -> unit = <fun>     *)
(*   paramètres : - une procédure d'affichage d'un mot                        *)
(*                - un trie                                                   *)
(*   résultat   : aucun                                                       *)
(******************************************************************************)
let affiche p trie = failwith "TO DO affiche"

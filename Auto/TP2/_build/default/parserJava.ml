
module MenhirBasics = struct
  
  exception Error
  
  let _eRR =
    fun _s ->
      raise Error
  
  type token = 
    | VOID
    | VIRG
    | VIDE
    | TYPEIDENT of (
# 16 "parserJava.mly"
       (string)
# 18 "parserJava.ml"
  )
    | TANTQUE
    | STRING
    | SINON
    | SI
    | RETOUR
    | PTVIRG
    | PAROUV
    | PARFER
    | OPSUPEG
    | OPSUP
    | OPPT
    | OPPLUS
    | OPOU
    | OPNONEG
    | OPNON
    | OPMULT
    | OPMOINS
    | OPMOD
    | OPINFEG
    | OPINF
    | OPET
    | OPEG
    | OPDIV
    | NOUVEAU
    | INT
    | IMPORT
    | IDENT of (
# 16 "parserJava.mly"
       (string)
# 49 "parserJava.ml"
  )
    | FLOTTANT of (
# 23 "parserJava.mly"
       (float)
# 54 "parserJava.ml"
  )
    | FLOAT
    | FIN
    | ENTIER of (
# 22 "parserJava.mly"
       (int)
# 61 "parserJava.ml"
  )
    | CROOUV
    | CROFER
    | CHAR
    | CHAINE of (
# 26 "parserJava.mly"
       (string)
# 69 "parserJava.ml"
  )
    | CARACTERE of (
# 25 "parserJava.mly"
       (char)
# 74 "parserJava.ml"
  )
    | BOOLEEN of (
# 24 "parserJava.mly"
       (bool)
# 79 "parserJava.ml"
  )
    | BOOL
    | ASSIGN
    | ACCOUV
    | ACCFER
  
end

include MenhirBasics

# 1 "parserJava.mly"
  

(* Partie recopiee dans le fichier CaML genere. *)
(* Ouverture de modules exploites dans les actions *)
(* Declarations de types, de constantes, de fonctions, d'exceptions exploites dans les actions *)

(* let nbrVariables = ref 0;; *)

let nbrFonctions = ref 0;;


# 102 "parserJava.ml"

type ('s, 'r) _menhir_state = 
  | MenhirState000 : ('s, _menhir_box_fichier) _menhir_state
    (** State 000.
        Stack shape : .
        Start symbol: fichier. *)

  | MenhirState003 : (('s, _menhir_box_fichier) _menhir_cell1_VOID _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_state
    (** State 003.
        Stack shape : VOID IDENT.
        Start symbol: fichier. *)

  | MenhirState011 : (('s _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_state
    (** State 011.
        Stack shape : IDENT typeStruct IDENT.
        Start symbol: fichier. *)

  | MenhirState012 : ((('s, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_cell1_VIRG, _menhir_box_fichier) _menhir_state
    (** State 012.
        Stack shape : typeStruct IDENT VIRG.
        Start symbol: fichier. *)

  | MenhirState014 : (((('s, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_cell1_VIRG, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_state
    (** State 014.
        Stack shape : typeStruct IDENT VIRG typeStruct IDENT.
        Start symbol: fichier. *)

  | MenhirState025 : (('s, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_state
    (** State 025.
        Stack shape : typeStruct IDENT.
        Start symbol: fichier. *)

  | MenhirState030 : (('s, _menhir_box_fichier) _menhir_cell1_fonction, _menhir_box_fichier) _menhir_state
    (** State 030.
        Stack shape : fonction.
        Start symbol: fichier. *)

  | MenhirState032 : (('s, _menhir_box_fichier) _menhir_cell1_entete, _menhir_box_fichier) _menhir_state
    (** State 032.
        Stack shape : entete.
        Start symbol: fichier. *)

  | MenhirState033 : (('s, _menhir_box_fichier) _menhir_cell1_ACCOUV, _menhir_box_fichier) _menhir_state
    (** State 033.
        Stack shape : ACCOUV.
        Start symbol: fichier. *)

  | MenhirState034 : ((('s, _menhir_box_fichier) _menhir_cell1_ACCOUV, _menhir_box_fichier) _menhir_cell1_variables, _menhir_box_fichier) _menhir_state
    (** State 034.
        Stack shape : ACCOUV variables.
        Start symbol: fichier. *)

  | MenhirState036 : (('s, _menhir_box_fichier) _menhir_cell1_TANTQUE, _menhir_box_fichier) _menhir_state
    (** State 036.
        Stack shape : TANTQUE.
        Start symbol: fichier. *)

  | MenhirState037 : (('s, _menhir_box_fichier) _menhir_cell1_PAROUV, _menhir_box_fichier) _menhir_state
    (** State 037.
        Stack shape : PAROUV.
        Start symbol: fichier. *)

  | MenhirState045 : (('s, _menhir_box_fichier) _menhir_cell1_unaires, _menhir_box_fichier) _menhir_state
    (** State 045.
        Stack shape : unaires.
        Start symbol: fichier. *)

  | MenhirState046 : (('s, _menhir_box_fichier) _menhir_cell1_unaire, _menhir_box_fichier) _menhir_state
    (** State 046.
        Stack shape : unaire.
        Start symbol: fichier. *)

  | MenhirState067 : (('s, _menhir_box_fichier) _menhir_cell1_expression _menhir_cell0_binaire, _menhir_box_fichier) _menhir_state
    (** State 067.
        Stack shape : expression binaire.
        Start symbol: fichier. *)

  | MenhirState073 : (('s, _menhir_box_fichier) _menhir_cell1_unaires _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_state
    (** State 073.
        Stack shape : unaires IDENT.
        Start symbol: fichier. *)

  | MenhirState082 : (('s, _menhir_box_fichier) _menhir_cell1_unaires _menhir_cell0_contenu3, _menhir_box_fichier) _menhir_state
    (** State 082.
        Stack shape : unaires contenu3.
        Start symbol: fichier. *)

  | MenhirState083 : (('s, _menhir_box_fichier) _menhir_cell1_PAROUV, _menhir_box_fichier) _menhir_state
    (** State 083.
        Stack shape : PAROUV.
        Start symbol: fichier. *)

  | MenhirState086 : (('s, _menhir_box_fichier) _menhir_cell1_expressions, _menhir_box_fichier) _menhir_state
    (** State 086.
        Stack shape : expressions.
        Start symbol: fichier. *)

  | MenhirState090 : (('s, _menhir_box_fichier) _menhir_cell1_CROOUV, _menhir_box_fichier) _menhir_state
    (** State 090.
        Stack shape : CROOUV.
        Start symbol: fichier. *)

  | MenhirState094 : (('s, _menhir_box_fichier) _menhir_cell1_suffixe, _menhir_box_fichier) _menhir_state
    (** State 094.
        Stack shape : suffixe.
        Start symbol: fichier. *)

  | MenhirState097 : ((('s, _menhir_box_fichier) _menhir_cell1_TANTQUE, _menhir_box_fichier) _menhir_cell1_expression, _menhir_box_fichier) _menhir_state
    (** State 097.
        Stack shape : TANTQUE expression.
        Start symbol: fichier. *)

  | MenhirState100 : (('s, _menhir_box_fichier) _menhir_cell1_SI, _menhir_box_fichier) _menhir_state
    (** State 100.
        Stack shape : SI.
        Start symbol: fichier. *)

  | MenhirState102 : ((('s, _menhir_box_fichier) _menhir_cell1_SI, _menhir_box_fichier) _menhir_cell1_expression, _menhir_box_fichier) _menhir_state
    (** State 102.
        Stack shape : SI expression.
        Start symbol: fichier. *)

  | MenhirState104 : (((('s, _menhir_box_fichier) _menhir_cell1_SI, _menhir_box_fichier) _menhir_cell1_expression, _menhir_box_fichier) _menhir_cell1_bloc, _menhir_box_fichier) _menhir_state
    (** State 104.
        Stack shape : SI expression bloc.
        Start symbol: fichier. *)

  | MenhirState107 : (('s, _menhir_box_fichier) _menhir_cell1_RETOUR, _menhir_box_fichier) _menhir_state
    (** State 107.
        Stack shape : RETOUR.
        Start symbol: fichier. *)

  | MenhirState112 : (('s, _menhir_box_fichier) _menhir_cell1_instruction, _menhir_box_fichier) _menhir_state
    (** State 112.
        Stack shape : instruction.
        Start symbol: fichier. *)

  | MenhirState116 : (('s, _menhir_box_fichier) _menhir_cell1_variable, _menhir_box_fichier) _menhir_state
    (** State 116.
        Stack shape : variable.
        Start symbol: fichier. *)


and 's _menhir_cell0_binaire = 
  | MenhirCell0_binaire of 's * (unit)

and ('s, 'r) _menhir_cell1_bloc = 
  | MenhirCell1_bloc of 's * ('s, 'r) _menhir_state * (unit)

and 's _menhir_cell0_contenu3 = 
  | MenhirCell0_contenu3 of 's * (unit)

and ('s, 'r) _menhir_cell1_entete = 
  | MenhirCell1_entete of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_expression = 
  | MenhirCell1_expression of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_expressions = 
  | MenhirCell1_expressions of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_fonction = 
  | MenhirCell1_fonction of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_instruction = 
  | MenhirCell1_instruction of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_suffixe = 
  | MenhirCell1_suffixe of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_typeBase = 
  | MenhirCell1_typeBase of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_typeStruct = 
  | MenhirCell1_typeStruct of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_unaire = 
  | MenhirCell1_unaire of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_unaires = 
  | MenhirCell1_unaires of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_variable = 
  | MenhirCell1_variable of 's * ('s, 'r) _menhir_state * (unit)

and ('s, 'r) _menhir_cell1_variables = 
  | MenhirCell1_variables of 's * ('s, 'r) _menhir_state * (int)

and ('s, 'r) _menhir_cell1_ACCOUV = 
  | MenhirCell1_ACCOUV of 's * ('s, 'r) _menhir_state

and ('s, 'r) _menhir_cell1_CROOUV = 
  | MenhirCell1_CROOUV of 's * ('s, 'r) _menhir_state

and 's _menhir_cell0_IDENT = 
  | MenhirCell0_IDENT of 's * (
# 16 "parserJava.mly"
       (string)
# 301 "parserJava.ml"
)

and ('s, 'r) _menhir_cell1_PAROUV = 
  | MenhirCell1_PAROUV of 's * ('s, 'r) _menhir_state

and ('s, 'r) _menhir_cell1_RETOUR = 
  | MenhirCell1_RETOUR of 's * ('s, 'r) _menhir_state

and ('s, 'r) _menhir_cell1_SI = 
  | MenhirCell1_SI of 's * ('s, 'r) _menhir_state

and ('s, 'r) _menhir_cell1_TANTQUE = 
  | MenhirCell1_TANTQUE of 's * ('s, 'r) _menhir_state

and ('s, 'r) _menhir_cell1_VIRG = 
  | MenhirCell1_VIRG of 's * ('s, 'r) _menhir_state

and ('s, 'r) _menhir_cell1_VOID = 
  | MenhirCell1_VOID of 's * ('s, 'r) _menhir_state

and _menhir_box_fichier = 
  | MenhirBox_fichier of (unit) [@@unboxed]

let _menhir_action_01 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 330 "parserJava.ml"
     : (unit))

let _menhir_action_02 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 338 "parserJava.ml"
     : (unit))

let _menhir_action_03 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 346 "parserJava.ml"
     : (unit))

let _menhir_action_04 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 354 "parserJava.ml"
     : (unit))

let _menhir_action_05 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 362 "parserJava.ml"
     : (unit))

let _menhir_action_06 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 370 "parserJava.ml"
     : (unit))

let _menhir_action_07 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 378 "parserJava.ml"
     : (unit))

let _menhir_action_08 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 386 "parserJava.ml"
     : (unit))

let _menhir_action_09 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 394 "parserJava.ml"
     : (unit))

let _menhir_action_10 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 402 "parserJava.ml"
     : (unit))

let _menhir_action_11 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 410 "parserJava.ml"
     : (unit))

let _menhir_action_12 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 418 "parserJava.ml"
     : (unit))

let _menhir_action_13 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 426 "parserJava.ml"
     : (unit))

let _menhir_action_14 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 434 "parserJava.ml"
     : (unit))

let _menhir_action_15 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 442 "parserJava.ml"
     : (unit))

let _menhir_action_16 =
  fun () ->
    (
# 165 "parserJava.mly"
              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 450 "parserJava.ml"
     : (unit))

let _menhir_action_17 =
  fun _2 ->
    (
# 88 "parserJava.mly"
     (
	(print_endline "bloc : ACCOUV variables instructions ACCFER");
	(print_string "Nombre de variables = ");
	(print_int _2);
	(print_newline ())
	)
# 463 "parserJava.ml"
     : (unit))

let _menhir_action_18 =
  fun () ->
    (
# 178 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 471 "parserJava.ml"
     : (unit))

let _menhir_action_19 =
  fun () ->
    (
# 178 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 479 "parserJava.ml"
     : (unit))

let _menhir_action_20 =
  fun () ->
    (
# 136 "parserJava.mly"
                              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 487 "parserJava.ml"
     : (unit))

let _menhir_action_21 =
  fun () ->
    (
# 136 "parserJava.mly"
                              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 495 "parserJava.ml"
     : (unit))

let _menhir_action_22 =
  fun () ->
    (
# 139 "parserJava.mly"
                              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 503 "parserJava.ml"
     : (unit))

let _menhir_action_23 =
  fun () ->
    (
# 139 "parserJava.mly"
                              ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 511 "parserJava.ml"
     : (unit))

let _menhir_action_24 =
  fun () ->
    (
# 73 "parserJava.mly"
                                 ( (print_endline "declTab : /* Lambda, mot vide */") )
# 519 "parserJava.ml"
     : (unit))

let _menhir_action_25 =
  fun () ->
    (
# 74 "parserJava.mly"
                        ( (print_endline "declTab : CROOUV CROFER") )
# 527 "parserJava.ml"
     : (unit))

let _menhir_action_26 =
  fun () ->
    (
# 78 "parserJava.mly"
                                                    ( (print_endline "entete : typeStruct IDENT PAROUV parsFormels PARFER") )
# 535 "parserJava.ml"
     : (unit))

let _menhir_action_27 =
  fun () ->
    (
# 79 "parserJava.mly"
                                              ( (print_endline "entete : VOID IDENT PAROUV parsFormels PARFER") )
# 543 "parserJava.ml"
     : (unit))

let _menhir_action_28 =
  fun () ->
    (
# 119 "parserJava.mly"
                                   ( (print_endline "elseCorps: /* Lambda, mot vide */") )
# 551 "parserJava.ml"
     : (unit))

let _menhir_action_29 =
  fun () ->
    (
# 120 "parserJava.mly"
                 ( (print_endline "elseCorps: SINON corps") )
# 559 "parserJava.ml"
     : (unit))

let _menhir_action_30 =
  fun () ->
    (
# 124 "parserJava.mly"
                            ( (print_endline "expression : ENTIER") )
# 567 "parserJava.ml"
     : (unit))

let _menhir_action_31 =
  fun () ->
    (
# 130 "parserJava.mly"
                              ( (print_endline "expression : unaires contenu3 suffixes") )
# 575 "parserJava.ml"
     : (unit))

let _menhir_action_32 =
  fun () ->
    (
# 130 "parserJava.mly"
                              ( (print_endline "expression : unaires contenu3 suffixes") )
# 583 "parserJava.ml"
     : (unit))

let _menhir_action_33 =
  fun () ->
    (
# 130 "parserJava.mly"
                              ( (print_endline "expression : unaires contenu3 suffixes") )
# 591 "parserJava.ml"
     : (unit))

let _menhir_action_34 =
  fun () ->
    (
# 130 "parserJava.mly"
                              ( (print_endline "expression : unaires contenu3 suffixes") )
# 599 "parserJava.ml"
     : (unit))

let _menhir_action_35 =
  fun () ->
    (
# 130 "parserJava.mly"
                              ( (print_endline "expression : unaires contenu3 suffixes") )
# 607 "parserJava.ml"
     : (unit))

let _menhir_action_36 =
  fun () ->
    (
# 130 "parserJava.mly"
                              ( (print_endline "expression : unaires contenu3 suffixes") )
# 615 "parserJava.ml"
     : (unit))

let _menhir_action_37 =
  fun () ->
    (
# 133 "parserJava.mly"
                                   ( (print_endline "expressions : expression binaire expressions") )
# 623 "parserJava.ml"
     : (unit))

let _menhir_action_38 =
  fun () ->
    (
# 133 "parserJava.mly"
                                   ( (print_endline "expressions : expression binaire expressions") )
# 631 "parserJava.ml"
     : (unit))

let _menhir_action_39 =
  fun () ->
    (
# 59 "parserJava.mly"
                        ( (print_endline "fichier : programme FIN");(print_string "Nombre de fonctions : ");(print_int !nbrFonctions);(print_newline()) )
# 639 "parserJava.ml"
     : (unit))

let _menhir_action_40 =
  fun () ->
    (
# 76 "parserJava.mly"
                        ( (print_endline "fonction : entete bloc") )
# 647 "parserJava.ml"
     : (unit))

let _menhir_action_41 =
  fun () ->
    (
# 113 "parserJava.mly"
                                               ( (print_endline "instruction : expression PTVIRG") )
# 655 "parserJava.ml"
     : (unit))

let _menhir_action_42 =
  fun () ->
    (
# 116 "parserJava.mly"
                                                         ( (print_endline "instruction : RETURN expression PTVIRG") )
# 663 "parserJava.ml"
     : (unit))

let _menhir_action_43 =
  fun () ->
    (
# 116 "parserJava.mly"
                                                         ( (print_endline "instruction : RETURN expression PTVIRG") )
# 671 "parserJava.ml"
     : (unit))

let _menhir_action_44 =
  fun () ->
    (
# 116 "parserJava.mly"
                                                         ( (print_endline "instruction : RETURN expression PTVIRG") )
# 679 "parserJava.ml"
     : (unit))

let _menhir_action_45 =
  fun () ->
    (
# 109 "parserJava.mly"
                                      ( (print_endline "instructions : /* Lambda, mot vide */") )
# 687 "parserJava.ml"
     : (unit))

let _menhir_action_46 =
  fun () ->
    (
# 110 "parserJava.mly"
                              ( (print_endline "instructions : instruction instructions") )
# 695 "parserJava.ml"
     : (unit))

let _menhir_action_47 =
  fun () ->
    (
# 81 "parserJava.mly"
                                     ( (print_endline "parsFormels : /* Lambda, mot vide */") )
# 703 "parserJava.ml"
     : (unit))

let _menhir_action_48 =
  fun () ->
    (
# 82 "parserJava.mly"
                                                ( (print_endline "parsFormels : typeStruct IDENT suiteParsFormels") )
# 711 "parserJava.ml"
     : (unit))

let _menhir_action_49 =
  fun () ->
    (
# 61 "parserJava.mly"
                                   ( (nbrFonctions := 0); (print_endline "programme : /* Lambda, mot vide */") )
# 719 "parserJava.ml"
     : (unit))

let _menhir_action_50 =
  fun () ->
    (
# 62 "parserJava.mly"
                               ( (nbrFonctions := !nbrFonctions + 1);(print_endline "programme : fonction programme") )
# 727 "parserJava.ml"
     : (unit))

let _menhir_action_51 =
  fun () ->
    (
# 171 "parserJava.mly"
                        ( (print_endline "elseCorps: /* Lambda, mot vide */") )
# 735 "parserJava.ml"
     : (unit))

let _menhir_action_52 =
  fun () ->
    (
# 173 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 743 "parserJava.ml"
     : (unit))

let _menhir_action_53 =
  fun () ->
    (
# 173 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 751 "parserJava.ml"
     : (unit))

let _menhir_action_54 =
  fun () ->
    (
# 169 "parserJava.mly"
                     ( (print_endline "suffixes : suffixe suffixes") )
# 759 "parserJava.ml"
     : (unit))

let _menhir_action_55 =
  fun () ->
    (
# 84 "parserJava.mly"
                                          ( (print_endline "suiteParsFormels : /* Lambda, mot vide */") )
# 767 "parserJava.ml"
     : (unit))

let _menhir_action_56 =
  fun () ->
    (
# 85 "parserJava.mly"
                                                          ( (print_endline "suiteParsFormels : VIRG typeStruct IDENT suiteParsFormels") )
# 775 "parserJava.ml"
     : (unit))

let _menhir_action_57 =
  fun () ->
    (
# 66 "parserJava.mly"
               ( (print_endline "typeBase : INT") )
# 783 "parserJava.ml"
     : (unit))

let _menhir_action_58 =
  fun () ->
    (
# 67 "parserJava.mly"
                 ( (print_endline "typeBase : FLOAT") )
# 791 "parserJava.ml"
     : (unit))

let _menhir_action_59 =
  fun () ->
    (
# 68 "parserJava.mly"
                ( (print_endline "typeBase : BOOL") )
# 799 "parserJava.ml"
     : (unit))

let _menhir_action_60 =
  fun () ->
    (
# 69 "parserJava.mly"
                ( (print_endline "typeBase : CHAR") )
# 807 "parserJava.ml"
     : (unit))

let _menhir_action_61 =
  fun () ->
    (
# 70 "parserJava.mly"
                  ( (print_endline "typeBase : STRING") )
# 815 "parserJava.ml"
     : (unit))

let _menhir_action_62 =
  fun () ->
    (
# 71 "parserJava.mly"
                     ( (print_endline "typeBase : TYPEIDENT") )
# 823 "parserJava.ml"
     : (unit))

let _menhir_action_63 =
  fun () ->
    (
# 64 "parserJava.mly"
                              ( (print_endline "typeStruct : typeBase declTab") )
# 831 "parserJava.ml"
     : (unit))

let _menhir_action_64 =
  fun () ->
    (
# 147 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 839 "parserJava.ml"
     : (unit))

let _menhir_action_65 =
  fun () ->
    (
# 147 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 847 "parserJava.ml"
     : (unit))

let _menhir_action_66 =
  fun () ->
    (
# 147 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 855 "parserJava.ml"
     : (unit))

let _menhir_action_67 =
  fun () ->
    (
# 147 "parserJava.mly"
                             ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 863 "parserJava.ml"
     : (unit))

let _menhir_action_68 =
  fun () ->
    (
# 143 "parserJava.mly"
                   ( (print_endline "contenu2 : CROOUV expressions PARFER") )
# 871 "parserJava.ml"
     : (unit))

let _menhir_action_69 =
  fun () ->
    (
# 106 "parserJava.mly"
                                   ( (print_endline "variable : typeStruct IDENT PTVIRG") )
# 879 "parserJava.ml"
     : (unit))

let _menhir_action_70 =
  fun () ->
    (
# 96 "parserJava.mly"
   (
		(print_endline "variables : /* Lambda, mot vide */");
		0
		)
# 890 "parserJava.ml"
     : (int))

let _menhir_action_71 =
  fun _2 ->
    (
# 101 "parserJava.mly"
   (
		(print_endline "variables : variable variables");
		(_2 + 1)
		)
# 901 "parserJava.ml"
     : (int))

let _menhir_print_token : token -> string =
  fun _tok ->
    match _tok with
    | ACCFER ->
        "ACCFER"
    | ACCOUV ->
        "ACCOUV"
    | ASSIGN ->
        "ASSIGN"
    | BOOL ->
        "BOOL"
    | BOOLEEN _ ->
        "BOOLEEN"
    | CARACTERE _ ->
        "CARACTERE"
    | CHAINE _ ->
        "CHAINE"
    | CHAR ->
        "CHAR"
    | CROFER ->
        "CROFER"
    | CROOUV ->
        "CROOUV"
    | ENTIER _ ->
        "ENTIER"
    | FIN ->
        "FIN"
    | FLOAT ->
        "FLOAT"
    | FLOTTANT _ ->
        "FLOTTANT"
    | IDENT _ ->
        "IDENT"
    | IMPORT ->
        "IMPORT"
    | INT ->
        "INT"
    | NOUVEAU ->
        "NOUVEAU"
    | OPDIV ->
        "OPDIV"
    | OPEG ->
        "OPEG"
    | OPET ->
        "OPET"
    | OPINF ->
        "OPINF"
    | OPINFEG ->
        "OPINFEG"
    | OPMOD ->
        "OPMOD"
    | OPMOINS ->
        "OPMOINS"
    | OPMULT ->
        "OPMULT"
    | OPNON ->
        "OPNON"
    | OPNONEG ->
        "OPNONEG"
    | OPOU ->
        "OPOU"
    | OPPLUS ->
        "OPPLUS"
    | OPPT ->
        "OPPT"
    | OPSUP ->
        "OPSUP"
    | OPSUPEG ->
        "OPSUPEG"
    | PARFER ->
        "PARFER"
    | PAROUV ->
        "PAROUV"
    | PTVIRG ->
        "PTVIRG"
    | RETOUR ->
        "RETOUR"
    | SI ->
        "SI"
    | SINON ->
        "SINON"
    | STRING ->
        "STRING"
    | TANTQUE ->
        "TANTQUE"
    | TYPEIDENT _ ->
        "TYPEIDENT"
    | VIDE ->
        "VIDE"
    | VIRG ->
        "VIRG"
    | VOID ->
        "VOID"

let _menhir_fail : unit -> 'a =
  fun () ->
    Printf.eprintf "Internal failure -- please contact the parser generator's developers.\n%!";
    assert false

include struct
  
  [@@@ocaml.warning "-4-37"]
  
  let _menhir_run_028 : type  ttv_stack. ttv_stack -> _menhir_box_fichier =
    fun _menhir_stack ->
      let _v = _menhir_action_39 () in
      MenhirBox_fichier _v
  
  let rec _menhir_run_031 : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_fonction -> _menhir_box_fichier =
    fun _menhir_stack ->
      let MenhirCell1_fonction (_menhir_stack, _menhir_s, _) = _menhir_stack in
      let _ = _menhir_action_50 () in
      _menhir_goto_programme _menhir_stack _menhir_s
  
  and _menhir_goto_programme : type  ttv_stack. ttv_stack -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_s ->
      match _menhir_s with
      | MenhirState030 ->
          _menhir_run_031 _menhir_stack
      | MenhirState000 ->
          _menhir_run_028 _menhir_stack
      | _ ->
          _menhir_fail ()
  
  let rec _menhir_run_001 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _menhir_stack = MenhirCell1_VOID (_menhir_stack, _menhir_s) in
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | IDENT _v ->
          let _menhir_stack = MenhirCell0_IDENT (_menhir_stack, _v) in
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | PAROUV ->
              let _tok = _menhir_lexer _menhir_lexbuf in
              (match (_tok : MenhirBasics.token) with
              | TYPEIDENT _ ->
                  _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState003
              | STRING ->
                  _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState003
              | INT ->
                  _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState003
              | FLOAT ->
                  _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState003
              | CHAR ->
                  _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState003
              | BOOL ->
                  _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState003
              | PARFER ->
                  let _ = _menhir_action_47 () in
                  _menhir_run_021 _menhir_stack _menhir_lexbuf _menhir_lexer
              | _ ->
                  _eRR ())
          | _ ->
              _eRR ())
      | _ ->
          _eRR ()
  
  and _menhir_run_004 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_62 () in
      _menhir_goto_typeBase _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_goto_typeBase : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_typeBase (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | CROOUV ->
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | CROFER ->
              let _tok = _menhir_lexer _menhir_lexbuf in
              let _ = _menhir_action_25 () in
              _menhir_goto_declTab _menhir_stack _menhir_lexbuf _menhir_lexer _tok
          | _ ->
              _eRR ())
      | IDENT _ | PARFER ->
          let _ = _menhir_action_24 () in
          _menhir_goto_declTab _menhir_stack _menhir_lexbuf _menhir_lexer _tok
      | _ ->
          _eRR ()
  
  and _menhir_goto_declTab : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_typeBase -> _ -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _tok ->
      let MenhirCell1_typeBase (_menhir_stack, _menhir_s, _) = _menhir_stack in
      let _v = _menhir_action_63 () in
      _menhir_goto_typeStruct _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_goto_typeStruct : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      match _menhir_s with
      | MenhirState033 ->
          _menhir_run_118 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s _tok
      | MenhirState116 ->
          _menhir_run_118 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s _tok
      | MenhirState037 ->
          _menhir_run_038 _menhir_stack _menhir_lexbuf _menhir_lexer _tok
      | MenhirState030 ->
          _menhir_run_023 _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | MenhirState000 ->
          _menhir_run_023 _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | MenhirState012 ->
          _menhir_run_013 _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | MenhirState025 ->
          _menhir_run_010 _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | MenhirState003 ->
          _menhir_run_010 _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | _ ->
          _menhir_fail ()
  
  and _menhir_run_118 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s _tok ->
      match (_tok : MenhirBasics.token) with
      | IDENT _ ->
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | PTVIRG ->
              let _tok = _menhir_lexer _menhir_lexbuf in
              let _v = _menhir_action_69 () in
              let _menhir_stack = MenhirCell1_variable (_menhir_stack, _menhir_s, _v) in
              (match (_tok : MenhirBasics.token) with
              | TYPEIDENT _ ->
                  _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState116
              | STRING ->
                  _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState116
              | INT ->
                  _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState116
              | FLOAT ->
                  _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState116
              | CHAR ->
                  _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState116
              | BOOL ->
                  _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState116
              | ACCFER | OPMOINS | OPNON | OPPLUS | PAROUV | RETOUR | SI | TANTQUE ->
                  let _v_1 = _menhir_action_70 () in
                  _menhir_run_117 _menhir_stack _menhir_lexbuf _menhir_lexer _v_1 _tok
              | _ ->
                  _eRR ())
          | _ ->
              _eRR ())
      | _ ->
          _eRR ()
  
  and _menhir_run_005 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_61 () in
      _menhir_goto_typeBase _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_006 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_57 () in
      _menhir_goto_typeBase _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_007 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_58 () in
      _menhir_goto_typeBase _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_008 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_60 () in
      _menhir_goto_typeBase _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_009 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_59 () in
      _menhir_goto_typeBase _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_117 : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_variable -> _ -> _ -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _tok ->
      let MenhirCell1_variable (_menhir_stack, _menhir_s, _) = _menhir_stack in
      let _2 = _v in
      let _v = _menhir_action_71 _2 in
      _menhir_goto_variables _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_goto_variables : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      match _menhir_s with
      | MenhirState116 ->
          _menhir_run_117 _menhir_stack _menhir_lexbuf _menhir_lexer _v _tok
      | MenhirState033 ->
          _menhir_run_034 _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | _ ->
          _menhir_fail ()
  
  and _menhir_run_034 : type  ttv_stack. ((ttv_stack, _menhir_box_fichier) _menhir_cell1_ACCOUV as 'stack) -> _ -> _ -> _ -> ('stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_variables (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | TANTQUE ->
          _menhir_run_035 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState034
      | SI ->
          _menhir_run_099 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState034
      | RETOUR ->
          _menhir_run_107 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState034
      | PAROUV ->
          _menhir_run_037 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState034
      | OPPLUS ->
          _menhir_run_040 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState034
      | OPNON ->
          _menhir_run_041 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState034
      | OPMOINS ->
          _menhir_run_042 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState034
      | ACCFER ->
          let _ = _menhir_action_45 () in
          _menhir_run_110 _menhir_stack _menhir_lexbuf _menhir_lexer
      | _ ->
          _menhir_fail ()
  
  and _menhir_run_035 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _menhir_stack = MenhirCell1_TANTQUE (_menhir_stack, _menhir_s) in
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | PAROUV ->
          let _menhir_s = MenhirState036 in
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | PAROUV ->
              _menhir_run_037 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | OPPLUS ->
              _menhir_run_040 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | OPNON ->
              _menhir_run_041 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | OPMOINS ->
              _menhir_run_042 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | _ ->
              _eRR ())
      | _ ->
          _eRR ()
  
  and _menhir_run_037 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _menhir_stack = MenhirCell1_PAROUV (_menhir_stack, _menhir_s) in
      let _menhir_s = MenhirState037 in
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | TYPEIDENT _ ->
          _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | STRING ->
          _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | INT ->
          _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | FLOAT ->
          _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | CHAR ->
          _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | BOOL ->
          _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | _ ->
          _eRR ()
  
  and _menhir_run_040 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_65 () in
      _menhir_goto_unaire _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_goto_unaire : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_unaire (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | PAROUV ->
          _menhir_run_037 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState046
      | OPPLUS ->
          _menhir_run_040 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState046
      | OPNON ->
          _menhir_run_041 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState046
      | OPMOINS ->
          _menhir_run_042 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState046
      | _ ->
          _eRR ()
  
  and _menhir_run_041 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_67 () in
      _menhir_goto_unaire _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_042 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let _v = _menhir_action_66 () in
      _menhir_goto_unaire _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_099 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _menhir_stack = MenhirCell1_SI (_menhir_stack, _menhir_s) in
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | PAROUV ->
          let _menhir_s = MenhirState100 in
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | PAROUV ->
              _menhir_run_037 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | OPPLUS ->
              _menhir_run_040 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | OPNON ->
              _menhir_run_041 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | OPMOINS ->
              _menhir_run_042 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | _ ->
              _eRR ())
      | _ ->
          _eRR ()
  
  and _menhir_run_107 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _menhir_stack = MenhirCell1_RETOUR (_menhir_stack, _menhir_s) in
      let _menhir_s = MenhirState107 in
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | PAROUV ->
          _menhir_run_037 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | OPPLUS ->
          _menhir_run_040 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | OPNON ->
          _menhir_run_041 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | OPMOINS ->
          _menhir_run_042 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | _ ->
          _eRR ()
  
  and _menhir_run_110 : type  ttv_stack. ((ttv_stack, _menhir_box_fichier) _menhir_cell1_ACCOUV, _menhir_box_fichier) _menhir_cell1_variables -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let MenhirCell1_variables (_menhir_stack, _, _2) = _menhir_stack in
      let MenhirCell1_ACCOUV (_menhir_stack, _menhir_s) = _menhir_stack in
      let _v = _menhir_action_17 _2 in
      _menhir_goto_bloc _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_goto_bloc : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      match _menhir_s with
      | MenhirState032 ->
          _menhir_run_121 _menhir_stack _menhir_lexbuf _menhir_lexer _tok
      | MenhirState104 ->
          _menhir_run_105 _menhir_stack _menhir_lexbuf _menhir_lexer _tok
      | MenhirState102 ->
          _menhir_run_103 _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | MenhirState097 ->
          _menhir_run_098 _menhir_stack _menhir_lexbuf _menhir_lexer _tok
      | _ ->
          _menhir_fail ()
  
  and _menhir_run_121 : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_entete -> _ -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _tok ->
      let MenhirCell1_entete (_menhir_stack, _menhir_s, _) = _menhir_stack in
      let _v = _menhir_action_40 () in
      let _menhir_stack = MenhirCell1_fonction (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | VOID ->
          _menhir_run_001 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState030
      | TYPEIDENT _ ->
          _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState030
      | STRING ->
          _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState030
      | INT ->
          _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState030
      | FLOAT ->
          _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState030
      | CHAR ->
          _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState030
      | BOOL ->
          _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState030
      | FIN ->
          let _ = _menhir_action_49 () in
          _menhir_run_031 _menhir_stack
      | _ ->
          _eRR ()
  
  and _menhir_run_105 : type  ttv_stack. (((ttv_stack, _menhir_box_fichier) _menhir_cell1_SI, _menhir_box_fichier) _menhir_cell1_expression, _menhir_box_fichier) _menhir_cell1_bloc -> _ -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _tok ->
      let _ = _menhir_action_29 () in
      _menhir_goto_esleCorps _menhir_stack _menhir_lexbuf _menhir_lexer _tok
  
  and _menhir_goto_esleCorps : type  ttv_stack. (((ttv_stack, _menhir_box_fichier) _menhir_cell1_SI, _menhir_box_fichier) _menhir_cell1_expression, _menhir_box_fichier) _menhir_cell1_bloc -> _ -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _tok ->
      let MenhirCell1_bloc (_menhir_stack, _, _) = _menhir_stack in
      let MenhirCell1_expression (_menhir_stack, _, _) = _menhir_stack in
      let MenhirCell1_SI (_menhir_stack, _menhir_s) = _menhir_stack in
      let _v = _menhir_action_42 () in
      _menhir_goto_instruction _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_goto_instruction : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_instruction (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | TANTQUE ->
          _menhir_run_035 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState112
      | SI ->
          _menhir_run_099 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState112
      | RETOUR ->
          _menhir_run_107 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState112
      | PAROUV ->
          _menhir_run_037 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState112
      | OPPLUS ->
          _menhir_run_040 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState112
      | OPNON ->
          _menhir_run_041 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState112
      | OPMOINS ->
          _menhir_run_042 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState112
      | ACCFER ->
          let _ = _menhir_action_45 () in
          _menhir_run_113 _menhir_stack _menhir_lexbuf _menhir_lexer
      | _ ->
          _eRR ()
  
  and _menhir_run_113 : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_instruction -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer ->
      let MenhirCell1_instruction (_menhir_stack, _menhir_s, _) = _menhir_stack in
      let _ = _menhir_action_46 () in
      _menhir_goto_instructions _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
  
  and _menhir_goto_instructions : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      match _menhir_s with
      | MenhirState112 ->
          _menhir_run_113 _menhir_stack _menhir_lexbuf _menhir_lexer
      | MenhirState034 ->
          _menhir_run_110 _menhir_stack _menhir_lexbuf _menhir_lexer
      | _ ->
          _menhir_fail ()
  
  and _menhir_run_103 : type  ttv_stack. (((ttv_stack, _menhir_box_fichier) _menhir_cell1_SI, _menhir_box_fichier) _menhir_cell1_expression as 'stack) -> _ -> _ -> _ -> ('stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_bloc (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | SINON ->
          let _menhir_s = MenhirState104 in
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | ACCOUV ->
              _menhir_run_033 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
          | _ ->
              _eRR ())
      | ACCFER | OPMOINS | OPNON | OPPLUS | PAROUV | RETOUR | SI | TANTQUE ->
          let _ = _menhir_action_28 () in
          _menhir_goto_esleCorps _menhir_stack _menhir_lexbuf _menhir_lexer _tok
      | _ ->
          _eRR ()
  
  and _menhir_run_033 : type  ttv_stack. ttv_stack -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _menhir_stack = MenhirCell1_ACCOUV (_menhir_stack, _menhir_s) in
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | TYPEIDENT _ ->
          _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState033
      | STRING ->
          _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState033
      | INT ->
          _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState033
      | FLOAT ->
          _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState033
      | CHAR ->
          _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState033
      | BOOL ->
          _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState033
      | ACCFER | OPMOINS | OPNON | OPPLUS | PAROUV | RETOUR | SI | TANTQUE ->
          let _v = _menhir_action_70 () in
          _menhir_run_034 _menhir_stack _menhir_lexbuf _menhir_lexer _v MenhirState033 _tok
      | _ ->
          _eRR ()
  
  and _menhir_run_098 : type  ttv_stack. ((ttv_stack, _menhir_box_fichier) _menhir_cell1_TANTQUE, _menhir_box_fichier) _menhir_cell1_expression -> _ -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _tok ->
      let MenhirCell1_expression (_menhir_stack, _, _) = _menhir_stack in
      let MenhirCell1_TANTQUE (_menhir_stack, _menhir_s) = _menhir_stack in
      let _v = _menhir_action_43 () in
      _menhir_goto_instruction _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_038 : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_PAROUV -> _ -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _tok ->
      match (_tok : MenhirBasics.token) with
      | PARFER ->
          let _tok = _menhir_lexer _menhir_lexbuf in
          let MenhirCell1_PAROUV (_menhir_stack, _menhir_s) = _menhir_stack in
          let _v = _menhir_action_64 () in
          _menhir_goto_unaire _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
      | _ ->
          _eRR ()
  
  and _menhir_run_023 : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_typeStruct (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | IDENT _v_0 ->
          let _menhir_stack = MenhirCell0_IDENT (_menhir_stack, _v_0) in
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | PAROUV ->
              let _tok = _menhir_lexer _menhir_lexbuf in
              (match (_tok : MenhirBasics.token) with
              | TYPEIDENT _ ->
                  _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState025
              | STRING ->
                  _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState025
              | INT ->
                  _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState025
              | FLOAT ->
                  _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState025
              | CHAR ->
                  _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState025
              | BOOL ->
                  _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState025
              | PARFER ->
                  let _ = _menhir_action_47 () in
                  _menhir_run_026 _menhir_stack _menhir_lexbuf _menhir_lexer
              | _ ->
                  _eRR ())
          | _ ->
              _eRR ())
      | _ ->
          _eRR ()
  
  and _menhir_run_026 : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let MenhirCell0_IDENT (_menhir_stack, _) = _menhir_stack in
      let MenhirCell1_typeStruct (_menhir_stack, _menhir_s, _) = _menhir_stack in
      let _v = _menhir_action_26 () in
      _menhir_goto_entete _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_goto_entete : type  ttv_stack. ttv_stack -> _ -> _ -> _ -> (ttv_stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_entete (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | ACCOUV ->
          _menhir_run_033 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState032
      | _ ->
          _eRR ()
  
  and _menhir_run_013 : type  ttv_stack. (((ttv_stack, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_cell1_VIRG as 'stack) -> _ -> _ -> _ -> ('stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_typeStruct (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | IDENT _v_0 ->
          let _menhir_stack = MenhirCell0_IDENT (_menhir_stack, _v_0) in
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | VIRG ->
              _menhir_run_012 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState014
          | PARFER ->
              let _ = _menhir_action_55 () in
              _menhir_run_015 _menhir_stack _menhir_lexbuf _menhir_lexer
          | _ ->
              _eRR ())
      | _ ->
          _eRR ()
  
  and _menhir_run_012 : type  ttv_stack. ((ttv_stack, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT as 'stack) -> _ -> _ -> ('stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      let _menhir_stack = MenhirCell1_VIRG (_menhir_stack, _menhir_s) in
      let _menhir_s = MenhirState012 in
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | TYPEIDENT _ ->
          _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | STRING ->
          _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | INT ->
          _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | FLOAT ->
          _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | CHAR ->
          _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | BOOL ->
          _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
      | _ ->
          _eRR ()
  
  and _menhir_run_015 : type  ttv_stack. (((ttv_stack, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_cell1_VIRG, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer ->
      let MenhirCell0_IDENT (_menhir_stack, _) = _menhir_stack in
      let MenhirCell1_typeStruct (_menhir_stack, _, _) = _menhir_stack in
      let MenhirCell1_VIRG (_menhir_stack, _menhir_s) = _menhir_stack in
      let _ = _menhir_action_56 () in
      _menhir_goto_suiteParsFormels _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
  
  and _menhir_goto_suiteParsFormels : type  ttv_stack. ((ttv_stack, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT as 'stack) -> _ -> _ -> ('stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      match _menhir_s with
      | MenhirState011 ->
          _menhir_run_020 _menhir_stack _menhir_lexbuf _menhir_lexer
      | MenhirState014 ->
          _menhir_run_015 _menhir_stack _menhir_lexbuf _menhir_lexer
      | _ ->
          _menhir_fail ()
  
  and _menhir_run_020 : type  ttv_stack. (ttv_stack _menhir_cell0_IDENT, _menhir_box_fichier) _menhir_cell1_typeStruct _menhir_cell0_IDENT -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer ->
      let MenhirCell0_IDENT (_menhir_stack, _) = _menhir_stack in
      let MenhirCell1_typeStruct (_menhir_stack, _menhir_s, _) = _menhir_stack in
      let _ = _menhir_action_48 () in
      _menhir_goto_parsFormels _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s
  
  and _menhir_goto_parsFormels : type  ttv_stack. (ttv_stack _menhir_cell0_IDENT as 'stack) -> _ -> _ -> ('stack, _menhir_box_fichier) _menhir_state -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _menhir_s ->
      match _menhir_s with
      | MenhirState025 ->
          _menhir_run_026 _menhir_stack _menhir_lexbuf _menhir_lexer
      | MenhirState003 ->
          _menhir_run_021 _menhir_stack _menhir_lexbuf _menhir_lexer
      | _ ->
          _menhir_fail ()
  
  and _menhir_run_021 : type  ttv_stack. (ttv_stack, _menhir_box_fichier) _menhir_cell1_VOID _menhir_cell0_IDENT -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      let MenhirCell0_IDENT (_menhir_stack, _) = _menhir_stack in
      let MenhirCell1_VOID (_menhir_stack, _menhir_s) = _menhir_stack in
      let _v = _menhir_action_27 () in
      _menhir_goto_entete _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok
  
  and _menhir_run_010 : type  ttv_stack. (ttv_stack _menhir_cell0_IDENT as 'stack) -> _ -> _ -> _ -> ('stack, _menhir_box_fichier) _menhir_state -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer _v _menhir_s _tok ->
      let _menhir_stack = MenhirCell1_typeStruct (_menhir_stack, _menhir_s, _v) in
      match (_tok : MenhirBasics.token) with
      | IDENT _v_0 ->
          let _menhir_stack = MenhirCell0_IDENT (_menhir_stack, _v_0) in
          let _tok = _menhir_lexer _menhir_lexbuf in
          (match (_tok : MenhirBasics.token) with
          | VIRG ->
              _menhir_run_012 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState011
          | PARFER ->
              let _ = _menhir_action_55 () in
              _menhir_run_020 _menhir_stack _menhir_lexbuf _menhir_lexer
          | _ ->
              _eRR ())
      | _ ->
          _eRR ()
  
  let _menhir_run_000 : type  ttv_stack. ttv_stack -> _ -> _ -> _menhir_box_fichier =
    fun _menhir_stack _menhir_lexbuf _menhir_lexer ->
      let _tok = _menhir_lexer _menhir_lexbuf in
      match (_tok : MenhirBasics.token) with
      | VOID ->
          _menhir_run_001 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState000
      | TYPEIDENT _ ->
          _menhir_run_004 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState000
      | STRING ->
          _menhir_run_005 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState000
      | INT ->
          _menhir_run_006 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState000
      | FLOAT ->
          _menhir_run_007 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState000
      | CHAR ->
          _menhir_run_008 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState000
      | BOOL ->
          _menhir_run_009 _menhir_stack _menhir_lexbuf _menhir_lexer MenhirState000
      | FIN ->
          let _ = _menhir_action_49 () in
          _menhir_run_028 _menhir_stack
      | _ ->
          _eRR ()
  
end

let fichier =
  fun _menhir_lexer _menhir_lexbuf ->
    let _menhir_stack = () in
    let MenhirBox_fichier v = _menhir_run_000 _menhir_stack _menhir_lexbuf _menhir_lexer in
    v

# 181 "parserJava.mly"
  

# 1679 "parserJava.ml"

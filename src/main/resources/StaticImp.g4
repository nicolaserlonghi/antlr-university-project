grammar StaticImp;

prog : com EOF ;

com : SKIPP                                                                                                             # skip
    | type=(TNAT | TBOOL) ID                                                                                            # decl
    | ID ASSIGN exp                                                                                                     # assign
    | OUT LPAR exp RPAR                                                                                                 # out
    | WHILE LPAR exp RPAR LBRACE com RBRACE                                                                             # while
    | com SEMICOLON com                                                                                                 # seq
    | IF LPAR exp RPAR THEN LBRACE com RBRACE (ELSEIF LPAR exp RPAR LBRACE com RBRACE)* (ELSE LBRACE com RBRACE)?       # if
    | FOR LPAR com SEMICOLON exp SEMICOLON com RPAR LBRACE com RBRACE                                                   # for
    | DO LBRACE com RBRACE WHILE LPAR exp RPAR                                                                          # do_while
    | ND LPAR com COMMA com RPAR                                                                                        # nd
    ;

exp : NAT                                 # nat
    | BOOL                                # bool
    | LPAR exp RPAR                       # parExp
    | NOT exp                             # not
    | <assoc=right> exp POW exp           # pow
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR) exp               # logicExp
    | ID                                  # id
    ;

TNAT  : 'nat' ;
TBOOL : 'bool' ;

NAT : '0' | [1-9][0-9]* ;
BOOL : 'true' | 'false' ;

PLUS  : '+' ;
MINUS : '-';
MUL   : '*' ;
DIV   : '/' ;
MOD   : 'mod' ;
POW   : '^' ;

AND : '&' ;
OR  : '|' ;

EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;
NOT : '!' ;

IF     : 'if' ;
ELSEIF : 'elseif' ;
THEN   : 'then' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
DO     : 'do' ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
OUT    : 'out' ;
FOR    : 'for' ;
ND     : 'nd' ;

LPAR      : '(' ;
RPAR      : ')';
LBRACE    : '{' ;
RBRACE    : '}' ;
SEMICOLON : ';' ;
COMMA     : ',' ;

ID : [a-z]+ ;

WS : [ \t\r\n]+ -> skip ;

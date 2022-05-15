 grammar CoolCompiler;

program :  class_name+  ;
class_name :  ( CLASS TYPE (INHERITS TYPE)?  LBRACE  body* RBRACE SEMICOLON  )  ;
body :
      ( ID LPAREN (parm (COMMA parm)*)? RPAREN COLON  TYPE  LBRACE  expr RBRACE SEMICOLON
      |  ID COLON TYPE (ASSIGN expr)? SEMICOLON )
       ;
parm : ID COLON TYPE ;
expr :    expr DIV expr  |  expr MUL expr
         | expr PLUS expr  |  expr MINUS expr
         | expr LE expr
         | expr LT expr
         | LPAREN expr RPAREN
         | expr EQUALS expr
         | NOT expr
         |  ID ASSIGN expr
         | IF expr THEN expr ELSE expr FI
         | WHILE expr LOOP expr POOL
         |NEW TYPE
         | LBRACE (expr SEMICOLON)+ RBRACE
         | ID
         | NUM
         | TRUE
         |FALSE
          ;


//Keywords
CASE		: ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
ESAC		: ('e'|'E')('s'|'S')('a'|'A')('c'|'C');
IF		    : ('i'|'I')('f'|'F');
FI		    : ('f'|'F')('i'|'I');
WHILE		: ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
THEN		: ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
ELSE		: ('e'|'E')('l'|'L')('s'|'S')('e'|'E');
LOOP		: ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL		: ('p'|'P')('o'|'O')('o'|'O')('l'|'L');
CLASS		: ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
IN		    : ('i'|'I')('n'|'N');
INHERITS	: ('i'|'I')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');
OF		    : ('o'|'O')('f'|'F');
LET		    : ('l'|'L')('e'|'E')('t'|'T');
NEW		    : ('n'|'N')('e'|'E')('w'|'W');
ISVOID		: ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');
NOT		    : ('n'|'N')('o'|'O')('t'|'T');
TRUE        : 't'('r'|'R')('u'|'U')('e'|'E');
FALSE       : 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');
SEMICOLON   : ';';
CASE_ARROW  : '=>';
LPAREN	    : '(';
RPAREN	    : ')';
COMMA	    : ',';
PLUS	    : '+';
MINUS	    : '-';
MUL 	    : '*';
DIV 	    : '/';
TILDE	    : '~';
LT	        : '<';
LE	        : '<=';
EQUALS	    : '=';
LBRACE	    : '{';
RBRACE	    : '}';
DOT	        : '.';
ASSIGN	    : '<-';
ATSYM	    : '@';
COLON	    : ':';
WS          : [ \t\r\n]+ ->skip;


//ID's
//OBJECT      :'Object';

NUM         : [0-9]+;

TYPE        : [A-Z][a-zA-Z0-9]*;
//INT         : 'Int';
ID          : [a-z]('_'|[a-zA-Z]|[0-9])* ;
ERROR       : . ;

/*
arrayinit : '{' list? '}' ;
list : (obj ',' list)
        |
        obj
            ;
obj : NUM
      | CASE

         ;
CASE : ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
NUM : [0-9]+;
WS: [\t\r\n]+ ->skip;
*/
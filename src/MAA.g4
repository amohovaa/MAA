grammar MAA;

program
   : block '.'
   ;

block
   : consts? (vars*)? (procedure*)? statement
   ;

consts
   : CONST vars   (';' 'const' vars) * ';'
   ;

vars
   : VAR type ident ('=' expression)? ';'
   ;

type
    : 'int'
    | 'float'
    | 'char'
    ;
procedure
   : PROCEDURE ident ';' block ';'
   ;

statement
   : (assignstmt | callstmt | writestmt | breakstmt | continuestmt | bangstmt | beginstmt | ifstmt | whilestmt)?
   ;

assignstmt
   : ident ':=' expression
   ;

callstmt
   : CALL ident
   ;

writestmt
   : WRITE '(' expressionunion ')'
   ;

expressionunion
    :   (expression(',' expression)*)?
    ;

bangstmt
   : '!' expression
   ;

beginstmt
   : BEGIN statement (';' statement)* END
   ;

ifstmt
   : IF conditionunion THEN BEGIN statement (';' statement)* END
   ;

whilestmt
   : WHILE condition DO statement
   ;

breakstmt
	: BREAK
	;

continuestmt
	: CONTINUE
	;

condition
   : expression # ExprCond
   | expression op=('=' | '!=' | '<' | '<=' | '>' | '>=') expression # Comparison
   ;

conditionunion
   : condition (opp=('AND'|'OR')condition)*
   ;

expression
   :
    factor #FactorExpr
   |expression op=('+' | '-') expression # SummExpr
   |expression op=('*' | '/') expression # MultExpr
   ;


factor
   : ident
   | number
   | literal
   | '(' factor ')'
   | assignstmt
   ;

literal
	:	integerLiteral
	|	floatLiteral
	|   charLiteral
	;

integerLiteral
    :   NUMBER
    ;

floatLiteral
    :  NUMBER '.' NUMBER*
    ;

charLiteral
    :  '\'' STRING '\''
    ;

ident
   : STRING
   ;

number
   : NUMBER
   ;

BREAK
	: 'BREAK'
	;

CONTINUE
	: 'CONTINUE'
	;


WRITE
   : 'WRITE'
   ;


WHILE
   : 'WHILE'
   ;


DO
   : 'DO'
   ;


IF
   : 'IF'
   ;


THEN
   : 'THEN'
   ;


ODD
   : 'ODD'
   ;


BEGIN
   : 'BEGIN'
   ;


END
   : 'END'
   ;


CALL
   : 'CALL'
   ;


CONST
   : 'CONST'
   ;


VAR
   : 'VAR'
   ;


PROCEDURE
   : 'PROCEDURE'
   ;


STRING
   : [a-zA-Z] [a-zA-Z]*
   ;


NUMBER
   : [0-9] +
   ;


BlockComment
: '/*' .*? '*/'
-> skip
;


LineComment
: '//' ~[\r\n]*
-> skip
;


WS
   : [ \t\r\n] -> skip
   ;
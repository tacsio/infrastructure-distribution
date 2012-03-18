grammar IDL;

options {

 output = AST;
 ASTLabelType = CommonTree;
 
}

tokens {

T_PUBLIC = 'public';
T_INTEFACE = 'interface';
T_INT = 'int';
T_BOOLEAN = 'boolean';
T_STRING = 'String';
T_BYTE = 'byte';
T_CHAR = 'char';
T_FLOAT = 'float';
T_DOUBLE = 'double';
T_VOID = 'void';
T_LCHAVE = '{';
T_RCHAVE = '}';
T_PONTOVIRG = ';';
T_VIRGULA = ',';
T_LPAREN = '(';
T_RPAREN = ')';

INTERFACE;
METODO;
LIST_PARAM;
PARAM;
}


interface_
	:		T_PUBLIC T_INTEFACE ID T_LCHAVE
			methods
			T_RCHAVE
			//AST
	->^(INTERFACE
		methods)	
	;
	
methods
	:	method*
	;
	
method
	:	T_PUBLIC type ID T_LPAREN params? T_RPAREN T_PONTOVIRG

	//AST
	->^(METODO
	^(ID)
	^(type)
	^(LIST_PARAM params)?
	)
	;

params
	:	param (T_VIRGULA param)*
	
	//AST
	->^(PARAM param)*
	;
	
param
	:	type ID
	
	//AST
	-> ^(type)
		^(ID)
	;
	
type
	:	T_INT
	|	T_STRING
	|  T_BOOLEAN
	|	T_BYTE
	|	T_CHAR
	|	T_FLOAT
	|	T_DOUBLE
	|	T_VOID
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

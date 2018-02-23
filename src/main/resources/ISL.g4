grammar ISL;


expression
    : NUMBER            #Number
    | TRUE        #LogicalTrue
    | FALSE        #LogicalFalse
    | STRING            #String
    | NULL              #Null
    | VARIABLE          #Variable
    | LEFT_PAREN expression RIGHT_PAREN    #Paren
    | expression'.'TRANSFORM  #Attribute
    | NOT expression    #LogicalNotEqExp
    | NEG expression    #NegExp
    | te=expression IF ee=expression ELSE fe=expression  #ifExp
    | expression op=(GT | GTE | LT | LTE | EQ | NE | CONTAINS) expression    #ExpCmp
    | expression AND expression    #ExpLogicalAnd
    | expression OR expression    #ExpLogicalOr
;



NEG : '-' ;
GT : '>' ;
GTE : '>=' ;
LT : '<' ;
LTE : '<=' ;
EQ : '==' ;
NE : '!=' ;
TRUE : 'true' ;
FALSE : 'false' ;
NULL: 'null';
AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;
CONTAINS: 'contains' ;
LEFT_PAREN : '(' ;
RIGHT_PAREN : ')' ;
IF : 'if' ;
ELSE : 'else' ;
DOUBLE_QUOTATION : '"' ;
TRANSFORM: 'exists'|'bool'|'int'|'double'|'str';

VARIABLE : ([a-z]|[A-Z]|[_])([a-z]|[A-Z]|[0-9])*;
NUMBER : [0-9]+|[0]|([0-9]+[.][0-9]+) ;
STRING : '"'('\\"'|.)*?'"' ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
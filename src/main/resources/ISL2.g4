grammar ISL2;


expression
    : NUMBER            #Number
    | STRING            #String
    | NULL              #Null
    | TRANSFORM         #Transform
    | VARIABLE          #Variable
    | expression'.'TRANSFORM  #Attribute
    | NEG expression    #NEGExp
    | LEFT_PAREN expression RIGHT_PAREN    #Paren
    | te=expression IF ee=equalityExpression ELSE fe=expression  #ifExp
;

equalityExpression
    : TRUE        #LogicalTrue
    | FALSE        #LogicalFalse
    | expression op=(GT | GTE | LT | LTE | EQ | NE | CONTAINS) expression    #LogicalExpCmp
    | equalityExpression op=(AND | OR | EQ | NE) equalityExpression    #LogicalEqExpCmp
    | NOT equalityExpression    #LogicalNotEqExp
    | LEFT_PAREN equalityExpression RIGHT_PAREN        # LogicalParen
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
CR : '\n' ;
IF : 'if' ;
ELSE : 'else' ;
DOUBLE_QUOTATION : '"' ;
TRANSFORM: 'exists'|'bool'|'int'|'double'|'str';

VARIABLE : ([a-z]|[A-Z]|[_])([a-z]|[A-Z]|[0-9])*;
NUMBER : [0-9]+|[0]|([0-9]+[.][0-9]+) ;
STRING : '"'('\\"'|.)*?'"' ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
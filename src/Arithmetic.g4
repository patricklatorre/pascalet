grammar Pascalet;

NUMBER : [0-9]+;
NEWLINE     : '\n';
WHITESPACE     : [ \t\r]+ -> skip;

PLUS  : '+';
MINUS : '-';
MULTIPLY  : '*';
DIVIDE   : '/';
MODULO    : '%';
LPAREN  : '(';
RPAREN  : ')';

expression
    : level1 NEWLINE            # Evaluate
    | NEWLINE                   # DoNothing
    ;


level1
    : level1 PLUS level2        # Addition
    | level1 MINUS level2       # Subtraction
    | level2                    # ToLevel2
    ;

level2
    : level2 MULTIPLY negate    # Multiplication
    | level2 DIVIDE negate      # Division
    | level2 MODULO negate      # Modulo
    | negate                    # ToNegate
    ;

negate
    : MINUS negate              # NegateSign
    | unit                      # ToUnitPriority
    ;

unit
    : NUMBER                    # Number
    | LPAREN level1 RPAREN      # Parenthesize
    ;


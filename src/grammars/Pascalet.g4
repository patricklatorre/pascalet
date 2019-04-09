grammar Pascalet;

program
   : programHeading (INTERFACE)? block DOT
   ;

programHeading
   : PROGRAM identifier (LPAREN identifierList RPAREN)? SEMI
   | UNIT identifier SEMI
   ;

typeDefinitionPart
   : TYPE (typeDefinition SEMI) +
   ;

typeDefinition
   : identifier EQUAL (type | functionType | procedureType)
   ;

functionType
   : FUNCTION (formalParameterList)? COLON resultType
   ;

procedureType
   : PROCEDURE (formalParameterList)?
   ;
resultType
   : typeIdentifier
   ;

componentType
   : type
   ;

labelDeclarationPart
   : LABEL label (COMMA label)* SEMI
   ;

label
   : unsignedInteger
   ;

constantDefinitionPart
   : CONST (constantDefinition SEMI) +
   ;

constantDefinition
   : identifier EQUAL constant
   ;

block
   : (labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | IMPLEMENTATION)* compoundStatement
     ;

structuredType
   : PACKED unpackedStructuredType
   | unpackedStructuredType
   ;

type
   : simpleType
   | structuredType
   ;

simpleType
   : scalarType
   | subrangeType
   | typeIdentifier
   ;

scalarType
   : LPAREN identifierList RPAREN
   ;
subrangeType
   : constant DOTDOT constant
   ;

typeIdentifier
   : identifier
   | (CHAR | BOOLEAN | INTEGER | STRING)
   ;

variableDeclarationPart
   : VAR variableDeclaration (SEMI variableDeclaration)* SEMI
   ;

variableDeclaration
   : identifierList COLON type
   ;

procedureAndFunctionDeclarationPart
   : procedureOrFunctionDeclaration SEMI
   ;

procedureOrFunctionDeclaration
   : procedureDeclaration
   | functionDeclaration
   ;

procedureDeclaration
   : PROCEDURE identifier (formalParameterList)? SEMI block
   ;

formalParameterList
   : LPAREN formalParameterSection (SEMI formalParameterSection)* RPAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   | PROCEDURE parameterGroup
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

constList
   : constant (COMMA constant)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON resultType SEMI block
   ;

typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : simpleType
   ;

unpackedStructuredType
   : arrayType
   ;

arrayType
   : ARRAY LBRACK typeList RBRACK OF componentType
   | ARRAY LBRACK2 typeList RBRACK2 OF componentType
   ;

procedureStatement
   : identifier (LPAREN parameterList RPAREN)?
   ;

forStatement
   : FOR identifier ASSIGN forList DO statement
   ;

forList
   : initialValue (TO | DOWNTO) finalValue
   ;

initialValue
   : expression
   ;

finalValue
   : expression
   ;

emptyStatement
   :
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | identifier
   | sign identifier
   | string
   ;

structuredStatement
   : compoundStatement
   | conditionalStatement
   | repetetiveStatement
   ;

compoundStatement
   : BEGIN statements END
   ;

statements
   : statement (SEMI statement)*
   ;

conditionalStatement
   : ifStatement
   ;

ifStatement
   : IF expression THEN statement (: ELSE statement)?
   ;

repetetiveStatement
   : forStatement
   ;

statement
   : label COLON unlabelledStatement
   | unlabelledStatement
   ;

unlabelledStatement
   : simpleStatement
   | structuredStatement
   ;

simpleStatement
   : assignmentStatement
   | procedureStatement
   | emptyStatement
   ;

unsignedInteger
   : NUM_INT
   ;

sign
   : PLUS
   | MINUS
   ;

bool
   : TRUE
   | FALSE
   ;

string
   : STRING_LITERAL
   ;

unsignedConstant
   : unsignedNumber
   | string
   | NIL
   ;
unsignedNumber
   : unsignedInteger
   ;

actualParameter
   : expression parameterwidth*
   ;

parameterwidth
   : ':' expression
   ;

functionDesignator
   : identifier LPAREN parameterList RPAREN
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;

identifier
   : IDENT
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : (AT identifier | identifier) (LBRACK expression (COMMA expression)* RBRACK | LBRACK2 expression (COMMA expression)* RBRACK2 | DOT identifier | POINTER)*
   ;

expression
   : simpleExpression (relationaloperator expression)?
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT
   | LE
   | GE
   | GT
   | IN
   ;

simpleExpression
   : term (additiveoperator simpleExpression)?
   ;

additiveoperator
   : PLUS
   | MINUS
   | OR
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
   : STAR
   | SLASH
   | DIV
   | MOD
   | AND
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | LPAREN expression RPAREN
   | functionDesignator
   | unsignedConstant
   | NOT factor
   | bool
   ;

fragment A
   : ('a' | 'A')
   ;


fragment B
   : ('b' | 'B')
   ;


fragment C
   : ('c' | 'C')
   ;


fragment D
   : ('d' | 'D')
   ;


fragment E
   : ('e' | 'E')
   ;


fragment F
   : ('f' | 'F')
   ;


fragment G
   : ('g' | 'G')
   ;


fragment H
   : ('h' | 'H')
   ;


fragment I
   : ('i' | 'I')
   ;


fragment J
   : ('j' | 'J')
   ;


fragment K
   : ('k' | 'K')
   ;


fragment L
   : ('l' | 'L')
   ;


fragment M
   : ('m' | 'M')
   ;


fragment N
   : ('n' | 'N')
   ;


fragment O
   : ('o' | 'O')
   ;


fragment P
   : ('p' | 'P')
   ;


fragment Q
   : ('q' | 'Q')
   ;


fragment R
   : ('r' | 'R')
   ;


fragment S
   : ('s' | 'S')
   ;


fragment T
   : ('t' | 'T')
   ;


fragment U
   : ('u' | 'U')
   ;


fragment V
   : ('v' | 'V')
   ;


fragment W
   : ('w' | 'W')
   ;


fragment X
   : ('x' | 'X')
   ;


fragment Y
   : ('y' | 'Y')
   ;


fragment Z
   : ('z' | 'Z')
   ;

CONST
   : C O N S T
   ;

AND
   : A N D
   ;


ARRAY
   : A R R A Y
   ;


BEGIN
   : B E G I N
   ;


BOOLEAN
   : B O O L E A N
   ;
CHAR
   : C H A R
   ;

DIV
   : D I V
   ;


DO
   : D O
   ;

ELSE
   : E L S E
   ;


END
   : E N D
   ;

FOR
   : F O R
   ;


FUNCTION
   : F U N C T I O N
   ;

IF
   : I F
   ;


IN
   : I N
   ;


INTEGER
   : I N T E G E R
   ;


LABEL
   : L A B E L
   ;


MOD
   : M O D
   ;

NOT
   : N O T
   ;


OF
   : O F
   ;


OR
   : O R
   ;

PROCEDURE
   : P R O C E D U R E
   ;


PROGRAM
   : P R O G R A M
   ;

THEN
   : T H E N
   ;


TO
   : T O
   ;


TYPE
   : T Y P E
   ;


UNTIL
   : U N T I L
   ;

VAR
   : V A R
   ;

PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


STAR
   : '*'
   ;


SLASH
   : '/'
   ;


ASSIGN
   : ':='
   ;


COMMA
   : ','
   ;


SEMI
   : ';'
   ;


COLON
   : ':'
   ;


EQUAL
   : '='
   ;


NOT_EQUAL
   : '<>'
   ;


LT
   : '<'
   ;


LE
   : '<='
   ;


GE
   : '>='
   ;


GT
   : '>'
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


LBRACK
   : '['
   ;


LBRACK2
   : '(.'
   ;


RBRACK
   : ']'
   ;


RBRACK2
   : '.)'
   ;


POINTER
   : '^'
   ;


AT
   : '@'
   ;


DOT
   : '.'
   ;


DOTDOT
   : '..'
   ;


LCURLY
   : '{'
   ;


RCURLY
   : '}'
   ;


USES
   : U S E S
   ;


STRING
   : S T R I N G
   ;

TRUE
   : T R U E
   ;


FALSE
   : F A L S E
   ;


WS
   : [ \t\r\n] -> skip
   ;


COMMENT_1
   : '(*' .*? '*)' -> skip
   ;


COMMENT_2
   : '{' .*? '}' -> skip
   ;


IDENT
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
   ;


STRING_LITERAL
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


NUM_INT
   : ('0' .. '9') +
   ;
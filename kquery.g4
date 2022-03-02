// Grammar for KLEE KQuery Parser.

grammar kquery;

kqueryExpression 
    : ktranslationUnit* EOF
    ;

ktranslationUnit
    : arrayDeclaration
    | queryCommand
    ;

queryCommand 
    : '(' 'query' evalExprList queryExpr ')' 
    ;
        
queryExpr 
    : expression 
    | expression evalExprList
    | expression evalExprList evalArrayList
    |
    ;
    
evalExprList 
    : LeftBracket expression RightBracket  
    | LeftBracket RightBracket
    |
    ;
    
evalArrayList 
    : LeftBracket Identifier  RightBracket  
    | LeftBracket RightBracket 
    |
    ;

arrayDeclaration
    : 'array' arrName LeftBracket Digit* RightBracket ':' domain '->' rangeLimit '=' arrayInitializer
    ;
    
arrayInitializer
    : 'symbolic' 
    | LeftBracket numberList RightBracket
    ;

expression
    : Identifier
    | Identifier ':' expression   
    | '(' WidthType number ')'
    | '(' arithmeticExpr WidthType expression expression ')'
    | '(' 'Not' LeftBracket WidthType RightBracket expression ')'
    | '(' bitwiseExpr WidthType expression expression ')' 
    | '(' 'Shl' WidthType expression expression ')'
    | '(' 'LShr' WidthType expression expression ')'
    | '(' 'AShr' WidthType expression expression ')'
    | '(' comparisonExpr ( WidthType ) expression expression ')'  
    | '(' 'Concat' ( WidthType ) expression expression ')'
    | '(' 'Extract' WidthType number expression ')'
    | '(' 'ZExt' WidthType expression ')'
    | '(' 'SExt' WidthType expression ')'
    | '(' 'Read' WidthType expression version ')'  
    | '(' 'Select' WidthType expression expression expression ')'  
    | '(' 'Neg' ( WidthType ) expression ')'
    | '(' 'ReadLSB' WidthType expression version ')'  
    | '(' 'ReadMSB' WidthType expression version ')'  
    | number
    ;
    
bitwiseExpr : ( 'And' | 'Or' | 'Xor' | 'Shl' | 'LShr' | 'AShr' )  ;
comparisonExpr : ( 'Eq' | 'Ne' | 'Ult' | 'Ule' | 'Ugt' | 'Uge' | 'Slt' | 'Sle' | 'Sgt' | 'Sge' ) ;
arithmeticExpr : ( 'Add' | 'Sub' | 'Mul' | 'UDiv' | 'URem' | 'SDiv' | 'SRem' )  ;
domain : WidthType ;
rangeLimit : WidthType ;
arrName : Identifier ;

numberList
    : number
    | number ',' numberList
    ;

number 
    : 'true' 
    | 'false' 
    | SignedConstant
    | Constant
    ;
    
SignedConstant 
    : ('+' | '-')( DecConstant | BinConstant | OctConstant | HexConstant )
    ;
    
Constant
    : ( DecConstant | BinConstant | OctConstant | HexConstant )
    ;
    
DecConstant : (Digit)+  ;
BinConstant : '0b'('0' | '1' | '_')+  ;
OctConstant : '0o'('0'..'7' | '_')+  ;
HexConstant : '0x'('0'..'9' | 'a'..'z' | 'A'..'Z' | '_' )+  ;

floatingPointwidthType : 'fp'(Digit)+((.).*?)?  ;
integerwidthType : 'i'(Digit)+ ;

WidthType 
    : 'w'Digit+
    ;

version
    : Identifier 
    | LeftBracket ( updateList ) RightBracket '@' version
    ;
    
updateList 
    : expression '=' expression ( ',' updateList )
    ;

Identifier
  :  ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '.' )*
  ;

Digit  
    : ('0'..'9')  
    ;
    
WS : (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';
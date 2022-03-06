// Code generated from KQuery.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser // KQuery

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseKQueryListener is a complete listener for a parse tree produced by KQueryParser.
type BaseKQueryListener struct{}

var _ KQueryListener = &BaseKQueryListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseKQueryListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseKQueryListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseKQueryListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseKQueryListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterKqueryExpression is called when production kqueryExpression is entered.
func (s *BaseKQueryListener) EnterKqueryExpression(ctx *KqueryExpressionContext) {}

// ExitKqueryExpression is called when production kqueryExpression is exited.
func (s *BaseKQueryListener) ExitKqueryExpression(ctx *KqueryExpressionContext) {}

// EnterQueryStatements is called when production queryStatements is entered.
func (s *BaseKQueryListener) EnterQueryStatements(ctx *QueryStatementsContext) {}

// ExitQueryStatements is called when production queryStatements is exited.
func (s *BaseKQueryListener) ExitQueryStatements(ctx *QueryStatementsContext) {}

// EnterKtranslationUnit is called when production ktranslationUnit is entered.
func (s *BaseKQueryListener) EnterKtranslationUnit(ctx *KtranslationUnitContext) {}

// ExitKtranslationUnit is called when production ktranslationUnit is exited.
func (s *BaseKQueryListener) ExitKtranslationUnit(ctx *KtranslationUnitContext) {}

// EnterQueryCommand is called when production queryCommand is entered.
func (s *BaseKQueryListener) EnterQueryCommand(ctx *QueryCommandContext) {}

// ExitQueryCommand is called when production queryCommand is exited.
func (s *BaseKQueryListener) ExitQueryCommand(ctx *QueryCommandContext) {}

// EnterSingletonQueryExpr is called when production SingletonQueryExpr is entered.
func (s *BaseKQueryListener) EnterSingletonQueryExpr(ctx *SingletonQueryExprContext) {}

// ExitSingletonQueryExpr is called when production SingletonQueryExpr is exited.
func (s *BaseKQueryListener) ExitSingletonQueryExpr(ctx *SingletonQueryExprContext) {}

// EnterWithEvalExpr is called when production WithEvalExpr is entered.
func (s *BaseKQueryListener) EnterWithEvalExpr(ctx *WithEvalExprContext) {}

// ExitWithEvalExpr is called when production WithEvalExpr is exited.
func (s *BaseKQueryListener) ExitWithEvalExpr(ctx *WithEvalExprContext) {}

// EnterWithEvalExprAndArrayList is called when production WithEvalExprAndArrayList is entered.
func (s *BaseKQueryListener) EnterWithEvalExprAndArrayList(ctx *WithEvalExprAndArrayListContext) {}

// ExitWithEvalExprAndArrayList is called when production WithEvalExprAndArrayList is exited.
func (s *BaseKQueryListener) ExitWithEvalExprAndArrayList(ctx *WithEvalExprAndArrayListContext) {}

// EnterEvalExprList is called when production evalExprList is entered.
func (s *BaseKQueryListener) EnterEvalExprList(ctx *EvalExprListContext) {}

// ExitEvalExprList is called when production evalExprList is exited.
func (s *BaseKQueryListener) ExitEvalExprList(ctx *EvalExprListContext) {}

// EnterEvalArrayList is called when production evalArrayList is entered.
func (s *BaseKQueryListener) EnterEvalArrayList(ctx *EvalArrayListContext) {}

// ExitEvalArrayList is called when production evalArrayList is exited.
func (s *BaseKQueryListener) ExitEvalArrayList(ctx *EvalArrayListContext) {}

// EnterExpressionList is called when production expressionList is entered.
func (s *BaseKQueryListener) EnterExpressionList(ctx *ExpressionListContext) {}

// ExitExpressionList is called when production expressionList is exited.
func (s *BaseKQueryListener) ExitExpressionList(ctx *ExpressionListContext) {}

// EnterIdentifierList is called when production identifierList is entered.
func (s *BaseKQueryListener) EnterIdentifierList(ctx *IdentifierListContext) {}

// ExitIdentifierList is called when production identifierList is exited.
func (s *BaseKQueryListener) ExitIdentifierList(ctx *IdentifierListContext) {}

// EnterArrayDeclaration is called when production arrayDeclaration is entered.
func (s *BaseKQueryListener) EnterArrayDeclaration(ctx *ArrayDeclarationContext) {}

// ExitArrayDeclaration is called when production arrayDeclaration is exited.
func (s *BaseKQueryListener) ExitArrayDeclaration(ctx *ArrayDeclarationContext) {}

// EnterNumArrayElements is called when production numArrayElements is entered.
func (s *BaseKQueryListener) EnterNumArrayElements(ctx *NumArrayElementsContext) {}

// ExitNumArrayElements is called when production numArrayElements is exited.
func (s *BaseKQueryListener) ExitNumArrayElements(ctx *NumArrayElementsContext) {}

// EnterArrayInitializer is called when production arrayInitializer is entered.
func (s *BaseKQueryListener) EnterArrayInitializer(ctx *ArrayInitializerContext) {}

// ExitArrayInitializer is called when production arrayInitializer is exited.
func (s *BaseKQueryListener) ExitArrayInitializer(ctx *ArrayInitializerContext) {}

// EnterVariableName is called when production VariableName is entered.
func (s *BaseKQueryListener) EnterVariableName(ctx *VariableNameContext) {}

// ExitVariableName is called when production VariableName is exited.
func (s *BaseKQueryListener) ExitVariableName(ctx *VariableNameContext) {}

// EnterNamedAbbreviation is called when production NamedAbbreviation is entered.
func (s *BaseKQueryListener) EnterNamedAbbreviation(ctx *NamedAbbreviationContext) {}

// ExitNamedAbbreviation is called when production NamedAbbreviation is exited.
func (s *BaseKQueryListener) ExitNamedAbbreviation(ctx *NamedAbbreviationContext) {}

// EnterSizeQuery is called when production SizeQuery is entered.
func (s *BaseKQueryListener) EnterSizeQuery(ctx *SizeQueryContext) {}

// ExitSizeQuery is called when production SizeQuery is exited.
func (s *BaseKQueryListener) ExitSizeQuery(ctx *SizeQueryContext) {}

// EnterArithExpr is called when production ArithExpr is entered.
func (s *BaseKQueryListener) EnterArithExpr(ctx *ArithExprContext) {}

// ExitArithExpr is called when production ArithExpr is exited.
func (s *BaseKQueryListener) ExitArithExpr(ctx *ArithExprContext) {}

// EnterNotExprWidth is called when production NotExprWidth is entered.
func (s *BaseKQueryListener) EnterNotExprWidth(ctx *NotExprWidthContext) {}

// ExitNotExprWidth is called when production NotExprWidth is exited.
func (s *BaseKQueryListener) ExitNotExprWidth(ctx *NotExprWidthContext) {}

// EnterBitwExprWidth is called when production BitwExprWidth is entered.
func (s *BaseKQueryListener) EnterBitwExprWidth(ctx *BitwExprWidthContext) {}

// ExitBitwExprWidth is called when production BitwExprWidth is exited.
func (s *BaseKQueryListener) ExitBitwExprWidth(ctx *BitwExprWidthContext) {}

// EnterCompExprWidth is called when production CompExprWidth is entered.
func (s *BaseKQueryListener) EnterCompExprWidth(ctx *CompExprWidthContext) {}

// ExitCompExprWidth is called when production CompExprWidth is exited.
func (s *BaseKQueryListener) ExitCompExprWidth(ctx *CompExprWidthContext) {}

// EnterCompExpr is called when production CompExpr is entered.
func (s *BaseKQueryListener) EnterCompExpr(ctx *CompExprContext) {}

// ExitCompExpr is called when production CompExpr is exited.
func (s *BaseKQueryListener) ExitCompExpr(ctx *CompExprContext) {}

// EnterConcatExprWidth is called when production ConcatExprWidth is entered.
func (s *BaseKQueryListener) EnterConcatExprWidth(ctx *ConcatExprWidthContext) {}

// ExitConcatExprWidth is called when production ConcatExprWidth is exited.
func (s *BaseKQueryListener) ExitConcatExprWidth(ctx *ConcatExprWidthContext) {}

// EnterConcatExprNW is called when production ConcatExprNW is entered.
func (s *BaseKQueryListener) EnterConcatExprNW(ctx *ConcatExprNWContext) {}

// ExitConcatExprNW is called when production ConcatExprNW is exited.
func (s *BaseKQueryListener) ExitConcatExprNW(ctx *ConcatExprNWContext) {}

// EnterArrExtractExprWidth is called when production ArrExtractExprWidth is entered.
func (s *BaseKQueryListener) EnterArrExtractExprWidth(ctx *ArrExtractExprWidthContext) {}

// ExitArrExtractExprWidth is called when production ArrExtractExprWidth is exited.
func (s *BaseKQueryListener) ExitArrExtractExprWidth(ctx *ArrExtractExprWidthContext) {}

// EnterBitExtractExprWidth is called when production BitExtractExprWidth is entered.
func (s *BaseKQueryListener) EnterBitExtractExprWidth(ctx *BitExtractExprWidthContext) {}

// ExitBitExtractExprWidth is called when production BitExtractExprWidth is exited.
func (s *BaseKQueryListener) ExitBitExtractExprWidth(ctx *BitExtractExprWidthContext) {}

// EnterReadExpresssionVersioned is called when production ReadExpresssionVersioned is entered.
func (s *BaseKQueryListener) EnterReadExpresssionVersioned(ctx *ReadExpresssionVersionedContext) {}

// ExitReadExpresssionVersioned is called when production ReadExpresssionVersioned is exited.
func (s *BaseKQueryListener) ExitReadExpresssionVersioned(ctx *ReadExpresssionVersionedContext) {}

// EnterSelectExprWidth is called when production SelectExprWidth is entered.
func (s *BaseKQueryListener) EnterSelectExprWidth(ctx *SelectExprWidthContext) {}

// ExitSelectExprWidth is called when production SelectExprWidth is exited.
func (s *BaseKQueryListener) ExitSelectExprWidth(ctx *SelectExprWidthContext) {}

// EnterNegationExprWidth is called when production NegationExprWidth is entered.
func (s *BaseKQueryListener) EnterNegationExprWidth(ctx *NegationExprWidthContext) {}

// ExitNegationExprWidth is called when production NegationExprWidth is exited.
func (s *BaseKQueryListener) ExitNegationExprWidth(ctx *NegationExprWidthContext) {}

// EnterNegetionExpr is called when production NegetionExpr is entered.
func (s *BaseKQueryListener) EnterNegetionExpr(ctx *NegetionExprContext) {}

// ExitNegetionExpr is called when production NegetionExpr is exited.
func (s *BaseKQueryListener) ExitNegetionExpr(ctx *NegetionExprContext) {}

// EnterReadExpr is called when production ReadExpr is entered.
func (s *BaseKQueryListener) EnterReadExpr(ctx *ReadExprContext) {}

// ExitReadExpr is called when production ReadExpr is exited.
func (s *BaseKQueryListener) ExitReadExpr(ctx *ReadExprContext) {}

// EnterVersionExpr is called when production VersionExpr is entered.
func (s *BaseKQueryListener) EnterVersionExpr(ctx *VersionExprContext) {}

// ExitVersionExpr is called when production VersionExpr is exited.
func (s *BaseKQueryListener) ExitVersionExpr(ctx *VersionExprContext) {}

// EnterSingleton is called when production Singleton is entered.
func (s *BaseKQueryListener) EnterSingleton(ctx *SingletonContext) {}

// ExitSingleton is called when production Singleton is exited.
func (s *BaseKQueryListener) ExitSingleton(ctx *SingletonContext) {}

// EnterGenericBitRead is called when production genericBitRead is entered.
func (s *BaseKQueryListener) EnterGenericBitRead(ctx *GenericBitReadContext) {}

// ExitGenericBitRead is called when production genericBitRead is exited.
func (s *BaseKQueryListener) ExitGenericBitRead(ctx *GenericBitReadContext) {}

// EnterBitExtractExpr is called when production bitExtractExpr is entered.
func (s *BaseKQueryListener) EnterBitExtractExpr(ctx *BitExtractExprContext) {}

// ExitBitExtractExpr is called when production bitExtractExpr is exited.
func (s *BaseKQueryListener) ExitBitExtractExpr(ctx *BitExtractExprContext) {}

// EnterVersionVariableName is called when production VersionVariableName is entered.
func (s *BaseKQueryListener) EnterVersionVariableName(ctx *VersionVariableNameContext) {}

// ExitVersionVariableName is called when production VersionVariableName is exited.
func (s *BaseKQueryListener) ExitVersionVariableName(ctx *VersionVariableNameContext) {}

// EnterVersionedNamedAbbreviation is called when production VersionedNamedAbbreviation is entered.
func (s *BaseKQueryListener) EnterVersionedNamedAbbreviation(ctx *VersionedNamedAbbreviationContext) {}

// ExitVersionedNamedAbbreviation is called when production VersionedNamedAbbreviation is exited.
func (s *BaseKQueryListener) ExitVersionedNamedAbbreviation(ctx *VersionedNamedAbbreviationContext) {}

// EnterUpdationList is called when production UpdationList is entered.
func (s *BaseKQueryListener) EnterUpdationList(ctx *UpdationListContext) {}

// ExitUpdationList is called when production UpdationList is exited.
func (s *BaseKQueryListener) ExitUpdationList(ctx *UpdationListContext) {}

// EnterNoUpdateList is called when production NoUpdateList is entered.
func (s *BaseKQueryListener) EnterNoUpdateList(ctx *NoUpdateListContext) {}

// ExitNoUpdateList is called when production NoUpdateList is exited.
func (s *BaseKQueryListener) ExitNoUpdateList(ctx *NoUpdateListContext) {}

// EnterNotExpr is called when production notExpr is entered.
func (s *BaseKQueryListener) EnterNotExpr(ctx *NotExprContext) {}

// ExitNotExpr is called when production notExpr is exited.
func (s *BaseKQueryListener) ExitNotExpr(ctx *NotExprContext) {}

// EnterConcatExpr is called when production concatExpr is entered.
func (s *BaseKQueryListener) EnterConcatExpr(ctx *ConcatExprContext) {}

// ExitConcatExpr is called when production concatExpr is exited.
func (s *BaseKQueryListener) ExitConcatExpr(ctx *ConcatExprContext) {}

// EnterExprNegation is called when production exprNegation is entered.
func (s *BaseKQueryListener) EnterExprNegation(ctx *ExprNegationContext) {}

// ExitExprNegation is called when production exprNegation is exited.
func (s *BaseKQueryListener) ExitExprNegation(ctx *ExprNegationContext) {}

// EnterSelectExpr is called when production selectExpr is entered.
func (s *BaseKQueryListener) EnterSelectExpr(ctx *SelectExprContext) {}

// ExitSelectExpr is called when production selectExpr is exited.
func (s *BaseKQueryListener) ExitSelectExpr(ctx *SelectExprContext) {}

// EnterArrExtractExpr is called when production arrExtractExpr is entered.
func (s *BaseKQueryListener) EnterArrExtractExpr(ctx *ArrExtractExprContext) {}

// ExitArrExtractExpr is called when production arrExtractExpr is exited.
func (s *BaseKQueryListener) ExitArrExtractExpr(ctx *ArrExtractExprContext) {}

// EnterVarName is called when production varName is entered.
func (s *BaseKQueryListener) EnterVarName(ctx *VarNameContext) {}

// ExitVarName is called when production varName is exited.
func (s *BaseKQueryListener) ExitVarName(ctx *VarNameContext) {}

// EnterLeftExpr is called when production leftExpr is entered.
func (s *BaseKQueryListener) EnterLeftExpr(ctx *LeftExprContext) {}

// ExitLeftExpr is called when production leftExpr is exited.
func (s *BaseKQueryListener) ExitLeftExpr(ctx *LeftExprContext) {}

// EnterRightExpr is called when production rightExpr is entered.
func (s *BaseKQueryListener) EnterRightExpr(ctx *RightExprContext) {}

// ExitRightExpr is called when production rightExpr is exited.
func (s *BaseKQueryListener) ExitRightExpr(ctx *RightExprContext) {}

// EnterNamedConstant is called when production namedConstant is entered.
func (s *BaseKQueryListener) EnterNamedConstant(ctx *NamedConstantContext) {}

// ExitNamedConstant is called when production namedConstant is exited.
func (s *BaseKQueryListener) ExitNamedConstant(ctx *NamedConstantContext) {}

// EnterUpdateList is called when production updateList is entered.
func (s *BaseKQueryListener) EnterUpdateList(ctx *UpdateListContext) {}

// ExitUpdateList is called when production updateList is exited.
func (s *BaseKQueryListener) ExitUpdateList(ctx *UpdateListContext) {}

// EnterBitwiseExpr is called when production bitwiseExpr is entered.
func (s *BaseKQueryListener) EnterBitwiseExpr(ctx *BitwiseExprContext) {}

// ExitBitwiseExpr is called when production bitwiseExpr is exited.
func (s *BaseKQueryListener) ExitBitwiseExpr(ctx *BitwiseExprContext) {}

// EnterComparisonExpr is called when production comparisonExpr is entered.
func (s *BaseKQueryListener) EnterComparisonExpr(ctx *ComparisonExprContext) {}

// ExitComparisonExpr is called when production comparisonExpr is exited.
func (s *BaseKQueryListener) ExitComparisonExpr(ctx *ComparisonExprContext) {}

// EnterArithmeticExpr is called when production arithmeticExpr is entered.
func (s *BaseKQueryListener) EnterArithmeticExpr(ctx *ArithmeticExprContext) {}

// ExitArithmeticExpr is called when production arithmeticExpr is exited.
func (s *BaseKQueryListener) ExitArithmeticExpr(ctx *ArithmeticExprContext) {}

// EnterDomain is called when production domain is entered.
func (s *BaseKQueryListener) EnterDomain(ctx *DomainContext) {}

// ExitDomain is called when production domain is exited.
func (s *BaseKQueryListener) ExitDomain(ctx *DomainContext) {}

// EnterRangeLimit is called when production rangeLimit is entered.
func (s *BaseKQueryListener) EnterRangeLimit(ctx *RangeLimitContext) {}

// ExitRangeLimit is called when production rangeLimit is exited.
func (s *BaseKQueryListener) ExitRangeLimit(ctx *RangeLimitContext) {}

// EnterArrName is called when production arrName is entered.
func (s *BaseKQueryListener) EnterArrName(ctx *ArrNameContext) {}

// ExitArrName is called when production arrName is exited.
func (s *BaseKQueryListener) ExitArrName(ctx *ArrNameContext) {}

// EnterNumberList is called when production numberList is entered.
func (s *BaseKQueryListener) EnterNumberList(ctx *NumberListContext) {}

// ExitNumberList is called when production numberList is exited.
func (s *BaseKQueryListener) ExitNumberList(ctx *NumberListContext) {}

// EnterNumber is called when production number is entered.
func (s *BaseKQueryListener) EnterNumber(ctx *NumberContext) {}

// ExitNumber is called when production number is exited.
func (s *BaseKQueryListener) ExitNumber(ctx *NumberContext) {}

// EnterConstant is called when production constant is entered.
func (s *BaseKQueryListener) EnterConstant(ctx *ConstantContext) {}

// ExitConstant is called when production constant is exited.
func (s *BaseKQueryListener) ExitConstant(ctx *ConstantContext) {}

// EnterBoolnum is called when production boolnum is entered.
func (s *BaseKQueryListener) EnterBoolnum(ctx *BoolnumContext) {}

// ExitBoolnum is called when production boolnum is exited.
func (s *BaseKQueryListener) ExitBoolnum(ctx *BoolnumContext) {}

// EnterSignedConstant is called when production signedConstant is entered.
func (s *BaseKQueryListener) EnterSignedConstant(ctx *SignedConstantContext) {}

// ExitSignedConstant is called when production signedConstant is exited.
func (s *BaseKQueryListener) ExitSignedConstant(ctx *SignedConstantContext) {}

// EnterWidthOrSizeExpr is called when production widthOrSizeExpr is entered.
func (s *BaseKQueryListener) EnterWidthOrSizeExpr(ctx *WidthOrSizeExprContext) {}

// ExitWidthOrSizeExpr is called when production widthOrSizeExpr is exited.
func (s *BaseKQueryListener) ExitWidthOrSizeExpr(ctx *WidthOrSizeExprContext) {}

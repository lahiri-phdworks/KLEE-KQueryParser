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

// EnterKtranslationUnit is called when production ktranslationUnit is entered.
func (s *BaseKQueryListener) EnterKtranslationUnit(ctx *KtranslationUnitContext) {}

// ExitKtranslationUnit is called when production ktranslationUnit is exited.
func (s *BaseKQueryListener) ExitKtranslationUnit(ctx *KtranslationUnitContext) {}

// EnterQueryCommand is called when production queryCommand is entered.
func (s *BaseKQueryListener) EnterQueryCommand(ctx *QueryCommandContext) {}

// ExitQueryCommand is called when production queryCommand is exited.
func (s *BaseKQueryListener) ExitQueryCommand(ctx *QueryCommandContext) {}

// EnterQueryExpr is called when production queryExpr is entered.
func (s *BaseKQueryListener) EnterQueryExpr(ctx *QueryExprContext) {}

// ExitQueryExpr is called when production queryExpr is exited.
func (s *BaseKQueryListener) ExitQueryExpr(ctx *QueryExprContext) {}

// EnterEvalExprList is called when production evalExprList is entered.
func (s *BaseKQueryListener) EnterEvalExprList(ctx *EvalExprListContext) {}

// ExitEvalExprList is called when production evalExprList is exited.
func (s *BaseKQueryListener) ExitEvalExprList(ctx *EvalExprListContext) {}

// EnterEvalArrayList is called when production evalArrayList is entered.
func (s *BaseKQueryListener) EnterEvalArrayList(ctx *EvalArrayListContext) {}

// ExitEvalArrayList is called when production evalArrayList is exited.
func (s *BaseKQueryListener) ExitEvalArrayList(ctx *EvalArrayListContext) {}

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

// EnterExpression is called when production expression is entered.
func (s *BaseKQueryListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseKQueryListener) ExitExpression(ctx *ExpressionContext) {}

// EnterGenericBitRead is called when production genericBitRead is entered.
func (s *BaseKQueryListener) EnterGenericBitRead(ctx *GenericBitReadContext) {}

// ExitGenericBitRead is called when production genericBitRead is exited.
func (s *BaseKQueryListener) ExitGenericBitRead(ctx *GenericBitReadContext) {}

// EnterBitExtractExpr is called when production bitExtractExpr is entered.
func (s *BaseKQueryListener) EnterBitExtractExpr(ctx *BitExtractExprContext) {}

// ExitBitExtractExpr is called when production bitExtractExpr is exited.
func (s *BaseKQueryListener) ExitBitExtractExpr(ctx *BitExtractExprContext) {}

// EnterVersion is called when production version is entered.
func (s *BaseKQueryListener) EnterVersion(ctx *VersionContext) {}

// ExitVersion is called when production version is exited.
func (s *BaseKQueryListener) ExitVersion(ctx *VersionContext) {}

// EnterFullyQualifiedExpression is called when production fullyQualifiedExpression is entered.
func (s *BaseKQueryListener) EnterFullyQualifiedExpression(ctx *FullyQualifiedExpressionContext) {}

// ExitFullyQualifiedExpression is called when production fullyQualifiedExpression is exited.
func (s *BaseKQueryListener) ExitFullyQualifiedExpression(ctx *FullyQualifiedExpressionContext) {}

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

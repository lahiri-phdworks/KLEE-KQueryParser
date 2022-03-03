// Code generated from KQuery.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser // KQuery

import "github.com/antlr/antlr4/runtime/Go/antlr"

// KQueryListener is a complete listener for a parse tree produced by KQueryParser.
type KQueryListener interface {
	antlr.ParseTreeListener

	// EnterKqueryExpression is called when entering the kqueryExpression production.
	EnterKqueryExpression(c *KqueryExpressionContext)

	// EnterKtranslationUnit is called when entering the ktranslationUnit production.
	EnterKtranslationUnit(c *KtranslationUnitContext)

	// EnterQueryCommand is called when entering the queryCommand production.
	EnterQueryCommand(c *QueryCommandContext)

	// EnterQueryExpr is called when entering the queryExpr production.
	EnterQueryExpr(c *QueryExprContext)

	// EnterEvalExprList is called when entering the evalExprList production.
	EnterEvalExprList(c *EvalExprListContext)

	// EnterEvalArrayList is called when entering the evalArrayList production.
	EnterEvalArrayList(c *EvalArrayListContext)

	// EnterArrayDeclaration is called when entering the arrayDeclaration production.
	EnterArrayDeclaration(c *ArrayDeclarationContext)

	// EnterNumArrayElements is called when entering the numArrayElements production.
	EnterNumArrayElements(c *NumArrayElementsContext)

	// EnterArrayInitializer is called when entering the arrayInitializer production.
	EnterArrayInitializer(c *ArrayInitializerContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterGenericBitRead is called when entering the genericBitRead production.
	EnterGenericBitRead(c *GenericBitReadContext)

	// EnterBitExtractExpr is called when entering the bitExtractExpr production.
	EnterBitExtractExpr(c *BitExtractExprContext)

	// EnterVersion is called when entering the version production.
	EnterVersion(c *VersionContext)

	// EnterFullyQualifiedExpression is called when entering the fullyQualifiedExpression production.
	EnterFullyQualifiedExpression(c *FullyQualifiedExpressionContext)

	// EnterNotExpr is called when entering the notExpr production.
	EnterNotExpr(c *NotExprContext)

	// EnterConcatExpr is called when entering the concatExpr production.
	EnterConcatExpr(c *ConcatExprContext)

	// EnterExprNegation is called when entering the exprNegation production.
	EnterExprNegation(c *ExprNegationContext)

	// EnterSelectExpr is called when entering the selectExpr production.
	EnterSelectExpr(c *SelectExprContext)

	// EnterArrExtractExpr is called when entering the arrExtractExpr production.
	EnterArrExtractExpr(c *ArrExtractExprContext)

	// EnterVarName is called when entering the varName production.
	EnterVarName(c *VarNameContext)

	// EnterLeftExpr is called when entering the leftExpr production.
	EnterLeftExpr(c *LeftExprContext)

	// EnterRightExpr is called when entering the rightExpr production.
	EnterRightExpr(c *RightExprContext)

	// EnterNamedConstant is called when entering the namedConstant production.
	EnterNamedConstant(c *NamedConstantContext)

	// EnterUpdateList is called when entering the updateList production.
	EnterUpdateList(c *UpdateListContext)

	// EnterBitwiseExpr is called when entering the bitwiseExpr production.
	EnterBitwiseExpr(c *BitwiseExprContext)

	// EnterComparisonExpr is called when entering the comparisonExpr production.
	EnterComparisonExpr(c *ComparisonExprContext)

	// EnterArithmeticExpr is called when entering the arithmeticExpr production.
	EnterArithmeticExpr(c *ArithmeticExprContext)

	// EnterDomain is called when entering the domain production.
	EnterDomain(c *DomainContext)

	// EnterRangeLimit is called when entering the rangeLimit production.
	EnterRangeLimit(c *RangeLimitContext)

	// EnterArrName is called when entering the arrName production.
	EnterArrName(c *ArrNameContext)

	// EnterNumberList is called when entering the numberList production.
	EnterNumberList(c *NumberListContext)

	// EnterNumber is called when entering the number production.
	EnterNumber(c *NumberContext)

	// EnterConstant is called when entering the constant production.
	EnterConstant(c *ConstantContext)

	// EnterBoolnum is called when entering the boolnum production.
	EnterBoolnum(c *BoolnumContext)

	// EnterSignedConstant is called when entering the signedConstant production.
	EnterSignedConstant(c *SignedConstantContext)

	// EnterWidthOrSizeExpr is called when entering the widthOrSizeExpr production.
	EnterWidthOrSizeExpr(c *WidthOrSizeExprContext)

	// ExitKqueryExpression is called when exiting the kqueryExpression production.
	ExitKqueryExpression(c *KqueryExpressionContext)

	// ExitKtranslationUnit is called when exiting the ktranslationUnit production.
	ExitKtranslationUnit(c *KtranslationUnitContext)

	// ExitQueryCommand is called when exiting the queryCommand production.
	ExitQueryCommand(c *QueryCommandContext)

	// ExitQueryExpr is called when exiting the queryExpr production.
	ExitQueryExpr(c *QueryExprContext)

	// ExitEvalExprList is called when exiting the evalExprList production.
	ExitEvalExprList(c *EvalExprListContext)

	// ExitEvalArrayList is called when exiting the evalArrayList production.
	ExitEvalArrayList(c *EvalArrayListContext)

	// ExitArrayDeclaration is called when exiting the arrayDeclaration production.
	ExitArrayDeclaration(c *ArrayDeclarationContext)

	// ExitNumArrayElements is called when exiting the numArrayElements production.
	ExitNumArrayElements(c *NumArrayElementsContext)

	// ExitArrayInitializer is called when exiting the arrayInitializer production.
	ExitArrayInitializer(c *ArrayInitializerContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitGenericBitRead is called when exiting the genericBitRead production.
	ExitGenericBitRead(c *GenericBitReadContext)

	// ExitBitExtractExpr is called when exiting the bitExtractExpr production.
	ExitBitExtractExpr(c *BitExtractExprContext)

	// ExitVersion is called when exiting the version production.
	ExitVersion(c *VersionContext)

	// ExitFullyQualifiedExpression is called when exiting the fullyQualifiedExpression production.
	ExitFullyQualifiedExpression(c *FullyQualifiedExpressionContext)

	// ExitNotExpr is called when exiting the notExpr production.
	ExitNotExpr(c *NotExprContext)

	// ExitConcatExpr is called when exiting the concatExpr production.
	ExitConcatExpr(c *ConcatExprContext)

	// ExitExprNegation is called when exiting the exprNegation production.
	ExitExprNegation(c *ExprNegationContext)

	// ExitSelectExpr is called when exiting the selectExpr production.
	ExitSelectExpr(c *SelectExprContext)

	// ExitArrExtractExpr is called when exiting the arrExtractExpr production.
	ExitArrExtractExpr(c *ArrExtractExprContext)

	// ExitVarName is called when exiting the varName production.
	ExitVarName(c *VarNameContext)

	// ExitLeftExpr is called when exiting the leftExpr production.
	ExitLeftExpr(c *LeftExprContext)

	// ExitRightExpr is called when exiting the rightExpr production.
	ExitRightExpr(c *RightExprContext)

	// ExitNamedConstant is called when exiting the namedConstant production.
	ExitNamedConstant(c *NamedConstantContext)

	// ExitUpdateList is called when exiting the updateList production.
	ExitUpdateList(c *UpdateListContext)

	// ExitBitwiseExpr is called when exiting the bitwiseExpr production.
	ExitBitwiseExpr(c *BitwiseExprContext)

	// ExitComparisonExpr is called when exiting the comparisonExpr production.
	ExitComparisonExpr(c *ComparisonExprContext)

	// ExitArithmeticExpr is called when exiting the arithmeticExpr production.
	ExitArithmeticExpr(c *ArithmeticExprContext)

	// ExitDomain is called when exiting the domain production.
	ExitDomain(c *DomainContext)

	// ExitRangeLimit is called when exiting the rangeLimit production.
	ExitRangeLimit(c *RangeLimitContext)

	// ExitArrName is called when exiting the arrName production.
	ExitArrName(c *ArrNameContext)

	// ExitNumberList is called when exiting the numberList production.
	ExitNumberList(c *NumberListContext)

	// ExitNumber is called when exiting the number production.
	ExitNumber(c *NumberContext)

	// ExitConstant is called when exiting the constant production.
	ExitConstant(c *ConstantContext)

	// ExitBoolnum is called when exiting the boolnum production.
	ExitBoolnum(c *BoolnumContext)

	// ExitSignedConstant is called when exiting the signedConstant production.
	ExitSignedConstant(c *SignedConstantContext)

	// ExitWidthOrSizeExpr is called when exiting the widthOrSizeExpr production.
	ExitWidthOrSizeExpr(c *WidthOrSizeExprContext)
}

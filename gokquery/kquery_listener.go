// Code generated from KQuery.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser // KQuery

import "github.com/antlr/antlr4/runtime/Go/antlr"

// KQueryListener is a complete listener for a parse tree produced by KQueryParser.
type KQueryListener interface {
	antlr.ParseTreeListener

	// EnterKqueryExpression is called when entering the kqueryExpression production.
	EnterKqueryExpression(c *KqueryExpressionContext)

	// EnterQueryStatements is called when entering the queryStatements production.
	EnterQueryStatements(c *QueryStatementsContext)

	// EnterKtranslationUnit is called when entering the ktranslationUnit production.
	EnterKtranslationUnit(c *KtranslationUnitContext)

	// EnterQueryCommand is called when entering the queryCommand production.
	EnterQueryCommand(c *QueryCommandContext)

	// EnterSingletonQueryExpr is called when entering the SingletonQueryExpr production.
	EnterSingletonQueryExpr(c *SingletonQueryExprContext)

	// EnterWithEvalExpr is called when entering the WithEvalExpr production.
	EnterWithEvalExpr(c *WithEvalExprContext)

	// EnterWithEvalExprAndArrayList is called when entering the WithEvalExprAndArrayList production.
	EnterWithEvalExprAndArrayList(c *WithEvalExprAndArrayListContext)

	// EnterEvalExprList is called when entering the evalExprList production.
	EnterEvalExprList(c *EvalExprListContext)

	// EnterEvalArrayList is called when entering the evalArrayList production.
	EnterEvalArrayList(c *EvalArrayListContext)

	// EnterExpressionList is called when entering the expressionList production.
	EnterExpressionList(c *ExpressionListContext)

	// EnterIdentifierList is called when entering the identifierList production.
	EnterIdentifierList(c *IdentifierListContext)

	// EnterArrayDeclaration is called when entering the arrayDeclaration production.
	EnterArrayDeclaration(c *ArrayDeclarationContext)

	// EnterNumArrayElements is called when entering the numArrayElements production.
	EnterNumArrayElements(c *NumArrayElementsContext)

	// EnterArrayInitializer is called when entering the arrayInitializer production.
	EnterArrayInitializer(c *ArrayInitializerContext)

	// EnterVariableName is called when entering the VariableName production.
	EnterVariableName(c *VariableNameContext)

	// EnterNamedAbbreviation is called when entering the NamedAbbreviation production.
	EnterNamedAbbreviation(c *NamedAbbreviationContext)

	// EnterSizeQuery is called when entering the SizeQuery production.
	EnterSizeQuery(c *SizeQueryContext)

	// EnterArithExpr is called when entering the ArithExpr production.
	EnterArithExpr(c *ArithExprContext)

	// EnterNotExprWidth is called when entering the NotExprWidth production.
	EnterNotExprWidth(c *NotExprWidthContext)

	// EnterBitwExprWidth is called when entering the BitwExprWidth production.
	EnterBitwExprWidth(c *BitwExprWidthContext)

	// EnterCompExprWidth is called when entering the CompExprWidth production.
	EnterCompExprWidth(c *CompExprWidthContext)

	// EnterCompExpr is called when entering the CompExpr production.
	EnterCompExpr(c *CompExprContext)

	// EnterConcatExprWidth is called when entering the ConcatExprWidth production.
	EnterConcatExprWidth(c *ConcatExprWidthContext)

	// EnterConcatExprNW is called when entering the ConcatExprNW production.
	EnterConcatExprNW(c *ConcatExprNWContext)

	// EnterArrExtractExprWidth is called when entering the ArrExtractExprWidth production.
	EnterArrExtractExprWidth(c *ArrExtractExprWidthContext)

	// EnterBitExtractExprWidth is called when entering the BitExtractExprWidth production.
	EnterBitExtractExprWidth(c *BitExtractExprWidthContext)

	// EnterReadExpresssionVersioned is called when entering the ReadExpresssionVersioned production.
	EnterReadExpresssionVersioned(c *ReadExpresssionVersionedContext)

	// EnterSelectExprWidth is called when entering the SelectExprWidth production.
	EnterSelectExprWidth(c *SelectExprWidthContext)

	// EnterNegationExprWidth is called when entering the NegationExprWidth production.
	EnterNegationExprWidth(c *NegationExprWidthContext)

	// EnterNegetionExpr is called when entering the NegetionExpr production.
	EnterNegetionExpr(c *NegetionExprContext)

	// EnterReadExpr is called when entering the ReadExpr production.
	EnterReadExpr(c *ReadExprContext)

	// EnterVersionExpr is called when entering the VersionExpr production.
	EnterVersionExpr(c *VersionExprContext)

	// EnterSingleton is called when entering the Singleton production.
	EnterSingleton(c *SingletonContext)

	// EnterGenericBitRead is called when entering the genericBitRead production.
	EnterGenericBitRead(c *GenericBitReadContext)

	// EnterBitExtractExpr is called when entering the bitExtractExpr production.
	EnterBitExtractExpr(c *BitExtractExprContext)

	// EnterVersionVariableName is called when entering the VersionVariableName production.
	EnterVersionVariableName(c *VersionVariableNameContext)

	// EnterVersionedNamedAbbreviation is called when entering the VersionedNamedAbbreviation production.
	EnterVersionedNamedAbbreviation(c *VersionedNamedAbbreviationContext)

	// EnterUpdationList is called when entering the UpdationList production.
	EnterUpdationList(c *UpdationListContext)

	// EnterNoUpdateList is called when entering the NoUpdateList production.
	EnterNoUpdateList(c *NoUpdateListContext)

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

	// ExitQueryStatements is called when exiting the queryStatements production.
	ExitQueryStatements(c *QueryStatementsContext)

	// ExitKtranslationUnit is called when exiting the ktranslationUnit production.
	ExitKtranslationUnit(c *KtranslationUnitContext)

	// ExitQueryCommand is called when exiting the queryCommand production.
	ExitQueryCommand(c *QueryCommandContext)

	// ExitSingletonQueryExpr is called when exiting the SingletonQueryExpr production.
	ExitSingletonQueryExpr(c *SingletonQueryExprContext)

	// ExitWithEvalExpr is called when exiting the WithEvalExpr production.
	ExitWithEvalExpr(c *WithEvalExprContext)

	// ExitWithEvalExprAndArrayList is called when exiting the WithEvalExprAndArrayList production.
	ExitWithEvalExprAndArrayList(c *WithEvalExprAndArrayListContext)

	// ExitEvalExprList is called when exiting the evalExprList production.
	ExitEvalExprList(c *EvalExprListContext)

	// ExitEvalArrayList is called when exiting the evalArrayList production.
	ExitEvalArrayList(c *EvalArrayListContext)

	// ExitExpressionList is called when exiting the expressionList production.
	ExitExpressionList(c *ExpressionListContext)

	// ExitIdentifierList is called when exiting the identifierList production.
	ExitIdentifierList(c *IdentifierListContext)

	// ExitArrayDeclaration is called when exiting the arrayDeclaration production.
	ExitArrayDeclaration(c *ArrayDeclarationContext)

	// ExitNumArrayElements is called when exiting the numArrayElements production.
	ExitNumArrayElements(c *NumArrayElementsContext)

	// ExitArrayInitializer is called when exiting the arrayInitializer production.
	ExitArrayInitializer(c *ArrayInitializerContext)

	// ExitVariableName is called when exiting the VariableName production.
	ExitVariableName(c *VariableNameContext)

	// ExitNamedAbbreviation is called when exiting the NamedAbbreviation production.
	ExitNamedAbbreviation(c *NamedAbbreviationContext)

	// ExitSizeQuery is called when exiting the SizeQuery production.
	ExitSizeQuery(c *SizeQueryContext)

	// ExitArithExpr is called when exiting the ArithExpr production.
	ExitArithExpr(c *ArithExprContext)

	// ExitNotExprWidth is called when exiting the NotExprWidth production.
	ExitNotExprWidth(c *NotExprWidthContext)

	// ExitBitwExprWidth is called when exiting the BitwExprWidth production.
	ExitBitwExprWidth(c *BitwExprWidthContext)

	// ExitCompExprWidth is called when exiting the CompExprWidth production.
	ExitCompExprWidth(c *CompExprWidthContext)

	// ExitCompExpr is called when exiting the CompExpr production.
	ExitCompExpr(c *CompExprContext)

	// ExitConcatExprWidth is called when exiting the ConcatExprWidth production.
	ExitConcatExprWidth(c *ConcatExprWidthContext)

	// ExitConcatExprNW is called when exiting the ConcatExprNW production.
	ExitConcatExprNW(c *ConcatExprNWContext)

	// ExitArrExtractExprWidth is called when exiting the ArrExtractExprWidth production.
	ExitArrExtractExprWidth(c *ArrExtractExprWidthContext)

	// ExitBitExtractExprWidth is called when exiting the BitExtractExprWidth production.
	ExitBitExtractExprWidth(c *BitExtractExprWidthContext)

	// ExitReadExpresssionVersioned is called when exiting the ReadExpresssionVersioned production.
	ExitReadExpresssionVersioned(c *ReadExpresssionVersionedContext)

	// ExitSelectExprWidth is called when exiting the SelectExprWidth production.
	ExitSelectExprWidth(c *SelectExprWidthContext)

	// ExitNegationExprWidth is called when exiting the NegationExprWidth production.
	ExitNegationExprWidth(c *NegationExprWidthContext)

	// ExitNegetionExpr is called when exiting the NegetionExpr production.
	ExitNegetionExpr(c *NegetionExprContext)

	// ExitReadExpr is called when exiting the ReadExpr production.
	ExitReadExpr(c *ReadExprContext)

	// ExitVersionExpr is called when exiting the VersionExpr production.
	ExitVersionExpr(c *VersionExprContext)

	// ExitSingleton is called when exiting the Singleton production.
	ExitSingleton(c *SingletonContext)

	// ExitGenericBitRead is called when exiting the genericBitRead production.
	ExitGenericBitRead(c *GenericBitReadContext)

	// ExitBitExtractExpr is called when exiting the bitExtractExpr production.
	ExitBitExtractExpr(c *BitExtractExprContext)

	// ExitVersionVariableName is called when exiting the VersionVariableName production.
	ExitVersionVariableName(c *VersionVariableNameContext)

	// ExitVersionedNamedAbbreviation is called when exiting the VersionedNamedAbbreviation production.
	ExitVersionedNamedAbbreviation(c *VersionedNamedAbbreviationContext)

	// ExitUpdationList is called when exiting the UpdationList production.
	ExitUpdationList(c *UpdationListContext)

	// ExitNoUpdateList is called when exiting the NoUpdateList production.
	ExitNoUpdateList(c *NoUpdateListContext)

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

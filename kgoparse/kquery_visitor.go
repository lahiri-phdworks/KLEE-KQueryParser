// Code generated from KQuery.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser // KQuery

import "github.com/antlr/antlr4/runtime/Go/antlr"

// A complete Visitor for a parse tree produced by KQueryParser.
type KQueryVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by KQueryParser#kqueryExpression.
	VisitKqueryExpression(ctx *KqueryExpressionContext) interface{}

	// Visit a parse tree produced by KQueryParser#ktranslationUnit.
	VisitKtranslationUnit(ctx *KtranslationUnitContext) interface{}

	// Visit a parse tree produced by KQueryParser#queryCommand.
	VisitQueryCommand(ctx *QueryCommandContext) interface{}

	// Visit a parse tree produced by KQueryParser#queryExpr.
	VisitQueryExpr(ctx *QueryExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#evalExprList.
	VisitEvalExprList(ctx *EvalExprListContext) interface{}

	// Visit a parse tree produced by KQueryParser#evalArrayList.
	VisitEvalArrayList(ctx *EvalArrayListContext) interface{}

	// Visit a parse tree produced by KQueryParser#arrayDeclaration.
	VisitArrayDeclaration(ctx *ArrayDeclarationContext) interface{}

	// Visit a parse tree produced by KQueryParser#numArrayElements.
	VisitNumArrayElements(ctx *NumArrayElementsContext) interface{}

	// Visit a parse tree produced by KQueryParser#arrayInitializer.
	VisitArrayInitializer(ctx *ArrayInitializerContext) interface{}

	// Visit a parse tree produced by KQueryParser#expression.
	VisitExpression(ctx *ExpressionContext) interface{}

	// Visit a parse tree produced by KQueryParser#genericBitRead.
	VisitGenericBitRead(ctx *GenericBitReadContext) interface{}

	// Visit a parse tree produced by KQueryParser#bitExtractExpr.
	VisitBitExtractExpr(ctx *BitExtractExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#version.
	VisitVersion(ctx *VersionContext) interface{}

	// Visit a parse tree produced by KQueryParser#fullyQualifiedExpression.
	VisitFullyQualifiedExpression(ctx *FullyQualifiedExpressionContext) interface{}

	// Visit a parse tree produced by KQueryParser#notExpr.
	VisitNotExpr(ctx *NotExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#concatExpr.
	VisitConcatExpr(ctx *ConcatExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#exprNegation.
	VisitExprNegation(ctx *ExprNegationContext) interface{}

	// Visit a parse tree produced by KQueryParser#selectExpr.
	VisitSelectExpr(ctx *SelectExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#arrExtractExpr.
	VisitArrExtractExpr(ctx *ArrExtractExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#varName.
	VisitVarName(ctx *VarNameContext) interface{}

	// Visit a parse tree produced by KQueryParser#leftExpr.
	VisitLeftExpr(ctx *LeftExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#rightExpr.
	VisitRightExpr(ctx *RightExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#namedConstant.
	VisitNamedConstant(ctx *NamedConstantContext) interface{}

	// Visit a parse tree produced by KQueryParser#updateList.
	VisitUpdateList(ctx *UpdateListContext) interface{}

	// Visit a parse tree produced by KQueryParser#bitwiseExpr.
	VisitBitwiseExpr(ctx *BitwiseExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#comparisonExpr.
	VisitComparisonExpr(ctx *ComparisonExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#arithmeticExpr.
	VisitArithmeticExpr(ctx *ArithmeticExprContext) interface{}

	// Visit a parse tree produced by KQueryParser#domain.
	VisitDomain(ctx *DomainContext) interface{}

	// Visit a parse tree produced by KQueryParser#rangeLimit.
	VisitRangeLimit(ctx *RangeLimitContext) interface{}

	// Visit a parse tree produced by KQueryParser#arrName.
	VisitArrName(ctx *ArrNameContext) interface{}

	// Visit a parse tree produced by KQueryParser#numberList.
	VisitNumberList(ctx *NumberListContext) interface{}

	// Visit a parse tree produced by KQueryParser#number.
	VisitNumber(ctx *NumberContext) interface{}

	// Visit a parse tree produced by KQueryParser#constant.
	VisitConstant(ctx *ConstantContext) interface{}

	// Visit a parse tree produced by KQueryParser#boolnum.
	VisitBoolnum(ctx *BoolnumContext) interface{}

	// Visit a parse tree produced by KQueryParser#signedConstant.
	VisitSignedConstant(ctx *SignedConstantContext) interface{}

	// Visit a parse tree produced by KQueryParser#widthOrSizeExpr.
	VisitWidthOrSizeExpr(ctx *WidthOrSizeExprContext) interface{}
}

// Code generated from KQuery.g4 by ANTLR 4.9.2. DO NOT EDIT.

package parser // KQuery

import "github.com/antlr/antlr4/runtime/Go/antlr"

type BaseKQueryVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseKQueryVisitor) VisitKqueryExpression(ctx *KqueryExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitQueryStatements(ctx *QueryStatementsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitKtranslationUnit(ctx *KtranslationUnitContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitQueryCommand(ctx *QueryCommandContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitSingletonQueryExpr(ctx *SingletonQueryExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitWithEvalExpr(ctx *WithEvalExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitWithEvalExprAndArrayList(ctx *WithEvalExprAndArrayListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitEvalExprList(ctx *EvalExprListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitEvalArrayList(ctx *EvalArrayListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitExpressionList(ctx *ExpressionListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitIdentifierList(ctx *IdentifierListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitArrayDeclaration(ctx *ArrayDeclarationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNumArrayElements(ctx *NumArrayElementsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitArrayInitializer(ctx *ArrayInitializerContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitVariableName(ctx *VariableNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNamedAbbreviation(ctx *NamedAbbreviationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitSizeQuery(ctx *SizeQueryContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitArithExpr(ctx *ArithExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNotExprWidth(ctx *NotExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitBitwExprWidth(ctx *BitwExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitCompExprWidth(ctx *CompExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitCompExpr(ctx *CompExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitConcatExprWidth(ctx *ConcatExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitConcatExprNW(ctx *ConcatExprNWContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitArrExtractExprWidth(ctx *ArrExtractExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitBitExtractExprWidth(ctx *BitExtractExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitReadExpresssionVersioned(ctx *ReadExpresssionVersionedContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitSelectExprWidth(ctx *SelectExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNegationExprWidth(ctx *NegationExprWidthContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNegetionExpr(ctx *NegetionExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitReadExpr(ctx *ReadExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitVersionExpr(ctx *VersionExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitSingleton(ctx *SingletonContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitGenericBitRead(ctx *GenericBitReadContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitBitExtractExpr(ctx *BitExtractExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitVersionVariableName(ctx *VersionVariableNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitVersionedNamedAbbreviation(ctx *VersionedNamedAbbreviationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitUpdationList(ctx *UpdationListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNoUpdateList(ctx *NoUpdateListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNotExpr(ctx *NotExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitConcatExpr(ctx *ConcatExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitExprNegation(ctx *ExprNegationContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitSelectExpr(ctx *SelectExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitArrExtractExpr(ctx *ArrExtractExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitVarName(ctx *VarNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitLeftExpr(ctx *LeftExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitRightExpr(ctx *RightExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNamedConstant(ctx *NamedConstantContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitUpdateList(ctx *UpdateListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitBitwiseExpr(ctx *BitwiseExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitComparisonExpr(ctx *ComparisonExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitArithmeticExpr(ctx *ArithmeticExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitDomain(ctx *DomainContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitRangeLimit(ctx *RangeLimitContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitArrName(ctx *ArrNameContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNumberList(ctx *NumberListContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitNumber(ctx *NumberContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitConstant(ctx *ConstantContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitBoolnum(ctx *BoolnumContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitSignedConstant(ctx *SignedConstantContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseKQueryVisitor) VisitWidthOrSizeExpr(ctx *WidthOrSizeExprContext) interface{} {
	return v.VisitChildren(ctx)
}

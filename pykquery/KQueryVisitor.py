# Generated from KQuery.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .KQueryParser import KQueryParser
else:
    from KQueryParser import KQueryParser

# This class defines a complete generic visitor for a parse tree produced by KQueryParser.

class KQueryVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by KQueryParser#kqueryExpression.
    def visitKqueryExpression(self, ctx:KQueryParser.KqueryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#queryStatements.
    def visitQueryStatements(self, ctx:KQueryParser.QueryStatementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ktranslationUnit.
    def visitKtranslationUnit(self, ctx:KQueryParser.KtranslationUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#queryCommand.
    def visitQueryCommand(self, ctx:KQueryParser.QueryCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#SingletonQueryExpr.
    def visitSingletonQueryExpr(self, ctx:KQueryParser.SingletonQueryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#WithEvalExpr.
    def visitWithEvalExpr(self, ctx:KQueryParser.WithEvalExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#WithEvalExprAndArrayList.
    def visitWithEvalExprAndArrayList(self, ctx:KQueryParser.WithEvalExprAndArrayListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#evalExprList.
    def visitEvalExprList(self, ctx:KQueryParser.EvalExprListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#evalArrayList.
    def visitEvalArrayList(self, ctx:KQueryParser.EvalArrayListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#expressionList.
    def visitExpressionList(self, ctx:KQueryParser.ExpressionListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#identifierList.
    def visitIdentifierList(self, ctx:KQueryParser.IdentifierListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrayDeclaration.
    def visitArrayDeclaration(self, ctx:KQueryParser.ArrayDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#numArrayElements.
    def visitNumArrayElements(self, ctx:KQueryParser.NumArrayElementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrayInitializer.
    def visitArrayInitializer(self, ctx:KQueryParser.ArrayInitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#VariableName.
    def visitVariableName(self, ctx:KQueryParser.VariableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#NamedAbbreviation.
    def visitNamedAbbreviation(self, ctx:KQueryParser.NamedAbbreviationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#SizeQuery.
    def visitSizeQuery(self, ctx:KQueryParser.SizeQueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ArithExpr.
    def visitArithExpr(self, ctx:KQueryParser.ArithExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#NotExprWidth.
    def visitNotExprWidth(self, ctx:KQueryParser.NotExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#BitwExprWidth.
    def visitBitwExprWidth(self, ctx:KQueryParser.BitwExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#CompExprWidth.
    def visitCompExprWidth(self, ctx:KQueryParser.CompExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#CompExpr.
    def visitCompExpr(self, ctx:KQueryParser.CompExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ConcatExprWidth.
    def visitConcatExprWidth(self, ctx:KQueryParser.ConcatExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ConcatExprNW.
    def visitConcatExprNW(self, ctx:KQueryParser.ConcatExprNWContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ArrExtractExprWidth.
    def visitArrExtractExprWidth(self, ctx:KQueryParser.ArrExtractExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#BitExtractExprWidth.
    def visitBitExtractExprWidth(self, ctx:KQueryParser.BitExtractExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ReadExpresssionVersioned.
    def visitReadExpresssionVersioned(self, ctx:KQueryParser.ReadExpresssionVersionedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#SelectExprWidth.
    def visitSelectExprWidth(self, ctx:KQueryParser.SelectExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#NegationExprWidth.
    def visitNegationExprWidth(self, ctx:KQueryParser.NegationExprWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#NegetionExpr.
    def visitNegetionExpr(self, ctx:KQueryParser.NegetionExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ReadExpr.
    def visitReadExpr(self, ctx:KQueryParser.ReadExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#VersionExpr.
    def visitVersionExpr(self, ctx:KQueryParser.VersionExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#Singleton.
    def visitSingleton(self, ctx:KQueryParser.SingletonContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#genericBitRead.
    def visitGenericBitRead(self, ctx:KQueryParser.GenericBitReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#bitExtractExpr.
    def visitBitExtractExpr(self, ctx:KQueryParser.BitExtractExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#VersionVariableName.
    def visitVersionVariableName(self, ctx:KQueryParser.VersionVariableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#VersionedNamedAbbreviation.
    def visitVersionedNamedAbbreviation(self, ctx:KQueryParser.VersionedNamedAbbreviationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#UpdationList.
    def visitUpdationList(self, ctx:KQueryParser.UpdationListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#NoUpdateList.
    def visitNoUpdateList(self, ctx:KQueryParser.NoUpdateListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#notExpr.
    def visitNotExpr(self, ctx:KQueryParser.NotExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#concatExpr.
    def visitConcatExpr(self, ctx:KQueryParser.ConcatExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#exprNegation.
    def visitExprNegation(self, ctx:KQueryParser.ExprNegationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#selectExpr.
    def visitSelectExpr(self, ctx:KQueryParser.SelectExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrExtractExpr.
    def visitArrExtractExpr(self, ctx:KQueryParser.ArrExtractExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#varName.
    def visitVarName(self, ctx:KQueryParser.VarNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#leftExpr.
    def visitLeftExpr(self, ctx:KQueryParser.LeftExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#rightExpr.
    def visitRightExpr(self, ctx:KQueryParser.RightExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#namedConstant.
    def visitNamedConstant(self, ctx:KQueryParser.NamedConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#updateList.
    def visitUpdateList(self, ctx:KQueryParser.UpdateListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#bitwiseExpr.
    def visitBitwiseExpr(self, ctx:KQueryParser.BitwiseExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#comparisonExpr.
    def visitComparisonExpr(self, ctx:KQueryParser.ComparisonExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arithmeticExpr.
    def visitArithmeticExpr(self, ctx:KQueryParser.ArithmeticExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#domain.
    def visitDomain(self, ctx:KQueryParser.DomainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#rangeLimit.
    def visitRangeLimit(self, ctx:KQueryParser.RangeLimitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrName.
    def visitArrName(self, ctx:KQueryParser.ArrNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#numberList.
    def visitNumberList(self, ctx:KQueryParser.NumberListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#number.
    def visitNumber(self, ctx:KQueryParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#constant.
    def visitConstant(self, ctx:KQueryParser.ConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#boolnum.
    def visitBoolnum(self, ctx:KQueryParser.BoolnumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#signedConstant.
    def visitSignedConstant(self, ctx:KQueryParser.SignedConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#widthOrSizeExpr.
    def visitWidthOrSizeExpr(self, ctx:KQueryParser.WidthOrSizeExprContext):
        return self.visitChildren(ctx)



del KQueryParser
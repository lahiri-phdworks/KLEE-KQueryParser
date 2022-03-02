# Generated from kquery.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .kqueryParser import kqueryParser
else:
    from kqueryParser import kqueryParser

# This class defines a complete generic visitor for a parse tree produced by kqueryParser.

class kqueryVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by kqueryParser#kqueryExpression.
    def visitKqueryExpression(self, ctx:kqueryParser.KqueryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#ktranslationUnit.
    def visitKtranslationUnit(self, ctx:kqueryParser.KtranslationUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#queryCommand.
    def visitQueryCommand(self, ctx:kqueryParser.QueryCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#queryExpr.
    def visitQueryExpr(self, ctx:kqueryParser.QueryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#evalExprList.
    def visitEvalExprList(self, ctx:kqueryParser.EvalExprListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#evalArrayList.
    def visitEvalArrayList(self, ctx:kqueryParser.EvalArrayListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#arrayDeclaration.
    def visitArrayDeclaration(self, ctx:kqueryParser.ArrayDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#arrayInitializer.
    def visitArrayInitializer(self, ctx:kqueryParser.ArrayInitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#expression.
    def visitExpression(self, ctx:kqueryParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#bitwiseExpr.
    def visitBitwiseExpr(self, ctx:kqueryParser.BitwiseExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#comparisonExpr.
    def visitComparisonExpr(self, ctx:kqueryParser.ComparisonExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#arithmeticExpr.
    def visitArithmeticExpr(self, ctx:kqueryParser.ArithmeticExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#domain.
    def visitDomain(self, ctx:kqueryParser.DomainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#rangeLimit.
    def visitRangeLimit(self, ctx:kqueryParser.RangeLimitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#arrName.
    def visitArrName(self, ctx:kqueryParser.ArrNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#numberList.
    def visitNumberList(self, ctx:kqueryParser.NumberListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#number.
    def visitNumber(self, ctx:kqueryParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#floatingPointwidthType.
    def visitFloatingPointwidthType(self, ctx:kqueryParser.FloatingPointwidthTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#integerwidthType.
    def visitIntegerwidthType(self, ctx:kqueryParser.IntegerwidthTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#version.
    def visitVersion(self, ctx:kqueryParser.VersionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by kqueryParser#updateList.
    def visitUpdateList(self, ctx:kqueryParser.UpdateListContext):
        return self.visitChildren(ctx)



del kqueryParser
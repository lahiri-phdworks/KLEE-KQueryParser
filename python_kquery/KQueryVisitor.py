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


    # Visit a parse tree produced by KQueryParser#ktranslationUnit.
    def visitKtranslationUnit(self, ctx:KQueryParser.KtranslationUnitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#queryCommand.
    def visitQueryCommand(self, ctx:KQueryParser.QueryCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#queryExpr.
    def visitQueryExpr(self, ctx:KQueryParser.QueryExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#evalExprList.
    def visitEvalExprList(self, ctx:KQueryParser.EvalExprListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#evalArrayList.
    def visitEvalArrayList(self, ctx:KQueryParser.EvalArrayListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrayDeclaration.
    def visitArrayDeclaration(self, ctx:KQueryParser.ArrayDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrayInitializer.
    def visitArrayInitializer(self, ctx:KQueryParser.ArrayInitializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#expression.
    def visitExpression(self, ctx:KQueryParser.ExpressionContext):
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


    # Visit a parse tree produced by KQueryParser#floatingPointwidthType.
    def visitFloatingPointwidthType(self, ctx:KQueryParser.FloatingPointwidthTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#integerwidthType.
    def visitIntegerwidthType(self, ctx:KQueryParser.IntegerwidthTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#version.
    def visitVersion(self, ctx:KQueryParser.VersionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#updateList.
    def visitUpdateList(self, ctx:KQueryParser.UpdateListContext):
        return self.visitChildren(ctx)



del KQueryParser
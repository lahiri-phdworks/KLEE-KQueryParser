# Generated from kquery.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .kqueryParser import kqueryParser
else:
    from kqueryParser import kqueryParser

# This class defines a complete listener for a parse tree produced by kqueryParser.
class kqueryListener(ParseTreeListener):

    # Enter a parse tree produced by kqueryParser#kqueryExpression.
    def enterKqueryExpression(self, ctx:kqueryParser.KqueryExpressionContext):
        pass

    # Exit a parse tree produced by kqueryParser#kqueryExpression.
    def exitKqueryExpression(self, ctx:kqueryParser.KqueryExpressionContext):
        pass


    # Enter a parse tree produced by kqueryParser#ktranslationUnit.
    def enterKtranslationUnit(self, ctx:kqueryParser.KtranslationUnitContext):
        pass

    # Exit a parse tree produced by kqueryParser#ktranslationUnit.
    def exitKtranslationUnit(self, ctx:kqueryParser.KtranslationUnitContext):
        pass


    # Enter a parse tree produced by kqueryParser#queryCommand.
    def enterQueryCommand(self, ctx:kqueryParser.QueryCommandContext):
        pass

    # Exit a parse tree produced by kqueryParser#queryCommand.
    def exitQueryCommand(self, ctx:kqueryParser.QueryCommandContext):
        pass


    # Enter a parse tree produced by kqueryParser#queryExpr.
    def enterQueryExpr(self, ctx:kqueryParser.QueryExprContext):
        pass

    # Exit a parse tree produced by kqueryParser#queryExpr.
    def exitQueryExpr(self, ctx:kqueryParser.QueryExprContext):
        pass


    # Enter a parse tree produced by kqueryParser#evalExprList.
    def enterEvalExprList(self, ctx:kqueryParser.EvalExprListContext):
        pass

    # Exit a parse tree produced by kqueryParser#evalExprList.
    def exitEvalExprList(self, ctx:kqueryParser.EvalExprListContext):
        pass


    # Enter a parse tree produced by kqueryParser#evalArrayList.
    def enterEvalArrayList(self, ctx:kqueryParser.EvalArrayListContext):
        pass

    # Exit a parse tree produced by kqueryParser#evalArrayList.
    def exitEvalArrayList(self, ctx:kqueryParser.EvalArrayListContext):
        pass


    # Enter a parse tree produced by kqueryParser#arrayDeclaration.
    def enterArrayDeclaration(self, ctx:kqueryParser.ArrayDeclarationContext):
        pass

    # Exit a parse tree produced by kqueryParser#arrayDeclaration.
    def exitArrayDeclaration(self, ctx:kqueryParser.ArrayDeclarationContext):
        pass


    # Enter a parse tree produced by kqueryParser#arrayInitializer.
    def enterArrayInitializer(self, ctx:kqueryParser.ArrayInitializerContext):
        pass

    # Exit a parse tree produced by kqueryParser#arrayInitializer.
    def exitArrayInitializer(self, ctx:kqueryParser.ArrayInitializerContext):
        pass


    # Enter a parse tree produced by kqueryParser#expression.
    def enterExpression(self, ctx:kqueryParser.ExpressionContext):
        pass

    # Exit a parse tree produced by kqueryParser#expression.
    def exitExpression(self, ctx:kqueryParser.ExpressionContext):
        pass


    # Enter a parse tree produced by kqueryParser#bitwiseExpr.
    def enterBitwiseExpr(self, ctx:kqueryParser.BitwiseExprContext):
        pass

    # Exit a parse tree produced by kqueryParser#bitwiseExpr.
    def exitBitwiseExpr(self, ctx:kqueryParser.BitwiseExprContext):
        pass


    # Enter a parse tree produced by kqueryParser#comparisonExpr.
    def enterComparisonExpr(self, ctx:kqueryParser.ComparisonExprContext):
        pass

    # Exit a parse tree produced by kqueryParser#comparisonExpr.
    def exitComparisonExpr(self, ctx:kqueryParser.ComparisonExprContext):
        pass


    # Enter a parse tree produced by kqueryParser#arithmeticExpr.
    def enterArithmeticExpr(self, ctx:kqueryParser.ArithmeticExprContext):
        pass

    # Exit a parse tree produced by kqueryParser#arithmeticExpr.
    def exitArithmeticExpr(self, ctx:kqueryParser.ArithmeticExprContext):
        pass


    # Enter a parse tree produced by kqueryParser#domain.
    def enterDomain(self, ctx:kqueryParser.DomainContext):
        pass

    # Exit a parse tree produced by kqueryParser#domain.
    def exitDomain(self, ctx:kqueryParser.DomainContext):
        pass


    # Enter a parse tree produced by kqueryParser#rangeLimit.
    def enterRangeLimit(self, ctx:kqueryParser.RangeLimitContext):
        pass

    # Exit a parse tree produced by kqueryParser#rangeLimit.
    def exitRangeLimit(self, ctx:kqueryParser.RangeLimitContext):
        pass


    # Enter a parse tree produced by kqueryParser#arrName.
    def enterArrName(self, ctx:kqueryParser.ArrNameContext):
        pass

    # Exit a parse tree produced by kqueryParser#arrName.
    def exitArrName(self, ctx:kqueryParser.ArrNameContext):
        pass


    # Enter a parse tree produced by kqueryParser#numberList.
    def enterNumberList(self, ctx:kqueryParser.NumberListContext):
        pass

    # Exit a parse tree produced by kqueryParser#numberList.
    def exitNumberList(self, ctx:kqueryParser.NumberListContext):
        pass


    # Enter a parse tree produced by kqueryParser#number.
    def enterNumber(self, ctx:kqueryParser.NumberContext):
        pass

    # Exit a parse tree produced by kqueryParser#number.
    def exitNumber(self, ctx:kqueryParser.NumberContext):
        pass


    # Enter a parse tree produced by kqueryParser#floatingPointwidthType.
    def enterFloatingPointwidthType(self, ctx:kqueryParser.FloatingPointwidthTypeContext):
        pass

    # Exit a parse tree produced by kqueryParser#floatingPointwidthType.
    def exitFloatingPointwidthType(self, ctx:kqueryParser.FloatingPointwidthTypeContext):
        pass


    # Enter a parse tree produced by kqueryParser#integerwidthType.
    def enterIntegerwidthType(self, ctx:kqueryParser.IntegerwidthTypeContext):
        pass

    # Exit a parse tree produced by kqueryParser#integerwidthType.
    def exitIntegerwidthType(self, ctx:kqueryParser.IntegerwidthTypeContext):
        pass


    # Enter a parse tree produced by kqueryParser#version.
    def enterVersion(self, ctx:kqueryParser.VersionContext):
        pass

    # Exit a parse tree produced by kqueryParser#version.
    def exitVersion(self, ctx:kqueryParser.VersionContext):
        pass


    # Enter a parse tree produced by kqueryParser#updateList.
    def enterUpdateList(self, ctx:kqueryParser.UpdateListContext):
        pass

    # Exit a parse tree produced by kqueryParser#updateList.
    def exitUpdateList(self, ctx:kqueryParser.UpdateListContext):
        pass



del kqueryParser
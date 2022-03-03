# Generated from KQuery.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .KQueryParser import KQueryParser
else:
    from KQueryParser import KQueryParser

# This class defines a complete listener for a parse tree produced by KQueryParser.
class KQueryListener(ParseTreeListener):

    # Enter a parse tree produced by KQueryParser#kqueryExpression.
    def enterKqueryExpression(self, ctx:KQueryParser.KqueryExpressionContext):
        pass

    # Exit a parse tree produced by KQueryParser#kqueryExpression.
    def exitKqueryExpression(self, ctx:KQueryParser.KqueryExpressionContext):
        pass


    # Enter a parse tree produced by KQueryParser#queryStatements.
    def enterQueryStatements(self, ctx:KQueryParser.QueryStatementsContext):
        pass

    # Exit a parse tree produced by KQueryParser#queryStatements.
    def exitQueryStatements(self, ctx:KQueryParser.QueryStatementsContext):
        pass


    # Enter a parse tree produced by KQueryParser#ktranslationUnit.
    def enterKtranslationUnit(self, ctx:KQueryParser.KtranslationUnitContext):
        pass

    # Exit a parse tree produced by KQueryParser#ktranslationUnit.
    def exitKtranslationUnit(self, ctx:KQueryParser.KtranslationUnitContext):
        pass


    # Enter a parse tree produced by KQueryParser#queryCommand.
    def enterQueryCommand(self, ctx:KQueryParser.QueryCommandContext):
        pass

    # Exit a parse tree produced by KQueryParser#queryCommand.
    def exitQueryCommand(self, ctx:KQueryParser.QueryCommandContext):
        pass


    # Enter a parse tree produced by KQueryParser#queryExpr.
    def enterQueryExpr(self, ctx:KQueryParser.QueryExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#queryExpr.
    def exitQueryExpr(self, ctx:KQueryParser.QueryExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#evalExprList.
    def enterEvalExprList(self, ctx:KQueryParser.EvalExprListContext):
        pass

    # Exit a parse tree produced by KQueryParser#evalExprList.
    def exitEvalExprList(self, ctx:KQueryParser.EvalExprListContext):
        pass


    # Enter a parse tree produced by KQueryParser#evalArrayList.
    def enterEvalArrayList(self, ctx:KQueryParser.EvalArrayListContext):
        pass

    # Exit a parse tree produced by KQueryParser#evalArrayList.
    def exitEvalArrayList(self, ctx:KQueryParser.EvalArrayListContext):
        pass


    # Enter a parse tree produced by KQueryParser#expressionList.
    def enterExpressionList(self, ctx:KQueryParser.ExpressionListContext):
        pass

    # Exit a parse tree produced by KQueryParser#expressionList.
    def exitExpressionList(self, ctx:KQueryParser.ExpressionListContext):
        pass


    # Enter a parse tree produced by KQueryParser#identifierList.
    def enterIdentifierList(self, ctx:KQueryParser.IdentifierListContext):
        pass

    # Exit a parse tree produced by KQueryParser#identifierList.
    def exitIdentifierList(self, ctx:KQueryParser.IdentifierListContext):
        pass


    # Enter a parse tree produced by KQueryParser#arrayDeclaration.
    def enterArrayDeclaration(self, ctx:KQueryParser.ArrayDeclarationContext):
        pass

    # Exit a parse tree produced by KQueryParser#arrayDeclaration.
    def exitArrayDeclaration(self, ctx:KQueryParser.ArrayDeclarationContext):
        pass


    # Enter a parse tree produced by KQueryParser#numArrayElements.
    def enterNumArrayElements(self, ctx:KQueryParser.NumArrayElementsContext):
        pass

    # Exit a parse tree produced by KQueryParser#numArrayElements.
    def exitNumArrayElements(self, ctx:KQueryParser.NumArrayElementsContext):
        pass


    # Enter a parse tree produced by KQueryParser#arrayInitializer.
    def enterArrayInitializer(self, ctx:KQueryParser.ArrayInitializerContext):
        pass

    # Exit a parse tree produced by KQueryParser#arrayInitializer.
    def exitArrayInitializer(self, ctx:KQueryParser.ArrayInitializerContext):
        pass


    # Enter a parse tree produced by KQueryParser#expression.
    def enterExpression(self, ctx:KQueryParser.ExpressionContext):
        pass

    # Exit a parse tree produced by KQueryParser#expression.
    def exitExpression(self, ctx:KQueryParser.ExpressionContext):
        pass


    # Enter a parse tree produced by KQueryParser#genericBitRead.
    def enterGenericBitRead(self, ctx:KQueryParser.GenericBitReadContext):
        pass

    # Exit a parse tree produced by KQueryParser#genericBitRead.
    def exitGenericBitRead(self, ctx:KQueryParser.GenericBitReadContext):
        pass


    # Enter a parse tree produced by KQueryParser#bitExtractExpr.
    def enterBitExtractExpr(self, ctx:KQueryParser.BitExtractExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#bitExtractExpr.
    def exitBitExtractExpr(self, ctx:KQueryParser.BitExtractExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#version.
    def enterVersion(self, ctx:KQueryParser.VersionContext):
        pass

    # Exit a parse tree produced by KQueryParser#version.
    def exitVersion(self, ctx:KQueryParser.VersionContext):
        pass


    # Enter a parse tree produced by KQueryParser#fullyQualifiedExpression.
    def enterFullyQualifiedExpression(self, ctx:KQueryParser.FullyQualifiedExpressionContext):
        pass

    # Exit a parse tree produced by KQueryParser#fullyQualifiedExpression.
    def exitFullyQualifiedExpression(self, ctx:KQueryParser.FullyQualifiedExpressionContext):
        pass


    # Enter a parse tree produced by KQueryParser#notExpr.
    def enterNotExpr(self, ctx:KQueryParser.NotExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#notExpr.
    def exitNotExpr(self, ctx:KQueryParser.NotExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#concatExpr.
    def enterConcatExpr(self, ctx:KQueryParser.ConcatExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#concatExpr.
    def exitConcatExpr(self, ctx:KQueryParser.ConcatExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#exprNegation.
    def enterExprNegation(self, ctx:KQueryParser.ExprNegationContext):
        pass

    # Exit a parse tree produced by KQueryParser#exprNegation.
    def exitExprNegation(self, ctx:KQueryParser.ExprNegationContext):
        pass


    # Enter a parse tree produced by KQueryParser#selectExpr.
    def enterSelectExpr(self, ctx:KQueryParser.SelectExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#selectExpr.
    def exitSelectExpr(self, ctx:KQueryParser.SelectExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#arrExtractExpr.
    def enterArrExtractExpr(self, ctx:KQueryParser.ArrExtractExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#arrExtractExpr.
    def exitArrExtractExpr(self, ctx:KQueryParser.ArrExtractExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#varName.
    def enterVarName(self, ctx:KQueryParser.VarNameContext):
        pass

    # Exit a parse tree produced by KQueryParser#varName.
    def exitVarName(self, ctx:KQueryParser.VarNameContext):
        pass


    # Enter a parse tree produced by KQueryParser#leftExpr.
    def enterLeftExpr(self, ctx:KQueryParser.LeftExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#leftExpr.
    def exitLeftExpr(self, ctx:KQueryParser.LeftExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#rightExpr.
    def enterRightExpr(self, ctx:KQueryParser.RightExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#rightExpr.
    def exitRightExpr(self, ctx:KQueryParser.RightExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#namedConstant.
    def enterNamedConstant(self, ctx:KQueryParser.NamedConstantContext):
        pass

    # Exit a parse tree produced by KQueryParser#namedConstant.
    def exitNamedConstant(self, ctx:KQueryParser.NamedConstantContext):
        pass


    # Enter a parse tree produced by KQueryParser#updateList.
    def enterUpdateList(self, ctx:KQueryParser.UpdateListContext):
        pass

    # Exit a parse tree produced by KQueryParser#updateList.
    def exitUpdateList(self, ctx:KQueryParser.UpdateListContext):
        pass


    # Enter a parse tree produced by KQueryParser#bitwiseExpr.
    def enterBitwiseExpr(self, ctx:KQueryParser.BitwiseExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#bitwiseExpr.
    def exitBitwiseExpr(self, ctx:KQueryParser.BitwiseExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#comparisonExpr.
    def enterComparisonExpr(self, ctx:KQueryParser.ComparisonExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#comparisonExpr.
    def exitComparisonExpr(self, ctx:KQueryParser.ComparisonExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#arithmeticExpr.
    def enterArithmeticExpr(self, ctx:KQueryParser.ArithmeticExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#arithmeticExpr.
    def exitArithmeticExpr(self, ctx:KQueryParser.ArithmeticExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#domain.
    def enterDomain(self, ctx:KQueryParser.DomainContext):
        pass

    # Exit a parse tree produced by KQueryParser#domain.
    def exitDomain(self, ctx:KQueryParser.DomainContext):
        pass


    # Enter a parse tree produced by KQueryParser#rangeLimit.
    def enterRangeLimit(self, ctx:KQueryParser.RangeLimitContext):
        pass

    # Exit a parse tree produced by KQueryParser#rangeLimit.
    def exitRangeLimit(self, ctx:KQueryParser.RangeLimitContext):
        pass


    # Enter a parse tree produced by KQueryParser#arrName.
    def enterArrName(self, ctx:KQueryParser.ArrNameContext):
        pass

    # Exit a parse tree produced by KQueryParser#arrName.
    def exitArrName(self, ctx:KQueryParser.ArrNameContext):
        pass


    # Enter a parse tree produced by KQueryParser#numberList.
    def enterNumberList(self, ctx:KQueryParser.NumberListContext):
        pass

    # Exit a parse tree produced by KQueryParser#numberList.
    def exitNumberList(self, ctx:KQueryParser.NumberListContext):
        pass


    # Enter a parse tree produced by KQueryParser#number.
    def enterNumber(self, ctx:KQueryParser.NumberContext):
        pass

    # Exit a parse tree produced by KQueryParser#number.
    def exitNumber(self, ctx:KQueryParser.NumberContext):
        pass


    # Enter a parse tree produced by KQueryParser#constant.
    def enterConstant(self, ctx:KQueryParser.ConstantContext):
        pass

    # Exit a parse tree produced by KQueryParser#constant.
    def exitConstant(self, ctx:KQueryParser.ConstantContext):
        pass


    # Enter a parse tree produced by KQueryParser#boolnum.
    def enterBoolnum(self, ctx:KQueryParser.BoolnumContext):
        pass

    # Exit a parse tree produced by KQueryParser#boolnum.
    def exitBoolnum(self, ctx:KQueryParser.BoolnumContext):
        pass


    # Enter a parse tree produced by KQueryParser#signedConstant.
    def enterSignedConstant(self, ctx:KQueryParser.SignedConstantContext):
        pass

    # Exit a parse tree produced by KQueryParser#signedConstant.
    def exitSignedConstant(self, ctx:KQueryParser.SignedConstantContext):
        pass


    # Enter a parse tree produced by KQueryParser#widthOrSizeExpr.
    def enterWidthOrSizeExpr(self, ctx:KQueryParser.WidthOrSizeExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#widthOrSizeExpr.
    def exitWidthOrSizeExpr(self, ctx:KQueryParser.WidthOrSizeExprContext):
        pass



del KQueryParser
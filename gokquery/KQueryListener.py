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


    # Enter a parse tree produced by KQueryParser#SingletonQueryExpr.
    def enterSingletonQueryExpr(self, ctx:KQueryParser.SingletonQueryExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#SingletonQueryExpr.
    def exitSingletonQueryExpr(self, ctx:KQueryParser.SingletonQueryExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#WithEvalExpr.
    def enterWithEvalExpr(self, ctx:KQueryParser.WithEvalExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#WithEvalExpr.
    def exitWithEvalExpr(self, ctx:KQueryParser.WithEvalExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#WithEvalExprAndArrayList.
    def enterWithEvalExprAndArrayList(self, ctx:KQueryParser.WithEvalExprAndArrayListContext):
        pass

    # Exit a parse tree produced by KQueryParser#WithEvalExprAndArrayList.
    def exitWithEvalExprAndArrayList(self, ctx:KQueryParser.WithEvalExprAndArrayListContext):
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


    # Enter a parse tree produced by KQueryParser#VariableName.
    def enterVariableName(self, ctx:KQueryParser.VariableNameContext):
        pass

    # Exit a parse tree produced by KQueryParser#VariableName.
    def exitVariableName(self, ctx:KQueryParser.VariableNameContext):
        pass


    # Enter a parse tree produced by KQueryParser#NamedAbbreviation.
    def enterNamedAbbreviation(self, ctx:KQueryParser.NamedAbbreviationContext):
        pass

    # Exit a parse tree produced by KQueryParser#NamedAbbreviation.
    def exitNamedAbbreviation(self, ctx:KQueryParser.NamedAbbreviationContext):
        pass


    # Enter a parse tree produced by KQueryParser#SizeQuery.
    def enterSizeQuery(self, ctx:KQueryParser.SizeQueryContext):
        pass

    # Exit a parse tree produced by KQueryParser#SizeQuery.
    def exitSizeQuery(self, ctx:KQueryParser.SizeQueryContext):
        pass


    # Enter a parse tree produced by KQueryParser#ArithExpr.
    def enterArithExpr(self, ctx:KQueryParser.ArithExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#ArithExpr.
    def exitArithExpr(self, ctx:KQueryParser.ArithExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#NotExprWidth.
    def enterNotExprWidth(self, ctx:KQueryParser.NotExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#NotExprWidth.
    def exitNotExprWidth(self, ctx:KQueryParser.NotExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#BitwExprWidth.
    def enterBitwExprWidth(self, ctx:KQueryParser.BitwExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#BitwExprWidth.
    def exitBitwExprWidth(self, ctx:KQueryParser.BitwExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#CompExprWidth.
    def enterCompExprWidth(self, ctx:KQueryParser.CompExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#CompExprWidth.
    def exitCompExprWidth(self, ctx:KQueryParser.CompExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#CompExpr.
    def enterCompExpr(self, ctx:KQueryParser.CompExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#CompExpr.
    def exitCompExpr(self, ctx:KQueryParser.CompExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#ConcatExprWidth.
    def enterConcatExprWidth(self, ctx:KQueryParser.ConcatExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#ConcatExprWidth.
    def exitConcatExprWidth(self, ctx:KQueryParser.ConcatExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#ConcatExprNW.
    def enterConcatExprNW(self, ctx:KQueryParser.ConcatExprNWContext):
        pass

    # Exit a parse tree produced by KQueryParser#ConcatExprNW.
    def exitConcatExprNW(self, ctx:KQueryParser.ConcatExprNWContext):
        pass


    # Enter a parse tree produced by KQueryParser#ArrExtractExprWidth.
    def enterArrExtractExprWidth(self, ctx:KQueryParser.ArrExtractExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#ArrExtractExprWidth.
    def exitArrExtractExprWidth(self, ctx:KQueryParser.ArrExtractExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#BitExtractExprWidth.
    def enterBitExtractExprWidth(self, ctx:KQueryParser.BitExtractExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#BitExtractExprWidth.
    def exitBitExtractExprWidth(self, ctx:KQueryParser.BitExtractExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#ReadExpresssionVersioned.
    def enterReadExpresssionVersioned(self, ctx:KQueryParser.ReadExpresssionVersionedContext):
        pass

    # Exit a parse tree produced by KQueryParser#ReadExpresssionVersioned.
    def exitReadExpresssionVersioned(self, ctx:KQueryParser.ReadExpresssionVersionedContext):
        pass


    # Enter a parse tree produced by KQueryParser#SelectExprWidth.
    def enterSelectExprWidth(self, ctx:KQueryParser.SelectExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#SelectExprWidth.
    def exitSelectExprWidth(self, ctx:KQueryParser.SelectExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#NegationExprWidth.
    def enterNegationExprWidth(self, ctx:KQueryParser.NegationExprWidthContext):
        pass

    # Exit a parse tree produced by KQueryParser#NegationExprWidth.
    def exitNegationExprWidth(self, ctx:KQueryParser.NegationExprWidthContext):
        pass


    # Enter a parse tree produced by KQueryParser#NegetionExpr.
    def enterNegetionExpr(self, ctx:KQueryParser.NegetionExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#NegetionExpr.
    def exitNegetionExpr(self, ctx:KQueryParser.NegetionExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#ReadExpr.
    def enterReadExpr(self, ctx:KQueryParser.ReadExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#ReadExpr.
    def exitReadExpr(self, ctx:KQueryParser.ReadExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#VersionExpr.
    def enterVersionExpr(self, ctx:KQueryParser.VersionExprContext):
        pass

    # Exit a parse tree produced by KQueryParser#VersionExpr.
    def exitVersionExpr(self, ctx:KQueryParser.VersionExprContext):
        pass


    # Enter a parse tree produced by KQueryParser#Singleton.
    def enterSingleton(self, ctx:KQueryParser.SingletonContext):
        pass

    # Exit a parse tree produced by KQueryParser#Singleton.
    def exitSingleton(self, ctx:KQueryParser.SingletonContext):
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


    # Enter a parse tree produced by KQueryParser#VersionVariableName.
    def enterVersionVariableName(self, ctx:KQueryParser.VersionVariableNameContext):
        pass

    # Exit a parse tree produced by KQueryParser#VersionVariableName.
    def exitVersionVariableName(self, ctx:KQueryParser.VersionVariableNameContext):
        pass


    # Enter a parse tree produced by KQueryParser#VersionedNamedAbbreviation.
    def enterVersionedNamedAbbreviation(self, ctx:KQueryParser.VersionedNamedAbbreviationContext):
        pass

    # Exit a parse tree produced by KQueryParser#VersionedNamedAbbreviation.
    def exitVersionedNamedAbbreviation(self, ctx:KQueryParser.VersionedNamedAbbreviationContext):
        pass


    # Enter a parse tree produced by KQueryParser#UpdationList.
    def enterUpdationList(self, ctx:KQueryParser.UpdationListContext):
        pass

    # Exit a parse tree produced by KQueryParser#UpdationList.
    def exitUpdationList(self, ctx:KQueryParser.UpdationListContext):
        pass


    # Enter a parse tree produced by KQueryParser#NoUpdateList.
    def enterNoUpdateList(self, ctx:KQueryParser.NoUpdateListContext):
        pass

    # Exit a parse tree produced by KQueryParser#NoUpdateList.
    def exitNoUpdateList(self, ctx:KQueryParser.NoUpdateListContext):
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
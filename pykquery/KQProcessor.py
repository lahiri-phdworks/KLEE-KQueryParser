import sys
import z3
from antlr4 import *
from KQueryLexer import KQueryLexer
from KQueryParser import KQueryParser
from KQueryVisitor import KQueryVisitor
numbersList = []

class OverridenVisitor(KQueryVisitor):
    def visitKqueryExpression(self, ctx:KQueryParser.KqueryExpressionContext):
        statements = self.visit(ctx.queryStatements())
        print(statements)
        
    def visitQueryStatements(self, ctx:KQueryParser.QueryStatementsContext):
        for queryStmts in ctx.ktranslationUnit():
            self.visit(queryStmts)
    
    def visitArrayDeclaration(self, ctx: KQueryParser.ArrayDeclarationContext):
        # print(ctx.arrayInitializer().getText())
        if ctx.Array():
            print(">>> Hit Array Statement.")
        if ctx.arrName():
            print(f"\t ArrName : {ctx.arrName().getText()}")
        if ctx.numArrayElements():
            print(f"\t Size : {ctx.numArrayElements().getText()}")
        if ctx.domain():
            print(f"\t Domain : {ctx.domain().getText()}")
        if ctx.rangeLimit():
            print(f"\t Range : {ctx.rangeLimit().getText()}")
        if ctx.arrayInitializer():
            arrayInit = self.visit(ctx.arrayInitializer())
        print(f"\t ArrInit : {arrayInit}")
        # Create a Z3 Array or IntVars. 
        
    def visitArrayInitializer(self, ctx:KQueryParser.ArrayInitializerContext):
        if ctx.Symbolic():
            return ctx.Symbolic().getText()
        if ctx.numberList():
            global numbersList
            numbersList = []
            self.visit(ctx.numberList())
            return numbersList
    
    def visitNumberList(self, ctx: KQueryParser.NumberListContext):
        num0 = ctx.number().getText()
        if ctx.numberList():
            self.visit(ctx.numberList())
        numbersList.append(num0)
        
        
    def visitNumber(self, ctx: KQueryParser.NumberContext):
        if ctx.boolnum():
            print(f">>> Bool Value : {ctx.boolnum().getText()}")
            return ctx.boolnum().getText()
        if ctx.signedConstant():
            print(f">>> Signed Constant : {ctx.signedConstant().getText()}")
            return ctx.signedConstant().getText()
        if ctx.constant():
            print(f">>> Constant : {ctx.constant().getText()}")
            return ctx.constant().getText()

            
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


    # Visit a parse tree produced by KQueryParser#numArrayElements.
    def visitNumArrayElements(self, ctx:KQueryParser.NumArrayElementsContext):
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
        
if __name__ == "__main__":
    data = FileStream(sys.argv[1])
    # lexer
    lexer = KQueryLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = KQueryParser(stream)
    tree = parser.kqueryExpression()
    # evaluator
    visitor = OverridenVisitor()
    output = visitor.visit(tree)
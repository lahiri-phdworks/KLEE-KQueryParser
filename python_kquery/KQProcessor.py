import sys
from antlr4 import *
from KQueryLexer import KQueryLexer
from KQueryParser import KQueryParser
from KQueryVisitor import KQueryVisitor

class OverridenVisitor(KQueryVisitor):
    # Visit a parse tree produced by KQueryParser#kqueryExpression.
    def visitKqueryExpression(self, ctx:KQueryParser.KqueryExpressionContext):
        print(f"visitKqueryExpression : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#ktranslationUnit.
    def visitKtranslationUnit(self, ctx:KQueryParser.KtranslationUnitContext):
        print(f"\tvisitKtranslationUnit : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#queryCommand.
    def visitQueryCommand(self, ctx:KQueryParser.QueryCommandContext):
        print(f"\tvisitQueryCommand : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#queryExpr.
    def visitQueryExpr(self, ctx:KQueryParser.QueryExprContext):
        print(f"\t\tvisitQueryExpr : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#evalExprList.
    def visitEvalExprList(self, ctx:KQueryParser.EvalExprListContext):
        print(f"\t\t\tvisitEvalExprList : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#evalArrayList.
    def visitEvalArrayList(self, ctx:KQueryParser.EvalArrayListContext):
        print(f"\t\t\tvisitEvalArrayList : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrayDeclaration.
    def visitArrayDeclaration(self, ctx:KQueryParser.ArrayDeclarationContext):
        print(f"\tvisitArrayDeclaration : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrayElemsStub.
    def visitArrayElemsStub(self, ctx:KQueryParser.ArrayElemsStubContext):
        print(f"\t\tvisitArrayElemsStub : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrayInitializer.
    def visitArrayInitializer(self, ctx:KQueryParser.ArrayInitializerContext):
        print(f"\t\t\tvisitArrayInitializer : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#expression.
    def visitExpression(self, ctx:KQueryParser.ExpressionContext):
        print(f"\t\t\tvisitExpression : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#version.
    def visitVersion(self, ctx:KQueryParser.VersionContext):
        print(f"\t\t\tvisitVersion : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#updateList.
    def visitUpdateList(self, ctx:KQueryParser.UpdateListContext):
        print(f"\t\t\tvisitUpdateList : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#bitwiseExpr.
    def visitBitwiseExpr(self, ctx:KQueryParser.BitwiseExprContext):
        print(f"\t\t\tvisitBitwiseExpr : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#comparisonExpr.
    def visitComparisonExpr(self, ctx:KQueryParser.ComparisonExprContext):
        print(f"\t\t\tvisitComparisonExpr : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arithmeticExpr.
    def visitArithmeticExpr(self, ctx:KQueryParser.ArithmeticExprContext):
        print(f"\t\t\tvisitArithmeticExpr : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#domain.
    def visitDomain(self, ctx:KQueryParser.DomainContext):
        print(f"\t\tvisitDomain : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#rangeLimit.
    def visitRangeLimit(self, ctx:KQueryParser.RangeLimitContext):
        print(f"\t\tvisitRangeLimit : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#arrName.
    def visitArrName(self, ctx:KQueryParser.ArrNameContext):
        print(f"\t\tvisitArrName : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#numberList.
    def visitNumberList(self, ctx:KQueryParser.NumberListContext):
        print(f"\t\t\tvisitNumberList : {ctx.getText()}")
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#number.
    def visitNumber(self, ctx:KQueryParser.NumberContext):
        print(f"\t\t\t\tvisitNumber : {ctx.getText()}")
        return self.visitChildren(ctx)

    # Visit a parse tree produced by KQueryParser#varName.
    def visitVarName(self, ctx:KQueryParser.VarNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by KQueryParser#namedConstant.
    def visitNamedConstant(self, ctx:KQueryParser.NamedConstantContext):
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
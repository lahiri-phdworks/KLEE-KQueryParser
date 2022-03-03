import sys
from antlr4 import *
from KQueryLexer import KQueryLexer
from KQueryParser import KQueryParser
from KQueryVisitor import KQueryVisitor

class OverridenVisitor(KQueryVisitor):

    def visitKqueryExpression(self, ctx:KQueryParser.KqueryExpressionContext):
        statements = self.visit(ctx.queryStatements())
        print(statements)
        
    def visitQueryStatements(self, ctx:KQueryParser.QueryStatementsContext):
        print(ctx)
        statements = []
        for queryStmts in ctx.ktranslationUnit():
            statements.append(self.visit(queryStmts))
            print(queryStmts.getText())
            
        return statements
    
    def visitArrayDeclaration(self, ctx: KQueryParser.ArrayDeclarationContext):
        # print(ctx.arrayInitializer().getText())
        if ctx.arrayInitializer():
            self.visit(ctx.arrayInitializer())
    
    def visitArrayInitializer(self, ctx:KQueryParser.ArrayInitializerContext):
        if ctx.numberList():
            numbersList = []
            self.visit(ctx.numberList())
    
    def visitNumberList(self, ctx: KQueryParser.NumberListContext):
        num0 = ctx.number().getText()
        print(num0)
        if ctx.numberList():
            self.visit(ctx.numberList())
        
    def visitNumber(self, ctx: KQueryParser.NumberContext):
        return ctx.getText()
        
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
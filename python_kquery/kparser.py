import sys
from antlr4 import *
from kqueryLexer import kqueryLexer
from kqueryParser import kqueryParser
from kqueryVisitor import kqueryVisitor

class KQVisitor(kqueryVisitor):     
    def visitKqueryExpression(self, ctx):         
        print("KQuery !\n") 
    
    def enterEveryRule(self):
        print("Rules")
        
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = kqueryLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = kqueryParser(stream)
    tree = parser.kqueryExpression()
    visitor = KQVisitor()
    visitor.visit(tree)
 
if __name__ == '__main__':
    main(sys.argv)
// Generated from KQuery.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KQueryParser}.
 */
public interface KQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KQueryParser#kqueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterKqueryExpression(KQueryParser.KqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#kqueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitKqueryExpression(KQueryParser.KqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#queryStatements}.
	 * @param ctx the parse tree
	 */
	void enterQueryStatements(KQueryParser.QueryStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#queryStatements}.
	 * @param ctx the parse tree
	 */
	void exitQueryStatements(KQueryParser.QueryStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#ktranslationUnit}.
	 * @param ctx the parse tree
	 */
	void enterKtranslationUnit(KQueryParser.KtranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#ktranslationUnit}.
	 * @param ctx the parse tree
	 */
	void exitKtranslationUnit(KQueryParser.KtranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#queryCommand}.
	 * @param ctx the parse tree
	 */
	void enterQueryCommand(KQueryParser.QueryCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#queryCommand}.
	 * @param ctx the parse tree
	 */
	void exitQueryCommand(KQueryParser.QueryCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#queryExpr}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpr(KQueryParser.QueryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#queryExpr}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpr(KQueryParser.QueryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#evalExprList}.
	 * @param ctx the parse tree
	 */
	void enterEvalExprList(KQueryParser.EvalExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#evalExprList}.
	 * @param ctx the parse tree
	 */
	void exitEvalExprList(KQueryParser.EvalExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#evalArrayList}.
	 * @param ctx the parse tree
	 */
	void enterEvalArrayList(KQueryParser.EvalArrayListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#evalArrayList}.
	 * @param ctx the parse tree
	 */
	void exitEvalArrayList(KQueryParser.EvalArrayListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(KQueryParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(KQueryParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(KQueryParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(KQueryParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(KQueryParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(KQueryParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#numArrayElements}.
	 * @param ctx the parse tree
	 */
	void enterNumArrayElements(KQueryParser.NumArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#numArrayElements}.
	 * @param ctx the parse tree
	 */
	void exitNumArrayElements(KQueryParser.NumArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(KQueryParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(KQueryParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(KQueryParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableName}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(KQueryParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedAbbreviation}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNamedAbbreviation(KQueryParser.NamedAbbreviationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedAbbreviation}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNamedAbbreviation(KQueryParser.NamedAbbreviationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SizeQuery}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeQuery(KQueryParser.SizeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SizeQuery}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeQuery(KQueryParser.SizeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithExpr}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(KQueryParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithExpr}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(KQueryParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExprWidth(KQueryParser.NotExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExprWidth(KQueryParser.NotExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwExprWidth(KQueryParser.BitwExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwExprWidth(KQueryParser.BitwExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompExprWidth(KQueryParser.CompExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompExprWidth(KQueryParser.CompExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatExprWidth(KQueryParser.ConcatExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatExprWidth(KQueryParser.ConcatExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrExtractExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrExtractExprWidth(KQueryParser.ArrExtractExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrExtractExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrExtractExprWidth(KQueryParser.ArrExtractExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitExtractExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitExtractExprWidth(KQueryParser.BitExtractExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitExtractExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitExtractExprWidth(KQueryParser.BitExtractExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadExpresssionVersioned}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReadExpresssionVersioned(KQueryParser.ReadExpresssionVersionedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadExpresssionVersioned}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReadExpresssionVersioned(KQueryParser.ReadExpresssionVersionedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSelectExprWidth(KQueryParser.SelectExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSelectExprWidth(KQueryParser.SelectExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegationExprWidth(KQueryParser.NegationExprWidthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationExprWidth}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegationExprWidth(KQueryParser.NegationExprWidthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VersionExpr}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVersionExpr(KQueryParser.VersionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VersionExpr}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVersionExpr(KQueryParser.VersionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Singleton}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSingleton(KQueryParser.SingletonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Singleton}
	 * labeled alternative in {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSingleton(KQueryParser.SingletonContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#genericBitRead}.
	 * @param ctx the parse tree
	 */
	void enterGenericBitRead(KQueryParser.GenericBitReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#genericBitRead}.
	 * @param ctx the parse tree
	 */
	void exitGenericBitRead(KQueryParser.GenericBitReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#bitExtractExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExtractExpr(KQueryParser.BitExtractExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#bitExtractExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExtractExpr(KQueryParser.BitExtractExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VersionVariableName}
	 * labeled alternative in {@link KQueryParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersionVariableName(KQueryParser.VersionVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VersionVariableName}
	 * labeled alternative in {@link KQueryParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersionVariableName(KQueryParser.VersionVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UpdationList}
	 * labeled alternative in {@link KQueryParser#version}.
	 * @param ctx the parse tree
	 */
	void enterUpdationList(KQueryParser.UpdationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UpdationList}
	 * labeled alternative in {@link KQueryParser#version}.
	 * @param ctx the parse tree
	 */
	void exitUpdationList(KQueryParser.UpdationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(KQueryParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(KQueryParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpr(KQueryParser.ConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#concatExpr}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpr(KQueryParser.ConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#exprNegation}.
	 * @param ctx the parse tree
	 */
	void enterExprNegation(KQueryParser.ExprNegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#exprNegation}.
	 * @param ctx the parse tree
	 */
	void exitExprNegation(KQueryParser.ExprNegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpr(KQueryParser.SelectExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpr(KQueryParser.SelectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#arrExtractExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrExtractExpr(KQueryParser.ArrExtractExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#arrExtractExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrExtractExpr(KQueryParser.ArrExtractExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(KQueryParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(KQueryParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void enterLeftExpr(KQueryParser.LeftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#leftExpr}.
	 * @param ctx the parse tree
	 */
	void exitLeftExpr(KQueryParser.LeftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void enterRightExpr(KQueryParser.RightExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#rightExpr}.
	 * @param ctx the parse tree
	 */
	void exitRightExpr(KQueryParser.RightExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#updateList}.
	 * @param ctx the parse tree
	 */
	void enterUpdateList(KQueryParser.UpdateListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#updateList}.
	 * @param ctx the parse tree
	 */
	void exitUpdateList(KQueryParser.UpdateListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpr(KQueryParser.BitwiseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpr(KQueryParser.BitwiseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(KQueryParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(KQueryParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(KQueryParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(KQueryParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(KQueryParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(KQueryParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#rangeLimit}.
	 * @param ctx the parse tree
	 */
	void enterRangeLimit(KQueryParser.RangeLimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#rangeLimit}.
	 * @param ctx the parse tree
	 */
	void exitRangeLimit(KQueryParser.RangeLimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#arrName}.
	 * @param ctx the parse tree
	 */
	void enterArrName(KQueryParser.ArrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#arrName}.
	 * @param ctx the parse tree
	 */
	void exitArrName(KQueryParser.ArrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#numberList}.
	 * @param ctx the parse tree
	 */
	void enterNumberList(KQueryParser.NumberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#numberList}.
	 * @param ctx the parse tree
	 */
	void exitNumberList(KQueryParser.NumberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(KQueryParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(KQueryParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(KQueryParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(KQueryParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#boolnum}.
	 * @param ctx the parse tree
	 */
	void enterBoolnum(KQueryParser.BoolnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#boolnum}.
	 * @param ctx the parse tree
	 */
	void exitBoolnum(KQueryParser.BoolnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#signedConstant}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(KQueryParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#signedConstant}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(KQueryParser.SignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#widthOrSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterWidthOrSizeExpr(KQueryParser.WidthOrSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#widthOrSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitWidthOrSizeExpr(KQueryParser.WidthOrSizeExprContext ctx);
}
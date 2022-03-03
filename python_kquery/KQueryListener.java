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
	 * Enter a parse tree produced by {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KQueryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KQueryParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link KQueryParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(KQueryParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(KQueryParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KQueryParser#fullyQualifiedExpression}.
	 * @param ctx the parse tree
	 */
	void enterFullyQualifiedExpression(KQueryParser.FullyQualifiedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#fullyQualifiedExpression}.
	 * @param ctx the parse tree
	 */
	void exitFullyQualifiedExpression(KQueryParser.FullyQualifiedExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link KQueryParser#namedConstant}.
	 * @param ctx the parse tree
	 */
	void enterNamedConstant(KQueryParser.NamedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KQueryParser#namedConstant}.
	 * @param ctx the parse tree
	 */
	void exitNamedConstant(KQueryParser.NamedConstantContext ctx);
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
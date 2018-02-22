// Generated from C:/Users/weid/PycharmProjects/test_antlr/src/main/resources\ISL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ISLParser}.
 */
public interface ISLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNull(ISLParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNull(ISLParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ISLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ISLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ISLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ISLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ISLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ISLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(ISLParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(ISLParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEGExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNEGExp(ISLParser.NEGExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEGExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNEGExp(ISLParser.NEGExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(ISLParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(ISLParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Transform}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTransform(ISLParser.TransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Transform}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTransform(ISLParser.TransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParen(ISLParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParen(ISLParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalFalse}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalFalse(ISLParser.LogicalFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalFalse}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalFalse(ISLParser.LogicalFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalParen}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalParen(ISLParser.LogicalParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalParen}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalParen(ISLParser.LogicalParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpCmp}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpCmp(ISLParser.LogicalExpCmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpCmp}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpCmp(ISLParser.LogicalExpCmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalEqExpCmp}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEqExpCmp(ISLParser.LogicalEqExpCmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalEqExpCmp}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEqExpCmp(ISLParser.LogicalEqExpCmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalTrue}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTrue(ISLParser.LogicalTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalTrue}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTrue(ISLParser.LogicalTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalNotEqExp}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotEqExp(ISLParser.LogicalNotEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalNotEqExp}
	 * labeled alternative in {@link ISLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotEqExp(ISLParser.LogicalNotEqExpContext ctx);
}
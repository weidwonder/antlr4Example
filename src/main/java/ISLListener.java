// Generated from /home/weid/projects/antlr4Example/src/main/resources/ISL.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by the {@code ExpCmp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpCmp(ISLParser.ExpCmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpCmp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpCmp(ISLParser.ExpCmpContext ctx);
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
	 * Enter a parse tree produced by the {@code LogicalNotEqExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotEqExp(ISLParser.LogicalNotEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalNotEqExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotEqExp(ISLParser.LogicalNotEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalFalse}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalFalse(ISLParser.LogicalFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalFalse}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalFalse(ISLParser.LogicalFalseContext ctx);
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
	 * Enter a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(ISLParser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(ISLParser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpLogicalAnd}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpLogicalAnd(ISLParser.ExpLogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpLogicalAnd}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpLogicalAnd(ISLParser.ExpLogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpLogicalOr}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpLogicalOr(ISLParser.ExpLogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpLogicalOr}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpLogicalOr(ISLParser.ExpLogicalOrContext ctx);
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
	 * Enter a parse tree produced by the {@code LogicalTrue}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTrue(ISLParser.LogicalTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalTrue}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTrue(ISLParser.LogicalTrueContext ctx);
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
}
// Generated from /home/weid/projects/antlr4Example/src/main/resources/ISL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ISLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ISLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(ISLParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ISLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpCmp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCmp(ISLParser.ExpCmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ISLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ISLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalNotEqExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNotEqExp(ISLParser.LogicalNotEqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalFalse}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalFalse(ISLParser.LogicalFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ISLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(ISLParser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpLogicalAnd}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLogicalAnd(ISLParser.ExpLogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpLogicalOr}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLogicalOr(ISLParser.ExpLogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(ISLParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalTrue}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalTrue(ISLParser.LogicalTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link ISLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(ISLParser.ParenContext ctx);
}
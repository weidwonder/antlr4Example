import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Map;

class ExpressionEvaluator {

    private ExpressionVisitor visitor = new ExpressionVisitorImpl();
    private ISLParser.ExpressionContext context;

    public void setExpression(String expression) {

        ISLLexer lexer = new ISLLexer(new ANTLRInputStream(expression));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ISLParser parser = new ISLParser(tokens);

        context = parser.expression();

        ExpressionEnv expe = new ExpressionEnv();
        visitor.setEnv(expe);
    }

    public Boolean evalBoolExp(Map<String, Object> valMap) {
        ExpressionEnv expe = visitor.getEnv();
        expe.setAttrs(valMap);
        Result r = visitor.visit(context);
        return r.toBoolean();
    }
}
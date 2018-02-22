import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

class ExpressionEvaluator {

    private ExpressionVisitor visitor = new ExpressionVisitorImpl();
    private ISLParser.EqualityExpressionContext context;

    public void SetupExpression(String expression) {
        InputStream stream = new ByteArrayInputStream(expression.getBytes(StandardCharsets.UTF_8));

        ISLLexer lexer = new ISLLexer(new UnbufferedCharStream(stream));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ISLParser parser = new ISLParser(tokens);

        context = parser.equalityExpression();

        ExpressionEnv expe = new ExpressionEnv();
        visitor.setEnv(expe);
    }

    public Boolean evalEquation(Map<String, Object> valMap) {
        ExpressionEnv expe = visitor.getEnv();
        expe.setAttrs(valMap);
        Result<Boolean> r = visitor.visit(context);
        return r.value;
    }
}
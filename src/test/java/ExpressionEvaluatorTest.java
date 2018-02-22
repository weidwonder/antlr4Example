import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ExpressionEvaluatorTest extends TestCase {

    Map<String, Object> map = new HashMap<String, Object>() {{
        put("vInt", 1);
        put("vDouble", 1.23);
        put("vnull", null);
        put("vString", "Hello");
        put("vBoolean", true);
    }};

    private Boolean testEval(String expr, Map<String, Object> vals) {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        ee.setExpression(expr);
        return ee.evalEquation(vals);
    }

    private Boolean testEval(String expr) {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        ee.setExpression(expr);
        return ee.evalEquation(new HashMap<String, Object>());
    }

    @Test
    public void testMultiExp() {
        Assert.assertTrue(testEval("1==1"));
        Assert.assertFalse(testEval("1!=1"));
        Assert.assertTrue(testEval("\"2\"!=2"));
        Assert.assertTrue(testEval("1==1"));
        Assert.assertTrue(testEval("1==1"));
    }
}

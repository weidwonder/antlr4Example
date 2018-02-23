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
        put("vString", "Hello my antlr world!");
        put("vBoolean", true);
    }};

    private Boolean testEval(String expr, Map<String, Object> vals) {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        ee.setExpression(expr);
        return ee.evalBoolExp(vals);
    }

    private Boolean testEval(String expr) {
        ExpressionEvaluator ee = new ExpressionEvaluator();
        ee.setExpression(expr);
        return ee.evalBoolExp(new HashMap<String, Object>());
    }

    @Test
    public void testMultiExp() {
        Assert.assertTrue(testEval("1==1"));
        Assert.assertTrue(testEval("1.0==1"));
        Assert.assertTrue(testEval("false==false"));
        Assert.assertTrue(testEval("\"哈哈\"==\"哈哈\""));
        Assert.assertTrue(testEval("vInt.int==1", map));
        Assert.assertTrue(testEval("vInt==\"1\"", map));
        Assert.assertTrue(testEval("vInt.exists", map));
        Assert.assertTrue(testEval("vInt.bool", map));
        Assert.assertTrue(testEval("vDouble.double.int==1", map));
        Assert.assertTrue(testEval("vDouble.double!=1", map));
        Assert.assertTrue(testEval("vString contains \"my\"", map));
        Assert.assertTrue(testEval("1.00 == 1"));
        Assert.assertTrue(testEval("1 or 0 and 0"));
        Assert.assertTrue(testEval("1!=1 or 0.bool == false"));
        Assert.assertFalse(testEval("(1 or 0) and 0"));
        Assert.assertFalse(testEval("vString contains \"fuck\"", map));
        Assert.assertFalse(testEval("1!=1 and 2 == 1.1"));

        map.put("vInt", 2);
        Assert.assertFalse(testEval("vInt.int==1", map));
    }
}

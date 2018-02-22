import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExpressionVisitorImpl extends ExpressionVisitor {

    @Override
    public Result<String> visitVariable(ISLParser.VariableContext ctx) {
        String name = ctx.VARIABLE().getText();
        String varVal = this.getVar(name);
        return new Result<String>(varVal);
    }

    @Override
    public Result visitNumber(ISLParser.NumberContext ctx) {
        if (ctx.getText().contains(".")) {
            return new Result<Double>(Double.parseDouble(ctx.getText()));
        } else {
            return new Result<Integer>(Integer.parseInt(ctx.getText()));
        }
    }

    @Override
    public Result visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Result visitTerminal(TerminalNode node) {
        switch (node.getSymbol().getType()) {
            case ISLParser.VARIABLE: {
                return new Result<String>(getVar(node.getText()));
            }
            case ISLParser.TRANSFORM: {
                return new Result<String>(node.getText());
            }
            default:
                return visit(node);
        }
    }

    @Override
    public Result visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    public Result visitAttribute(ISLParser.AttributeContext ctx) {
        Result r;
        Result expression = visit(ctx.expression());
        Result<String> transform = visit(ctx.TRANSFORM());
        if (expression.value == null) {
            return new Result();
        }
        if (transform.value.equals("exists")) {
            r = new Result<Boolean>();
            r.value = expression.value != null;
        } else if (transform.value.equals("int")) {
            r = new Result<Integer>();
            if (expression.value instanceof String) {
                r.value = Integer.parseInt((String) expression.value);
            } else if (expression.value instanceof Integer) {
                r.value = expression.value;
            } else if (expression.value instanceof Double) {
                r.value = ((Double) expression.value).intValue();
            } else if (expression.value instanceof Boolean) {
                r.value = ((Boolean) expression.value) ? 1 : 0;
            }
        } else if (transform.value.equals("double")) {
            r = new Result<Double>();
            if (expression.value instanceof String) {
                r.value = Double.parseDouble((String) expression.value);
            } else if (expression.value instanceof Integer) {
                r.value = ((Integer) expression.value).doubleValue();
            } else if (expression.value instanceof Double) {
                r.value = expression.value;
            } else if (expression.value instanceof Boolean) {
                r.value = ((Boolean) expression.value) ? 1.0d : 0.0d;
            }
        } else if (transform.value.equals("bool")) {
            r = new Result<Boolean>();
            if (expression.value instanceof String) {
                r.value = !expression.value.equals("");
            } else if (expression.value instanceof Integer) {
                r.value = (Integer) expression.value != 0;
            } else if (expression.value instanceof Double) {
                r.value = (Double) expression.value != 0.0d;
            } else if (expression.value instanceof Boolean) {
                r.value = expression.value;
            }
        } else if (transform.value.equals("str")) {
            r = new Result<String>();
            if (expression.value instanceof String) {
                r.value = expression.value;
            } else {
                r.value = expression.value.toString();
            }
        } else {
            throw new ExpressionError("不能识别的转换模式:" +
                    transform.value);
        }
        return r;
    }

    @Override
    public Result visitTransform(ISLParser.TransformContext ctx) {
        return new Result<String>(ctx.TRANSFORM().getText());
    }

    @Override
    public Result visitIfExp(ISLParser.IfExpContext ctx) {
        Result te = visit(ctx.te);
        Result fe = visit(ctx.fe);
        Result ee = visit(ctx.ee);
        if (ee.value == null) {
            return fe;
        }
        if (ee.value instanceof Integer) {
            return ee.value.equals(0) ? fe : te;
        }
        if (ee.value instanceof String) {
            return ee.value.equals("") ? fe : te;
        }
        if (ee.value instanceof Double) {
            return ee.value.equals(0.0) ? fe : te;
        }
        if (ee.value instanceof Boolean) {
            return (Boolean) ee.value ? te : fe;
        }
        throw new ExpressionError("不能识别的if条件表达式类型:" +
                ctx.ee.getText());
    }

    @Override
    public Result visitNEGExp(ISLParser.NEGExpContext ctx) {
        Result r = new Result();
        Result exp = visit(ctx.expression());
        if (exp.value == null) {
            r = new Result<String>();
            r.value = null;
        }
        if (exp.value instanceof Integer) {
            r = new Result<Integer>();
            r.value = -(Integer) exp.value;
        }
        if (exp.value instanceof String) {
            throw new ExpressionError("不能对字符串取负值:"
                    + ctx.expression().getText());
        }
        if (exp.value instanceof Double) {
            r = new Result<Double>();
            r.value = -(Double) exp.value;
        }
        if (exp.value instanceof Boolean) {
            throw new ExpressionError("不能对布尔取负值:"
                    + ctx.expression().getText());
        }
        return r;
    }

    @Override
    public Result visitString(ISLParser.StringContext ctx) {
        Result r = new Result<String>();
        String s = ctx.STRING().getText();
        r.value = s.substring(1, s.length() - 1);
        return r;
    }

    @Override
    public Result visitParen(ISLParser.ParenContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Result visitLogicalFalse(ISLParser.LogicalFalseContext ctx) {
        return new Result<Boolean>(false);
    }

    @Override
    public Result visitLogicalParen(ISLParser.LogicalParenContext ctx) {
        return visit(ctx.equalityExpression());
    }

    @Override
    public Result visitNull(ISLParser.NullContext ctx) {
        return new Result();
    }

    @Override
    public Result visitLogicalExpCmp(ISLParser.LogicalExpCmpContext ctx) {
        Result r = new Result<Boolean>();
        Result left = visit(ctx.expression(0));
        Result right = visit(ctx.expression(1));
        int op = ctx.op.getType();
        if (left.value == null && right.value == null) {
            r.value = true;
            return r;
        }
        if (left.value == null || right.value == null) {
            r.value = false;
            return r;
        }
        switch (op) {
            case ISLParser.GT: {
                r.value = compare(left, right) > 0;
                break;
            }
            case ISLParser.GTE: {
                r.value = compare(left, right) >= 0;
                break;
            }
            case ISLParser.LT: {
                r.value = compare(left, right) < 0;
                break;
            }
            case ISLParser.LTE: {
                r.value = compare(left, right) <= 0;
                break;
            }
            case ISLParser.EQ: {
                r.value = compare(left, right) == 0;
                break;
            }
            case ISLParser.NE: {
                r.value = compare(left, right) != 0;
                break;
            }
            case ISLParser.CONTAINS: {
                if (!(left.value instanceof String) || !(right.value instanceof ISLParser.StringContext)) {
                    throw new ExpressionError("contains 只能用于字符串");
                }
                r.value = ((String) left.value).contains((String) right.value);
                break;
            }
        }
        return r;
    }

    @Override
    public Result visitLogicalEqExpCmp(ISLParser.LogicalEqExpCmpContext ctx) {
        Result r = new Result<Boolean>();
        Result<Boolean> left = visit(ctx.equalityExpression(0));
        Result<Boolean> right = visit(ctx.equalityExpression(1));
        int op = ctx.op.getType();
        switch (op) {
            case ISLParser.EQ: {
                r.value = compare(left, right) == 0;
                break;
            }
            case ISLParser.NE: {
                r.value = compare(left, right) != 0;
                break;
            }
            case ISLParser.AND: {
                r.value = left.value && right.value;
                break;
            }
            case ISLParser.OR: {
                r.value = left.value || right.value;
                break;
            }
            case ISLParser.NOT: {
                r.value = left.value || right.value;
                break;
            }
        }
        return r;
    }

    @Override
    public Result visitLogicalNotEqExp(ISLParser.LogicalNotEqExpContext ctx) {
        return new Result(!(Boolean) visit(ctx.equalityExpression()).value);
    }

    @Override
    public Result visitLogicalTrue(ISLParser.LogicalTrueContext ctx) {
        return new Result<Boolean>(true);
    }

    private int compare(Result i, Result j) {
        if (i.value instanceof Number && j.value instanceof Number) {
            return compareNumber((Number) i.value, (Number) j.value);
        }
        if (i.value instanceof Boolean && j.value instanceof Boolean) {
            return i.value == j.value ? 0 : 1;
        }
        if (i.value instanceof String && j.value instanceof String) {
            return ((String) i.value).compareTo((String) j.value);
        }
        throw new ExpressionError("不可以比较的类型:" + i.value.getClass() + "与" + j.value.getClass());
    }

    private int compareNumber(Number a, Number b) {
        Double n2c = a.doubleValue();
        Double n1c = b.doubleValue();

        return n1c.compareTo(n2c);
    }

}

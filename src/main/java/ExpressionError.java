public class ExpressionError extends RuntimeException {
    public ExpressionError() {
        this("表达式错误");
    }

    public ExpressionError(String s) {
        super(s);
    }
}

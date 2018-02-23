
public class Result<T> {
    public T value = null;

    public Result(){};

    public Result(T value) {
        this.value = value;
    }

    public boolean toBoolean() {
        if (this.value == null) {
            return false;
        }
        if (this.value instanceof Integer) {
            return (Integer) this.value != 0;
        }
        if (this.value instanceof Double) {
            return (Double) this.value == 0.0d;
        }
        if (this.value instanceof Boolean) {
            return (Boolean) this.value;
        }
        if (this.value instanceof String) {
            return !this.value.equals("");
        }
        throw new ExpressionError("转换bool类型错误:" + this.value.getClass());
    }
}

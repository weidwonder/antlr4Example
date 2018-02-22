public class ExpressionVisitor extends ISLBaseVisitor<Result> {

    private ExpressionEnv env = null;

    public String getVar(String name) {
        if (env == null) {
            throw new RuntimeException("环境变量未装载");
        }
        return env.get(name);
    }

    public void setEnv(ExpressionEnv env) {
        this.env = env;
    }
    public ExpressionEnv getEnv() {
        return env;
    }
}

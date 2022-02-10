package questions.LambdaExpressions;

@FunctionalInterface
public interface MessagePreparer {
    String prepare(String message);
}

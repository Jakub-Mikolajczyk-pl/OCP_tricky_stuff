package questions.LambdaExpressions;

public class LambdaExpressions {
    public void printMessage(String message, MessagePreparer messagePreparer) {
        System.out.println(messagePreparer.prepare(message));
    }
}

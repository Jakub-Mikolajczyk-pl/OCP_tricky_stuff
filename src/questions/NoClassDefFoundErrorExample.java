package questions;

public class NoClassDefFoundErrorExample {
    public static void invokeException() {
        try {
            new Objectus(); //ExceptionInInitializeError
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }
        new Objectus(); //NoClassDefFoundError!
    }

    public static class Objectus {
        static int arithmeticException = 1/0; //ArithmeticException thrown when object initialized
    }
}

package questions;

public class FunctionalInterf {
    public static void doSomething() {
        EventHandler doSomething = () -> System.out.println("I'm doing something");

        doSomething.handle();
    }
}

@FunctionalInterface
interface EventHandler {
    void handle();
}
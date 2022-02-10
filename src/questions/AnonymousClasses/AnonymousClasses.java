package questions.AnonymousClasses;

public class AnonymousClasses {
    public void someMethod() {
        String saySomething = "Something";

        SomeInterface someInterfaceLambda = () -> System.out.println(saySomething + " - it did from lambda!");

        SomeInterface someInterfaceNormal = new SomeInterface() {
            @Override
            public void doSomething() {
                System.out.println(saySomething + " - it did from normal anonymous class!");
            }
        };

        someInterfaceLambda.doSomething();
        someInterfaceNormal.doSomething();
    }
}

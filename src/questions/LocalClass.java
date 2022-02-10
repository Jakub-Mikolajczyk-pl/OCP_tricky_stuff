package questions;

public class LocalClass {

    public void method() {
        System.out.println("Hello from method");

        class Local {
            void localMethod() {
                System.out.println("Hello from localMethod in local class named Local");
            }
        }

        Local local = new Local();
        local.localMethod();
    }

}

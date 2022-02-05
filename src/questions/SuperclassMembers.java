package questions;

public class SuperclassMembers {
    public static class Hello {
        public void sayHello() {
            System.out.println("Hello");
        }
    }
    public static class Hi extends Hello {
        @Override
        public void sayHello() {
            super.sayHello(); // You can call Superclass method from its overrode method
            System.out.println("Hi");
        }
    }
}

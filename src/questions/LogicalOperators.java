package questions;

public class LogicalOperators {

    public static void shortCircuitedOR() {
        //What's the value of yBool?
        int xInt = 7;
        boolean yBool = false;

        boolean result = (xInt++ <= 7) || (yBool = true); //true
        //short circuited or skips the second logical bracket

        System.out.println(yBool); //false
    }

    public static void orderOfOperations() {
        int x = 3;
        int y = 4;

        int z = x * x++ + y - y;
        System.out.println(z);
    }
}

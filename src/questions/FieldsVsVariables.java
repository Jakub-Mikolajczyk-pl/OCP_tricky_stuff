package questions;

import java.util.Random;

public class FieldsVsVariables {

    public static void partialInitializationWithElse() {
        boolean flag = (new Random()).nextBoolean();
        long variable_x;
        if (flag) {
            variable_x = 100L;
        } else {
            variable_x = 500L;
        }
        System.out.println(variable_x); //WORKS!
    }

    public static void partialInitializationWithoutElse() {
        boolean flag = (new Random()).nextBoolean();
        long variable_x;
        if (flag) {
            variable_x = 100L;
        } // Missing else clause, the same would be with while/for, where variable is initialized inside the loop
        // and with switch statements if they miss default step
        
//        System.out.println(variable_x); //Won't compile
    }
}

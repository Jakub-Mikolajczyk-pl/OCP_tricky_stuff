package questions;

public class SwitchStatements {
    public static void switchWithStatement() {
        int iVal = 10;
//        int evenValue = 0;
        final int finalEvenValue = 2; // can be byte or short will still work with int as other case
        final byte oddValue = 4;
        switch (iVal % 2) {
            //case evenValue: //Must be constant value/expression
            case finalEvenValue: // works!
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            case finalEvenValue + 1:
                System.out.println("works");
                break;
            case oddValue:
                System.out.println("byte value works");
                break;
        }
    }


}

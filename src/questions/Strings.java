package questions;

public class Strings {
    public static void trickyConcatenation() {
        String str = 5 + 3 + "xyz" + 3 + 5;
        System.out.println(str); // "8xyz35"
    }

    public static void trickyPlusSumConcatenation() {
        String str4 = "Pi is 3.14";
        str4 += "__" + 5 * 4; //Order of operations - multiplication is done first
        System.out.println(str4); // "Pi is 3.14__20"
    }

    public static void newStrings() {
        String s = new String("Hello");
        String s1 = new String("Hello");
        System.out.print("Compared with == ");
        System.out.println(s==s1); //false
        System.out.println("Compared with equals() " + s.equals(s1)); //true
    }

    public static void stripTrim() {
        String s = "\t\b   \"Hi there!\"  \\\r\n\f";
        System.out.println(s);
        System.out.println(s.length());
        String s1 = s.trim();
        System.out.println("Trim");
        System.out.println(s1);
        System.out.println(s1.length());
        String s2 = s.strip();
        System.out.println("Strip");
        System.out.println(s2);
        System.out.println(s2.length());
    }
}

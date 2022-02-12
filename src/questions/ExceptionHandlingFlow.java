package questions;

public class ExceptionHandlingFlow {
    public static void flow() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = null;
        try {
            stringBuilder.append("a");
            str.toUpperCase();
            stringBuilder.append("b");
        } catch (IllegalArgumentException e) {
            stringBuilder.append("c");
        } catch (Exception e) {
            stringBuilder.append("d");
        } finally {
            stringBuilder.append("e");
        }
        stringBuilder.append("f");

        System.out.println(stringBuilder);
    }

}

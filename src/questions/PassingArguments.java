package questions;

public class PassingArguments {
    private static void swap(int a, int b) {
        int aux = a;
        a = b;
        b = aux;
    }

    public static void swapPrimitives() { //Pass by value
        int a = 1; int b = 2;
        swap(a, b);
        System.out.println("Still the same, even after swap " + a + ", " + b);
    }

    // ------------------------------------------------------

    static class Coordinate {
        double x; double y;

        public Coordinate(double v, double v1) {
            x = v;
            y = v1;
        }

        @Override
        public String toString() {
            return "Coordinate{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static void offset(Coordinate coordinate) {
        coordinate.x += 0.1;
        coordinate.y += 0.1;
    }

    public static void swapWithTypeReference() { //Pass by Reference
        Coordinate c = new Coordinate(0.0, 0.0);
        System.out.println("Before offseting Coordinate " + c);
        offset(c);
        System.out.println("After offseting Coordinate " + c);
    }
}

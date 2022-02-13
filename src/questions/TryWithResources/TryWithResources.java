package questions.TryWithResources;

public class TryWithResources {
    public static void tryIt() {
        try (var one = new MyResource("One");
             var two = new MyResource("Two")) { //It closes the resources from last to first
            throw new RuntimeException();
        } //Can be without catch because resource doesn't throw an exception
    }
}

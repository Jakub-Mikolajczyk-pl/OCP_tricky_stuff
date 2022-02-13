package questions.TryWithResources;

public class MyResource implements AutoCloseable{

    public MyResource(String name) {
        this.name = name;
    }

    String name;

    @Override
    public void close() { // If `throws IOException` would be added then try with resources would need to catch it
        System.out.println("Closing resource #: " + name);
    }
}

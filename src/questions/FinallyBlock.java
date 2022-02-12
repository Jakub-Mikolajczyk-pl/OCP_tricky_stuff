package questions;

public class FinallyBlock {
    //How to avoid running finally block? There's one way
    public void avoidFinally() {
        try {
            System.exit(0);
        } finally {
            System.out.println("This won't print!");
        }
    }
}

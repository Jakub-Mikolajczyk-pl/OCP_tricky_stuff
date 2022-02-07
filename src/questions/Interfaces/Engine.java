package questions.Interfaces;

public interface Engine {
    // By default - public static final
    int MIN_TEMP = -50;
    void start();
    void stop();

    //Why use this? To create utility methods for this interface and it's implementations
    static boolean canStart(int outsideTemp) {
        return outsideTemp > MIN_TEMP;
    }

    default String healthCheck() {
        return "OK";
    }
}

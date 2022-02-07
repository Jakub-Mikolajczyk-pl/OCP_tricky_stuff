package questions.Interfaces;

public class TurboProp implements Engine {

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String healthCheck() {
        return "TurboProp - OK";
    }
}

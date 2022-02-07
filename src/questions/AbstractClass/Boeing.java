package questions.AbstractClass;

public class Boeing extends Aircraft {
    public Boeing(String modelName) {
        super(Boeing.class.getSimpleName() + " " + modelName);
    }

    @Override
    protected void checkSystems() {
        System.out.println("All systems OK!");
    }

    @Override
    protected void getClearance() {
        System.out.println("Clear to Go!");
    }

    @Override
    protected void implementCustomActions() {
        System.out.println("FLY!");
    }
}

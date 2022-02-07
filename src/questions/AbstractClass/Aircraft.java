package questions.AbstractClass;

public abstract class Aircraft {
    private final String modelName;

    public Aircraft(String modelName) {
        this.modelName = modelName;
    }

    //Skeleton of an Algorithm
    public final void takeOff() {
        System.out.println(modelName + " - taking off!");
        this.checkSystems();
        this.getClearance();
        this.implementCustomActions();
    }

    //A subclass needs to implement all these abstract methods
    protected abstract void checkSystems();

    protected abstract void getClearance();

    protected abstract void implementCustomActions();
}


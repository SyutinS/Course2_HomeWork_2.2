public abstract class Vehicle implements Serviced {

    private String modelName;

    public Vehicle(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return " - " + modelName + " -  ";
    }
}

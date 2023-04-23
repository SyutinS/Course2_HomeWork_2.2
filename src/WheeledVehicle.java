public abstract class WheeledVehicle extends Vehicle implements Serviced {

    private int wheelsCount;

    public WheeledVehicle(String modelName, int wheelsCount) {
        super(modelName);
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}

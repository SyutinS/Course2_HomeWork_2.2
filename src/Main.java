public class Main {

    public static void main(String[] args) {

        Serviced[] transport = {
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck ("truck1", 6),
                new Truck ("truck2", 8),
                new Bicycle("becycle1", 2),
                new Bicycle("becycle2", 2),
        };

        ServiceStation station = new ServiceStation();
        for (Serviced vehicle : transport) {
            station.printNameTransport(vehicle);
            station.check(vehicle);
        }
    }
}
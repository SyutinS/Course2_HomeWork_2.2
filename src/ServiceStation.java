public class ServiceStation {

    public void printNameTransport(Serviced vehicle) {
        System.out.println("Обслуживаем " + vehicle.toString());
    }

    public void check(Serviced vehicle) {
        vehicle.service();
    }
}

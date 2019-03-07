public class Main {

    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.createVehicle("car");
        v1.changeTires();
    }
}

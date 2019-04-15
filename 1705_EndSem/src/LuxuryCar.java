public class LuxuryCar extends Car {

    LuxuryCar() {
        super(CarType.LUXURY);
        assign();
    }

    @Override
    protected void assign() {
        System.out.println("Assign LuxuryCar");
        System.out.println("Capacity: 7");
    }
}

public class SmallCar extends Car {

    SmallCar() {
        super(CarType.SMALL);
        assign();
    }

    @Override
    protected void assign() {
        System.out.println("Assign SmallCar");
        System.out.println("Capacity: 4");
    }
}

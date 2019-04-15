/* * @author  Leonora Fernandes
 * * @version 1.0
 * * @since   2019-04-15
 * */

public class CarFactory {

    public static Car assignCar(CarType model) {

        Car car = null;

        switch (model) {
            case SMALL:
                car = new SmallCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default: break;
        }
        return car;
    }
}

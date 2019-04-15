/* * @author  Leonora Fernandes
 * * @version 1.0
 * * @since   2019-04-15
 * */

public abstract class Car {

    public Car(CarType model){
        this.model = model;
        assignCars();
    }

    private void assignCars(){
    }

    protected abstract void assign();

    private CarType model = null;

    public CarType getModel(){
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}

public class VehiclePortal {
    private Vehicle bike,car;

    public VehiclePortal(){
        bike = new Bike();
        car = new Car();
    }

    public void changeCarTires(){
        car.changeTires();
    }

    public void changeBikeTires(){
        bike.changeTires();
    }

    public Vehicle getCar(){
        return car;
    }
    public void getCar(Vehicle car){
        this.car = car;
    }

    public Vehicle getBike(){
        return  bike;
    }
    public void getBike(Vehicle  bike){
        this.bike = bike;
    }
}

/* <h1>Car Pooling Program</h1>
* * this program allows you to Register a Passenger or a Driver and even allows you to book a cab.
* * @author  Leonora Fernandes
* * @version 1.0
* * @since   2019-04-15
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("*****Registeration*****");
        System.out.println("1. Driver");
        System.out.println("2. Passenger");
        System.out.println("Choose your option (1/2) >>>>");

        Scanner reg_in = new Scanner(System.in);
        int reg_opt = reg_in.nextInt();

        if(reg_opt==1){
            System.out.println("*****Driver*****");
            UserReg d1 = UserRegFactory.createUserName("driver");
            d1.enterName();
            UserReg d2 = UserRegFactory.createUserMobileNo("driver");
            d2.enterMobileNo();
            UserReg d3 = UserRegFactory.createUserCarType("driver");
            d3.enterCarType();
            return;
        }
        else if(reg_opt==2){
            System.out.println("*****Passenger*****");
            UserReg p1 = UserRegFactory.createUserName("passenger");
            p1.enterName();
            UserReg p2 = UserRegFactory.createUserMobileNo("passenger");
            p2.enterMobileNo();
            UserReg p3 = UserRegFactory.createUserCarType("passenger");
            p3.enterCarType();
        }


        System.out.println("\n");
        System.out.println("*****Car Pooling System*****");
        System.out.println("1. Small Car");
        System.out.println("2. Luxury Car");
        System.out.println("Choose your option (1/2) >>>>");

        Scanner car_in = new Scanner(System.in);
        int car_opt = car_in.nextInt();

        if(car_opt==1){
            System.out.println(CarFactory.assignCar(CarType.SMALL));
            System.out.println("\n*****Cab Successfully Booked*****");
        }
        else if(car_opt==2){
            System.out.println(CarFactory.assignCar(CarType.LUXURY));
            System.out.println("\n*****Cab Successfully Booked*****");
        }
    }
}

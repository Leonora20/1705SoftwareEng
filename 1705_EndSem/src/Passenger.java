/* * @author  Leonora Fernandes
 * * @version 1.0
 * * @since   2019-04-15
 * */

public class Passenger implements UserReg {
    @Override
    public void enterName() {
        System.out.println("PassengerName");
    }

    @Override
    public void enterMobileNo() {
        System.out.println("MobileNo.");
    }

    @Override
    public void enterCarType() {
        System.out.println("CarChoice");
    }
}

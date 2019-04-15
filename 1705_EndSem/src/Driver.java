/* * @author  Leonora Fernandes
 * * @version 1.0
 * * @since   2019-04-15
 * */

public class Driver implements UserReg {
    @Override
    public void enterName() {
        System.out.println("DriverName");
    }

    @Override
    public void enterMobileNo() {
        System.out.println("MobileNo.");
    }

    @Override
    public void enterCarType() {
        System.out.println("OwnedCarType");
        System.out.println("CarRegNo.");
    }

}

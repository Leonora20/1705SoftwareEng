/* * @author  Leonora Fernandes
 * * @version 1.0
 * * @since   2019-04-15
 * */

public class UserRegFactory {
    public static UserReg createUserName(String dmType){
        if(dmType == "driver"){
            return new Driver();
        }else if(dmType == "passenger"){
            return new Passenger();
        }
        return null;
    }

    public static UserReg createUserMobileNo(String dmType){
        if(dmType == "driver"){
            return new Driver();
        }else if(dmType == "passenger"){
            return new Passenger();
        }
        return null;
    }

    public static UserReg createUserCarType(String dmType){
        if(dmType == "driver"){
            return new Driver();
        }else if(dmType == "passenger"){
            return new Passenger();
        }
        return null;
    }

}

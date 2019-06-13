package Class;

public class Data {

// Method to validate user.
    public boolean validateUser(String user, String password){
        if (user.equalsIgnoreCase("jio")&& password.equals("123"))
            return true;
        else
            return false;
    }
}

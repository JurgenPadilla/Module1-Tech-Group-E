package Class;

import Forms.frmLogin;

public class Main {
    public static void main(String[] args) {
        frmLogin myLogin = new frmLogin();

        // put in the middle the form
        myLogin.setLocationRelativeTo(null);
        myLogin.setVisible(true);
    }
}

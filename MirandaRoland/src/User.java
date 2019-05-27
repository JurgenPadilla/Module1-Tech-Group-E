import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class User {

    private String accountID;
    private int systemID;
    private boolean admin;
    private Socket socket;
    private DataInputStream input;
    private DataOutputStream output;

    public User(String accountID, int systemID, boolean admin, Socket socket, DataInputStream input, DataOutputStream output) {
        this.accountID = accountID;
        this.systemID = systemID;
        this.admin = admin;
        this.socket = socket;
        this.input = input;
        this.output = output;
    }

    public DataInputStream getInput() {
        return input;
    }

    public DataOutputStream getOutput() {
        return output;
    }

    public Socket getSocket() {
        return socket;
    }

    public String getAccountID() {
        return accountID;
    }

    public boolean isAdmin() {
        return admin;
    }

    public int getSystemID() {
        return systemID;
    }

}

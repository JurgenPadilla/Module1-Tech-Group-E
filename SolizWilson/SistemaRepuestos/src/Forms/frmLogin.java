package Forms;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmLogin extends JFrame {

//------------------------------------------
    // Objects of the form
    private JLabel lblUser;
    private JLabel lblPassword;
    private JLabel lblImage;
    private JTextField txtUser;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;
//-------------------------------------------

  //----------------------------------------------
    // Create the constructor
    // Properties of the form
    public frmLogin() {

        setTitle("Login to the system");
        setResizable(false);
        setSize(390, 180);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//---------------------------------------------------------

//---------------------------------------------------------
        // Create the object of the form
        lblUser = new JLabel("User");
        txtUser = new JTextField("10");
        lblPassword = new JLabel("Password");
        txtPassword = new JPasswordField("10");
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
//----------------------------------------------------------

//----------------------------------------------------------
        // Add objects to form
        add(lblUser);
        add(txtUser);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(btnCancel);
//----------------------------------------------------------

//----------------------------------------------------------
        // Location of the objects in the form.
        lblUser.reshape(20, 20, 100, 20);
        txtUser.reshape(120, 20, 100, 20);

        lblPassword.reshape(20, 45, 100, 20);
        txtPassword.reshape(120, 45, 100, 20);

        btnLogin.reshape(20, 75, 90, 60);
        btnCancel.reshape(130, 75, 90, 60);
//----------------------------------------------------------

//------------------------------------------------------------
// Add events to buttons
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLoginActionPerformed(e);

            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCancelActionPerformed(e);
            }
        });
    }
            private void btnLoginActionPerformed(ActionEvent e) {

            frmMain myMain = new frmMain();
            myMain.setVisible(true);
        }
            private void btnCancelActionPerformed(ActionEvent e) {
// Finish the application
            System.exit(0);
    }
}

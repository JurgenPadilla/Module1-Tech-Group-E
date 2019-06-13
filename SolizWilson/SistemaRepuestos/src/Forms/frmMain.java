package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmMain extends JFrame {

    //-------------------------------------------------
    // objects create menu bar and menus
    private JMenuBar mnbSold;
    private JMenu mnuFile;
    private JMenu mnuSold;
    private JMenu mnuHelp;
    private JMenuItem mnuFileCustomers;
    private JMenuItem mnuFileProducts;
    private JMenuItem mnuFileUsers;
    private JSeparator mnuFileSeparator;
    private JMenuItem mnuFileChangePassword;
    private JMenuItem mnuFileChangeUser;
    private JSeparator mnuFileSeparator2;
    private JMenuItem mnuFileExit;
    private JMenuItem mnuNewSold;
    private JMenuItem mnuReportSold;
    private JMenuItem mnuHelpAboutUs;
    private JMenuItem mnuHelpHelp;
    //
    private JDesktopPane dpnDesktop;



    //---------------------------------------------------
    public frmMain () {
// objects
        //Properties of the form
        setTitle("Sold system");
                setResizable(true);
        setSize(700, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//----------------------------------------------------------------------
        // creation of objects
        mnbSold = new JMenuBar();
        mnuFile = new JMenu ("File");
        mnuSold = new JMenu ("Sold");
        mnuHelp = new JMenu ("Help");
        mnuFileCustomers = new JMenuItem ("FileCustomer");
        mnuFileProducts = new JMenuItem ("FileProducts");
        mnuFileUsers = new JMenuItem ("FileUser");
        mnuFileSeparator = new JSeparator();
        mnuFileChangePassword = new JMenuItem ("FileChangePassword");
        mnuFileChangeUser = new JMenuItem ("FileChangeUser");
        mnuFileSeparator2 = new JSeparator();
        mnuFileExit = new JMenuItem("Exit");
        mnuNewSold = new JMenuItem("NewSold");
        mnuReportSold = new JMenuItem("ReportSold");
        mnuHelpAboutUs = new JMenuItem("HelpAboutUs");
        mnuHelpHelp = new JMenuItem("Help");
        dpnDesktop = new JDesktopPane();
//----------------------------------------------------------------------------

//---------------------------------------------------------------------------
        //Building  menus

        mnuFile.add(mnuFileCustomers);
        mnuFile.add(mnuFileProducts);
        mnuFile.add(mnuFileUsers);
        mnuFile.add(mnuFileSeparator);
        mnuFile.add(mnuFileChangePassword);
        mnuFile.add(mnuFileChangeUser);
        mnuFile.add(mnuFileSeparator2);
        mnuFile.add(mnuFileExit);
        mnbSold.add(mnuFile);

        mnuSold.add(mnuNewSold);
        mnbSold.add (mnuReportSold);
        mnbSold.add(mnuSold);

        mnuHelp.add(mnuHelpAboutUs);
        mnuHelp.add(mnuHelpHelp);
        mnbSold.add(mnuHelp);

        // My properties of the form
        setJMenuBar(mnbSold);
        setContentPane(dpnDesktop);

        // Menu events

        mnuFileCustomers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnuFileCustomersActionPerformed(e);
            }
        });

        mnuFileProducts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnuFileProductsActionPerformed(e);
                            }
        });

        mnuFileUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnuFileUsersActionPerformed(e);
            }
        });
        mnuFileChangePassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnuFileChangeUserActionPerformed(e);
            }
        });
        mnuFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mnuFileExitActionPerformed(e);
            }
        });
       mnuNewSold.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               mnuNewSoldActionPerformed(e);
           }
       });
       mnuReportSold.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               mnuReportSoldActionPerformed (e);
           }
       });
       mnuHelpAboutUs.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               mnuHelpAboutUsActionPerformed(e);
           }
       });

               mnuHelp.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       mnuHelpActionPerformed(e);
                   }
               });
           }
        private void mnuFileCustomersActionPerformed(ActionEvent e) {
            // create new object
            frmCustomers myCustomers = new frmCustomers();
            dpnDesktop.add(myCustomers);
            myCustomers.show();
        }

    private void mnuFileProductsActionPerformed(ActionEvent e) {
        // create new object
        frmProducts myProducts = new frmProducts();
        dpnDesktop.add(myProducts);
        myProducts.show();
    }
    private void mnuFileUsersActionPerformed(ActionEvent e) {
// create new object
        frmUsers myUsers = new frmUsers();
        dpnDesktop.add(myUsers);
        myUsers.show();
    }
    private void mnuFileChangeUserActionPerformed(ActionEvent e) {

    }
    private void mnuFileExitActionPerformed(ActionEvent e) {
        // Finish the aplication
        System.exit(0);
    }
    private void mnuNewSoldActionPerformed(ActionEvent e) {

    }
    private void mnuHelpAboutUsActionPerformed(ActionEvent e) {

    }

    private void mnuHelpActionPerformed(ActionEvent e) {

    }
    private void mnuReportSoldActionPerformed(ActionEvent e) {

    }

    }



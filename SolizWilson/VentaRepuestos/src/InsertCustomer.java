import java.util.Scanner;


public class InsertCustomer {

    private String customerName;
    private String askForCustomer;
    private String dropSpaces;

    // constructor

    public InsertCustomer(){

        customerName = "";
        askForCustomer();
        dropSpaces();

    }

    // method request word with scanner

    public void askForCustomer(){

        Scanner sc = new Scanner(System.in);
        customerName =   sc.nextLine();

    }

    public void dropSpaces() {

        for (int i = 0; i < getLongitud(); i++) {

            if (customerName.substring(0, 1).equals(" ")) {
                customerName = customerName.substring(1, getLongitud());
            } else {
                customerName = customerName;
            }
        }
    }

    public String getCustomerName(){
        return customerName;

    }
    public int getLongitud(){
        return customerName.length();
    }
    }

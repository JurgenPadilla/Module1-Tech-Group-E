import java.util.ArrayList;

public class Customers {

    private String namesCustomerList;
    private ArrayList<String> listCustomers;


    //constructor

    public Customers(){

        namesCustomerList = "CUSTOMERS";
        listCustomers = new ArrayList<String>();
        listCustomers.add("Jorge Falcon");
        listCustomers.add("Jose Mujica");
        listCustomers.add("Linda Hermosa");
        listCustomers.add("Carlos Capo");
        listCustomers.add("Julian Perez");
        listCustomers.add("Marcelo Tinelli");

    }
    // function add customer
    public void addCustomer(String customerName){
        listCustomers.add(customerName);

    }

    public ArrayList<String> getListacustomers(){
        return listCustomers;
    }

    public int getSize(){

        return listCustomers.size();
    }
    public String getWord(){

        return getWord();
    }

    public String getNamesCustomerList() {
        return namesCustomerList;

    }

    //print in column list
    public void printList(){

        System.out.println("\n" + getNamesCustomerList() + "\n");
        for (int i = 0; i<getSize(); i++){
            System.out.println((i+1) + "---" + getListacustomers().get(i));
        }
    }

}

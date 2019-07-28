import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is the list of customers");

        Customers list = new Customers();
        list.printList();

        boolean lanzador = true;
        while (lanzador == true){
            System.out.println("\n" + "¿Do you want to another customer in the list?(y/n)");
            InsertCustomer confirmador = new InsertCustomer();

            if (confirmador.getCustomerName().equalsIgnoreCase("y")) {
                System.out.println("\nPlease insert a new costumer:");
                InsertCustomer name = new InsertCustomer();
                list.addCustomer(name.getCustomerName());
            } else {
                lanzador = false;
                System.out.println("\nthe full list list is  " + (list.getSize())  );
                list.printList();

            }
        }

    }
}

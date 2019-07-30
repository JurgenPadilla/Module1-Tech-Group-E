import java.io.IOException;


/**
 this class in the main --> HERE STARTS!
 */
public class StoreManagment {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//    public static void main(String[] args){
        Store UoGStore = new Store("Store");
        Manager uogStoreManager = new Manager(UoGStore,"store.db");
        GUI.DEFAULT_UI= userInterface.GRAPHICAL;
        while(uogStoreManager.update()!=0);
    }

}
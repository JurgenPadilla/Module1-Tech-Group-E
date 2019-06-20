import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Circles> arrayList = new ArrayList<Circles>();
        arrayList.add(new Circles(2.5, 5.5));
        arrayList.add(new Circles(4.5,9.5));

        //Collection.class arrayList;

        for (Circles rd: arrayList){
            System.out.println(rd);
        }
    }
}

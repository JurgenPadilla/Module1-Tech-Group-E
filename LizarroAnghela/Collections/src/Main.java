import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Circle> arrayList = new ArrayList<Circle>();
        arrayList.add(new Circle(2.5, 5.5));
        arrayList.add(new Circle(4.5,9.5));


        //Collection.class arrayList;

        for (Circle rd: arrayList){
            //System.out.println(rd);
            System.out.println("Circle with radius:" + rd.getRadius());
        }
    }
}

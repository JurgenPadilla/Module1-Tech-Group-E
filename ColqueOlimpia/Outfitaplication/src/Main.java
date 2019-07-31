import GeneralClasses.Boots;
import GeneralClasses.Footwear;
import GeneralClasses.Tshirt;

import java.util.*;

public class Main {
    public static void main (String [] args) {
        List<Tshirt> tshirtList = new ArrayList<Tshirt>();

        tshirtList.add(new Tshirt("blue", "M", "Levys", "cotton", false, false, "Long sleeves", true));
        tshirtList.add(new Tshirt("pink", "XS", "Levys", "cotton", false, false, "Long sleeves", true));

        List<Boots> footwearList = new ArrayList<Boots>();
        footwearList.add(new Boots("black", "36A", "Azaleia", true, "Letter", "UNDERKNEE"));

        System.out.println("Hello Josy" + tshirtList.toString());
    }
}

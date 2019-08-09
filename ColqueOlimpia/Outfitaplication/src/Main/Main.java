package Main;

import Footwears.Boots;
import Clothes.Tshirt;

import java.util.*;

public class Main {
    public static void main (String [] args) {
        List<Tshirt> tshirtList = new ArrayList<Tshirt>();

        tshirtList.add(new Tshirt("Blue", "M", "Levys", "cotton", false, false, "Long sleeves", true));
        tshirtList.add(new Tshirt("Pink", "L", "Benetton", "cotton", false, false, "Short sleeves", false));
        tshirtList.add(new Tshirt("White", "L", "Manianeras", "cotton", true, false, "Long sleeves", false));

     //   List<Pants> pantsList = new ArrayList<Tshirt>();

      //  tshirtList.add(new Tshirt("Blue", "M", "Levys", "cotton", false, false, "Long sleeves", true));
    //    tshirtList.add(new Tshirt("Pink", "L", "Benetton", "cotton", false, false, "Short sleeves", false));
     //   tshirtList.add(new Tshirt("White", "L", "Manianeras", "cotton", true, false, "Long sleeves", false));


        List<Boots> footwearList = new ArrayList<Boots>();
        footwearList.add(new Boots("black", "36A", "Azaleia", true, "Letter", "UNDERKNEE"));
        footwearList.add(new Boots("Beige", "36", "Manaco", false, "Letter", "KNEE"));

        System.out.println("This is an outfit composed by " + " " + tshirtList.get(0).toString());
        System.out.println("                              " + " " + footwearList.get(1).toString());

    }
}

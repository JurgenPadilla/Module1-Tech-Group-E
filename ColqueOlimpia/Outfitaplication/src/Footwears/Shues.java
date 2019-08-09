package Footwears;

public class Shues extends Footwear {
    String typeShues;
    public Shues(String color, String size, String brand, String fabrique, String typeShues, boolean isFormal){
        super(color,size,brand,fabrique,typeShues, isFormal);
        this.typeShues =  typeShues;
    }

}

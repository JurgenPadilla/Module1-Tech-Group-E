package Footwears;

import Clothes.Clothe;


public class Footwear extends Clothe {
    public Footwear(String color, String size, String brand, boolean isFormal, String fabrique) {
        super(color, size, brand, fabrique, isFormal);
        this.color = color;
        this.size = size;
        this.fabrique = fabrique;
    }

    public Footwear(String color, String size, String brand, String fabrique, String typeShues, boolean isFormal) {
        super(color, size,brand,fabrique,isFormal);
    }
}

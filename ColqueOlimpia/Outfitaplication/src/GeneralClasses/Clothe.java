package GeneralClasses;

import Interfaces.IClothe;

public class Clothe extends Outfit {
    String color;
    String size;
    String brand;
    String fabrique;
    boolean isFormal;
    boolean isTaylor;
    public Clothe(String color, String size, String brand, String fabrique, boolean isFormal) {
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.fabrique = fabrique;
        this.isFormal = isFormal;
    }
}

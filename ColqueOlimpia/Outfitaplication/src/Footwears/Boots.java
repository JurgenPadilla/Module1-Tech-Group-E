package Footwears;

public class Boots extends Footwear {
    String typeBoots;
    public Boots(String color, String size, String brand, boolean isFormal, String fabrique, String typeBoots ) {
        super(color, size, brand, isFormal, fabrique);
        this.typeBoots = typeBoots;
    }
}

package Clothes;

import Clothes.Clothe;

public class Tshirt extends Clothe {
    String typeTshirt;
    boolean isPrinted;
    boolean isTaylor;
    public Tshirt(String color, String size, String brand, String fabrique, boolean isTaylor, boolean isFormal, String typeTshirt, boolean isPrinted) {
        super(color, size, brand, fabrique, isFormal);
        this.typeTshirt = typeTshirt;
        this.isPrinted = isPrinted;
        this.isTaylor = isTaylor;
    }

    public String getTypeShirt() {
        return typeTshirt;
    }

    public void setTypeShirt(String typeShirt) {
        this.typeTshirt = typeShirt;
    }

    public boolean isPrinted() {
        return isPrinted;
    }

    public void setPrinted(boolean printed) {
        isPrinted = printed;
    }

    public boolean isTaylor() {
        return isTaylor;
    }

    public void setTaylor(boolean taylor) {
        isTaylor = taylor;
    }

    public String toString (){
        return "Tshirt features " + this.typeTshirt + " " + this.color + " "+this.brand;
    }

}

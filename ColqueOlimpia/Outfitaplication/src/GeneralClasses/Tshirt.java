package GeneralClasses;

import Interfaces.IClothe;

public class Tshirt extends Clothe  {
    String typeShirt;
    boolean isPrinted;


    boolean isTaylor;
    public Tshirt(String color, String size, String brand, String fabrique, boolean isTaylor, boolean isFormal, String typeShirt, boolean isPrinted) {
        super(color, size, brand, fabrique, isFormal);
        this.typeShirt = typeShirt;
        this.isPrinted = isPrinted;
        this.isTaylor = isTaylor;
    }

    public String getTypeShirt() {
        return typeShirt;
    }

    public void setTypeShirt(String typeShirt) {
        this.typeShirt = typeShirt;
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



}

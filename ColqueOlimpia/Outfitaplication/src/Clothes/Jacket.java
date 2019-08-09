package Clothes;

public class Jacket extends Clothe {
    String typeJacket;

    boolean isTaylor;
    //setting constructor for jacket
    public Jacket(String color, String size, String brand, String fabrique, boolean isTaylor, boolean isFormal, String typeJacket) {
        super(color, size, brand, fabrique, isFormal);
        this.typeJacket = typeJacket;
        this.isTaylor = isTaylor;
    }

    public String getTypeShirt() {
        return typeJacket;
    }

    public void setTypeShirt(String typeShirt) {
        this.typeJacket = typeShirt;
    }

    public boolean isTaylor() {
        return isTaylor;
    }

    public void setTaylor(boolean taylor) {
        isTaylor = taylor;
    }


}

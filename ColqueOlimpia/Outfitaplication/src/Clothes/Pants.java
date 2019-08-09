package Clothes;

public class Pants extends Clothe {
    String typePants;
    public Pants(String color, String size, String brand, String fabrique, boolean isTaylor, boolean isFormal) {
        super(color, size, brand, fabrique, isFormal);
        this.typePants = typePants;
        this.isFormal = isFormal;
        this.isTaylor = isTaylor;
    }

    public String getTypePants() {
        return typePants;
    }

    public void setTypePants(String typePants) {
        this.typePants = typePants;
    }

    public boolean isFormal() {
        return isFormal;
    }

    public void setFormal(boolean formal) {
        isFormal = formal;
    }

    public boolean isTaylor() {
        return isTaylor;
    }

    public void setTaylor(boolean taylor) {
        isTaylor = taylor;
    }




}

package Main;

import Clothes.Clothe;
import Interfaces.IClothe;

import java.util.ArrayList;

public abstract class Outfit implements IClothe {

    private ArrayList<Clothe> setClothes;
    public Outfit(){
        setClothes = new ArrayList<>();
    }
    @Override
    public void addClothe(Clothe clothe) {
        setClothes.add(clothe);
    }

    @Override
    public void removeClothe(Clothe clothe) {
        setClothes.remove(clothe);
    }

    @Override
    public void viewClothe() {

    }

}

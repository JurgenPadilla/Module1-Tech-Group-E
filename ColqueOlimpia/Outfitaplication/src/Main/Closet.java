package Main;

import Clothes.Clothe;

import java.util.Collection;

public class Closet {
    public Collection<Clothe> clotheList;
    Outfit currentOutfit = new Outfit() {
        @Override
        public void viewClothe(Clothe clothe) {

        }
    };
}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Region kantho = new Region("Kantho");
        Region jotho = new Region("Jotho");
        Region hoenn = new Region("Hoenn");
        Region sinnoh = new Region("Sinnoh");

        Type electric = new Type ("Electric");
        Type water = new Type ("Water");
        Type fire = new Type ("Fire");
        Type grass = new Type ("Grass");
        Type ground = new Type ("Ground");
        Type normal = new Type ("Normal");


        electric.addWeaknesses(ground);
        electric.addEffectivenesses(water);
        fire.addWeaknesses(water);
        fire.addWeaknesses(ground);

        List<Type> pikachuTypes = new ArrayList<>();
        pikachuTypes.add(electric);

        Attack pikachuFastAttacks = new Attack(normal, "quick attack", 8);
        Attack pikachuChargeAttacks = new Attack(electric, "thunderbolt", 80);




        Pokemon pikachu = new Pokemon("Pikachu",kantho,pikachuTypes, pikachuFastAttacks, pikachuChargeAttacks, false, false, false,false,null);
        kantho.registerPokemon(pikachu);


        pokedex.registerRegion(kantho);
        pokedex.registerRegion(jotho);
        pokedex.registerRegion(hoenn);
        pokedex.registerRegion(sinnoh);

        pokedex.showAllInformation();
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Regions
        Pokedex pokedex = new Pokedex();
        Region kantho = new Region("Kantho");
        Region jotho = new Region("Jotho");
        Region hoenn = new Region("Hoenn");
        Region sinnoh = new Region("Sinnoh");

        //Pokemon types
        Type electric = new Type ("Electric");
        Type ground = new Type ("Ground");
        Type grass = new Type ("Grass");
        Type water = new Type ("Water");
        Type fire = new Type ("Fire");
        Type normal = new Type ("Normal");

        //Effective and Weak
        electric.addEffectivenesses(water);
        electric.addWeaknesses(ground);
        electric.addWeaknesses(electric);
        ground.addEffectivenesses(fire);
        ground.addEffectivenesses(electric);
        ground.addWeaknesses(grass);
        grass.addEffectivenesses(ground);
        grass.addEffectivenesses(water);
        grass.addWeaknesses(fire);
        grass.addWeaknesses(grass);
        water.addEffectivenesses(ground);
        water.addEffectivenesses(fire);
        water.addWeaknesses(water);
        water.addWeaknesses(grass);
        fire.addEffectivenesses(grass);
        fire.addWeaknesses(water);
        fire.addWeaknesses(fire);

        List<Type> pikachuTypes = new ArrayList<>();
        pikachuTypes.add(electric);
        Attack pikachuFastAttacks = new Attack(normal, "Quick Attack", 8);
        Attack pikachuChargeAttacks = new Attack(electric, "Thunderbolt", 80);
        Pokemon pikachu = new Pokemon("Pikachu",kantho,pikachuTypes, pikachuFastAttacks, pikachuChargeAttacks, false, false, false,false,null);
        kantho.registerPokemon(pikachu);

        List<Type> charmanderTypes = new ArrayList<>();
        charmanderTypes.add(fire);
        Attack charmanderFastAttack = new Attack(fire,"Ember", 12);
        Attack charmanderChargeAttack = new Attack(fire, "Flame Burst", 84);
        Pokemon charmander = new Pokemon("Charmeleon",kantho, charmanderTypes, charmanderFastAttack, charmanderChargeAttack,true, true,false,false,null);
        kantho.registerPokemon(charmander);

        List<Type> chikoritaTypes = new ArrayList<>();
        chikoritaTypes.add(grass);
        Attack chikoritaFastAttack = new Attack(grass,"Vine Whip", 8);
        Attack chikoritaChargeAttack = new Attack(normal, "Body Slam", 50);
        Pokemon chikorita = new Pokemon("Chikorita",jotho, chikoritaTypes, chikoritaFastAttack, chikoritaChargeAttack,false, false,false,false,null);
        jotho.registerPokemon(chikorita);

        List<Type> piplupTypes = new ArrayList<>();
        piplupTypes.add(water);
        Attack piplupFastAttack = new Attack(normal,"Pound", 7);
        Attack piplupChargeAttack = new Attack(normal, "Drill Peck", 60);
        Pokemon piplup = new Pokemon("Piplup",sinnoh, piplupTypes, piplupFastAttack, piplupChargeAttack,false, false,false,false,null);
        sinnoh.registerPokemon(piplup);

        pokedex.registerRegion(kantho);
        pokedex.registerRegion(jotho);
        pokedex.registerRegion(hoenn);
        pokedex.registerRegion(sinnoh);

        pokedex.showAllInformation();
    }
}

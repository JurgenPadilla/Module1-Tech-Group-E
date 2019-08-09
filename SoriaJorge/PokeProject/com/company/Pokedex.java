package com.company;

import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemonMap;
    private Map<String, Type> typeMap;


    public Pokedex() {
        pokemonMap = new HashMap<>();
        loadTypes();
    }

    public Integer getSize() {
        return pokemonMap.size();
    }

    public void addPokemon(Pokemon p) {
        pokemonMap.put(p.getName(), p);
    }

    public Pokemon getPokemon(String pokemonName) {
        return pokemonMap.get(pokemonName);
    }

    public Type getType(String typeName){
        return typeMap.get(typeName);
    }

    private void loadTypes(){
        Type pokemonTypeGrass = new Type("Grass");
        Type pokemonTypeFire = new Type("Fire");
        Type pokemonTypeWater = new Type("Water");
        Type pokemonTypeDark = new Type("Dark");
        Type pokemonTypePsychic = new Type("Psychic");
        Type pokemonTypeGround = new Type("Ground");
        Type pokemonTypeBug = new Type("Bug");
        Type pokemonTypeIce = new Type("Ice");
        Type pokemonTypeRock = new Type("Rock");
        Type pokemonTypeElectric = new Type("Electric");
        Type pokemonTypeFairy = new Type("Fairy");
        Type pokemonTypeFlying = new Type("Flying");
        Type pokemonTypePoison = new Type("Poison");
        Type pokemonTypeGhost = new Type("Ghost");
        Type pokemonTypeDragon = new Type("Dragon");
        Type pokemonTypeSteel = new Type("Steel");
        Type pokemonTypeFighting = new Type("Fighting");
        Type pokemonTypeNormal = new Type("Normal");
        //Add the rest of pokemon Types
        typeMap  = new HashMap<>();
        typeMap.put(pokemonTypeFire.getName(),pokemonTypeFire);
        typeMap.put(pokemonTypeGrass.getName(),pokemonTypeGrass);
        typeMap.put(pokemonTypeWater.getName(),pokemonTypeWater);
        typeMap.put(pokemonTypeDark.getName(),pokemonTypeDark);
        typeMap.put(pokemonTypePsychic.getName(),pokemonTypePsychic);
        typeMap.put(pokemonTypeGround.getName(),pokemonTypeGround);
        typeMap.put(pokemonTypeBug.getName(),pokemonTypeBug);
        typeMap.put(pokemonTypeIce.getName(),pokemonTypeIce);
        typeMap.put(pokemonTypeFairy.getName(),pokemonTypeFairy);
        typeMap.put(pokemonTypeFlying.getName(),pokemonTypeFlying);
        typeMap.put(pokemonTypePoison.getName(),pokemonTypePoison);
        typeMap.put(pokemonTypeGhost.getName(),pokemonTypeGhost);
        typeMap.put(pokemonTypeRock.getName(),pokemonTypeRock);
        typeMap.put(pokemonTypeDragon.getName(),pokemonTypeDragon);
        typeMap.put(pokemonTypeSteel.getName(),pokemonTypeSteel);
        typeMap.put(pokemonTypeFighting.getName(),pokemonTypeFighting);
        typeMap.put(pokemonTypeNormal.getName(),pokemonTypeNormal);

        //Normal Pokemon
        pokemonTypeNormal.addWeakness(pokemonTypeRock);
        pokemonTypeNormal.addWeakness(pokemonTypeGhost);
        pokemonTypeNormal.addWeakness(pokemonTypeSteel);

        //Fighting Pokemon Strengths
        pokemonTypeFighting.addStrength(pokemonTypeNormal);
        pokemonTypeFighting.addStrength(pokemonTypeRock);
        pokemonTypeFighting.addStrength(pokemonTypeSteel);
        pokemonTypeFighting.addStrength(pokemonTypeIce);
        pokemonTypeFighting.addStrength(pokemonTypeDark);
        //Fighting Pokemon Weakness
        pokemonTypeFighting.addWeakness(pokemonTypeFlying);
        pokemonTypeFighting.addWeakness(pokemonTypePoison);
        pokemonTypeFighting.addWeakness(pokemonTypePsychic);
        pokemonTypeFighting.addWeakness(pokemonTypeBug);
        pokemonTypeFighting.addWeakness(pokemonTypeGhost);
        pokemonTypeFighting.addWeakness(pokemonTypeFairy);

        //Flying Pokemon Strengths
        pokemonTypeFlying.addStrength(pokemonTypeFighting);
        pokemonTypeFlying.addStrength(pokemonTypeBug);
        pokemonTypeFlying.addStrength(pokemonTypeGrass);
        //Flying Pokemon Weakness
        pokemonTypeFlying.addWeakness(pokemonTypeRock);
        pokemonTypeFlying.addWeakness(pokemonTypeSteel);
        pokemonTypeFlying.addWeakness(pokemonTypeElectric);

        //Poison Pokemon Strengths
        pokemonTypePoison.addStrength(pokemonTypeGrass);
        pokemonTypePoison.addStrength(pokemonTypeFairy);
        //Poison Pokemon Weakness
        pokemonTypePoison.addWeakness(pokemonTypePoison);
        pokemonTypePoison.addWeakness(pokemonTypeGround);
        pokemonTypePoison.addWeakness(pokemonTypeRock);
        pokemonTypePoison.addWeakness(pokemonTypeGhost);
        pokemonTypePoison.addWeakness(pokemonTypeSteel);

        //Ground Pokemon Strengths
        pokemonTypeGround.addStrength(pokemonTypePoison);
        pokemonTypeGround.addStrength(pokemonTypeRock);
        pokemonTypeGround.addStrength(pokemonTypeSteel);
        pokemonTypeGround.addStrength(pokemonTypeFire);
        pokemonTypeGround.addStrength(pokemonTypeElectric);
        //Ground Pokemon Weakness
        pokemonTypeGround.addWeakness(pokemonTypeFlying);
        pokemonTypeGround.addWeakness(pokemonTypeBug);
        pokemonTypeGround.addWeakness(pokemonTypeGrass);

        //Rock Pokemon Strengths
        pokemonTypeRock.addStrength(pokemonTypeFlying);
        pokemonTypeRock.addStrength(pokemonTypeBug);
        pokemonTypeRock.addStrength(pokemonTypeFire);
        pokemonTypeRock.addStrength(pokemonTypeIce);
        //Rock Pokemon Weakness
        pokemonTypeRock.addWeakness(pokemonTypeFighting);
        pokemonTypeRock.addWeakness(pokemonTypeGround);
        pokemonTypeRock.addWeakness(pokemonTypeSteel);

        //Bug Pokemon Strengths
        pokemonTypeBug.addStrength(pokemonTypeGrass);
        pokemonTypeBug.addStrength(pokemonTypePsychic);
        pokemonTypeBug.addStrength(pokemonTypeDark);
        //Bug Pokemon Weakness
        pokemonTypeBug.addWeakness(pokemonTypeFighting);
        pokemonTypeBug.addWeakness(pokemonTypeFlying);
        pokemonTypeBug.addWeakness(pokemonTypePoison);
        pokemonTypeBug.addWeakness(pokemonTypeGhost);
        pokemonTypeBug.addWeakness(pokemonTypeSteel);
        pokemonTypeBug.addWeakness(pokemonTypeFire );
        pokemonTypeBug.addWeakness(pokemonTypeFairy);

        //Ghost Pokemon Strengths
        pokemonTypeGhost.addStrength(pokemonTypeGhost);
        pokemonTypeGhost.addStrength(pokemonTypePsychic);
        //Ghost Pokemon Weakness
        pokemonTypeGhost.addWeakness(pokemonTypeNormal);
        pokemonTypeGhost.addWeakness(pokemonTypeDark);

        //Steel Pokemon Strengths
        pokemonTypeSteel.addStrength(pokemonTypeRock);
        pokemonTypeSteel.addStrength(pokemonTypeIce);
        pokemonTypeSteel.addStrength(pokemonTypeFairy);
        //Steel Pokemon Weakness
        pokemonTypeSteel.addWeakness(pokemonTypeSteel);
        pokemonTypeSteel.addWeakness(pokemonTypeFire);
        pokemonTypeSteel.addWeakness(pokemonTypeWater);
        pokemonTypeSteel.addWeakness(pokemonTypeElectric);

        //Fire Pokemon Strengths
        pokemonTypeFire.addStrength(pokemonTypeBug);
        pokemonTypeFire.addStrength(pokemonTypeSteel);
        pokemonTypeFire.addStrength(pokemonTypeGrass);
        pokemonTypeFire.addStrength(pokemonTypeIce);
        //Fire Pokemon Weakness
        pokemonTypeFire.addWeakness(pokemonTypeRock);
        pokemonTypeFire.addWeakness(pokemonTypeWater);
        pokemonTypeFire.addWeakness(pokemonTypeFire);
        pokemonTypeFire.addWeakness(pokemonTypeDragon);

        //Water Pokemon Strengths
        pokemonTypeWater.addStrength(pokemonTypeGround);
        pokemonTypeWater.addStrength(pokemonTypeRock);
        pokemonTypeWater.addStrength(pokemonTypeFire);
        //Water Pokemon Weakness
        pokemonTypeWater.addWeakness(pokemonTypeWater);
        pokemonTypeWater.addWeakness(pokemonTypeGrass);
        pokemonTypeWater.addWeakness(pokemonTypeDragon);

        //Grass Pokemon Strengths
        pokemonTypeGrass.addStrength(pokemonTypeGround);
        pokemonTypeGrass.addStrength(pokemonTypeRock);
        pokemonTypeGrass.addStrength(pokemonTypeWater);
        //Grass Pokemon Weakness
        pokemonTypeGrass.addWeakness(pokemonTypeFlying);
        pokemonTypeGrass.addWeakness(pokemonTypePoison);
        pokemonTypeGrass.addWeakness(pokemonTypeBug);
        pokemonTypeGrass.addWeakness(pokemonTypeSteel);
        pokemonTypeGrass.addWeakness(pokemonTypeFire);
        pokemonTypeGrass.addWeakness(pokemonTypeGrass);
        pokemonTypeGrass.addWeakness(pokemonTypeDragon);

        //Electric Pokemon Strengths
        pokemonTypeElectric.addStrength(pokemonTypeFlying);
        pokemonTypeElectric.addStrength(pokemonTypeWater);
        //Electric Pokemon Weakness
        pokemonTypeElectric.addWeakness(pokemonTypeGround);
        pokemonTypeElectric.addWeakness(pokemonTypeGrass);
        pokemonTypeElectric.addWeakness(pokemonTypeElectric);
        pokemonTypeElectric.addWeakness(pokemonTypeDragon);

        //Psychic Pokemon Strengths
        pokemonTypePsychic.addStrength(pokemonTypeFighting);
        pokemonTypePsychic.addStrength(pokemonTypePoison);
        //Psychic Pokemon Weakness
        pokemonTypePsychic.addWeakness(pokemonTypeSteel);
        pokemonTypePsychic.addWeakness(pokemonTypePsychic);
        pokemonTypePsychic.addWeakness(pokemonTypeDark);

        //Ice Pokemon Strengths
        pokemonTypeIce.addStrength(pokemonTypeFlying);
        pokemonTypeIce.addStrength(pokemonTypeGround);
        pokemonTypeIce.addStrength(pokemonTypeGrass);
        pokemonTypeIce.addStrength(pokemonTypeDragon);
        //Ice Pokemon Weakness
        pokemonTypeIce.addWeakness(pokemonTypeSteel);
        pokemonTypeIce.addWeakness(pokemonTypeFire);
        pokemonTypeIce.addWeakness(pokemonTypeWater);
        pokemonTypeIce.addWeakness(pokemonTypeIce);

        //Dragon Pokemon Strengths
        pokemonTypeDragon.addStrength(pokemonTypeDragon);
        //Dragon Pokemon Weakness
        pokemonTypeDragon.addWeakness(pokemonTypeSteel);
        pokemonTypeDragon.addWeakness(pokemonTypeFairy);

        //Fairy Pokemon Strengths
        pokemonTypeFairy.addStrength(pokemonTypeFighting);
        pokemonTypeFairy.addStrength(pokemonTypeDragon);
        pokemonTypeFairy.addStrength(pokemonTypeDark);
        //Fairy Pokemon Weakness
        pokemonTypeFairy.addWeakness(pokemonTypePoison);
        pokemonTypeFairy.addWeakness(pokemonTypeSteel);
        pokemonTypeFairy.addWeakness(pokemonTypeFire);

        //Dark Pokemon Strengths
        pokemonTypeDark.addStrength(pokemonTypeGhost);
        pokemonTypeDark.addStrength(pokemonTypePsychic);
        //Dark Pokemon Weakness
        pokemonTypeDark.addWeakness(pokemonTypeFighting);
        pokemonTypeDark.addWeakness(pokemonTypeDark);
        pokemonTypeDark.addWeakness(pokemonTypeFairy);

    }
}

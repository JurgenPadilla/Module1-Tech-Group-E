package com.company;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void print(String something) {
        System.out.println(something);
    }


    public static List<Region> loadRegion(){
        Region pokemonRegionKanto = new Region("Kanto");
        Region pokemonRegionJohto = new Region("Johto");
        Region pokemonRegionHoenn = new Region("Hoenn");
        Region pokemonRegionSinnoh = new Region("Sinnoh");
        Region pokemonRegionUnova = new Region("Unova");
        Region pokemonRegionKalos = new Region("Kalos");
        Region pokemonRegionAlola = new Region("Alola");
        Region pokemonRegionGalar = new Region("Galar");

        List<Region> loadRegion = new ArrayList<>();
        loadRegion.add(pokemonRegionHoenn);
        loadRegion.add(pokemonRegionJohto);
        loadRegion.add(pokemonRegionKanto);
        loadRegion.add(pokemonRegionSinnoh);
        loadRegion.add(pokemonRegionUnova);
        loadRegion.add(pokemonRegionKalos);
        loadRegion.add(pokemonRegionAlola);
        loadRegion.add(pokemonRegionGalar);
        return loadRegion;
    }

    public static List<Generation> loadGeneration(){
        Generation pokemonGenI = new Generation("I");
        Generation pokemonGenII = new Generation("II");
        Generation pokemonGenIII = new Generation("III");
        Generation pokemonGenIV = new Generation("IV");
        Generation pokemonGenV = new Generation("V");
        Generation pokemonGenVI = new Generation("VI");
        Generation pokemonGenVII = new Generation("VII");
        Generation pokemonGenVIII = new Generation("VIII");

        List<Generation> loadGeneration = new ArrayList<>();
        loadGeneration.add(pokemonGenI);
        loadGeneration.add(pokemonGenII);
        loadGeneration.add(pokemonGenIII);
        loadGeneration.add(pokemonGenIV);
        loadGeneration.add(pokemonGenV);
        loadGeneration.add(pokemonGenVI);
        loadGeneration.add(pokemonGenVII);
        loadGeneration.add(pokemonGenVIII);
        return  loadGeneration;
    }

    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex();
        print("*****************************");
        print("***WELCOME TO YOUR POKEDEX***");
        print("*****************************");
        Boolean work = true;
        while (work) {
            print("What would you like to do?");
            print("1. Register a new Pokemon");
            print("2. Get Pokemon Information");
            print("3. Review Pokemon Strengths/Weakness");
            print("9. Exit");
            String selection = scanner.nextLine();
            switch (selection) {
                case "1":
                    registerPokemon(pokedex);
                    print("The size of your dex is: " + pokedex.getSize());
                    break;
                case "2":
                    getPokemon(pokedex);
                    break;
                case "3":
                    getTypes(pokedex);
                default:
                    work = false;
            }
        }
    }
    private static void getPokemon(Pokedex pokedex) {
        print("Please enter a pokemon name");
        String introducedName = scanner.nextLine();
        Pokemon resultP = pokedex.getPokemon(introducedName);
        if (resultP == null) {
            print("The introduced Pokemon wasn't registered yet or is not valid.");
            return;
        }
        print(resultP.display());
    }

    private static void registerPokemon(Pokedex pokedex) {
        print("Please enter the type of your pokemon");
        String typeName = scanner.nextLine();
        Type type = pokedex.getType(typeName);
        if (type == null) {
            print("The introduced type is not valid.");
            return;
        }
        print("Please enter the name of your pokemon");
        String pokemonName = scanner.nextLine();
        Pokemon currentPokemon = new Pokemon(pokemonName, type);
        pokedex.addPokemon(currentPokemon);
    }
    private static void getTypes(Pokedex pokedex){
        print("Please enter the Pokemon Type you want to review");
        String typeGiven = scanner.nextLine();
        Type type = pokedex.getType(typeGiven);
        if (type == null) {
            print("The introduced type is not valid.");
            return;
        }
        print(type.display());
    }

}
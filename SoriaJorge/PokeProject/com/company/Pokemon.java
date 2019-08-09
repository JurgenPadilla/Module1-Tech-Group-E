package com.company;

public class Pokemon {
    private String name;
    private Type type;
    private Integer number;
    private Region region;
    private Generation generation;

    public Pokemon(String pokemonName, Type type) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String display() {
        String result = "Pokemon ";
        result+=getName() + "\n";
        result+="and has a type : " + getType().getName();
        return result;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}

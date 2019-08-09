package com.company;

import java.util.ArrayList;
import java.util.List;

public class Type {
    private String name;
    private List<Type> weaknessList;
    private List<Type> strengthList;

    public Type(String name) {
        weaknessList = new ArrayList<>();
        strengthList = new ArrayList<>();
        this.name = name;
    }

    public void addStrength(Type newStrength){
        strengthList.add(newStrength);
    }

    public void addWeakness(Type newWeakness){
        weaknessList.add(newWeakness);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Type> getWeaknessList() {
        return weaknessList;
    }

    public void setWeaknessList(List<Type> weaknessList) {
        this.weaknessList = weaknessList;
    }

    public List<Type> getStrengthList() {
        return strengthList;
    }

    public void setStrengthList(List<Type> strengthList) {
        this.strengthList = strengthList;
    }

    public String toString(){
        return name;
    }

    public String displayStrength(){
        String result = "[";
        for (Type type:this.strengthList){
            result+=type.getName()+", ";
        }
        result+="]";
        return result;
    }

    public String displayWeakness(){
        String result = "[";
        for (Type type:this.weaknessList){
            result+=type.getName()+", ";
        }
        result+="]";
        return result;
    }

    public String display(){
        String result = new String();
        result+="The type: "+this.getName()+" is strong against:\n"
        + displayStrength()+"\nand is weak against:\n"
        + displayWeakness();
        return result;
    }

}

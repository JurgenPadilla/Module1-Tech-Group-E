import java.util.ArrayList;
import java.util.List;

public class Type {
    private String name;
    private List<Type> effectiveness;
    private List<Type> weakness;

    public Type (String name){
        this.name = name;
        this.effectiveness = new ArrayList<>();
        this.weakness = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(List<Type> effectiveness) {
        this.effectiveness = effectiveness;
    }

    public List<Type> getWeakness() {
        return weakness;
    }

    public void setWeakness(List<Type> weakness) {
        this.weakness = weakness;
    }

    public void addEffectivenesses (Type type){
        this.effectiveness.add(type);
    }
    public void addWeaknesses (Type type){
        this.weakness.add(type);
    }

    /////////
    /*public String getName(){
        return name;
    }*/
    public String getTypeDetailInfo(){
        String detailInfo= "Pokemon Type: " + name + "\n";
        detailInfo = detailInfo + "Effectiveness against: " + joinTypesAsString(effectiveness) + "\n";
        detailInfo = detailInfo + "Weakness against: " + joinTypesAsString(weakness)+ "\n";
        return detailInfo;
    }

    private String joinTypesAsString(List<Type> types) {
        List<String> asString = new ArrayList<>(types.size());
        for (Type type : types) {
            asString.add(type.getName());
        }
        return String.join(",", asString);
    }

}


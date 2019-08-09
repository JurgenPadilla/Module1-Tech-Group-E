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

}


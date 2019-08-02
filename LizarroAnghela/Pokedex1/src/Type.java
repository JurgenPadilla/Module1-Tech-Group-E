import java.util.List;

public class Type {
    private String name;
    private List<Type> effectiveness;
    private List<Type> weakness;

    public Type (String name, List<Type> effectiveness, List<Type> weakness){
        this.name = name;
        this.effectiveness = effectiveness;
        this.weakness = weakness;
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

}


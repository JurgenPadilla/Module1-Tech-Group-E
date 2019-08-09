public class Attack {
    private Type type;
    private String name;
    private Integer damage;

    public Attack(Type type, String name, Integer damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    //metodo calculate the damage
}

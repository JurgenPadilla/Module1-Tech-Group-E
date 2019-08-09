import java.util.ArrayList;
import java.util.List;

public class Pokemon implements Registrable{
    private String name;
    private Region region;
    private List <Type> types;
    private Attack fastAttack;
    private Attack chargeAttack;
    private Boolean isShiny;
    private Boolean isLucky;
    private Boolean isLegendary;
    private Boolean hasAlola;
    private Pokemon preEvolution;

    public Pokemon (){

    }

    public Pokemon (String name, Region region, List<Type> types, Attack fastAttack, Attack chargeAttack, Boolean isShiny,
                    Boolean isLucky, Boolean isLegendary, Boolean isAlola, Pokemon preEvolution){
        this.name = name;
        this.region = region;
        this.types = new ArrayList<>();
        this.fastAttack = fastAttack;
        this.chargeAttack = chargeAttack;
        this.isShiny = isShiny;
        this.isLucky = isLucky;
        this.isLegendary = isLegendary;
        this.hasAlola = isAlola;
        this.preEvolution = preEvolution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Attack getFastAttack() {
        return fastAttack;
    }

    public void setFastAttack(Attack fastAttack) {
        this.fastAttack = fastAttack;
    }

    public Attack getChargeAttack() {
        return chargeAttack;
    }

    public void setChargeAttack(Attack chargeAttack) {
        this.chargeAttack = chargeAttack;
    }

    public Boolean getIsShiny() {
        return isShiny;
    }

    public void setIsShiny(Boolean isShiny) {
        this.isShiny = isShiny;
    }

    public Boolean getIsLucky() {
        return isLucky;
    }

    public void setIsLucky(Boolean isLucky) {
        this.isLucky = isLucky;
    }

    public Boolean getIsLegendary() {
        return isLegendary;
    }

    public void setIsLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    public Boolean getIsAlola() {
        return hasAlola;
    }

    public void setIsAlola(Boolean isAlola) {
        this.hasAlola = isAlola;
    }

    public Pokemon getPreEvolution() {
        return preEvolution;
    }

    public void setPreEvolution(Pokemon preEvolution) {
        this.preEvolution = preEvolution;
    }

    @Override
    public String getInformation() {
        String information = "Pokemon Name: " + this.name + "\n"+
        "Pokemon Type: " + this.getTypesAsString();

        return information;
    }

    private String getTypesAsString (){
        String result = "";
        for(Type type: types){
            result = result + ", " + type.getName();
        }
        return result;
    }
}

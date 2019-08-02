import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Registrable> registeredItems;
    private Integer totalPokemon;

    public Pokedex() {
        this.registeredItems = new ArrayList<>();
        this.totalPokemon = 0;
    }

    public void registerRegion (Registrable regions){
        this.registeredItems.add(regions);
    }

    public void registerPokemon (Registrable pokemons){
        this.registeredItems.add(pokemons);
    }

    public void showAllInformation (){
        for (Registrable item : registeredItems){
            System.out.println(item.getInformation());
        }
    }

}

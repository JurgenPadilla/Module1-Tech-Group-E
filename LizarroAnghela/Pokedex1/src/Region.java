import java.util.ArrayList;
import java.util.List;

public class Region implements Registrable {
    private String name;
    private List<Pokemon> registeredPokemon;
    private Integer totalPokemon;

    public Region (String name){
        this.name = name;
        this.registeredPokemon = new ArrayList<>();
        totalPokemon = 0;
    }

    //metodo register pokemon
    public void registerPokemon (Pokemon pokemons){
        this.registeredPokemon.add(pokemons);
        this.totalPokemon++;
    }

    @Override
    public String getInformation() {
        String information = "Region Name: " + name + "\n"
                + "Total Pokemon: " + totalPokemon + "\n";
        String allPokemonInformation = "";
        for(Pokemon pokemon: registeredPokemon){
            allPokemonInformation = allPokemonInformation + "\n"
            + pokemon.getInformation();
        }
        return information;
    }
}

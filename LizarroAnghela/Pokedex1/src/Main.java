public class Main {

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Region region = new Region("Kantho");

        Pokemon pokemon1 = new Pokemon();
        pokemon1.setName("Pikachu");

        region.registerPokemon(pokemon1);
    }
}

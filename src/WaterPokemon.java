import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int healthpoints, String food, String sound) {
        super(name, level, healthpoints, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public String getType() {
        return "water";
    }

    public void surf(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 15;
        int maxDamage = 35;

        System.out.println(attackingPokemon.getName() + " uses Surf!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void hydroPump(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 20;
        int maxDamage = 30;

        System.out.println(attackingPokemon.getName() + " uses Hydro Pump!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void hydroCanon(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 20;
        int maxDamage = 40;

        System.out.println(attackingPokemon.getName() + " uses Hydro Canon!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void rainDance(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 10;
        int maxDamage = 20;

        System.out.println(attackingPokemon.getName() + " uses Rain Dance!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }
}

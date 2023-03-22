import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leachseed", "leaveblade");

    public GrassPokemon(String name, int level, int healthpoints, String food, String sound) {
        super(name, level, healthpoints, food, sound);
    }

    public String getType() {
        return "grass";
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 20;
        int maxDamage = 35;

        System.out.println(attackingPokemon.getName() + " uses Leaf Storm!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void solarBeam(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 30;
        int maxDamage = 45;

        System.out.println(attackingPokemon.getName() + " uses Solar Beam!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void leechSeed(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 5;
        int maxDamage = 25;

        System.out.println(attackingPokemon.getName() + " uses Leech Seed!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void leaveBlade(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 15;
        int maxDamage = 25;

        System.out.println(attackingPokemon.getName() + " uses Leave Blade!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }
}

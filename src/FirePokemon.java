import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    List<String> attacks = Arrays.asList("inferno", "pyroball", "firelash", "flamethrower");

    public FirePokemon(String name, int level, int healthpoints, String food, String sound) {
        super(name, level, healthpoints, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public String getType() {
        return "fire";
    }

    public void inferno(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 10;
        int maxDamage = 20;

        System.out.println(attackingPokemon.getName() + " uses Inferno!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void pyroBall(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 15;
        int maxDamage = 25;

        System.out.println(attackingPokemon.getName() + " uses Pyro Ball!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void fireLash(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 5;
        int maxDamage = 25;

        System.out.println(attackingPokemon.getName() + " uses Fire Lash!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void flameThrower(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 15;
        int maxDamage = 40;

        System.out.println(attackingPokemon.getName() + " uses Flamethrower!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }
}

import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");

    public ElectricPokemon(String name, int level, int healthpoints, String food, String sound) {
        super(name, level, healthpoints, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public String getType() {
        return "electric";
    }

    public void thunderPunch(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 15;
        int maxDamage = 25;

        System.out.println(attackingPokemon.getName() + " uses Thunder Punch!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void electroBall(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 5;
        int maxDamage = 20;

        System.out.println(attackingPokemon.getName() + " uses Electro Ball!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void thunder(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 15;
        int maxDamage = 30;

        System.out.println(attackingPokemon.getName() + " uses Thunder!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }

    public void voltTackle(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        int minDamage = 5;
        int maxDamage = 20;

        System.out.println(attackingPokemon.getName() + " uses Volt Tackle!");

        PokemonDamageHandler damageHandler = new PokemonDamageHandler();
        int attackingPokemonLevel = attackingPokemon.getLevel();
        damageHandler.handleDamage(attackingPokemon, defendingPokemon, minDamage, maxDamage, attackingPokemonLevel);
    }
}

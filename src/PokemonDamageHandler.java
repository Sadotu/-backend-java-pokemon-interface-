public class PokemonDamageHandler {
    public void handleDamage(Pokemon attackingPokemon, Pokemon defendingPokemon, int minDamage, int maxDamage, int attackingPokemonLevel) {
        double criticalHitModifier = 1.5;
        double typeModifier = getTypeModifier(attackingPokemon.getType(), defendingPokemon.getType());

        int damage = calculateDamage(minDamage, maxDamage, criticalHitModifier, typeModifier, attackingPokemonLevel);

        if (damage < minDamage + 2) { System.out.println("Wow! The attack was not very effective." ); }
        else if (damage >  maxDamage + 2) { System.out.println("Wow! The attack was super effective!"); }
        defendingPokemon.setHp(defendingPokemon.getHp() - damage);
        System.out.println("Current HP of " + defendingPokemon.getName() + " is: " + defendingPokemon.getHp());
    }


    private int calculateDamage(int minDamage, int maxDamage, double criticalHitModifier, double typeModifier, int attackingPokemonLevel) {
        int damage = (int) (minDamage + (Math.random() * (maxDamage - minDamage + 1)));
        boolean isCriticalHit = Math.random() < 0.1;
        if (isCriticalHit) {
            damage *= criticalHitModifier;
        }
        damage *= typeModifier;
        damage *= (1.0 + (attackingPokemonLevel * 0.01));

        return damage;
    }

    private double getTypeModifier(String attackingType, String defendingType) {
        double modifier = 1.0;
        if (attackingType.equals("fire")) {
            if (defendingType.equals("water")) {modifier = 0.5;}
            else if (defendingType.equals("grass")) {modifier = 1.5;}
            else if (defendingType.equals("fire") || defendingType.equals("electric")) {modifier = 1;}
        }
        return modifier;
    }
}

public interface Visitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}

class BoostVisitor implements Visitor {
    @Override
    public void applyBoost(Character character) {
        int boostAmount = 15;
        System.out.println("Arcane Boost: Your power surges, increasing attack strength by "
                + boostAmount + " for the next three turns.");
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("No damage applied during boost.");
    }
}

class DamageVisitor implements Visitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Failed Boost: Attempt to enhance power fizzles.");
    }

    @Override
    public void applyDamage(Character character) {
        int damage = 35;
        System.out.println("Damage Over Time: You suffer " + damage + " ongoing damage as a result of a critical injury.");
    }
}

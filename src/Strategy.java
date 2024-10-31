public interface Strategy {
    void fight();
}

class MeleeStrategy implements Strategy {
    @Override
    public void fight() {
        int meleeDamage = 35;
        System.out.println("Close-Range Slash: You engage in melee combat, dealing " + meleeDamage
                + " slashing damage with a chance to inflict Bleed.");
    }
}

class RangedStrategy implements Strategy {
    @Override
    public void fight() {
        int rangedDamage = 40;
        System.out.println("Precision Shot: You strike from a distance, dealing " + rangedDamage
                + " piercing damage. Critical hit chance increased by 10%.");
    }
}

class MagicStrategy implements Strategy {
    @Override
    public void fight() {
        int magicDamage = 60;
        System.out.println("Arcane Blast: You release a burst of magic energy, dealing " + magicDamage
                + " arcane damage. Target must make a Will save or be stunned.");
    }
}

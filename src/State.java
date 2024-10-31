public interface State {
    void attack(Character character);
}

class NormalState implements State {
    @Override
    public void attack(Character character) {
        int baseDamage = 50;
        System.out.println("Strike: You land a normal hit, dealing " + baseDamage + " physical damage.");
    }
}

class PoweredUpState implements State {
    @Override
    public void attack(Character character) {
        int boostedDamage = 100;
        int bonus = 20;
        System.out.println("Empowered Strike: Your attack is enhanced, dealing " + boostedDamage
                + " physical damage with a bonus " + bonus + " from power surge.");
    }
}

class DefeatedState implements State {
    @Override
    public void attack(Character character) {
        System.out.println("Incapacitated: You are unable to attack.");
    }
}

abstract class GameAction {
    public final void executeAction() {
        System.out.println("Preparing action...");
        action();
        System.out.println("Action resolved.");
    }

    protected abstract void action();
}

class AttackAction extends GameAction {
    @Override
    protected void action() {
        int attackDamage = 75;
        System.out.println("Power Attack: You swing with full force, dealing " + attackDamage
                + " damage. Strength bonus applied.");
    }
}

class DefendAction extends GameAction {
    @Override
    protected void action() {
        int damageBlocked = 40;
        System.out.println("Shield Block: You brace yourself, blocking up to " + damageBlocked
                + " damage this turn. You gain +2 to Armor Class.");
    }
}

class HealAction extends GameAction {
    @Override
    protected void action() {
        int healingAmount = 30;
        System.out.println("Healing Spell: You channel a healing aura, restoring " + healingAmount
                + " HP. Effects increase with Wisdom modifier.");
    }
}

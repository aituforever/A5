public class Character {
    private State currentState;
    private Strategy currentStrategy;

    public void setState(State state) {
        this.currentState = state;
        System.out.println("State changed to " + state.getClass().getSimpleName());
    }

    public void setStrategy(Strategy strategy) {
        this.currentStrategy = strategy;
        System.out.println("Strategy set to " + strategy.getClass().getSimpleName());
    }

    public void performAttack() {
        if (currentState != null) {
            currentState.attack(this);
        } else {
            System.out.println("No state set for the character. Unable to attack.");
        }
    }

    public void performFight() {
        if (currentStrategy != null) {
            currentStrategy.fight();
        } else {
            System.out.println("No strategy set for the character. Unable to fight.");
        }
    }
}

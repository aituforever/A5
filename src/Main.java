public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        character.setState(new NormalState());
        character.setStrategy(new MeleeStrategy());

        System.out.println(" ");
        System.out.println("== Turn 1 ==");
        System.out.println(" ");
        character.performAttack();
        character.setStrategy(new MagicStrategy());
        character.performFight();

        character.setState(new PoweredUpState());
        System.out.println(" ");
        System.out.println("== Turn 2 ==");
        System.out.println(" ");
        character.performAttack();

        GameAction action1 = new AttackAction();
        action1.executeAction();

        GameAction action2 = new DefendAction();
        action2.executeAction();

        Visitor boostVisitor = new BoostVisitor();
        boostVisitor.applyBoost(character);

        Visitor damageVisitor = new DamageVisitor();
        damageVisitor.applyDamage(character);

        character.setState(new DefeatedState());
        System.out.println(" ");
        System.out.println("== Turn 3 ==");
        System.out.println(" ");
        character.performAttack();
    }
}

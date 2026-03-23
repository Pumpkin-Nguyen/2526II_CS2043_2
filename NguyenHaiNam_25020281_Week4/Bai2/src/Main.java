public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        CanSwim swimHero = (CanSwim) hero;
        swimHero.swim();

        CanFight fightHero = (CanFight) hero;
        fightHero.fight();
    }
}

public class Hero extends ActionCharacter implements CanFly, CanSwim, CanFight {
    public void swim() {
        System.out.println("Hero is swimming");
    }

    public void fly() {
        System.out.println("Hero is flying");
    }
}

package homeworks.lesson3.point2;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Маг " + getName() + ", обращаясь к стихиям, поражает своего врага.");
    }
}

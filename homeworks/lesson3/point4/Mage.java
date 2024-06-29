package homeworks.lesson3.point4;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + getName() + ", обращаясь к стихиям, поражает своего врага, у которого " + enemy.getHealth() + " здоровья. [Урон: 7]");
        enemy.takeDamage(7);
    }
}

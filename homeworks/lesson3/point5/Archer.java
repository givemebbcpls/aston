package homeworks.lesson3.point5;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + getName() + " пронзает ядовитой стрелой своего врага, у которого " + enemy.getHealth() + " здоровья. [Урон: 12]");
        enemy.takeDamage(12);
    }
}

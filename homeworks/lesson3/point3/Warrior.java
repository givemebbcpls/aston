package homeworks.lesson3.point3;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }
    
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = (int) Math.round((Math.random() * 0.4 + 0.8) * 10);
        System.out.println("Воин " + getName() + " с помощью невероятной силы сокрушает своего врага, у которого " + enemy.getHealth() + " здоровья. [Урон: " + damage + "]");
        enemy.takeDamage(damage);
    }
}

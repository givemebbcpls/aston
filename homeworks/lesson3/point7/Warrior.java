package homeworks.lesson3.point7;

public class Warrior extends Hero {
    public Warrior(String name, int health, int baseDamage) {
        super(name, "Warrior", health, baseDamage);
    }
    
    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = (int) Math.round((Math.random() + 0.5) * this.getBaseDamage());
        System.out.println(this.getName() + " с помощью невероятной силы сокрушает своего врага, у которого " + enemy.getHealth() + " здоровья, и наносит " + damage + " урона.");
        enemy.takeDamage(damage);
    }
}

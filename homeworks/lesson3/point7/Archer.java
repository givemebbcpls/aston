package homeworks.lesson3.point7;

public class Archer extends Hero {
    public Archer(String name, int health, int baseDamage) {
        super(name, "Archer", health, baseDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        double attackChoice = Math.random();
        int damage = 0;
        if (attackChoice > 0.3) {
            damage = this.getBaseDamage();
            System.out.println("Лучник " + getName() + " отправляет меткую стрелу в своего врага, у которого " + enemy.getHealth() + " здоровья. И наноси " + damage + " урона.");
            enemy.takeDamage(damage);
        } else {
            damage = (int) (0.8 * this.getBaseDamage());
            System.out.println("Лучник " + getName() + " пронзает ядовитой стрелой своего врага, у которого " + enemy.getHealth() + " здоровья, нанося " + damage + " урона и отравляя его.");
            enemy.takeDamage(12);
            enemy.setPoison();
        }
    }
}

package homeworks.lesson3.point7;

public class Djinn extends Enemy {
    public Djinn(int health, int baseDamage) {
        super("Djinn", "none", health, baseDamage);
    }

    @Override
    public void attackHero(Hero hero) {
        if (Math.random() < 0.1) {
            System.out.println("Сила " + this.getEnemyClass() + " велика. " + hero.getName() + " моментально погибает.");
            hero.setHealth(0);
        } else {
            int damage = this.getBaseDamage();
            System.out.println(this.getEnemyClass() + " атакует героя по имени " + hero.getName() + ", у которого " + hero.getHealth() + " жизней, и наносит ему " + damage + ".");
            hero.takeDamage(damage);
        }
    }
}

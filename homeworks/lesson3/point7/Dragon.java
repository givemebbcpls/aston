package homeworks.lesson3.point7;

public class Dragon extends Enemy {
    public Dragon(int health, int baseDamage) {
        super("Dragon", "water", health, baseDamage);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = 0;
        if (Math.random() < 0.2) {
            damage = 2 * this.getBaseDamage();
            System.out.println(this.getEnemyClass() + " выпускает столб пламени страшной силы. " + hero.getName() + ", у которого " + hero.getHealth() + " жизней, получает этот урон равный " + damage + ".");
        } else {
            damage = this.getBaseDamage();
            System.out.println(this.getEnemyClass() + " атакует героя по имени " + hero.getName() + ", у которого " + hero.getHealth() + " жизней, и наносит ему " + damage + ".");
        }
        hero.takeDamage(damage);
    }
}

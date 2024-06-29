package homeworks.lesson3.point7;

public class Zombie extends Enemy {
    public Zombie(int health, int baseDamage) {
        super("Zombie", "fire", health, baseDamage);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = this.getBaseDamage();
        System.out.println(this.getEnemyClass() + " атакует героя по имени " + hero.getName() + ", у которого " + hero.getHealth() + " жизней, и наносит ему " + damage + ".");
        hero.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        if (!isAlive()) {
            if (Math.random() > 0.2) System.out.println("Враг повержен.");
            else {
                System.out.println(this.getEnemyClass() + " оживает на ваших глазах. Придется побеждать его снова.");
                this.setHealth(80);
            }
        }
    }    
}

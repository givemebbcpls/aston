package homeworks.lesson3.point7;

public class Mage extends Hero {
    public Mage(String name, int health, int baseDamage) {
        super(name, "Mage", health, baseDamage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        String[] attackTypes = {"fire attack", "water attack", "earth attack"};
        int attackChoice = (int) (Math.random() * 3);
        int damage = 0;

        switch (attackTypes[attackChoice]) {
            case "fire attack":
                System.out.print(this.getName() + " призывает к стихии огня");
                if (enemy.getWeakness() == "fire") damage = (int) (1.2 * this.getBaseDamage());
                else damage = (int) (0.8 * this.getBaseDamage());
                break;
            case "water attack":
                System.out.print(this.getName() + " призывает к стихии воды");
                if (enemy.getWeakness() == "water") damage = (int) (1.2 * this.getBaseDamage());
                else damage = (int) (0.8 * this.getBaseDamage());
                break;
            default:
                System.out.print(this.getName() + " призывает к стихии земли");
                damage = this.getBaseDamage();
                break;
        }

        System.out.println(" и наносит " + enemy.getEnemyClass() + ", у которого " + enemy.getHealth() + " жизней, " + damage + " урона.");
        enemy.takeDamage(damage);
    }
}

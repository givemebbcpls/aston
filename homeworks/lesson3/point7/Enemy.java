package homeworks.lesson3.point7;

public abstract class Enemy implements Mortal {
    private String enemyClass;
    private String weakness;
    private int health;
    private int baseDamage;
    private boolean poisoned;

    public Enemy(String enemyClass, String weakness, int health, int baseDamage) {
        this.enemyClass = enemyClass;
        this.health = health;
        this.baseDamage = baseDamage;
        this.weakness = weakness;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public String getEnemyClass() {
        return enemyClass;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setPoison() {
        poisoned = true;
    }

    public boolean isPoisoned() {
        return poisoned;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (!isAlive()) System.out.println("Враг повержен.");
    }

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return enemyClass + "\nhealth:\t\t" + health + "\nbase damage:\t" + baseDamage + "\n";
    }
}

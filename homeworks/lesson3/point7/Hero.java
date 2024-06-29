package homeworks.lesson3.point7;

public abstract class Hero implements Mortal {
    private String name;
    private String heroClass;
    private int health;
    private int baseDamage;

    public Hero(String name, String heroClass, int health, int baseDamage) {
        this.name = name;
        this.heroClass = heroClass;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (!isAlive()) System.out.println("Герой " + name + " погиб.");
    }
    
    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return name + "\nclass:\t\t" + heroClass + "\nhealth:\t\t" + health + "\nbase damage:\t" + baseDamage + "\n";
    }
}
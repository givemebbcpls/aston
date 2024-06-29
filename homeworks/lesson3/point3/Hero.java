package homeworks.lesson3.point3;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Этот храбрый герой по имени " + name + " атакует врага со здоровьем " + enemy.getHealth() + "! [Урон: 10]");
        enemy.takeDamage(10);
    }
}
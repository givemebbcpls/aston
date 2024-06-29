package homeworks.lesson3.point2;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy() {
        System.out.println("Этот храбрый герой по имени " + name + " атакует врага!");
    }
}
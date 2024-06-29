package homeworks.lesson3.point2;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Лучник " + getName() + " пронзает ядовитой стрелой своего врага.");
    }
}

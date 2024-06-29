package homeworks.lesson3.point2;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }
    
    @Override
    public void attackEnemy() {
        System.out.println("Воин " + getName() + " с помощью невероятной силы сокрушает своего врага.");
    }
}

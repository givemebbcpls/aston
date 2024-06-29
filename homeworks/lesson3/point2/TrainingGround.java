package homeworks.lesson3.point2;

public class TrainingGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Робин Гуд");
        Hero mage = new Mage("Лич");
        Hero warrior = new Warrior("Геркулес");
        
        Hero[] heroes = {archer, mage, warrior};
        for (Hero hero : heroes) {
            hero.attackEnemy();
        }
    }
}
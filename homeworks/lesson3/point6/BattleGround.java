package homeworks.lesson3.point6;

public class BattleGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Робин Гуд");
        Hero mage = new Mage("Лич");
        Hero warrior = new Warrior("Геркулес");
        Enemy enemy = new Enemy(30);
        
        Hero[] heroes = {archer, mage, warrior};
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
            System.out.print("Enemy ");
            if (enemy.isAlive()) System.out.println("жив.");
            else System.out.println("побежден.");
        }
    }
}
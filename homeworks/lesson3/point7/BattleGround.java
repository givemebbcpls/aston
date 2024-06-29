package homeworks.lesson3.point7;

public class BattleGround {
    private static int round = 0;
    private static int heroesCounter = 3;
    
    public static void main(String[] args) {
        Hero archer = new Archer("Робин Гуд", 35, 12);
        Hero mage = new Mage("Мерлин", 27, 11);
        Hero warrior = new Warrior("Геркулес", 42, 10);
        Hero[] heroes = {archer, mage, warrior};

        Enemy zombie = new Zombie(100, 17);
        Enemy djinn = new Djinn(120, 20);
        Enemy dragon = new Dragon(150, 15);
        Enemy[] enemies = {zombie, djinn, dragon};
        int enemyChoice = (int) (Math.random() * 3);
        Enemy enemy = enemies[enemyChoice];
        
        while (heroesCounter > 0) {
            round++;
            System.out.println("\nRound " + round + ":");
            if (enemy.isPoisoned()) {
                System.out.println(enemy.getEnemyClass() + " получет 1 урон от яда.");
                enemy.takeDamage(1);
                if (!enemy.isAlive()) {
                    System.out.println("И погибает от него.");
                }
            }

            for (Hero hero : heroes) {
                if (hero.isAlive()) {
                    if (enemy.isAlive()) hero.attackEnemy(enemy);
                } else {
                    continue;
                }
            }

            if (enemy.isAlive()) {
                Hero heroToAttack = heroes[heroesCounter - 1];
                enemy.attackHero(heroToAttack);
                if (!heroToAttack.isAlive()) heroesCounter--;
            } else {
                System.out.println("Конец боя. Герои победили!");
                break;
            }
        }

        if (heroesCounter <= 0) {
            System.out.println("К сожалению, путь героев не всегда успешен. На этот раз враги победили.");
        }
    }
}
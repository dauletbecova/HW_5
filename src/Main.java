public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Босс: Здоровье - " + boss.getHealth() + ", Урон - " + boss.getDamage() + ", Тип защиты - " + boss.getDefenseType());
        Hero hero1 = new Hero(100, 20, "Fireball");
        Hero hero2 = new Hero(120, 15);
        Hero hero3 = new Hero(80, 30, "Ice Shield");

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Герой: Здоровье - " + hero.getHealth() + ", Урон - " + hero.getDamage() + ", Суперспособность - " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Fireball");
        Hero hero2 = new Hero(120, 15);
        Hero hero3 = new Hero(80, 30, "Ice Shield");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}

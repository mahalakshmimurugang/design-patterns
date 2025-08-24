public class Main {
    public static void main(String[] args) {
        // Warrior creation
        System.out.println("Creating a Warrior:");
        CharacterFactory warriorFactory = new WarriorFactory();
        Weapon warriorWeapon = warriorFactory.createWeapon();
        Armor warriorArmor = warriorFactory.createArmor();
        System.out.println("Weapon: " + warriorWeapon.getWeaponType());
        System.out.println("Armor: " + warriorArmor.getArmorType());
    }
}

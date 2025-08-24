public class WarriorFactory implements CharacterFactory {
    public Weapon createWeapon() {
        return new Sword();
    }

    public Armor createArmor() {
        return new Shield();
    }
}

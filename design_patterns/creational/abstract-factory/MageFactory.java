public class MageFactory implements CharacterFactory {
    public Weapon createWeapon() {
        return new Staff();
    }

    public Armor createArmor() {
        return new Robe();
    }
}

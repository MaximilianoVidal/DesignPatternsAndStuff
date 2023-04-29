package AbtractFactory;

public interface SpritesFactory {
    Character createCharacter();
    Weapon createWeapon();
    Map createMap();
    Enemy createEnemy();

}

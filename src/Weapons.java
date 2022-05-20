import java.util.Random;

public abstract class Weapons extends Item {

    private int damage;

    public Weapons(String name, int weight, int value, int damage) {
        super(name, weight, value);
        this.damage = damage;

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public static Weapons newRandomWeapon() {
        Random rand = new Random();
        int random = rand.nextInt(17) + 1;
        Weapons weapon = null;
        if (random <= 10) {
            random = rand.nextInt(3) + 1;
            if (random == 1)
                weapon = Swords.newShortSword();
            if (random == 2)
                weapon = Shields.newBuckler();
            if (random == 3)
                weapon = Wands.newBoneWand();
        }
        if (random > 10 & random <= 16) {
            random = rand.nextInt(3) + 1;
            if (random == 1)
                weapon = Swords.newLongSword();
            if (random == 2)
                weapon = Shields.newSmallShield();
            if (random == 3)
                weapon = Wands.newWoodWand();
            ;
        } else {
            random = rand.nextInt(3) + 1;
            if (random == 1)
                weapon = Swords.newScimitarSword();
            if (random == 2)
                weapon = Shields.newTowerShield();
            if (random == 3)
                weapon = Wands.newUnicornWand();
        }
        return weapon;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Weapon Damage: " + getDamage());

    }
}


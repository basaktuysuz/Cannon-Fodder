import java.util.Random;

public abstract class Weapons extends Item {

    private int damage;
    public Weapons(){
        super();
        damage=0;
    }

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


    @Override
    public void display() {
        super.display();
        System.out.println("Weapon Damage: " + getDamage());

    }
}



public abstract class Weapons extends Item {

    private int damage;
    private String itemType;

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public Weapons(){
        super();
        damage=0;
        itemType=null;
    }

    public Weapons(String name, int weight, int value, int damage,String itemType) {
        super(name, weight, value);
        this.itemType=itemType;
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


import java.util.ArrayList;
import java.util.List;

public class Character {
    protected int strength;
    protected int vitality;
    protected int intelligence;
    protected int HP;


    public Character() {
        HP = (int) (0.7 * vitality + 0.2 * strength * 0.1 * intelligence);
    }

    public Character(int strength, int vitality, int intelligence) {
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        HP = (int) (0.7 * vitality + 0.2 * strength * 0.1 * intelligence);
    }

    private List<Item> inventory = new ArrayList<Item>();

    private Weapons weapon;
    private Clothing clothing;

    public void Pick(Item item) {
        if (HasSpaceInInventory(item)) {
            this.inventory.add(item);
            System.out.println("Picked " + item.getName() + " from the ground.");
        }
        else System.out.println("Inventory doesn't have space");
    }

    public void Throw(Item item) {
        if (inventory.contains(item)) {
            inventory.remove(item);
            System.out.println("Threw " + item.getName() + " to the ground.");
        }
        else System.out.println("Item not FOUND");
    }

    public boolean HasSpaceInInventory(Item item) {
        double item_weight = item.getWeight();
        for (Item inventory_item : inventory) {
            item_weight += inventory_item.getWeight();
        }
        return item_weight < this.strength * 10; // arbitrary
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public double getHP() {
        return HP;
    }

    public int Attack() {
        return weapon.getDamage();
    }

    public void SpecialAction() {
        System.out.println("Hero's special ability is activated !!!");
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }

    public void Pick() {
    }

    public void Wield() {
    }


    public void Examine() {
    }

    public void ListInventory() {
    }
}
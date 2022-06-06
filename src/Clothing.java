import java.util.ArrayList;
import java.util.Random;

public class Clothing extends Item {

    private int protection;
    private String type;

    public Clothing(String name, int weight, int value, int protection, String type) {
        super(name, weight, value);
        this.protection = protection;
        this.type = type;

    }
    private ArrayList<Clothing> wearing = new ArrayList<>();
    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public String getType() {
        return type;
    }

    public static Clothing newRandomClothing() {
        Random rand = new Random();
        int random = rand.nextInt(10) + 1;
        Clothing clothing;
        if (random <= 6) {
            clothing = newLightArmor();
        } else if (random <= 9) {
            clothing = newMediumArmor();
        } else {
            clothing = newHeavyArmor();
        }
        return clothing;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Clothing newLightArmor() {
        return new Clothing("Padded", 8, 5, 2, "Light Armor");
    }

    public static Clothing newMediumArmor() {
        return new Clothing("Studded Leather", 10, 20, 4, "Leather Armor");
    }

    public static Clothing newHeavyArmor() {
        return new Clothing("Chain Mail", 15, 75, 6, "Chain Armor");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Protection: " + getProtection());
    }
}


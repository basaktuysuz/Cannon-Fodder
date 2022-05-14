import java.util.Random;

public class Item {

    private String name;
    private int weight;
    private int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public static Item newRandomItem() {
        Random rand = new Random();
        int random = rand.nextInt(5) + 1;
        Item item = null;
        switch (random) {
            case 1:
                item = newCopper();
                break;
            case 2:
                item = newSilver();
                break;
            case 3:
                item = newGold();
                break;
            case 4:
                item = newPlatinum();
                break;
            case 5:
                item = newDiamond();
                break;
        }
        return item;
    }

    public static Item newCopper() {
        return new Item("Copper",1,10);
    }

    public static Item newSilver() {
        return new Item("Silver",1,50);
    }

    public static Item newGold() {
        return new Item("Gold",1,100);
    }

    public static Item newPlatinum() {
        return new Item("Platinum",1,500);
    }

    public static Item newDiamond() {
        return new Item("Diamond",1,1000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Name of Item: " + getName());
        System.out.println("Weight: " + getWeight());
        System.out.println("Value: " + getValue());
    }
}

import java.util.Random;

public class Item {

    private String name;
    private int weight;
    private int value;


    public Item(){
        name=null;
        weight=0;
        value=0;

    }

    public Item(String name, int weight, int value ) {
        this.name = name;
        this.weight = weight;
        this.value = value;

    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Value: " + value);
        System.out.println("Weight: " + weight);
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

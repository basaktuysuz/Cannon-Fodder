import java.util.ArrayList;
import java.util.Scanner;

public class Character {
    Scanner input=new Scanner(System.in);

    protected int strength;
    protected int intelligence;
    protected int vitality;
    protected int HP;

    protected Weapons[] weaponOnHand= new Weapons[1];
    protected Clothing[] clothingOnTheChar= new Clothing[1];
    protected ArrayList<Item> Inventory=new ArrayList<>();

    public Character( int strength, int intelligence, int vitality, int HP) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.HP =(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
    }
    public Character(){
        strength=0;
        intelligence=0;
        vitality=0;
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
    }



    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }








    public void Attack(Character character){}

    public void Pick(Item item){
        int sumWeight=0;
        for(int i=0;i<Inventory.size();i++){
            sumWeight= sumWeight +Inventory.get(i).getWeight();
        }
        if(sumWeight+ item.getWeight()<strength){
            Inventory.add(item);
        }
        else{
            System.out.println("You cannot pick this item. Your Inventory is full");
            System.out.println("If you want this item please drop some items");//drop için yeni bir metod lazım
        }

    }

    public void Wield(Weapons weapons){
        weaponOnHand[1]=weapons;
    }

    public void Wear(Clothing clothing){
        clothingOnTheChar[1]=clothing;
    }

    public void Examine(Item item){
        item.display();
    }

    public void specialAction(Character character){
        if(character.weaponOnHand[0].equals(new Swords())){
            System.out.println("How many turns you want to be stay away from fight(Max can be 4)");
            int turns=input.nextInt();

        }
    }

    public void ListInventory(){
        for(int i=0;i<Inventory.size();i++){
            Inventory.get(i).display();
        }

    }
}

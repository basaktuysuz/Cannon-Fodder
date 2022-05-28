import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {
    Scanner input=new Scanner(System.in);
    protected String name;
    protected int strength;
    protected int intelligence;
    protected int vitality;
    protected int HP;

    protected Weapons[] weaponOnHand= new Weapons[1];
    protected Clothing[] clothingOnTheChar= new Clothing[1];
    protected ArrayList<Item> Inventory=new ArrayList<>();

    public Character( String name,int strength, int intelligence, int vitality, int HP) {
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



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Weapons[] getWeaponOnHand() {
        return weaponOnHand;
    }

    public void setWeaponOnHand(Weapons[] weaponOnHand) {
        this.weaponOnHand = weaponOnHand;
    }

    public Clothing[] getClothingOnTheChar() {
        return clothingOnTheChar;
    }

    public void setClothingOnTheChar(Clothing[] clothingOnTheChar) {
        this.clothingOnTheChar = clothingOnTheChar;
    }

    public ArrayList<Item> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        Inventory = inventory;
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








    public void Attack(Character doingTheAttack,Character ReceivingTheAttack ){
        ReceivingTheAttack.HP=ReceivingTheAttack.HP-(int)(doingTheAttack.weaponOnHand[0].getDamage()*0.2*doingTheAttack.strength);
        System.out.println("Your damage caused "+(int)(doingTheAttack.weaponOnHand[0].getDamage()*0.2*doingTheAttack.strength)+" HP to the character" );
        System.out.println("Their HP is now "+ ReceivingTheAttack.HP);
    }

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
    public void dropItem(){
        ListInventory();
        System.out.println("Enter the name of the item you want to drop");
        String itemName=input.nextLine();
        boolean found=false;
        for(int i=0;i<Inventory.size();i++){
            if(Inventory.get(i).getName().equals(itemName)){
                found=true;
                Inventory.remove(i);
                break;
            }
        }
        if(found==true){
            System.out.println("The item is successfully removed");
        }
        else{
            System.out.println("You do not have that item in your inventory");
        }

    }

    public void Wield(Weapons weapons){
        weaponOnHand[0]=weapons;
    }

    public void Wear(Clothing clothing){
        clothingOnTheChar[0]=clothing;
    }

    public void Examine(Item item){
        item.display();
    }

    public void specialAction(Character character){
        if(character.weaponOnHand[0].equals(new Swords())){

        }
        if(character.weaponOnHand[0].equals(new Shields())){

        }
    }

    public void ListInventory(){
        for(int i=0;i<Inventory.size();i++){
            Inventory.get(i).display();
        }

    }
}

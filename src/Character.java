
import java.util.ArrayList;
import java.util.Scanner;

public class Character {
    Scanner input=new Scanner(System.in);
    protected String name;
    protected int strength;
    protected int intelligence;
    protected int vitality;
    protected int HP;
    protected double weight;
    protected String gender;
    protected int Damage;
    protected Weapons wearingWeapon;
    protected Clothing wearingClothing;
    protected Weapons[] weaponOnHand= new Weapons[1];
    protected Clothing[] clothingOnTheChar= new Clothing[1];
    protected ArrayList<Item> Inventory=new ArrayList<>();
    protected boolean isStunned;
    protected boolean isInTheGame;
    protected boolean isDead;



    public Character( String name,int strength, int intelligence, int vitality,String gender) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.weight = weight;
        this.HP =(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        this.weaponOnHand=weaponOnHand;
        this.clothingOnTheChar=clothingOnTheChar;
        isStunned=false;
        isInTheGame=true;
        this.gender=gender;
        isDead=false;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Character(){
        strength=0;
        intelligence=0;
        vitality=0;
        weight=0;
        gender=null;
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        isStunned=false;
        isInTheGame=true;
        isDead=false;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isInTheGame() {
        return isInTheGame;
    }

    public void setInTheGame(boolean inTheGame) {
        isInTheGame = inTheGame;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public boolean isStunned() {
        return isStunned;
    }

    public void setStunned(boolean stunned) {
        isStunned = stunned;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
       Inventory.add(weaponOnHand[0]);
       Inventory.add(clothingOnTheChar[0]);
       Inventory = inventory;
        this.weaponOnHand = weaponOnHand;
        this.clothingOnTheChar = clothingOnTheChar;
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

    //Methods
    public void Attack(Character ReceivingTheAttack ){
        ReceivingTheAttack.HP=ReceivingTheAttack.HP-(int)(weaponOnHand[0].getDamage()*0.2*strength);
        System.out.println("Your attack caused "+(int)(weaponOnHand[0].getDamage()*0.2*strength)+" HP to the character" );
        if(ReceivingTheAttack.getHP()<=0){
            ReceivingTheAttack.isDead=true;
            System.out.println("The target enemy is dead");
        }
        else{
        System.out.println("Their HP is now "+ ReceivingTheAttack.HP);}

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
    public void dropItem(Item item){

                Inventory.remove(item);

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

    public void specialAction(Character receivingTheSpecialAttack){

        if(weaponOnHand[0].getItemType().equals("Wand")){
            System.out.println("This special action can used by only a Healer");


        }
        if(weaponOnHand[0].getItemType().equals("Sword")){
            System.out.println("You chose to use the special action of sword.\nYou will be stay away from the battle for ths turn");
            receivingTheSpecialAttack.setInTheGame(false);

        }
        if(weaponOnHand[0].getItemType().equals("Shield")){
            System.out.println("You chose to use the special action of shield.\nYou can stun the enemy");
            receivingTheSpecialAttack.setStunned(true);

        }
    }

    public void ListInventory(){
        for(int a=0;a<Inventory.size();a++){
            Inventory.get(a).display();
        }

    }
    public void DisplayInfo(){
    }
}

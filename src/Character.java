import java.util.ArrayList;

public class Character {
    protected int strength;
    protected int vitality;
    protected int intelligence;
    protected int HP;
    protected Weapons[] weaponOnHand= new Weapons[1];
    protected Clothing[] clothsThatCharWears= new Clothing[1];



    public Character() {
        HP=(int)(Math.random()*(0.7 * vitality + 0.2 * strength * 0.1 * intelligence-1))+1;
    }

    public Character(int strength, int vitality, int intelligence) {
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        HP=(int)(Math.random()*(0.7 * vitality + 0.2 * strength * 0.1 * intelligence-1))+1;
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
        return(strength+weaponOnHand[0].getDamage());
    }

    public void SpecialAction() {
        System.out.println("Hero's special ability is activated !!!");
        if(weaponOnHand[0].equals(new Swords())){

        }
        if(weaponOnHand[0].equals(new Shields())){

        }
    }

    public void Pick() {
    }

    public void Wield(Weapons weapon) { weaponOnHand[0]=weapon;
        System.out.println("Your character now wields");
        weaponOnHand[0].display();
    }

    public void Wear(Clothing cloth) { clothsThatCharWears[0]=cloth;
        System.out.println("Your character now wears");
        clothsThatCharWears[0].display();
    }

    public void Examine() {
    }

    public void ListInventory() {
    }
    public void printInfo(){
        System.out.println("Strenght:"+strength);

    }
    public int GetDamage(){
        HP=HP-Attack();//sorun var burada saldıranın attackini almam lazım ama onu daha yapamadım
        return(HP);
    }
}
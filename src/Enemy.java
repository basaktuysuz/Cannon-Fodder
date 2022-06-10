
import java.util.ArrayList;
import java.util.Scanner;



public class Enemy extends Character {
    static int enemyAmount = 0;// enemy sayısı
    private  int level = 0; // level sayısı
    private int percentage;
    private int enemyReference;

    public int getEnemyReference() {
        return enemyReference;
    }

    public void setEnemyReference(int enemyReference) {
        this.enemyReference = enemyReference;
    }

    public Enemy(int enemyReference){
        this.enemyReference=enemyReference;
        strength = (int) (Math.random() * 4 + 1);
        vitality = (int) (Math.random() * 4 + 1);
        intelligence = (int) (Math.random() * 4 + 1);
        HP = (int) (Math.random() * (0.7 * vitality + 0.2 * strength + 0.1 * intelligence - 1) + 1);
        isStunned=false;
        isDead=false;

    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage() {
        percentage = (int) (Math.random() * 9 + 1);
    }
    public void RandomWeapon(){
        if (getPercentage() == 1) {
            weaponOnHand[0] = new Shields("Aegis Shield", 2, 4, 4,"Shield", "Small Shield");
        } else if (getPercentage() == 2) {
            weaponOnHand[0] = new Wands("Chestnut", 6, 4, 7,"Wand", 6, "Wood Wand");
        } else {
            weaponOnHand[0] = new Swords("Kyanite Sword", 2, 4, 4,"Sword" ,"Long Sword");
        }
    }



    public void RewardItemDrop(Character character){

        Scanner input=new Scanner(System.in);

        ArrayList<Shields> shieldsArrayList = new ArrayList<>();
        ArrayList<Wands> wandsArrayList = new ArrayList<>();
        ArrayList<Swords> swordsArrayList = new ArrayList<>();

        Wands newBoneWand = new Wands("Sphinx-Bone Wand", 5, 9, 6, "Wand", 5, "Bone Wand");
        wandsArrayList.add(newBoneWand);
        Wands newWoodWands = new Wands("Chestnut", 6, 4, 7, "Wand", 6, "Wood Wand");
        wandsArrayList.add(newWoodWands);
        Wands newUnicornWand = new Wands("Malfoy's Wand", 3, 7, 5, "Wand", 3, "Unicorn Hair Wand");
        wandsArrayList.add(newUnicornWand);


        Shields newBuckler = new Shields("Bubble Shield", 1, 2, 3, "Shield", "Buckler");
        shieldsArrayList.add(newBuckler);
        Shields newSmallShield = new Shields("Aegis Shield", 2, 4, 4, "Shield", "Small Shield");
        shieldsArrayList.add(newSmallShield);
        Shields newTowerShield = new Shields("Great Axe", 4, 8, 5, "Shield", "TowerShield");
        shieldsArrayList.add(newTowerShield);

        Swords newShortSword = new Swords("Scissor DaggerLion Sword", 1, 2, 4, "Sword", "Short Sword");
        swordsArrayList.add(newShortSword);
        Swords newLongSword = new Swords("Kyanite Sword", 2, 4, 4, "Sword", "Long Sword");
        swordsArrayList.add(newLongSword);
        Swords newScimitarSword = new Swords("Lion Sword", 4, 9, 5, "Sword", "Scimitar ");
        swordsArrayList.add(newScimitarSword);

        // enemy  ölünce silah droplama kısmı

       int chance=(int)(Math.random()*3+1);
       int randomIndex=(int)(Math.random()*2+1);
       if(chance==1){//Sword drop
           System.out.println("Enemy has dropped "+swordsArrayList.get(randomIndex).getName());
           System.out.println("1-Examine,2-Add Inventory");
           int choice= input.nextInt();
           if(choice==1){
               swordsArrayList.get(randomIndex).display();
           }
           else{
               character.Pick(swordsArrayList.get(randomIndex));
           }
       }
       else if(chance==2){
           System.out.println("Enemy has dropped "+wandsArrayList.get(randomIndex).getName());
           System.out.println("1-Examine,2-Add Inventory");
           int choice= input.nextInt();
           if(choice==1){
               wandsArrayList.get(randomIndex).display();
           }
           else{
               character.Pick(wandsArrayList.get(randomIndex));
           }

        }
       else if(chance==3){
           System.out.println("Enemy has dropped "+shieldsArrayList.get(randomIndex).getName());
           System.out.println("1-Examine,2-Add Inventory");
           int choice= input.nextInt();
           if(choice==1){
               shieldsArrayList.get(randomIndex).display();
           }
           else{
               character.Pick(shieldsArrayList.get(randomIndex));
           }
       }
       else{
           System.out.println("Enemy didn't drop reward");
       }


    }
}
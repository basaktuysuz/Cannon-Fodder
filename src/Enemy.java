import java.util.ArrayList;
import java.util.Scanner;



public class Enemy extends Character {
    protected Weapons[] weaponOnHandEnemy= new Weapons[1];
    static int enemyAmount = 0;// enemy sayısı
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
    public void enemydisplay(){
        System.out.println(strength);
    }





    public int getPercentage() {
        return percentage;
    }

    public void setPercentage() {
        percentage = (int) (Math.random() * 9 + 1);
    }
    public void RandomWeapon(){
        if (getPercentage() == 1) {
            weaponOnHandEnemy[0] = new Shields("Aegis Shield", 2, 4, 4,"Shield", "Small Shield");
        } else if (getPercentage() == 2) {
            weaponOnHandEnemy[0] = new Wands("Chestnut", 6, 4, 7,"Wand", 6, "Wood Wand");
        } else {
            weaponOnHandEnemy[0] = new Swords("Kyanite Sword", 2, 4, 4,"Sword" ,"Long Sword");
        }
    }

    public void AttackEnemy(Character ReceivingTheAttack ){
        ReceivingTheAttack.HP=ReceivingTheAttack.HP-(int)(0.2*strength+2);
        System.out.println("Enemy attack caused "+(int)(0.2*strength+2)+" HP to the character" );
        if(ReceivingTheAttack.getHP()<=0){
            ReceivingTheAttack.isDead=true;
            System.out.println("Your character is dead");
        }
        else{
            System.out.println("Your Character's HP is now "+ ReceivingTheAttack.HP);}

    }
    public int toInt(){
        return enemyReference;
    }



}
import java.util.ArrayList;

public class Enemy extends Character {
    static int enemyAmount = -1;// enemy sayısı
    private  int level = 0; // level sayısı
    private int percentage;

    public Enemy() {
        strength = (int) (Math.random() * 4 + 1);
        vitality = (int) (Math.random() * 4 + 1);
        intelligence = (int) (Math.random() * 4 + 1);
        HP = (int) (Math.random() * (0.7 * vitality + 0.2 * strength + 0.1 * intelligence - 1) + 1);
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

    public void SetEnemy() {
        ArrayList<String> names = new ArrayList<>();
        String name = "Enemy ";
        for (int i = 0; i < enemyAmount; i++) {
            if (getPercentage() == 1) {
                weaponOnHand[0] = new Shields("Aegis Shield", 2, 4, 4, "Small Shield");
            } else if (getPercentage() == 2) {
                weaponOnHand[0] = new Wands("Chestnut", 6, 4, 7, 6, "Wood Wand");
            } else {
                weaponOnHand[0] = new Swords("Kyanite Sword", 2, 4, 4, "Long Sword");
            }
        }
        //Name initialization
        for (int i = 0; i < names.size(); i++) {
            name = name + (i + 1);
            names.add(name);
        }
    }
    public  void increaseLevel(){
        //a method to increase level, we implemented this metod for the readibility purposes.
        level ++;
        enemyAmount = (int) Math.pow(2, level);
        System.out.println("The current level is : "+ getLevel());
    }
    public void RewardItem() {
        int random = (int) (Math.random() * 2 + 1);
        if (random == 1) {

        } else if (random == 2) {
        } else {
        }
    }

}
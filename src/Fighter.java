import java.util.Random;

public class Fighter extends Character {
    private int max1 = 6, max2 = 11, max3 = 8;
    private int min1 = 1, min2 = 6, min3 = 3;

    public Fighter() {


        Random rand = new Random();
        strength = rand.nextInt(max1 - min1) + min1;
        vitality = rand.nextInt(max2 - min2) + min2;
        intelligence = rand.nextInt(max3 - min3) + min3;
        HP = (int) (0.7 * vitality + 0.2 * strength * 0.1 * intelligence);
        System.out.println(HP);
    }



    public void specialAction() {
    }
    public void printInfo(){
        super.printInfo();
    }
}

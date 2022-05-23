import java.util.Random;

public class Fighter extends Character {
    private int max1 = 6, max2 = 11, max3 = 8;
    private int min1 = 1, min2 = 6, min3 = 3;


    public Fighter() {

        Random rand = new Random();

        fighterStrength = rand.nextInt(max1 - min1) + min1;
        fighterVitality = rand.nextInt(max2 - min2) + min2;
        fighterIntelligence = rand.nextInt(max3 - min3) + min3;
        fighterHP = (int) (0.7 * fighterVitality + 0.2 * fighterStrength * 0.1 * fighterIntelligence);
        System.out.println("Fighter created with " + fighterHP + " HP! ");
    }
}
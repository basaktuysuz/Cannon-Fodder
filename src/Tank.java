import java.util.Random;

public class Tank extends Character {
    private int max1 = 11, max2 = 8, max3 = 11;
    private int min1 = 6, min2 = 3, min3 = 6;


    public Tank() {

        Random rand = new Random();

        tankStrength = rand.nextInt(max1 - min1) + min1;
        tankVitality = rand.nextInt(max2 - min2) + min2;
        tankIntelligence = rand.nextInt(max3 - min3) + min3;
        tankHP = (int) (0.7 * tankVitality + 0.2 * tankStrength * 0.1 * tankIntelligence);
        System.out.println("Tank created with " + tankHP + " HP! ");
    }
}
import java.util.Random;
import java.util.Scanner;

public class Healer extends Character {

    Scanner input = new Scanner(System.in);
    private int max1=8,max2=6,max3=11;
    private int min1=3,min2=1,min3=6;

    public Healer(){

        Random rand = new Random();

        healerStrength = rand.nextInt(max1-min1 )+min1 ;
        healerVitality = rand.nextInt(max2-min2 )+min2 ;
        healerIntelligence = rand.nextInt(max3-min3 )+min3 ;
        healerHP=(int)(0.7*healerVitality+0.2*healerStrength*0.1*healerIntelligence);
        System.out.println("Healer created with "+healerHP+" HP! " );
        System.out.println("Healer created with "+healerIntelligence+" int! " );
    }
    public void specialAction() {
        givenHeal = healerIntelligence * 1;
        System.out.println(givenHeal + " HP given to healer.");

    }

    public void specialAction(Tank tank1) {
        givenHeal = healerIntelligence * 1;
        System.out.println(givenHeal + " given to the Tank.");
    }

    public void specialAction(Fighter fighter1) {
        givenHeal = healerIntelligence * 1;
        System.out.println(givenHeal + " given to the Fighter.");
    }







}

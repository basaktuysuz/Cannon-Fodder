import java.util.Random;

public class Enemy extends Character{
    private int max1=6,max2=6,max3=6;
    private int min1=1,min2=1,min3=1;


    public Enemy(){
        Random rand = new Random();
        healerStrength = rand.nextInt(max1-min1 )+min1 ;
        healerVitality = rand.nextInt(max2-min2 )+min2 ;
        healerIntelligence = rand.nextInt(max3-min3 )+min3 ;
        healerHP=(int)(0.7*healerVitality+0.2*healerStrength*0.1*healerIntelligence);
        System.out.println("Enemies created with "+enemyHP+" HP! " );

    }
}

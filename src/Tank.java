import java.util.Random;

public class Tank extends Character {
    private int max1=11,max2=8,max3=11;
    private int min1=6,min2=3,min3=6;


    public Tank(){

        Random rand = new Random();

        strength = rand.nextInt(max1-min1 )+min1 ;
        vitality = rand.nextInt(max2-min2 )+min2 ;
        intelligence = rand.nextInt(max3-min3 )+min3 ;
        HP=(int)(0.7*vitality+0.2*strength*0.1*intelligence);
        System.out.println(HP);


    }
    public void specialAction(){
    }


}
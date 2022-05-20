import java.util.Random;

public class Healer extends Character {
    private int max1=8,max2=6,max3=11;
    private int min1=3,min2=1,min3=6;
    private int heal;
    private int remainingHP;

    public Healer(){

        Random rand = new Random();

        strength = rand.nextInt(max1-min1 )+min1 ;
        vitality = rand.nextInt(max2-min2 )+min2 ;
        intelligence = rand.nextInt(max3-min3 )+min3 ;
        HP=(int)(0.7*vitality+0.2*strength*0.1*intelligence);
        System.out.println(HP);
        remainingHP=HP-1;
        System.out.println(remainingHP);


    }
    public void specialAction(){
        super.SpecialAction();
        heal=(int) (1+0.1*intelligence);
        if(heal+remainingHP>HP){
            HP=heal+remainingHP;
            System.out.println(HP);}
        else{
            HP=heal+remainingHP;
            System.out.println(HP);
        }

    }





}
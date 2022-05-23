
public class Healer extends Character {

    int givenHeal;

    public Healer(){
        strength =(int)(Math.random()*4+3);
        vitality=(int)(Math.random()*4+1);
        intelligence=(int)(Math.random()*4+6);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        System.out.println("Healer created with "+HP+" HP! " );
        System.out.println("Healer created with "+intelligence+" int! " );
    }
    public void specialAction() {
        givenHeal = intelligence * 1;
        System.out.println(givenHeal + " HP given to healer.");

    }

    public void specialAction(Tank tank1) {
        givenHeal = intelligence * 1;
        System.out.println(givenHeal + " given to the Tank.");
    }

    public void specialAction(Fighter fighter1) {
        givenHeal = intelligence * 1;
        System.out.println(givenHeal + " given to the Fighter.");
    }

}
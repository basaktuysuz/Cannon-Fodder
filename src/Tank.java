

public class Tank extends Character {



    public Tank(){
        name="Trooper";
        strength=(int)(Math.random()*4+1);
        vitality=(int)(Math.random()*4+6);
        intelligence=(int)(Math.random()*4+3);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);

    }
}
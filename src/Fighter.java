
public class Fighter extends Character {

    int stunnedEnemyCounter=0;

    public Fighter(){

        strength=(int)(Math.random()*4+6);
        vitality=(int)(Math.random()*4+3);
        intelligence=(int)(Math.random()*4+1);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
    }


}
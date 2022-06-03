
public class Enemy extends Character{
    private int percentage;
    public Enemy() {
       strength=(int)(Math.random()*4+1);
       vitality=(int)(Math.random()*4+1);
       intelligence=(int)(Math.random()*4+1);
       HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
    }
    public int getPercentage() {
        return percentage;
    }
    public void setPercentage(){
    percentage= (int)(Math.random()*9+1);
    }
   public void Wield(){
        if(getPercentage()==1){
            weaponOnHand[0]=new Shields("Aegis Shield", 2, 4, 4, "Small Shield");
        }
        else if(getPercentage()==2){
            weaponOnHand[0]=new Wands("Chestnut", 6, 4, 7, 6, "Wood Wand");
        }
        else{
            weaponOnHand[0]=new Swords("Kyanite Sword",2,4,4,"Long Sword");
        }


   }
   public void RewardItem(){
        int random=(int)(Math.random()*2+1);
        if(random==1){

        }
        else if(random==2){}
        else{}
   }



}

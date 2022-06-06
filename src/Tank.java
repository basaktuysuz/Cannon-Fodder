public class Tank extends Character {

    public Tank(){

        this.strength=(int)(Math.random()*4+1);
        this.vitality=(int)(Math.random()*4+6);
        this.intelligence=(int)(Math.random()*4+3);
        this.HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        this.weight = weight;
        this.wearingClothing= Clothing.newLightArmor();
        this.wearingWeapon= wearingWeapon;
    }


}
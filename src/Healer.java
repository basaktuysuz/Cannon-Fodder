
public class Healer extends Character {

    int givenHeal;

    public Healer(){

        strength =(int)(Math.random()*4+3);
        vitality=(int)(Math.random()*4+1);
        intelligence=(int)(Math.random()*4+6);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        weight = weight;
        wearingClothing= Clothing.newLightArmor();
        wearingWeapon= wearingWeapon;
    }



    public void specialAction(Character character){
        givenHeal = intelligence * 1;
        if(givenHeal+character.HP<(int)(character.intelligence*0.1+character.vitality*0.7+character.strength*0.2)){
        character.HP=character.HP+givenHeal;}
        else{
            character.HP=(int)(character.intelligence*0.1+character.vitality*0.7+character.strength*0.2);
        }

    }




}
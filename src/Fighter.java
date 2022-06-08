
public class Fighter extends Character {

    int stunnedEnemyCounter=0;

    public Fighter(String name, String gender){
        setName(name);
        setGender(gender);
        strength=(int)(Math.random()*4+6);
        vitality=(int)(Math.random()*4+3);
        intelligence=(int)(Math.random()*4+1);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        wearingClothing= Clothing.newLightArmor();
        this.wearingWeapon= wearingWeapon;

    }


    public Fighter(){
        strength=(int)(Math.random()*4+6);
        vitality=(int)(Math.random()*4+3);
        intelligence=(int)(Math.random()*4+1);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        wearingClothing= Clothing.newLightArmor();
        this.wearingWeapon= wearingWeapon;

    }
    public void DisplayInfo(){
        System.out.println("Your Fighter's name is : " + name);
        System.out.println("Fighter's gender is:" + gender);
        System.out.println("Fighter created with " + HP + " HP! ");
        System.out.println("Fighter created with " + intelligence + " intelligence ");
        System.out.println("Fighter created with " + vitality + "Vitality ");
        System.out.println("Fighter created with " + strength + "strength ");
        System.out.println("Fighter created With default weapon and armor ");
        System.out.println("******************************************");
    }





}
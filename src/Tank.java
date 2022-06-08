public class Tank extends Character {

    public Tank(String name,String gender){
        setName(name);
        setGender(gender);
        this.strength=(int)(Math.random()*4+1);
        this.vitality=(int)(Math.random()*4+6);
        this.intelligence=(int)(Math.random()*4+3);
        this.HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        this.weight = weight;
        this.wearingClothing= Clothing.newLightArmor();
        this.wearingWeapon= wearingWeapon;
    }
    public Tank(){
        this.strength=(int)(Math.random()*4+1);
        this.vitality=(int)(Math.random()*4+6);
        this.intelligence=(int)(Math.random()*4+3);
        this.HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        this.weight = weight;
        this.wearingClothing= Clothing.newLightArmor();
        this.wearingWeapon= wearingWeapon;

    }
    public void DisplayInfo(){
        System.out.println("Your Tank's name is : " +name);
        System.out.println("Tank's gender is:" + gender);
        System.out.println("Tank created with " + HP + " HP! ");
        System.out.println("Tank created with " + intelligence + " intelligence ");
        System.out.println("Tank created with " + vitality + " Vitality ");
        System.out.println("Tank created with " + strength + " strength ");
        System.out.println("Tank created With default weapon and armor ");
        System.out.println("******************************************");

    }


}
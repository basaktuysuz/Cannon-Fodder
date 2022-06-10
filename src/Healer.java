
public class Healer extends Character {

    int givenHeal;

    public Healer(String name, String gender){
        this.setName(name);
        setGender(gender);
        this.weaponOnHand=weaponOnHand;
        this.clothingOnTheChar=clothingOnTheChar;
        isStunned=false;
        isInTheGame=true;
        strength =(int)(Math.random()*4+3);
        vitality=(int)(Math.random()*4+1);
        intelligence=(int)(Math.random()*4+6);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);

    }

    public Healer(){
        isStunned=false;
        isInTheGame=true;
        strength =(int)(Math.random()*4+3);
        vitality=(int)(Math.random()*4+1);
        intelligence=(int)(Math.random()*4+6);
        HP=(int)(Math.random()*(0.7*vitality+0.2*strength+0.1*intelligence-1)+1);
        wearingClothing= Clothing.newLightArmor();
        wearingWeapon= wearingWeapon;
    }



    public void specialAction(Character character){
        super.specialAction(character);
        givenHeal = intelligence * 1;
        if(givenHeal+character.HP<(int)(character.intelligence*0.1+character.vitality*0.7+character.strength*0.2)){
        character.HP=character.HP+givenHeal;
        System.out.println("Character HP is now:"+character.HP);}
        else{
            character.HP=(int)(character.intelligence*0.1+character.vitality*0.7+character.strength*0.2);
            System.out.println("Character HP is now:"+character.HP);
        }


    }
    public void DisplayInfo(){
        System.out.println("Your Healer's name is : " + getName());
        System.out.println("Healer's gender is:" + getGender());
        System.out.println("Healer created with " + getHP() + " HP! ");
        System.out.println("Healer created with " +getIntelligence() + " intelligence ");
        System.out.println("Healer created with " + getVitality() + " Vitality ");
        System.out.println("Healer created with " + getStrength() + " strength ");
        System.out.println("Healer created With default weapon and armor ");
        System.out.println("******************************************");

    }
    /*public void HealersHealMenu(){
        System.out.println("Healer's special action is healing teammates. Please select the teammate you want to give heal to.");
        System.out.println("1 - Fighter \n2 - Tank \n3 - Healer\n4 - Exit ");


        int choice = input.nextInt();
        switch (choice) {
            case 1:{
                healer1.specialAction(character1);
                System.out.println("Fighter's hp is now : " + character1.HP);
                break;

            case 2:
                healer1.specialAction(tank1);
                System.out.println("Tank's hp is now : " + tank1.HP);

                break;

            case 3:
                healer1.specialAction(healer1);
                System.out.println("Healer's hp is now:" + healer1.HP);
                break;

            case 4:
            default:

        }*/
    }







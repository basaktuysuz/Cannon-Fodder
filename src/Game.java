import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {
    private static int level=0;
    public static void CreateLevel(){
        Enemy enemy=new Enemy(1);
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(enemy);
        for (int i = 0; i < Math.pow(2,level); i++){
            enemy.RandomWeapon();
            enemies.add(new Enemy(i+3));
        }
        System.out.println("In this level you will encounter "+Math.pow(2,level)+" enemies");


    }

    public static void main(String[] args) throws Exception {




        ArrayList<Shields> shieldsArrayList = new ArrayList<>();
        ArrayList<Shields> shieldsInventory = new ArrayList<>();
        ArrayList<Wands> wandsArrayList = new ArrayList<>();
        ArrayList<Wands> wandsInventory = new ArrayList<>();
        ArrayList<Wands> wearingWands = new ArrayList<>();
        ArrayList<Swords> swordsArrayList = new ArrayList<>();
        ArrayList<Swords> swordsInventory = new ArrayList<>();
        ArrayList<Swords> wearingSword = new ArrayList<>();
        ArrayList<Score> scores = new ArrayList<>();
        ArrayList<Shields> wearingShields = new ArrayList<>();
        ArrayList<Clothing> armorArrayList = new ArrayList<>();
        ArrayList<Clothing> armorInventory = new ArrayList<>();
        ArrayList<Clothing> wearingArmor = new ArrayList<>();
        ArrayList<Enemy> enemies = new ArrayList<>();
        ArrayList<Enemy> enemies; // enemylerin arraylisti

        Wands newBoneWand = new Wands("Sphinx-Bone Wand", 5, 9, 6,"Wand", 5, "Bone Wand");
        wandsArrayList.add(newBoneWand);
        Wands newWoodWands = new Wands("Chestnut", 6, 4, 7, "Wand", 6, "Wood Wand");
        wandsArrayList.add(newWoodWands);
        Wands newUnicornWand = new Wands("Malfoy's Wand", 3, 7, 5, "Wand", 3, "Unicorn Hair Wand");
        wandsArrayList.add(newUnicornWand);


        Shields newBuckler = new Shields("Bubble Shield", 1, 2, 3, "Shield","Buckler");
        shieldsArrayList.add(newBuckler);
        Shields newSmallShield = new Shields("Aegis Shield", 2, 4, 4, "Shield","Small Shield");
        shieldsArrayList.add(newSmallShield);
        Shields newTowerShield = new Shields("Great Axe", 4, 8, 5, "Shield","TowerShield");
        shieldsArrayList.add(newTowerShield);

        Swords newShortSword = new Swords("Scissor DaggerLion Sword", 1, 2, 4, "Sword","Short Sword");
        swordsArrayList.add(newShortSword);
        Swords newLongSword = new Swords("Kyanite Sword", 2, 4, 4, "Sword","Long Sword");
        swordsArrayList.add(newLongSword);
        Swords newScimitarSword = new Swords("Lion Sword", 4, 9, 5, "Sword","Scimitar ");
        swordsArrayList.add(newScimitarSword);


        Character character1 = new Character();
        Healer healer1 = new Healer();
        Tank tank1 = new Tank();
        Fighter fighter1=new Fighter();
        Score score = new Score();
        Enemy enemy2= new Enemy(2);
        enemies.add(enemy2);
        Scanner input = new Scanner(System.in);
        int turn_number = 0;

        // The game's Story
        //Thread.sleep(1000);
        System.out.println("You died. You died miserably without accomplishing anything.");
       //Thread.sleep(2500);
        System.out.println("You regret not doing anything, not trying enough, not overcoming your fears.");
       // Thread.sleep(2500);
        System.out.println("You are haunted by regret. You spend your afterlife drowning in lava of penitence.");
      //  Thread.sleep(2500);
        System.out.println("Waiting for your day of reckoning.");
       // Thread.sleep(2500);
        System.out.println("You wait,wait,wait.....");
       // Thread.sleep(4000);
        System.out.println("You waited for eternity. You no longer remember your past life " +
                "\nThere is only misery, regret, bitterness,wrath........");
       // Thread.sleep(3000);
        System.out.println("You sit still and wait. Wait for another eternity. The day will come eventually....");
      //  Thread.sleep(4000);
        System.out.println("WELCOME TO THE CANNON FODDER!!!");
     //   Thread.sleep(4000);
        System.out.println("The player listen carefully.\nYou are given an another chance. You were so miserable that " +
                "THE GODS TOOK PITY ON YOU.");
     //   Thread.sleep(4000);
        System.out.println("You will be facing countless enemy and try to gain kill points");
      //  Thread.sleep(3000);
        System.out.println("If you collect the needed kill points before you die you will have another chance in life");
      //  Thread.sleep(3000);
        System.out.println("You will be reborn and another life. You will get everything you wanted");
      //  Thread.sleep(3000);
        System.out.println("In this game, EVERY WAY IS FAIR.");
    //    Thread.sleep(3000);
        System.out.println("Now stop tormenting yourself and start killing for your sake.\n");
       // Thread.sleep(3000);
        System.out.println("MAY THE GODS BE WITH YOU.");
        //End of Game's Story



        System.out.println("Now you are Creating your team\nYou have three characters: \n1)Healer\n2)Tank\n3)Fighter");

        System.out.println("Enter your Healer's name");
        String temp1Name = input.next();
        healer1.setName(temp1Name);
        System.out.println("Enter your healer's gender(man or woman):");
        String gender1 = input.next();
        if (gender1.equals("Man") || gender1.equals("man") || gender1.equals("m") || gender1.equals("M")) {
            gender1 = "Man";
        } else if (gender1.equals("Woman") || gender1.equals("woman") || gender1.equals("w") || gender1.equals("W")) {
            gender1 = "Woman";
        } else
            throw new Exception("Invalid gender");
        healer1.setGender(gender1);
        healer1.DisplayInfo();

        //************************************************
        System.out.println("Enter your Fighter's name");
        String temp2Name = input.next();
        character1.setName(temp2Name);
        System.out.println("Enter your Fighter's gender(man or woman):");
        String gender2 = input.next();
        if (gender2.equals("Man") || gender2.equals("man") || gender2.equals("m") || gender2.equals("M")) {
            gender2 = "Man";
        } else if (gender2.equals("Woman") || gender2.equals("woman") || gender2.equals("w") || gender2.equals("W")) {
            gender2 = "Woman";
        } else
            throw new Exception("Invalid gender");
        fighter1.setGender(gender2);
        fighter1.DisplayInfo();

        //********************************************

        System.out.println("Enter your Tank's name");
        String temp3Name = input.next();
        tank1.setName(temp3Name);
        System.out.println("Enter your healer's gender(man or woman):");
        String gender3 = input.next();
        if (gender3.equals("Man") || gender3.equals("man") || gender3.equals("m") || gender3.equals("M")) {
            gender3 = "Man";
        } else if (gender3.equals("Woman") || gender3.equals("woman") || gender3.equals("w") || gender3.equals("W")) {
            gender3 = "Woman";
        } else
            throw new Exception("Invalid gender");
        tank1.setGender(gender3);
        tank1.DisplayInfo();
        //************************************************

        int shieldsCounter = 0;
        int wandsCounter = 0;
        int swordsCounter=0;
        int armorCounter = 0;

        CreateLevel();

        SecureRandom ran = new SecureRandom();
        character1.Wield(newLongSword);



            System.out.println("your total score is: " + score.getValue());
            fighter1.Wield(newLongSword);








        int givenDamage=75;
        EXTRA:
        while (true) {
            Menus.displayMenu();
            int firstDec = input.nextInt();
            if (firstDec == 1) {
                if (shieldsInventory.size() != 0 || wandsInventory.size() != 0|| swordsInventory.size()  !=0 ) {
                    System.out.println("\t***INVENTORY***");
                    int total = 1, armor = 0, shield=0,wand=0,sword=0;
                    for (Item i :shieldsInventory ) {
                        System.out.println("ID: " + total);
                        i.print();
                        total++;
                        shield++;
                    }
                    for (Item i : wandsInventory) {
                        System.out.println("ID: " + total);
                        i.print();
                        total++;
                        wand++;
                    }
                    for (Item i : swordsInventory) {
                        System.out.println("ID: " + total);
                        i.print();
                        total++;
                        sword++;
                    }
                    for (Item i : armorInventory) {
                        System.out.println("ID: " + total);
                        i.print();
                        total++;
                        armor++;
                    }
                    int health = character1.getHP();
                    Menus.displayInventoryMenu();
                    int inventoryDecision = input.nextInt();
                    if (inventoryDecision == 1) {
                        System.out.println("Which one would you like to wear?(Enter the ID number)");
                        int number = input.nextInt();

                        if (number <= armor) {
                            if (armorCounter == 0) {
                                System.out.println("Now you are wearing " + armorInventory.get(armor).getName());
                                System.out.println("HP: " + armorInventory.get(number - 1).getProtection());
                                health += armorInventory.get(armor).getProtection();
                                character1.setHP(health);
                                System.out.println("Your health have been increased! New health: " + health);


                                wearingArmor.add(armorInventory.get(number - 1));
                                armorInventory.remove(number - 1);
                                armorCounter++;
                            } else {
                                System.out.println("You are already wearing an armor.");
                                System.out.println("Would you like to change it?(Y,N)");
                                char decision = input.next().charAt(0);
                                if (decision == 'Y' || decision == 'y') {
                                    armorInventory.add(wearingArmor.get(0));
                                    health -= wearingArmor.get(0).getProtection();
                                    wearingArmor.remove(0);
                                    wearingArmor.add(armorInventory.get(number - 1));
                                    health += wearingArmor.get(0).getProtection();
                                    character1.setHP(health);
                                    armorInventory.remove(number - 1);
                                }
                            }
                        } else {
                            if (shieldsCounter == 0) {
                                System.out.println("Now you are taking " + shieldsInventory.get(shield - 1).getName());
                                System.out.println("Damage: " + shieldsInventory.get(shield - 1).getDamage());



                                wearingShields.add(shieldsInventory.get(shield - 1));
                                shieldsInventory.remove(shield - 1);
                                givenDamage += wearingShields.get(0).getDamage();
                                shieldsCounter++;
                                character1.setDamage(givenDamage);
                            } else {
                                System.out.println("You are already using a weapon");
                                System.out.println("Would you like to change it?(Y,N)");
                                char decision = input.next().charAt(0);
                                if (decision == 'Y' || decision == 'y') {
                                    shieldsInventory.add(wearingShields.get(0));
                                    givenDamage -= wearingShields.get(0).getDamage();
                                    wearingShields.remove(0);
                                    wearingShields.add(shieldsInventory.get(shield));
                                    givenDamage += wearingShields.get(0).getDamage();
                                    shieldsInventory.remove(number - 1);
                                    character1.setDamage(givenDamage);
                                }
                            }
                            if (swordsCounter == 0) {
                                System.out.println("Now you are taking " + swordsInventory.get(number - 1).getName());
                                System.out.println("Damage: " + swordsInventory.get(number - 1).getDamage());



                                wearingSword.add(swordsInventory.get(number));
                                swordsInventory.remove(number - 1 );
                                givenDamage += wearingSword.get(0).getDamage();
                                swordsCounter++;
                                character1.setDamage(givenDamage);
                            } else {
                                System.out.println("You are already using a weapon");
                                System.out.println("Would you like to change it?(Y,N)");
                                char decision = input.next().charAt(0);
                                if (decision == 'Y' || decision == 'y') {
                                  character1.dropItem();// BURAYA BAK
                                }
                            }
                            if (wandsCounter == 0) {
                                System.out.println("Now you are taking " + wandsInventory.get(number - 1).getName());
                                System.out.println("Damage: " + wandsInventory.get(number - 1).getDamage());



                                wearingWands.add(wandsInventory.get(number - 1));
                                wandsInventory.remove(number - 1);
                                givenDamage+= wearingWands.get(0).getDamage();
                                wandsCounter++;
                                character1.setDamage(givenDamage);
                            } else {
                                System.out.println("You are already using a weapon");
                                System.out.println("Would you like to change it?(Y,N)");
                                char decision = input.next().charAt(0);
                                if (decision == 'Y' || decision == 'y') {
                                    wandsInventory.add(wearingWands.get(0));
                                    givenDamage -= wearingWands.get(0).getDamage();
                                    wearingWands.remove(0);
                                    wearingWands.add(wandsInventory.get(number - 1));
                                    givenDamage += wearingWands.get(0).getDamage();
                                    wandsInventory.remove(number - 1);
                                    character1.setDamage(givenDamage);
                                }
                            }

                        }

                    } else if (inventoryDecision == 2) {
                        System.out.println("Which item would you like to drop?(Enter the ID number)");
                        int number = input.nextInt();
                        if (number <= armor) {
                            System.out.println("You have dropped: " + armorInventory.get(number - 1).getName());
                            character1.setWeight(character1.getWeight()-armorInventory.get(number - 1).getWeight());
                            score.setValue(score.getValue()-armorInventory.get(number - 1).getValue());

                            armorInventory.remove(number - 1);
                        } if(number<= shield){
                            System.out.println("You have dropped: " + shieldsInventory.get(number  - 1).getName());
                            character1.setWeight(character1.getWeight()-shieldsInventory.get(number  - 1).getWeight());
                            score.setValue(score.getValue()-shieldsInventory.get(number - 1).getValue());

                            shieldsInventory.remove(number  - 1);
                        }
                        if(number<= wand){
                            System.out.println("You have dropped: " + wandsInventory.get(number - 1).getName());
                            character1.setWeight(character1.getWeight()-wandsInventory.get(number  - 1).getWeight());
                            score.setValue(score.getValue()-wandsInventory.get(number  - 1).getValue());

                            wandsInventory.remove(number  - 1);
                        }if(number<= sword){
                            System.out.println("You have dropped: " + swordsInventory.get(number  - 1).getName());
                            character1.setWeight(character1.getWeight()-swordsInventory.get(number  - 1).getWeight());
                            score.setValue(score.getValue()-swordsInventory.get(number - 1).getValue());

                            swordsInventory.remove(number  - 1);
                        }
                    } else if (inventoryDecision == 3) {
                        continue;
                    } else
                        throw new Exception("Invalid number");

                } else

                    System.out.println("Your inventory has no item");
            } else if (firstDec == 2) {
                int wear = 0, total = 1;
                if (wearingShields.size() != 0 || wearingSword.size() != 0|| wearingWands.size() != 0) {
                    System.out.println("*-*-*-*-*-*-*-*-*-*");
                    System.out.println("\t***WEARING***");
                    for (Shields s : wearingShields) {
                        System.out.println("ID: " + total);
                        s.print();
                        total++;
                        wear++;

                    }
                    for (Swords sw : wearingSword) {
                        System.out.println("ID: " + total);
                        sw.print();
                        total++;
                    }
                    for (Wands  w : wearingWands) {
                        System.out.println("ID: " + total);
                        w.print();
                        total++;
                    }

                }


            } else if (firstDec == 2) {
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");

                if (wearingWands.size() != 0) {
                    System.out.println("\t***Your armor is: " + wearingWands.get(0).getName());

                }
                if (wearingSword.size() != 0) {
                    System.out.println("\t***Your shield is: " + wearingSword.get(0).getName());
                }
                if (wearingShields.size() != 0) {
                    System.out.println("\t***Your shield is: " + wearingShields.get(0).getName());
                }
                System.out.println("\t***Your health is " + character1.getHP() + "HP");
                System.out.println("\t***Total Score: " + score.getValue());
                System.out.println("\t***Total weight: " + character1.getWeight());
            } else if (firstDec == 3) {
                break EXTRA;// runladıktan sonra 3 ü seçinde döngüden breakliyor ama daha tam editlemediğimiz için healer's special
                //action geliyor onu da düzeltmek lazım
            } else
                throw new Exception("Invalid value");
        }


    }
    // turn sayısını count etme
    public static int turnCount(int turn) {
        if (turn < 2) {
            turn++;
        } else {
            turn = 0;
        }
        return turn;
    }

}
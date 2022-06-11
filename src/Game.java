import java.lang.invoke.SwitchPoint;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {

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

        ArrayList<Enemy> enemies = new ArrayList<>(); // enemylerin arraylisti
        ArrayList<Character> myTeam = new ArrayList<>();

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




        Healer healer1 = new Healer();
        Tank tank1 = new Tank();
        Fighter fighter1 = new Fighter();
        Score score = new Score();
        Scanner input = new Scanner(System.in);
        int turn_number = 0;
        fighter1.Wield(newLongSword);
        healer1.Wield(newBoneWand);
        tank1.Wield(newTowerShield);

        //The game's Story
        Thread.sleep(1000);
        System.out.println("You died. You died miserably without accomplishing anything.");
        Thread.sleep(2500);
        System.out.println("You regret not doing anything, not trying enough, not overcoming your fears.");
        Thread.sleep(2500);
        System.out.println("You are haunted by regret. You spend your afterlife drowning in lava of penitence.");
        Thread.sleep(2500);
        System.out.println("Waiting for your day of reckoning.");
        Thread.sleep(2500);
        System.out.println("You wait,wait,wait.....");
        Thread.sleep(4000);
        System.out.println("You waited for eternity. You no longer remember your past life " +
                "\nThere is only misery, regret, bitterness,wrath........");
         Thread.sleep(3000);
        System.out.println("You sit still and wait. Wait for another eternity. The day will come eventually....");
         Thread.sleep(4000);
        System.out.println("WELCOME TO THE CANNON FODDER!!!");
         Thread.sleep(4000);
        System.out.println("The player listen carefully.\nYou are given an another chance. You were so miserable that " +
                "THE GODS TOOK PITY ON YOU.");
         Thread.sleep(4000);
        System.out.println("You will be facing countless enemy and try to gain kill points");
         Thread.sleep(3000);
        System.out.println("If you collect the needed kill points before you die you will have another chance in life");
        Thread.sleep(3000);
        System.out.println("You will be reborn and another life. You will get everything you wanted");
         Thread.sleep(3000);
        System.out.println("In this game, EVERY WAY IS FAIR.");
         Thread.sleep(3000);
        System.out.println("Now stop tormenting yourself and start killing for your sake.\n");
        Thread.sleep(3000);
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
        healer1.DisplayInfo();
        System.out.println("Healer's gender is : " + gender1);
        System.out.println("******************************************");

        System.out.println("Enter your Fighter's name");
        String temp2Name = input.next();
        fighter1.setName(temp2Name);
        System.out.println("Enter your Fighter's gender(man or woman):");
        String gender2 = input.next();
        if (gender2.equals("Man") || gender2.equals("man") || gender2.equals("m") || gender2.equals("M")) {
            gender2 = "Man";
        } else if (gender2.equals("Woman") || gender2.equals("woman") || gender2.equals("w") || gender2.equals("W")) {
            gender2 = "Woman";
        } else
            throw new Exception("Invalid gender");
        fighter1.DisplayInfo();
        System.out.println("Fighter's gender is  : " + gender2);
        System.out.println("******************************************");


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
        tank1.DisplayInfo();
        System.out.println("Tank's gender is : " + gender3);
        System.out.println("******************************************");

        myTeam.add(fighter1);
        myTeam.add(tank1);
        myTeam.add(healer1);


        int shieldsCounter = 0;
        int wandsCounter = 0;
        int swordsCounter = 0;
        int armorCounter = 0;

        Boolean gameFlag = true;
        SecureRandom ran = new SecureRandom();
        while (gameFlag) {
            System.out.println("Welcome to the main menu");
            Menus.mainMenu();
            int c = input.nextInt();
            int u = 0;


            if (c > 3 || c < 0) {
                System.out.println("That's not an option, please use 1, 2 or 3");
            } else
                switch (c) {
                    case 1:

                        while (u == 0) {
                            if (myTeam.size() > 0) {

                                Enemy enemy = new Enemy(1);
                                enemies.add(enemy);
                                for (int i = 0; i < Math.pow(2, level); i++) {
                                    enemies.add(new Enemy(i));
                                    enemies.get(i).isStunned=false;
                                }
                                enemies.remove(0);

                                System.out.println("*****************                The level is now : " + level + "           ***************************************");
                                System.out.println("In this level you will encounter " + Math.pow(2, level) + " enemies");
                                if (enemies.size() >= 0){
                                    int z=0;
                                    while(z==0){
                                        int b = 0;
                                        fighter1.isInTheGame=true;

                                        while (b < 3) {
                                            if(fighter1.HP<=0){
                                                myTeam.remove(fighter1);
                                            }
                                            if(tank1.HP<=0){
                                                myTeam.remove(tank1);
                                            }
                                            if(healer1.HP<=0){
                                                myTeam.remove(healer1);
                                            }
                                            if(myTeam.size()!=0){

                                                if(enemies.size()>0){
                                                    System.out.println("With which character you want play? Choose(fighter/ healer/tank)  ");
                                                    String chosen = input.next();
                                                    switch (chosen) {
                                                        case "fighter":
                                                            if(fighter1.isDead==false){
                                                                if(fighter1.isInTheGame==true) {
                                                                    System.out.println("You are playing with fighter");
                                                                    Menus.actionMenu();
                                                                    int a1 = input.nextInt();
                                                                    switch (a1) {
                                                                        case 1:
                                                                            String choice;
                                                                            System.out.println("Do you want to attack or use special attack of your weapon");
                                                                            System.out.println("For special--> write the code special" +
                                                                                    "\nFor attack regular--> write the code regular");
                                                                            choice = input.next();
                                                                            if (choice.equals("regular")) {
                                                                                for(int p=1;p<=enemies.size();p++){
                                                                                    System.out.println(p);
                                                                                }
                                                                                System.out.println("Please select one of number stated in upper to attack that enemy");
                                                                                int enemyNumber = input.nextInt();
                                                                                for (int o = 0; o < enemies.indexOf(enemyNumber - 1); o++) {
                                                                                    if (o == enemies.indexOf(enemyNumber - 1)) {
                                                                                        break;
                                                                                    }

                                                                                }
                                                                                fighter1.Attack(enemies.get(enemyNumber - 1));
                                                                                b++;
                                                                                if (enemies.get(enemyNumber - 1).getHP() <= 0) {
                                                                                    enemies.remove(enemyNumber - 1);
                                                                                    if (enemies.size() <= 0) {
                                                                                        b=4;
                                                                                        z++;
                                                                                        level++;
                                                                                        break;
                                                                                        //LEVELE GEÇMESİ LAZIM
                                                                                    }
                                                                                    int shieldsDropChance = 50;
                                                                                    int wandsDropChance = 50;
                                                                                    int swordsDropChance = 50;
                                                                                    int possibilityShields = (int) (Math.random() * (shieldsArrayList.size()));
                                                                                    int possibilitySwords = (int) (Math.random() * (swordsArrayList.size()));
                                                                                    int possibilityWands = (int) (Math.random() * (wandsArrayList.size()));
                                                                                    int x = 0;
                                                                                    while (x == 0) {

                                                                                        if (ran.nextInt(100) < shieldsDropChance) {
                                                                                            shieldsCounter = 1;
                                                                                            x++;
                                                                                            System.out.println("Enemy has dropped " + shieldsArrayList.get(possibilityShields).getName());
                                                                                            System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                            char decision = input.next().charAt(0);
                                                                                            if (decision == 'Y' || decision == 'y') {
                                                                                                shieldsInventory.add(shieldsArrayList.get(possibilityShields));
                                                                                                fighter1.setWeight(fighter1.getWeight() + shieldsArrayList.get(possibilityShields).getWeight());
                                                                                                if (fighter1.getWeight() < 10) {
                                                                                                    b++;
                                                                                                    System.out.println("You've added the shield to your inventory...");
                                                                                                    score.setValue(score.getValue() + (shieldsArrayList.get(possibilityShields).getValue() * 10));
                                                                                                    System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                                } else {
                                                                                                    System.out.println("You cannot have item more than 10 pounds");
                                                                                                    shieldsInventory.remove(shieldsArrayList.get(possibilityShields));
                                                                                                    fighter1.setWeight(fighter1.getWeight() - shieldsArrayList.get(possibilityShields).getWeight());
                                                                                                }
                                                                                            }

                                                                                        } else if (ran.nextInt(100) < wandsDropChance) {
                                                                                            wandsCounter = 1;
                                                                                            x++;
                                                                                            System.out.println("Enemy has dropped " + wandsArrayList.get(possibilityWands).getName());

                                                                                            System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                            char decision = input.next().charAt(0);
                                                                                            if (decision == 'Y' || decision == 'y') {
                                                                                                wandsInventory.add(wandsArrayList.get(possibilityWands));
                                                                                                fighter1.setWeight(fighter1.getWeight() + wandsArrayList.get(possibilityWands).getWeight());
                                                                                                if (fighter1.getWeight() < 10) {
                                                                                                    b++;
                                                                                                    System.out.println("You've added the Wand to your inventory...");
                                                                                                    score.setValue(score.getValue() + (wandsArrayList.get(possibilityWands).getValue() * 10));
                                                                                                    System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                                } else {
                                                                                                    System.out.println("You cannot have item more than 10 pounds");
                                                                                                    wandsInventory.remove(wandsArrayList.get(possibilityWands));
                                                                                                    fighter1.setWeight(fighter1.getWeight() - wandsArrayList.get(possibilityWands).getWeight());
                                                                                                }
                                                                                            }
                                                                                        } else if (ran.nextInt(100) < swordsDropChance) {
                                                                                            swordsCounter = 1;
                                                                                            x++;
                                                                                            System.out.println("Enemy has dropped " + swordsArrayList.get(possibilitySwords).getName());
                                                                                            System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                            char decision = input.next().charAt(0);
                                                                                            if (decision == 'Y' || decision == 'y') {
                                                                                                swordsInventory.add(swordsArrayList.get(possibilitySwords));
                                                                                                fighter1.setWeight(fighter1.getWeight() + swordsArrayList.get(possibilitySwords).getWeight());
                                                                                                if (fighter1.getWeight() < 10) {
                                                                                                    b++;
                                                                                                    System.out.println("You've added the sword to your inventory...");
                                                                                                    score.setValue(score.getValue() + (swordsArrayList.get(possibilitySwords).getValue() * 10));
                                                                                                    System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                                } else {
                                                                                                    System.out.println("You cannot have item more than 10 kilo");
                                                                                                    swordsInventory.remove(swordsArrayList.get(possibilitySwords));
                                                                                                    fighter1.setWeight(fighter1.getWeight() - swordsArrayList.get(possibilitySwords).getWeight());
                                                                                                }
                                                                                            }

                                                                                        } else {
                                                                                            System.out.println("The enemy didn't dropped anything...");
                                                                                            x++;





                                                                                        }

                                                                                    }




                                                                                } else {
                                                                                    System.out.println("Enemy have " + enemies.get(enemyNumber - 1).getHP() + " HP left");
                                                                                }
                                                                                break;


                                                                            }
                                                                            else {
                                                                                System.out.println("You are using the special action");

                                                                                fighter1.specialAction(fighter1);
                                                                                b++;
                                                                            }
                                                                            break;
                                                                        case 3:
                                                                            int givenDamage = 75;//DÜZENLENECEEEEEEEEEEKKKKK
                                                                            EXTRA:
                                                                            while (true) {
                                                                                Menus.displayMenu();
                                                                                int firstDec = input.nextInt();
                                                                                if (firstDec == 1) {
                                                                                    if (shieldsInventory.size() != 0 || wandsInventory.size() != 0 || swordsInventory.size() != 0) {
                                                                                        System.out.println("\t*INVENTORY*");
                                                                                        int total = 1, armor = 0, shield = 0, wand = 0, sword = 0;
                                                                                        for (Item v : shieldsInventory) {
                                                                                            System.out.println("ID: " + total);
                                                                                            v.print();
                                                                                            total++;
                                                                                            shield++;
                                                                                        }
                                                                                        for (Item v : wandsInventory) {
                                                                                            System.out.println("ID: " + total);
                                                                                            v.print();
                                                                                            total++;
                                                                                            wand++;
                                                                                        }
                                                                                        for (Item v : swordsInventory) {
                                                                                            System.out.println("ID: " + total);
                                                                                            v.print();
                                                                                            total++;
                                                                                            sword++;
                                                                                        }
                                                                                        for (Item v : armorInventory) {
                                                                                            System.out.println("ID: " + total);
                                                                                            v.print();
                                                                                            total++;
                                                                                            armor++;
                                                                                        }
                                                                                        int health = fighter1.getHP();
                                                                                        Menus.displayInventoryMenu();
                                                                                        int inventoryDecision = input.nextInt();
                                                                                        if (inventoryDecision == 1) {
                                                                                            System.out.println("Which one would you like to wear?(Enter the ID number)");
                                                                                            int number = input.nextInt();

                                                                                            if (number <= armor) {


                                                                                                System.out.println("Now you are wearing " + armorInventory.get(number - 1).getName());
                                                                                                System.out.println("HP: " + armorInventory.get(number - 1).getProtection());
                                                                                                health += armorInventory.get(number - 1).getProtection();
                                                                                                fighter1.setHP(health);
                                                                                                System.out.println("Your health have been increased! New health: " + health);


                                                                                                wearingArmor.add(armorInventory.get(number - 1));
                                                                                                fighter1.Pick(fighter1.clothingOnTheChar[0]);
                                                                                                System.out.println("Your previous item is added to the inventory");
                                                                                                fighter1.Wear(armorInventory.get(number - 1));
                                                                                                armorInventory.remove(number - 1);
                                                                                                armorCounter++;

                                                                                            } else {
                                                                                                if (shieldsCounter != 0) {////buraya giriyor sürekli

                                                                                                    System.out.println("Now you are taking " + shieldsInventory.get(number - 1).getName());
                                                                                                    System.out.println("Damage: " + shieldsInventory.get(number - 1).getDamage());
                                                                                                    fighter1.Pick(fighter1.weaponOnHand[0]);
                                                                                                    System.out.println("******");
                                                                                                    fighter1.Wield(shieldsInventory.get(number - 1));
                                                                                                    System.out.println("-------------");
                                                                                                    wearingShields.add(shieldsInventory.get(number - 1));
                                                                                                    shieldsInventory.remove(number - 1);
                                                                                                    System.out.println("Your previous weapon added to inventory ");


                                                                                                    givenDamage += wearingShields.get(0).getDamage();
                                                                                                    shieldsCounter++;
                                                                                                    fighter1.setDamage(givenDamage);
                                                                                                    break;
                                                                                                }

                                                                                                if (swordsCounter != 0) {
                                                                                                    System.out.println("Now you are taking " + swordsInventory.get(number - 1).getName());
                                                                                                    System.out.println("Damage: " + swordsInventory.get(number-1).getDamage());

                                                                                                    fighter1.Pick(fighter1.weaponOnHand[0]);
                                                                                                    System.out.println("Your previous weapon added to inventory ");
                                                                                                    fighter1.Wield(swordsInventory.get(number-1));


                                                                                                    wearingSword.add(swordsInventory.get(number - 1));
                                                                                                    swordsInventory.remove(number - 1);
                                                                                                    givenDamage += wearingSword.get(0).getDamage();
                                                                                                    swordsCounter++;
                                                                                                    fighter1.setDamage(givenDamage);
                                                                                                    break;
                                                                                                }

                                                                                                if (wandsCounter != 0) {
                                                                                                    System.out.println("Now you are taking " + wandsInventory.get(number - 1).getName());
                                                                                                    System.out.println("Damage: " + wandsInventory.get(number-1).getDamage());

                                                                                                    fighter1.Pick(fighter1.weaponOnHand[0]);
                                                                                                    System.out.println("Your previous weapon added to inventory ");
                                                                                                    fighter1.Wield(wandsInventory.get(number - 1));


                                                                                                    wearingWands.add(wandsInventory.get(number - 1));
                                                                                                    wandsInventory.remove(number-1);
                                                                                                    givenDamage += wearingWands.get(0).getDamage();
                                                                                                    wandsCounter++;
                                                                                                    fighter1.setDamage(givenDamage);
                                                                                                    break;
                                                                                                }

                                                                                            }

                                                                                        } else if (inventoryDecision == 2) {
                                                                                            System.out.println("Which item would you like to drop?(Enter the ID number)");
                                                                                            int number = input.nextInt();
                                                                                            if (number <= armor) {
                                                                                                System.out.println("You have dropped: " + armorInventory.get(number - 1).getName());
                                                                                                fighter1.setWeight(fighter1.getWeight() - armorInventory.get(number - 1).getWeight());
                                                                                                score.setValue(score.getValue() - armorInventory.get(number - 1).getValue());
                                                                                                fighter1.dropItem(armorInventory.get(number - 1));

                                                                                                armorInventory.remove(number - 1);
                                                                                            }
                                                                                            if (number <= shield) {
                                                                                                System.out.println("You have dropped: " + shieldsInventory.get(number - 1).getName());
                                                                                                fighter1.setWeight(fighter1.getWeight() - shieldsInventory.get(number - 1).getWeight());
                                                                                                score.setValue(score.getValue() - shieldsInventory.get(number - 1).getValue());
                                                                                                fighter1.dropItem(shieldsInventory.get(number - 1));
                                                                                                shieldsInventory.remove(number - 1);
                                                                                            }
                                                                                            if (number <= wand) {
                                                                                                System.out.println("You have dropped: " + wandsInventory.get(number - 1).getName());
                                                                                                fighter1.setWeight(fighter1.getWeight() - wandsInventory.get(number - 1).getWeight());
                                                                                                score.setValue(score.getValue() - wandsInventory.get(number - 1).getValue());
                                                                                                fighter1.dropItem(wandsInventory.get(number - 1));
                                                                                                wandsInventory.remove(number - 1);
                                                                                            }
                                                                                            if (number <= sword) {
                                                                                                System.out.println("You have dropped: " + swordsInventory.get(number - 1).getName());
                                                                                                fighter1.setWeight(fighter1.getWeight() - swordsInventory.get(number - 1).getWeight());
                                                                                                score.setValue(score.getValue() - swordsInventory.get(number - 1).getValue());
                                                                                                fighter1.dropItem(swordsInventory.get(number - 1));
                                                                                                swordsInventory.remove(number - 1);
                                                                                            }
                                                                                        } else if (inventoryDecision == 3) {
                                                                                            continue;
                                                                                        } else
                                                                                            throw new Exception("Invalid number");

                                                                                    } else

                                                                                        System.out.println("Your inventory has no item");
                                                                                } else if (firstDec == 2) {
                                                                                    int wear = 0, total = 1;
                                                                                    if (wearingShields.size() != 0 || wearingSword.size() != 0 || wearingWands.size() != 0) {
                                                                                        System.out.println("---------");
                                                                                        System.out.println("\t*WEARING*");
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
                                                                                        for (Wands w : wearingWands) {
                                                                                            System.out.println("ID: " + total);
                                                                                            w.print();
                                                                                            total++;
                                                                                        }

                                                                                    }


                                                                                } else if (firstDec == 2) {
                                                                                    System.out.println("-----------");

                                                                                    if (wearingWands.size() != 0) {
                                                                                        System.out.println("\t***Your armor is: " + wearingWands.get(0).getName());

                                                                                    }
                                                                                    if (wearingSword.size() != 0) {
                                                                                        System.out.println("\t***Your shield is: " + wearingSword.get(0).getName());
                                                                                    }
                                                                                    if (wearingShields.size() != 0) {
                                                                                        System.out.println("\t***Your shield is: " + wearingShields.get(0).getName());
                                                                                    }
                                                                                    System.out.println("\t***Your health is " + fighter1.getHP() + "HP");
                                                                                    System.out.println("\t***Total Score: " + score.getValue());
                                                                                    System.out.println("\t***Total weight: " + fighter1.getWeight());
                                                                                } else if (firstDec == 3) {
                                                                                    break EXTRA;// runladıktan sonra 3 ü seçinde döngüden breakliyor ama daha tam editlemediğimiz için healer's special
                                                                                    //action geliyor onu da düzeltmek lazım
                                                                                } else
                                                                                    throw new Exception("Invalid value");
                                                                            }

                                                                            break;
                                                                    }

                                                                    break;
                                                                }
                                                                else{
                                                                    System.out.println("Your character is in the meditation and you cant play right now");
                                                                    break;
                                                                }
                                                            }
                                                            else{
                                                                System.out.println("Fighter is dead,choose another character!");}
                                                            break;
                                                        case "tank":
                                                            if(tank1.isDead==false){
                                                                System.out.println("You are playing with Tank");
                                                                Menus.actionMenu();
                                                                int a2 = input.nextInt();
                                                                switch (a2) {
                                                                    case 1:String choice;
                                                                        System.out.println("Do you want to attack or use special attack of your weapon");
                                                                        System.out.println("For special--> write the code special" +
                                                                                "\nFor attack regular--> write the code regular");
                                                                        choice = input.next();
                                                                        if (choice.equals("regular")) {
                                                                            System.out.println("Please type their number (like 1)");
                                                                            int enemyNumber = input.nextInt();
                                                                            for (int q = 0; q < enemies.indexOf(enemyNumber - 1); q++) {
                                                                                if (q == enemies.indexOf(enemyNumber - 1)) {
                                                                                    break;
                                                                                }

                                                                            }
                                                                            tank1.Attack(enemies.get(enemyNumber - 1));
                                                                            b++;
                                                                            if (enemies.get(enemyNumber - 1).getHP() < 0) {
                                                                                enemies.remove(enemyNumber - 1);

                                                                                if (enemies.size() <= 0) {
                                                                                    b=4;
                                                                                    z++;
                                                                                    level++;
                                                                                    break;
                                                                                    //LEVELE GEÇMESİ LAZIM
                                                                                }
                                                                                int shieldsDropChance = 50;
                                                                                int wandsDropChance = 50;
                                                                                int swordsDropChance = 50;
                                                                                int possibilityShields = ran.nextInt(shieldsArrayList.size());
                                                                                int possibilitySwords = ran.nextInt(swordsArrayList.size());
                                                                                int possibilityWands = ran.nextInt(wandsArrayList.size());
                                                                                int x = 0;
                                                                                while (x == 0) {

                                                                                    if (ran.nextInt(100) < shieldsDropChance) {
                                                                                        shieldsCounter = 1;
                                                                                        x++;
                                                                                        System.out.println("Enemy has dropped " + shieldsArrayList.get(possibilityShields).getName());
                                                                                        System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                        char decision = input.next().charAt(0);
                                                                                        if (decision == 'Y' || decision == 'y') {
                                                                                            shieldsInventory.add(shieldsArrayList.get(possibilityShields));
                                                                                            tank1.setWeight(tank1.getWeight() + shieldsArrayList.get(possibilityShields).getWeight());
                                                                                            if (tank1.getWeight() < 10) {
                                                                                                b++;
                                                                                                System.out.println("You've added the shield to your inventory...");
                                                                                                score.setValue(score.getValue() + (shieldsArrayList.get(possibilityShields).getValue() * 10));
                                                                                                System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                            } else {
                                                                                                System.out.println("You cannot have item more than 10 pounds");
                                                                                                shieldsInventory.remove(shieldsArrayList.get(possibilityShields));
                                                                                                tank1.setWeight(tank1.getWeight() - shieldsArrayList.get(possibilityShields).getWeight());
                                                                                            }
                                                                                        }

                                                                                    } else if (ran.nextInt(100) < wandsDropChance) {
                                                                                        wandsCounter = 1;
                                                                                        x++;
                                                                                        System.out.println("Enemy has dropped " + wandsArrayList.get(possibilityWands).getName());

                                                                                        System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                        char decision = input.next().charAt(0);
                                                                                        if (decision == 'Y' || decision == 'y') {
                                                                                            wandsInventory.add(wandsArrayList.get(possibilityWands));
                                                                                            tank1.setWeight(tank1.getWeight() + wandsArrayList.get(possibilityWands).getWeight());
                                                                                            if (tank1.getWeight() < 10) {
                                                                                                b++;
                                                                                                System.out.println("You've added the Wand to your inventory...");
                                                                                                score.setValue(score.getValue() + (wandsArrayList.get(possibilityWands).getValue() * 10));
                                                                                                System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                            } else {
                                                                                                System.out.println("You cannot have item more than 10 pounds");
                                                                                                wandsInventory.remove(wandsArrayList.get(possibilityWands));
                                                                                                tank1.setWeight(tank1.getWeight() - wandsArrayList.get(possibilityWands).getWeight());
                                                                                            }
                                                                                        }
                                                                                    } else if (ran.nextInt(100) < swordsDropChance) {
                                                                                        swordsCounter = 1;
                                                                                        x++;
                                                                                        System.out.println("Enemy has dropped " + swordsArrayList.get(possibilitySwords).getName());
                                                                                        System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                        char decision = input.next().charAt(0);
                                                                                        if (decision == 'Y' || decision == 'y') {
                                                                                            swordsInventory.add(swordsArrayList.get(possibilitySwords));
                                                                                            tank1.setWeight(tank1.getWeight() + swordsArrayList.get(possibilitySwords).getWeight());
                                                                                            if (tank1.getWeight() < 10) {
                                                                                                b++;
                                                                                                System.out.println("You've added the sword to your inventory...");
                                                                                                score.setValue(score.getValue() + (swordsArrayList.get(possibilitySwords).getValue() * 10));
                                                                                                System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                            } else {
                                                                                                System.out.println("You cannot have item more than 10 kilo");
                                                                                                swordsInventory.remove(swordsArrayList.get(possibilitySwords));
                                                                                                tank1.setWeight(tank1.getWeight() - swordsArrayList.get(possibilitySwords).getWeight());
                                                                                            }
                                                                                        }

                                                                                    } else {
                                                                                        System.out.println("The enemy didn't dropped anything...");
                                                                                        x++;
                                                                                    }


                                                                                }
                                                                            }
                                                                        }
                                                                        else{
                                                                            System.out.println("You are using special action");
                                                                            System.out.println("Please type their number (like 1)");
                                                                            int enemyNumber = input.nextInt();
                                                                            for (int q = 0; q < enemies.indexOf(enemyNumber - 1); q++) {
                                                                                if (q == enemies.indexOf(enemyNumber - 1)) {
                                                                                    break;
                                                                                }

                                                                            }
                                                                            tank1.specialAction(enemies.get(enemyNumber - 1));
                                                                            b++;
                                                                            break;
                                                                        }
                                                                    case 2:
                                                                        System.out.println("Returning menu");
                                                                        break;
                                                                    case 3:
                                                                        int givenDamage = 75;//DÜZENLENECEEEEEEEEEEKKKKK
                                                                        EXTRA:
                                                                        while (true) {
                                                                            Menus.displayMenu();
                                                                            int firstDec = input.nextInt();
                                                                            if (firstDec == 1) {
                                                                                if (shieldsInventory.size() != 0 || wandsInventory.size() != 0 || swordsInventory.size() != 0) {
                                                                                    System.out.println("\t*INVENTORY*");
                                                                                    int total = 1, armor = 0, shield = 0, wand = 0, sword = 0;
                                                                                    for (Item v : shieldsInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        shield++;
                                                                                    }
                                                                                    for (Item v : wandsInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        wand++;
                                                                                    }
                                                                                    for (Item v : swordsInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        sword++;
                                                                                    }
                                                                                    for (Item v : armorInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        armor++;
                                                                                    }
                                                                                    int health = tank1.getHP();
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
                                                                                                tank1.setHP(health);
                                                                                                System.out.println("Your health have been increased! New health: " + health);
                                                                                                tank1.Pick(tank1.clothingOnTheChar[0]);
                                                                                                tank1.Wear(armorInventory.get(armor));


                                                                                                wearingArmor.add(armorInventory.get(number - 1));
                                                                                                armorInventory.remove(number - 1);
                                                                                                armorCounter++;
                                                                                            }
                                                                                        } else {
                                                                                            if (shieldsCounter != 0) {
                                                                                                System.out.println("Now you are taking " + shieldsInventory.get(number - 1).getName());
                                                                                                System.out.println("Damage: " + shieldsInventory.get(number - 1).getDamage());


                                                                                                wearingShields.add(shieldsInventory.get(number- 1));
                                                                                                shieldsInventory.remove(number - 1);
                                                                                                givenDamage += wearingShields.get(0).getDamage();
                                                                                                shieldsCounter++;
                                                                                                tank1.setDamage(givenDamage);
                                                                                                tank1.Pick(tank1.weaponOnHand[0]);
                                                                                                tank1.Wield(shieldsInventory.get(number - 1));

                                                                                            }
                                                                                            if (swordsCounter != 0) {
                                                                                                System.out.println("Now you are taking " + swordsInventory.get(number - 1).getName());
                                                                                                System.out.println("Damage: " + swordsInventory.get(number - 1).getDamage());
                                                                                                tank1.Pick(tank1.weaponOnHand[0]);
                                                                                                tank1.Wield(swordsInventory.get(number - 1));


                                                                                                wearingSword.add(swordsInventory.get(number));
                                                                                                swordsInventory.remove(number - 1);
                                                                                                givenDamage += wearingSword.get(0).getDamage();
                                                                                                swordsCounter++;
                                                                                                tank1.setDamage(givenDamage);
                                                                                            }
                                                                                            if (wandsCounter != 0) {
                                                                                                System.out.println("Now you are taking " + wandsInventory.get(number - 1).getName());
                                                                                                System.out.println("Damage: " + wandsInventory.get(number - 1).getDamage());
                                                                                                tank1.Pick(tank1.weaponOnHand[0]);
                                                                                                tank1.Wield(wandsInventory.get(number - 1));


                                                                                                wearingWands.add(wandsInventory.get(number - 1));
                                                                                                wandsInventory.remove(number - 1);
                                                                                                givenDamage += wearingWands.get(0).getDamage();
                                                                                                wandsCounter++;
                                                                                                tank1.setDamage(givenDamage);
                                                                                            }

                                                                                        }

                                                                                    } else if (inventoryDecision == 2) {
                                                                                        System.out.println("Which item would you like to drop?(Enter the ID number)");
                                                                                        int number = input.nextInt();
                                                                                        if (number <= armor) {
                                                                                            System.out.println("You have dropped: " + armorInventory.get(number - 1).getName());
                                                                                            tank1.setWeight(tank1.getWeight() - armorInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - armorInventory.get(number - 1).getValue());
                                                                                            tank1.dropItem(armorInventory.get(number - 1));
                                                                                            armorInventory.remove(number - 1);
                                                                                        }
                                                                                        if (number <= shield) {
                                                                                            System.out.println("You have dropped: " + shieldsInventory.get(number - 1).getName());
                                                                                            tank1.setWeight(tank1.getWeight() - shieldsInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - shieldsInventory.get(number - 1).getValue());
                                                                                            tank1.dropItem(shieldsInventory.get(number - 1));
                                                                                            shieldsInventory.remove(number - 1);
                                                                                        }
                                                                                        if (number <= wand) {
                                                                                            System.out.println("You have dropped: " + wandsInventory.get(number - 1).getName());
                                                                                            tank1.setWeight(tank1.getWeight() - wandsInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - wandsInventory.get(number - 1).getValue());
                                                                                            tank1.dropItem(wandsInventory.get(number - 1));
                                                                                            wandsInventory.remove(number - 1);
                                                                                        }
                                                                                        if (number <= sword) {
                                                                                            System.out.println("You have dropped: " + swordsInventory.get(number - 1).getName());
                                                                                            tank1.setWeight(tank1.getWeight() - swordsInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - swordsInventory.get(number - 1).getValue());
                                                                                            tank1.dropItem(swordsInventory.get(number - 1));
                                                                                            swordsInventory.remove(number - 1);
                                                                                        }
                                                                                    } else if (inventoryDecision == 3) {
                                                                                        continue;
                                                                                    } else
                                                                                        throw new Exception("Invalid number");

                                                                                } else

                                                                                    System.out.println("Your inventory has no item");
                                                                            } else if (firstDec == 2) {
                                                                                int wear = 0, total = 1;
                                                                                if (wearingShields.size() != 0 || wearingSword.size() != 0 || wearingWands.size() != 0) {
                                                                                    System.out.println("---------");
                                                                                    System.out.println("\t*WEARING*");
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
                                                                                    for (Wands w : wearingWands) {
                                                                                        System.out.println("ID: " + total);
                                                                                        w.print();
                                                                                        total++;
                                                                                    }

                                                                                }


                                                                            } else if (firstDec == 2) {
                                                                                System.out.println("-----------");

                                                                                if (wearingWands.size() != 0) {
                                                                                    System.out.println("\t***Your armor is: " + wearingWands.get(0).getName());

                                                                                }
                                                                                if (wearingSword.size() != 0) {
                                                                                    System.out.println("\t***Your shield is: " + wearingSword.get(0).getName());
                                                                                }
                                                                                if (wearingShields.size() != 0) {
                                                                                    System.out.println("\t***Your shield is: " + wearingShields.get(0).getName());
                                                                                }
                                                                                System.out.println("\t***Your health is " + tank1.getHP() + "HP");
                                                                                System.out.println("\t***Total Score: " + score.getValue());
                                                                                System.out.println("\t***Total weight: " + tank1.getWeight());
                                                                            } else if (firstDec == 3) {
                                                                                break EXTRA;// runladıktan sonra 3 ü seçinde döngüden breakliyor ama daha tam editlemediğimiz için healer's special
                                                                                //action geliyor onu da düzeltmek lazım
                                                                            } else
                                                                                throw new Exception("Invalid value");
                                                                        }

                                                                        break;
                                                                }
                                                                break;}
                                                            else{
                                                                System.out.println("Tank is dead, please select another character!!!");
                                                            }
                                                            break;
                                                        case "healer":
                                                            if(healer1.isDead==false){
                                                                System.out.println("You are playing with healer");
                                                                Menus.actionMenu();
                                                                int a3 = input.nextInt();
                                                                switch (a3) {
                                                                    case 1:
                                                                        String choice;
                                                                        System.out.println("Do you want to attack or use special attack of your weapon");
                                                                        System.out.println("For special--> write the code special" +
                                                                                "\nFor attack regular--> write the code regular");
                                                                        choice = input.next();
                                                                        if (choice.equals("regular")){
                                                                            System.out.println("Please type their number (like 1)");
                                                                            healer1.Wield(newBoneWand);
                                                                            int enemyNumber = input.nextInt();
                                                                            for (int h = 0; h < enemies.indexOf(enemyNumber - 1); h++) {
                                                                                if (h == enemies.indexOf(enemyNumber - 1)) {
                                                                                    break;
                                                                                }

                                                                            }
                                                                            healer1.Attack(enemies.get(enemyNumber - 1));
                                                                            b++;
                                                                            if (enemies.get(enemyNumber - 1).getHP() < 0) {
                                                                                enemies.remove(enemyNumber - 1);
                                                                                if (enemies.size() <= 0) {
                                                                                    b=4;
                                                                                    z++;
                                                                                    level++;
                                                                                    break;
                                                                                    //LEVELE GEÇMESİ LAZIM
                                                                                }

                                                                                int shieldsDropChance = 50;
                                                                                int wandsDropChance = 50;
                                                                                int swordsDropChance = 50;
                                                                                int possibilityShields = ran.nextInt(shieldsArrayList.size());
                                                                                int possibilitySwords = ran.nextInt(swordsArrayList.size());
                                                                                int possibilityWands = ran.nextInt(wandsArrayList.size());
                                                                                int x = 0;
                                                                                while (x == 0) {

                                                                                    if (ran.nextInt(100) < shieldsDropChance) {
                                                                                        shieldsCounter = 1;
                                                                                        x++;
                                                                                        System.out.println("Enemy has dropped " + shieldsArrayList.get(possibilityShields).getName());
                                                                                        System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                        char decision = input.next().charAt(0);
                                                                                        if (decision == 'Y' || decision == 'y') {
                                                                                            shieldsInventory.add(shieldsArrayList.get(possibilityShields));
                                                                                            healer1.setWeight(healer1.getWeight() + shieldsArrayList.get(possibilityShields).getWeight());
                                                                                            if (healer1.getWeight() < 10) {
                                                                                                b++;
                                                                                                System.out.println("You've added the shield to your inventory...");
                                                                                                score.setValue(score.getValue() + (shieldsArrayList.get(possibilityShields).getValue() * 10));
                                                                                                System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                            } else {
                                                                                                System.out.println("You cannot have item more than 10 pounds");
                                                                                                shieldsInventory.remove(shieldsArrayList.get(possibilityShields));
                                                                                                healer1.setWeight(healer1.getWeight() - shieldsArrayList.get(possibilityShields).getWeight());
                                                                                            }
                                                                                        }

                                                                                    } else if (ran.nextInt(100) < wandsDropChance) {
                                                                                        wandsCounter = 1;
                                                                                        x++;
                                                                                        System.out.println("Enemy has dropped " + wandsArrayList.get(possibilityWands).getName());

                                                                                        System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                        char decision = input.next().charAt(0);
                                                                                        if (decision == 'Y' || decision == 'y') {
                                                                                            wandsInventory.add(wandsArrayList.get(possibilityWands));
                                                                                            healer1.setWeight(healer1.getWeight() + wandsArrayList.get(possibilityWands).getWeight());
                                                                                            if (healer1.getWeight() < 10) {
                                                                                                b++;
                                                                                                System.out.println("You've added the Wand to your inventory...");
                                                                                                score.setValue(score.getValue() + (wandsArrayList.get(possibilityWands).getValue() * 10));
                                                                                                System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                            } else {
                                                                                                System.out.println("You cannot have item more than 10 pounds");
                                                                                                wandsInventory.remove(wandsArrayList.get(possibilityWands));
                                                                                                healer1.setWeight(healer1.getWeight() - wandsArrayList.get(possibilityWands).getWeight());
                                                                                            }
                                                                                        }
                                                                                    } else if (ran.nextInt(100) < swordsDropChance) {
                                                                                        swordsCounter = 1;
                                                                                        x++;
                                                                                        System.out.println("Enemy has dropped " + swordsArrayList.get(possibilitySwords).getName());
                                                                                        System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
                                                                                        char decision = input.next().charAt(0);
                                                                                        if (decision == 'Y' || decision == 'y') {
                                                                                            swordsInventory.add(swordsArrayList.get(possibilitySwords));
                                                                                            healer1.setWeight(healer1.getWeight() + swordsArrayList.get(possibilitySwords).getWeight());
                                                                                            if (healer1.getWeight() < 10) {
                                                                                                b++;
                                                                                                System.out.println("You've added the sword to your inventory...");
                                                                                                score.setValue(score.getValue() + (swordsArrayList.get(possibilitySwords).getValue() * 10));
                                                                                                System.out.println("After killed enemy  your score is : " + score.getValue());
                                                                                            } else {
                                                                                                System.out.println("You cannot have item more than 10 kilo");
                                                                                                swordsInventory.remove(swordsArrayList.get(possibilitySwords));
                                                                                                healer1.setWeight(healer1.getWeight() - swordsArrayList.get(possibilitySwords).getWeight());
                                                                                            }
                                                                                        }

                                                                                    } else {
                                                                                        System.out.println("The enemy didn't dropped anything...");
                                                                                        x++;
                                                                                    }


                                                                                }
                                                                            }

                                                                        }
                                                                        else {
                                                                            System.out.println("You are using the speicial action");
                                                                            System.out.println("Select a teammate (1 for fighter,2 for tank,3 for healer)");
                                                                            int SEC = input.nextInt();
                                                                            switch (SEC) {
                                                                                case 1:
                                                                                    healer1.specialAction(fighter1);
                                                                                    System.out.println("Fighter's hp is now : " + fighter1.HP);
                                                                                    break;
                                                                                case 2:
                                                                                    healer1.specialAction(tank1);
                                                                                    System.out.println("Tank's hp is now : " + tank1.getHP());
                                                                                    break;
                                                                                case 3:
                                                                                    healer1.specialAction(healer1);
                                                                                    System.out.println("Healer's hp is now:" + healer1.HP);
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        System.out.println("Returning menu");
                                                                        break;


                                                                    case 3:
                                                                        int givenDamage = 75;//DÜZENLENECEEEEEEEEEEKKKKK
                                                                        EXTRA:
                                                                        while (true) {
                                                                            Menus.displayMenu();
                                                                            int firstDec = input.nextInt();
                                                                            if (firstDec == 1) {
                                                                                if (shieldsInventory.size() != 0 || wandsInventory.size() != 0 || swordsInventory.size() != 0) {
                                                                                    System.out.println("\t*INVENTORY*");
                                                                                    int total = 1, armor = 0, shield = 0, wand = 0, sword = 0;
                                                                                    for (Item v : shieldsInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        shield++;
                                                                                    }
                                                                                    for (Item v : wandsInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        wand++;
                                                                                    }
                                                                                    for (Item v : swordsInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        sword++;
                                                                                    }
                                                                                    for (Item v : armorInventory) {
                                                                                        System.out.println("ID: " + total);
                                                                                        v.print();
                                                                                        total++;
                                                                                        armor++;
                                                                                    }
                                                                                    int health = healer1.getHP();
                                                                                    Menus.displayInventoryMenu();
                                                                                    int inventoryDecision = input.nextInt();
                                                                                    if (inventoryDecision == 1) {
                                                                                        System.out.println("Which one would you like to wear?(Enter the ID number)");
                                                                                        int number = input.nextInt();

                                                                                        if (number <= armor) {
                                                                                            if (armorCounter != 0) {
                                                                                                System.out.println("Now you are wearing " + armorInventory.get(armor).getName());
                                                                                                System.out.println("HP: " + armorInventory.get(number - 1).getProtection());
                                                                                                health += armorInventory.get(armor).getProtection();
                                                                                                healer1.setHP(health);
                                                                                                System.out.println("Your health have been increased! New health: " + health);
                                                                                                healer1.Pick(healer1.clothingOnTheChar[0]);
                                                                                                healer1.Wear(armorInventory.get(armor));
                                                                                                wearingArmor.add(armorInventory.get(number - 1));
                                                                                                armorInventory.remove(number - 1);
                                                                                                armorCounter++;
                                                                                            }
                                                                                        } else {
                                                                                            if (shieldsCounter != 0) {
                                                                                                System.out.println("Now you are taking " + shieldsInventory.get(number - 1).getName());
                                                                                                System.out.println("Damage: " + shieldsInventory.get(number- 1).getDamage());


                                                                                                wearingShields.add(shieldsInventory.get(number - 1));
                                                                                                shieldsInventory.remove(number - 1);
                                                                                                givenDamage += wearingShields.get(0).getDamage();
                                                                                                shieldsCounter++;
                                                                                                healer1.setDamage(givenDamage);
                                                                                                healer1.Pick(healer1.weaponOnHand[0]);
                                                                                                healer1.Wield(shieldsInventory.get(number - 1));
                                                                                            }
                                                                                            if (swordsCounter != 0) {
                                                                                                System.out.println("Now you are taking " + swordsInventory.get(number - 1).getName());
                                                                                                System.out.println("Damage: " + swordsInventory.get(number - 1).getDamage());


                                                                                                wearingSword.add(swordsInventory.get(number));
                                                                                                swordsInventory.remove(number - 1);
                                                                                                givenDamage += wearingSword.get(0).getDamage();
                                                                                                swordsCounter++;
                                                                                                healer1.setDamage(givenDamage);
                                                                                                healer1.Pick(healer1.weaponOnHand[0]);
                                                                                                healer1.Wield(swordsInventory.get(number - 1));
                                                                                            }
                                                                                            if (wandsCounter != 0) {
                                                                                                System.out.println("Now you are taking " + wandsInventory.get(number - 1).getName());
                                                                                                System.out.println("Damage: " + wandsInventory.get(number - 1).getDamage());


                                                                                                wearingWands.add(wandsInventory.get(number - 1));
                                                                                                wandsInventory.remove(number - 1);
                                                                                                givenDamage += wearingWands.get(0).getDamage();
                                                                                                wandsCounter++;
                                                                                                healer1.setDamage(givenDamage);
                                                                                                healer1.Pick(healer1.weaponOnHand[0]);
                                                                                                healer1.Wield(wandsInventory.get(number - 1));
                                                                                            }
                                                                                        }

                                                                                    } else if (inventoryDecision == 2) {
                                                                                        System.out.println("Which item would you like to drop?(Enter the ID number)");
                                                                                        int number = input.nextInt();
                                                                                        if (number <= armor) {
                                                                                            System.out.println("You have dropped: " + armorInventory.get(number - 1).getName());
                                                                                            healer1.setWeight(healer1.getWeight() - armorInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - armorInventory.get(number - 1).getValue());

                                                                                            armorInventory.remove(number - 1);
                                                                                        }
                                                                                        if (number <= shield) {
                                                                                            System.out.println("You have dropped: " + shieldsInventory.get(number - 1).getName());
                                                                                            healer1.setWeight(healer1.getWeight() - shieldsInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - shieldsInventory.get(number - 1).getValue());

                                                                                            shieldsInventory.remove(number - 1);
                                                                                        }
                                                                                        if (number <= wand) {
                                                                                            System.out.println("You have dropped: " + wandsInventory.get(number - 1).getName());
                                                                                            healer1.setWeight(healer1.getWeight() - wandsInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - wandsInventory.get(number - 1).getValue());

                                                                                            wandsInventory.remove(number - 1);
                                                                                        }
                                                                                        if (number <= sword) {
                                                                                            System.out.println("You have dropped: " + swordsInventory.get(number - 1).getName());
                                                                                            healer1.setWeight(healer1.getWeight() - swordsInventory.get(number - 1).getWeight());
                                                                                            score.setValue(score.getValue() - swordsInventory.get(number - 1).getValue());

                                                                                            swordsInventory.remove(number - 1);
                                                                                        }
                                                                                    } else if (inventoryDecision == 3) {
                                                                                        continue;
                                                                                    } else
                                                                                        throw new Exception("Invalid number");

                                                                                } else

                                                                                    System.out.println("Your inventory has no item");
                                                                            } else if (firstDec == 2) {
                                                                                int wear = 0, total = 1;
                                                                                if (wearingShields.size() != 0 || wearingSword.size() != 0 || wearingWands.size() != 0) {
                                                                                    System.out.println("---------");
                                                                                    System.out.println("\t*WEARING*");
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
                                                                                    for (Wands w : wearingWands) {
                                                                                        System.out.println("ID: " + total);
                                                                                        w.print();
                                                                                        total++;
                                                                                    }

                                                                                }


                                                                            } else if (firstDec == 2) {
                                                                                System.out.println("-----------");

                                                                                if (wearingWands.size() != 0) {
                                                                                    System.out.println("\t***Your armor is: " + wearingWands.get(0).getName());

                                                                                }
                                                                                if (wearingSword.size() != 0) {
                                                                                    System.out.println("\t***Your shield is: " + wearingSword.get(0).getName());
                                                                                }
                                                                                if (wearingShields.size() != 0) {
                                                                                    System.out.println("\t***Your shield is: " + wearingShields.get(0).getName());
                                                                                }
                                                                                System.out.println("\t***Your health is " + healer1.getHP() + "HP");
                                                                                System.out.println("\t***Total Score: " + score.getValue());
                                                                                System.out.println("\t***Total weight: " + healer1.getWeight());
                                                                            } else if (firstDec == 3) {
                                                                                break EXTRA;// runladıktan sonra 3 ü seçinde döngüden breakliyor ama daha tam editlemediğimiz için healer's special
                                                                                //action geliyor onu da düzeltmek lazım
                                                                            } else
                                                                                throw new Exception("Invalid value");
                                                                        }

                                                                        break;
                                                                }
                                                                break;


                                                            }
                                                            break;
                                                    }




                                                }
                                                else{
                                                    b=4;
                                                }

                                            }
                                            else{
                                                b=4;
                                                z=1;
                                                u=1;
                                                gameFlag=false;
                                                System.out.println("You failed !");

                                            }
                                            //KARAKTER SIRASI BİTİŞİ
                                            if(enemies.size()>0){
                                                if(tank1.getHP()>0)
                                                {//eğer i<=enemies.size yaparsak 2. levelde vurabiliyor ama hata veriyor.



                                                    System.out.println("Enemy attacked TANK");
                                                    if(enemies.get(0).isStunned()==false){
                                                        enemies.get(0).AttackEnemy(tank1);}
                                                    else
                                                        System.out.println("Enemy is stunned, you dodged");}





                                                else {
                                                    if (fighter1.isInTheGame == true && 0 <= healer1.HP) {

                                                        int enemyRandom = getRandomInRange(1, 2);
                                                        if (enemyRandom == 1) {


                                                            System.out.println("Enemy attacked FIGHTER");
                                                            if (enemies.get(0).isStunned() == false) {
                                                                enemies.get(0).AttackEnemy(fighter1);
                                                            } else
                                                                System.out.println("Enemy is stunned, you dodged ");
                                                        }


                                                        else

                                                            System.out.println("Enemy attacked HEALER");
                                                        if (enemies.get(0).isStunned() == false) {
                                                            enemies.get(0).AttackEnemy(healer1);
                                                        } else
                                                            System.out.println("Enemy is stunned, you dodged");

                                                        break;


                                                    } else if (fighter1.isInTheGame == false && healer1.isDead == true) {
                                                        System.out.println("Enemy Can not attack because you have no characters in board");





                                                    } else {
                                                        System.out.println("Enemy attacked HEALER");
                                                        if (enemies.get(0).isStunned() == false) {
                                                            enemies.get(0).AttackEnemy(healer1);
                                                        } else
                                                            System.out.println("Enemy is stunned, you dodged");



                                                    }


                                                }
                                            }


                                        }
                                    }
                                }



                                else{
                                    level++;
                                    System.out.println("YOU PASSED THE LEVEL !!");
                                }
                            }

                        }
                        break;

                    case 2:
                        Menus.ruleMenu();
                        u++;
                        break;
                    case 3:
                        System.out.println("COWARD !!!");
                        gameFlag = false;
                        break;

                }


        }
        CreateTextFile.calculateEnemies(enemies);
        ReadTextFile.readRecords();

    }


    static int level = 1; // level sayısı
    public static void CreateLevel(){
        ArrayList<Enemy> enemies = new ArrayList<>();

        for (int i = 0; i <= Math.pow(2,level); i++){
            enemies.add(new Enemy(i));
            enemies.get(i).RandomWeapon();
        }
        System.out.println("In this level you will encounter "+Math.pow(2,level)+" enemies");


    }
    public  static void increaseLevel(){
        //a method to increase level, we implemented this metod for the readibility purposes.
        level ++;
        System.out.println("The current level is : "+ level);
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
    public static int getRandomInRange(int min, int max){
        if(min==max){
            Random r = new Random();
            return r.nextInt((max-min)+1)+min;
        }
        else{Random r = new Random();
            return r.nextInt((max-min)+1)+min;}
    }
}

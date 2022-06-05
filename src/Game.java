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
        ArrayList<Swords> swordsArrayList = new ArrayList<>();
        ArrayList<Swords> swordsInventory = new ArrayList<>();
        ArrayList<Score> scores = new ArrayList<>();
        ArrayList<Wands> wearingWands = new ArrayList<>();
        ArrayList<Swords> wearingSword = new ArrayList<>();
        ArrayList<Shields> wearingShields = new ArrayList<>();
        ArrayList<Enemy> enemies; // enemylerin arraylisti

        Wands newBoneWand = new Wands("Sphinx-Bone Wand", 5, 9, 6, 5, "Bone Wand");
        wandsArrayList.add(newBoneWand);
        Wands newWoodWands = new Wands("Chestnut", 6, 4, 7, 6, "Wood Wand");
        wandsArrayList.add(newWoodWands);
        Wands newUnicornWand = new Wands("Malfoy's Wand", 3, 7, 5, 3, "Unicorn Hair Wand");
        wandsArrayList.add(newUnicornWand);


        Shields newBuckler = new Shields("Bubble Shield", 1, 2, 3, "Buckler");
        shieldsArrayList.add(newBuckler);
        Shields newSmallShield = new Shields("Aegis Shield", 2, 4, 4, "Small Shield");
        shieldsArrayList.add(newSmallShield);
        Shields newTowerShield = new Shields("Great Axe", 4, 8, 5, "TowerShield");
        shieldsArrayList.add(newTowerShield);

        Swords newShortSword = new Swords("Scissor DaggerLion Sword", 1, 2, 4, "Short Sword");
        swordsArrayList.add(newShortSword);
        Swords newLongSword = new Swords("Kyanite Sword", 2, 4, 4, "Long Sword");
        swordsArrayList.add(newLongSword);
        Swords newScimitarSword = new Swords("Lion Sword", 4, 9, 5, "Scimitar ");
        swordsArrayList.add(newScimitarSword);

        Fighter fighter1  = new Fighter();

        Character character1 = new Character();
        Enemy enemy1 = new Enemy();
        Healer healer1 = new Healer();
        Tank tank1 = new Tank();

        Score score = new Score();
        Scanner input = new Scanner(System.in);
        int turn_number = 0;


        System.out.println("Welcome to Cannon Fodder !!! \nNow you are Creating your team\nYou have three characters: \n1)Healer\n2)Tank\n3)Fighter");

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
        System.out.println("Your Healer's name is : " + healer1.name);
        System.out.println("Healer's gender is:" + gender1);
        System.out.println("Healer created with " + healer1.HP + " HP! ");
        System.out.println("Healer created with " + healer1.intelligence + " intelligence ");
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
        System.out.println("Your Fighter's name is : " + fighter1.name);
        System.out.println("Fighter's gender is:" + gender2);
        System.out.println("Fighter created with " + fighter1.HP + " HP! ");
        System.out.println("Fighter created with " + fighter1.intelligence + " intelligence ");
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
        System.out.println("Your Tank's name is : " + tank1.name);
        System.out.println("Tank's gender is:" + gender3);
        System.out.println("Tank created with " + tank1.HP + " HP! ");
        System.out.println("Tank created with " + tank1.intelligence + " intelligence ");
        System.out.println("******************************************");
        int shieldsCounter = 0;
        int wandsCounter = 0;


        enemy1.SetEnemy();
        enemy1.increaseLevel();
        SecureRandom ran = new SecureRandom();
        fighter1.Wield(newLongSword);
        fighter1.Attack(fighter1, tank1);
        // enemy  ölünce silah droplama kısmı
        int shieldsDropChance = 50;//50 de sabit ilk %50 düşürme ihtimali var
        int wandsDropChance = 50;
        int swordsDropChance = 50;
        int possibilityShields = ran.nextInt(shieldsArrayList.size());
        int possibilitySwords = ran.nextInt(swordsArrayList.size());
        int possibilityWands = ran.nextInt(wandsArrayList.size());
        while (enemy1.getHP() <= 0)
            System.out.println("your total score is: " + score.getValue());
            System.out.println("enemy is dead");

        if (ran.nextInt(100) < shieldsDropChance) {
            System.out.println("Enemy has dropped " + shieldsArrayList.get(possibilityShields).getName());
            System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
            char decision = input.next().charAt(0);
            if (decision == 'Y' || decision == 'y') {
                shieldsInventory.add(shieldsArrayList.get(possibilityShields));
                fighter1.setWeight(fighter1.getWeight() + shieldsArrayList.get(possibilityShields).getWeight());
                if (fighter1.getWeight() < 10) {
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
            System.out.println("Enemy has dropped " + wandsArrayList.get(possibilityWands).getName());

            System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
            char decision = input.next().charAt(0);
            if (decision == 'Y' || decision == 'y') {
                wandsInventory.add(wandsArrayList.get(possibilityWands));
                fighter1.setWeight(fighter1.getWeight() + wandsArrayList.get(possibilityWands).getWeight());
                if (fighter1.getWeight() < 10) {
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
            System.out.println("Enemy has dropped " + swordsArrayList.get(possibilitySwords).getName());
            System.out.println("Would you like to add that to your inventory?(Y for Yes, N for No)");
            char decision = input.next().charAt(0);
            if (decision == 'Y' || decision == 'y') {
                swordsInventory.add(swordsArrayList.get(possibilitySwords));
                fighter1.setWeight(fighter1.getWeight() + swordsArrayList.get(possibilitySwords).getWeight());
                if (fighter1.getWeight() < 10) {
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
        }

        EXTRA:
        while (true) {
            Menus.displayMenu();
            int firstDec = input.nextInt();
            if (firstDec == 1) {
                if (shieldsInventory.size() != 0 || wandsInventory.size() != 0|| swordsInventory.size()  !=0 ) {
                    System.out.println("\t***INVENTORY***");
                    int total = 1, armor = 0;
                    for (Item i :shieldsInventory ) {
                        System.out.println("ID: " + total);
                        i.print();
                        total++;
                        armor++;
                    }
                    for (Item i : wandsInventory) {
                        System.out.println("ID: " + total);
                        i.print();
                        total++;
                    }
                    for (Item i : swordsInventory) {
                        System.out.println("ID: " + total);
                        i.print();
                        total++;
                    }

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
                System.out.println("\t***Your health is " + fighter1.getHP() + "HP");
                System.out.println("\t***Total Score: " + score.getValue());
                System.out.println("\t***Total weight: " + fighter1.getWeight());
            } else if (firstDec == 3) {
                break EXTRA;// runladıktan sonra 3 ü seçinde döngüden breakliyor ama daha tam editlemediğimiz için healer's special
                //action geliyor onu da düzeltmek lazım
            } else
                throw new Exception("Invalid value");
        }
        // healers special action kısmı
        System.out.println("Healer's special action is healing teammates. Please select the teammate you want to give heal to.");
        System.out.println("1 - Fighter \n2 - Tank \n3 - Healer\n4 - Exit ");
        System.out.println("Your tank's HP is " + tank1.getHP());

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                healer1.specialAction(fighter1);
                System.out.println("Fighter's hp is now : " + fighter1.HP);
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
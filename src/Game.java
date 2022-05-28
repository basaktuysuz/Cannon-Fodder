import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Healer healer1 = new Healer();
        Tank tank1 = new Tank();
        Fighter fighter1 = new Fighter();
        Scanner input = new Scanner(System.in);
        ArrayList<Weapons> fighterInventory = new ArrayList<Weapons>();
        int turn_number = 0;

        System.out.println("Welcome to Cannon Fodder !!! \nYou have three characters: \n1)Healer\n2)Tank\n3)Fighter");

        System.out.println("Your Healer's name is : " + healer1.name);
        System.out.println("Healer created with " + healer1.HP + " HP! ");
        System.out.println("Healer created with " + healer1.intelligence + " intelligence ");
        System.out.println("******************************************");
        System.out.println("Your Tank's name is : " + tank1.name);
        System.out.println("Tank created with " + tank1.HP + " HP! ");
        System.out.println("Tank created with " + tank1.intelligence + " intelligence ");
        System.out.println("******************************************");
        System.out.println("Your Fighter's name is : " + fighter1.name);
        System.out.println("Fighter created with " + fighter1.HP + " HP! ");
        System.out.println("Fighter created with " + fighter1.intelligence + " intelligence ");
        System.out.println("******************************************");
        System.out.println("Healer's special action is healing teammates. Please select the teammate you want to give heal to.");
        System.out.println("1 - Fighter \n2 - Tank \n3 - Healer\n4 - Exit ");




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

    public static int turnCount(int turn) {
        if (turn < 2) {
            turn++;
        } else {
            turn = 0;
        }
        return turn;
    }
}

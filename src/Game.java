import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Healer healer1 = new Healer();
        Tank tank1 = new Tank();
        Fighter fighter1 = new Fighter();
        Scanner input = new Scanner(System.in);
        ArrayList<Weapons> fighterInventory = new ArrayList<Weapons>();


        System.out.println("Healer's special action is healing teammates. Please select the teammate you want to give heal to.");
        System.out.println("1 - Fighter \n2 - Tank \n3 - Healer\n4 - Exit ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                healer1.specialAction(fighter1);
                System.out.println("Fighter's hp is now : "+fighter1.HP);
                break;

            case 2:
                healer1.specialAction(tank1);
                System.out.println("Tank's hp is now : "+tank1.HP);

                break;

            case 3:
                healer1.specialAction(healer1);
                System.out.println("Healer's hp is now:"+healer1.HP);
                break;

            case 4:
            default:

        }
    }
}

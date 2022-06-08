public class  Menus {
    public static void displayMenu() {

        System.out.println("-----------");
        System.out.println("\tTOP MENU");
        System.out.println("\t\t1.Inventory");
        System.out.println("\t\t2.Wearing");
        System.out.println("\t\t3.Exit");
        System.out.println("-----------");
    }


    public static void displayInventoryMenu(){
        System.out.println("\t1.Wear or Use\n"+"\t2.Drop\n" +"\t3.Back To Menu");
    }
    public static void actionMenu()
    {
        System.out.println("1 to attack to enemy");
        System.out.println("2  to return player menu");
        System.out.println("Choose action:");
    }
    public void mainMenu(){
        System.out.println("****MENU****");
        System.out.println("1-) Begin Adventure");
        System.out.println("2-) Read the rules");
        System.out.println("3-) Turn Back");
        System.out.println("Select with 1,2 or 3 !");
    }
    public void ruleMenu(){
        System.out.println("RULES : ");
        System.out.println("1-) The dimension let you take an action one time per round ");
        System.out.println("2-) Your objective is clear the path with full of enemies!!!");
        System.out.println("3-) If one of your character die, You cannot bring them back from the eternal fire !!!");
        System.out.println("4-) the special action of characters : ");
        System.out.println(" Healer : Give heal to one of selected teammate");
        System.out.println(" Fighter : Deal massive damage for a round ");
        System.out.println(" Tank : Huge damage reduction for a round ");
        System.out.println("***Rules Over*** ");
    }

}

public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Weapons w1=new Swords("dragon slayer",9,14,31,"allahın kılıcı");
        fighter.Wield(w1);
        w1.display();
        fighter.printInfo();
        fighter.Attack();

        }
}

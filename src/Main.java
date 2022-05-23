public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Weapons w1=new Swords("dragon slayer",9,14,31,"allahın kılıcı");

        w1.display();

        fighter.Attack();

        }
}

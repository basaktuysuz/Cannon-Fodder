public class Swords extends Weapons{

    private String swordType;


    public Swords(String name, int weight, int value, int damage,String itemType, String swordType) {
        super(name, weight, value, damage,itemType);
        this.swordType = swordType;
    }
    public Swords(){
        super();
        setSwordType("null");
    }

    public String getSwordType() {
        return swordType;
    }

    public void setSwordType(String swordType) {
        this.swordType = swordType;
    }

    public void print() {
        super.print();
        System.out.print("Sword: "+getName());
        System.out.println("Extra Damage: " + getDamage());
        System.out.println("*****");
    }

}
public class Swords extends Weapons{

    private String swordType;


    public Swords(String name, int weight, int value, int damage, String swordType) {
        super(name, weight, value, damage);
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


    public static Swords newShortSword() {
        return new Swords("Scissor DaggerLion Sword",1,2,4,"Short Sword");
    }

    public static Swords newLongSword() {
        return new Swords("Kyanite Sword",2,4,4,"Long Sword");
    }

    public static Swords newScimitarSword() {
        return new Swords("Lion Sword",4,9,5,"Scimitar ");
    }
}
public class Shields extends Weapons {

    private String shieldsType;

    public Shields(String name, int weight, int value, int damage, String shieldsType) {
        super(name, weight, value, damage);
        this.shieldsType = shieldsType;
    }
    public Shields(){
        super();
        shieldsType=null;
    }

    public String getShieldsType() {
        return shieldsType;
    }

    public void setShieldsType(String shieldsType) {
        this.shieldsType = shieldsType;
    }


    public static Shields newBuckler() {
        return new Shields("Bubble Shield", 1, 2, 3, "Buckler");
    }

    public static Shields newSmallShield() {
        return new Shields("Aegis Shield", 2, 4, 4, "Small Shield");
    }

    public static Shields newTowerShield() {
        return new Shields("Great Axe", 4, 8, 5, "TowerShield");
    }

}

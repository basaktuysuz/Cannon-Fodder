public class Wands extends Weapons {

    private String wandsType;
    private int healPoint;
    public Wands(){
        super();
        wandsType=null;
        healPoint=0;
    }

    public Wands(String name, int weight, int value, int damage, int healPoint, String wandsType) {
        super(name, weight, value, damage);
        this.healPoint = healPoint;
        this.wandsType = wandsType;
    }

    public String getWandsType() {
        return wandsType;
    }

    public void setWandsType(String wandsType) {
        this.wandsType = wandsType;
    }

    public static Wands newBoneWand() {
        return new Wands("Sphinx-Bone Wand", 5, 9, 6, 5, "Bone Wand");
    }

    public static Wands newWoodWand() {
        return new Wands("Chestnut", 6, 4, 7, 6, "Wood Wand");
    }

    public static Wands newUnicornWand() {
        return new Wands("Malfoy's Wand", 3, 7, 5, 3, "Unicorn Hair Wand");
    }


}

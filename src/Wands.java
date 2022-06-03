public class Wands extends Weapons {

    private String wandsType;
    private int healPoint;

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




}

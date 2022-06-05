public class Wands extends Weapons {

    private String wandsType;
    private int healPoint;

    public Wands(String name, int weight, int value, int damage, int healPoint, String wandsType) {
        super(name, weight, value, damage);
        this.healPoint = healPoint;
        this.wandsType = wandsType;
    }

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }

    public String getWandsType() {
        return wandsType;
    }

    public void setWandsType(String wandsType) {
        this.wandsType = wandsType;
    }


    public void print() {
        super.print();
        System.out.print("Wand: "+getName());
        System.out.println("Heal point "+ getHealPoint());
        System.out.println("*****");
    }
}

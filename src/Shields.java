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


}

public class Shields extends Weapons {

    private String shieldsType;

    public Shields(String name, int weight, int value, int damage, String itemType,String shieldsType) {
        super(name, weight, value, damage,itemType);
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
    public void print() {
        super.print();
        System.out.print("Shields : ");
        System.out.println("Extra Damage: " + getDamage());
        System.out.println("*****");
    }

  //Burda shield stunlıyor
   // public long stun(Character character, Enemy enemy1) {
        //    return Math.round(character.Attack()/enemy1.getVitality());



}

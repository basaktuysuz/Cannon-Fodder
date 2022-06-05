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
    public void print() {
        super.print();
        System.out.print("Shiels : ");
        System.out.println("Extra Damage: " + getDamage());
        System.out.println("*****");
    }

  //Burda shield stunlıyor
   // public long stun(Character character, Enemy enemy1) {
        //    return Math.round(character.Attack()/enemy1.getVitality());



}

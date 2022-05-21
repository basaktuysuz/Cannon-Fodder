public class Character {
    protected int strength;
    protected int vitality;
    protected int intelligence;
    protected int HP;
    private Weapons weapon;
    private Clothing clothing;

    public Character() {
        HP = (int) (0.7 * vitality + 0.2 * strength * 0.1 * intelligence);
    }

    public Character(int strength, int vitality, int intelligence) {
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        HP = (int) (0.7 * vitality + 0.2 * strength * 0.1 * intelligence);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public double getHP() {
        return HP;
    }

    public int Attack() {
        return weapon.getDamage();
    }

    public void SpecialAction() {
        System.out.println("Hero's special ability is activated !!!");
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }

    public void Pick() {
    }

    public void Wield() {
    }


    public void Examine() {
    }

    public void ListInventory() {
    }
}
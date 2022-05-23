import java.util.Scanner;

public class Character {
    Scanner input = new Scanner(System.in);
    protected int healerStrength;
    protected int healerVitality;
    protected int healerIntelligence;
    protected int tankStrength;
    protected int tankVitality;
    protected int tankIntelligence;
    protected int fighterStrength;
    protected int fighterVitality;
    protected int fighterIntelligence;
    protected int healerHP;
    protected int tankHP;
    protected int fighterHP;
    protected int givenHeal;
    protected int enemyHP;
    protected int enemyIntelligence;
    protected int enemyStrength;
    protected int enemyVitalty;
    protected int enemyNumber;

    public int getEnemyNumber() {
        return enemyNumber;
    }

    public void setEnemyNumber(int enemyNumber) {
        this.enemyNumber = enemyNumber;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public int getEnemyIntelligence() {
        return enemyIntelligence;
    }

    public void setEnemyIntelligence(int enemyIntelligence) {
        this.enemyIntelligence = enemyIntelligence;
    }

    public int getEnemyStrength() {
        return enemyStrength;
    }

    public void setEnemyStrength(int enemyStrength) {
        this.enemyStrength = enemyStrength;
    }

    public int getEnemyVitalty() {
        return enemyVitalty;
    }

    public void setEnemyVitalty(int enemyVitalty) {
        this.enemyVitalty = enemyVitalty;
    }

    public int getGivenHeal() {
        return givenHeal;
    }

    public void setGivenHeal(int givenHeal) {
        this.givenHeal = givenHeal;
    }


    public int getHealerStrength() {
        return healerStrength;
    }

    public void setHealerStrength(int healerStrength) {
        this.healerStrength = healerStrength;
    }

    public int getHealerVitality() {
        return healerVitality;
    }

    public void setHealerVitality(int healerVitality) {
        this.healerVitality = healerVitality;
    }

    public int getHealerIntelligence() {
        return healerIntelligence;
    }

    public void setHealerIntelligence(int healerIntelligence) {
        this.healerIntelligence = healerIntelligence;
    }

    public int getTankStrength() {
        return tankStrength;
    }

    public void setTankStrength(int tankStrength) {
        this.tankStrength = tankStrength;
    }

    public int getTankVitality() {
        return tankVitality;
    }

    public void setTankVitality(int tankVitality) {
        this.tankVitality = tankVitality;
    }

    public int getTankIntelligence() {
        return tankIntelligence;
    }

    public void setTankIntelligence(int tankIntelligence) {
        this.tankIntelligence = tankIntelligence;
    }

    public int getFighterStrength() {
        return fighterStrength;
    }

    public void setFighterStrength(int fighterStrength) {
        fighterStrength = fighterStrength;
    }

    public int getFighterVitality() {
        return fighterVitality;
    }

    public void setFighterVitality(int fighterVitality) {
        this.fighterVitality = fighterVitality;
    }

    public int getFighterIntelligence() {
        return fighterIntelligence;
    }

    public void setFighterIntelligence(int fighterIntelligence) {
        this.fighterIntelligence = fighterIntelligence;
    }

    public int getHealerHP() {
        return healerHP;
    }

    public void setHealerHP(int healerHP) {
        this.healerHP = healerHP;
    }

    public int getTankHP() {
        return tankHP;
    }

    public void setTankHP(int tankHP) {
        this.tankHP = tankHP;
    }

    public int getFighterHP() {
        return fighterHP;
    }

    public void setFighterHP(int fighterHP) {
        this.fighterHP = fighterHP;
    }

    public Character() {
    }

    public void Attack(){}

    public void Pick(){}

    public void Wield(){}

    public void Wear(){}

    public void Examine(){}

    public void specialAction(){}

    public void ListInventory(){}
}

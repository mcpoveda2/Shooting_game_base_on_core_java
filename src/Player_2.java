public class Player_2 extends Player_1 {
    private boolean armour;
    private Armour armourObj;
    private int health;

    public Player_2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
        this.armourObj = new Armour();
    }

    @Override
    public void Hit_By_Gun1() {
        int damage = armourObj.calculateDamageReceived(armour, 10, 40);
        reduceHealth(damage);
    }

    @Override
    public void Hit_By_Gun2() {
        int damage = armourObj.calculateDamageReceived(armour, 30, 60);
        reduceHealth(damage);
    }
    

    private void reduceHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println(getName() + " is dead");
        } else {
            System.out.println("Health reduced to " + this.health);
        }
    }
}

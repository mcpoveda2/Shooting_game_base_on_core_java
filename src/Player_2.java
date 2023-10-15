public class Player_2 extends Player_1{
    private int health;
    private Boolean armour;


    public Player_2(String name, String weapon, int health, Boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;

    }

    @Override
    public void Hit_By_Gun1() {
        if (armour){
            this.health-=10;
            if(this.health<=0) {
                this.health = 0;
            }
            System.out.println("Armour is on. got hit by gun 1 . health is reduced by 10 and new health is :"+ this.health);
        }
        if (!armour) {
            this.health -= 40;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is off. got hit by gun 1 . health is reduced by 40 and new health is :" + this.health);
        }
        if (this.health==0){
            System.out.println(getName()+" is dead");
        }
    }

    @Override
    public void Hit_By_Gun2() {
        if (armour){
            this.health-=30;
            if(this.health<=0) {
                this.health = 0;
            }
            System.out.println("Armour is on. got hit by gun 2 . health is reduced by 30 and new health is :"+ this.health);
        }
        if (!armour) {
            this.health -= 60;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is off. got hit by gun 2 . health is reduced by 60 and new health is :" + this.health);
        }
        if (this.health==0){
            System.out.println(getName()+" is dead");
        }

    }
}

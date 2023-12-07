
public class Bat extends Mammals{
    public Bat(){
        super(300);
    }

    public void fly(){
        System.out.println("Taking-off sound!");
        energyLevel -= 50;
        super.displayEnergy();
    }

    public void eatHumans(){
        System.out.println("Miam Miam!");
        energyLevel += 25;
        super.displayEnergy();
    }

    public void attackTown(){
        System.out.println("City on fireeeeeee!");
        energyLevel -= 100;
        super.displayEnergy();
    }
}
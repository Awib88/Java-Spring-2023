
public class Gorilla extends Mammals{
    public void throwThings(){
        System.out.println("Throwing something at someone..Better watch out!");
        energyLevel -= 5;
        super.displayEnergy();
    }

    public void eatBananas(){
        System.out.println("Miam Miam!");
        energyLevel += 10;
        super.displayEnergy();
    }

    public void climb(){
        System.out.println("Time to stretch out!");
        energyLevel -= 10;
        super.displayEnergy();
    }
}
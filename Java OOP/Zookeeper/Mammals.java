
public class Mammals{
    protected int energyLevel;

    public Mammals(){
        this(100);
    }

    public Mammals(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Remaining energy : " + this.energyLevel+"\n");
        return this.energyLevel;
    }
}
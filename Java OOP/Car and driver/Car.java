
public class Car {
    protected int gas;

    public Car(){
        this(10);
    }

    public Car(int initialGas) {
        this.gas = initialGas;
    }

    public String endGame(){
        if( this.gas <= 0){
            return "\n Game over";
        }
        return "";
    }

}
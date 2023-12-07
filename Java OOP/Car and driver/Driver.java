
public class Driver extends Car {
    public void drive(){
        System.out.println("Driving..");
        gas -= 1;
        System.out.printf("remaining gas level : %d/10 \n", gas);
        System.out.println(super.endGame());
    }

    public void useBooster(){
        System.out.println("Booooost..");
        gas -= 3;
        System.out.printf("remaining gas level : %d/10 \n", gas);
        System.out.println(super.endGame());
    }

    public void Refuel(){
        System.out.println("Juicyyyyy..");
        gas += 2;
        System.out.printf("remaining gas level : %d/10 \n", gas);
        System.out.println(super.endGame());
    }
}
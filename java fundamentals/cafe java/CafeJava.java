public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;

        double dripCoffee = 5.5;
        double latte = 2.5;
        double cappucino = 5.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";

        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false; // ! mochaPrice

        boolean isReadyOrder2 = false; // ! dripCoffee
        boolean isReadyOrder3 = false; // ! latte
        boolean isReadyOrder4 = true; // ! cappucino
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println("***********Cafe JAVA**********");
    	// ** Your customer interaction print statements will go here ** //
        // ? Cindhuri ordered drip coffee
        System.out.println(generalGreeting + customer1 +"!");
        if (isReadyOrder2){
            System.out.println(customer1+readyMessage);
        }
        else if( ! isReadyOrder2 ){
            System.out.println("Got it"+pendingMessage);
        }
        System.out.println("-------------------Thanks for passing!---------------------");

        // ? Noah ordered cappucino
        System.out.println(generalGreeting + customer4 +"!");
        if (isReadyOrder4){
            System.out.println(customer4+readyMessage);
            System.out.println( "item: Cappucino  " + displayTotalMessage + cappucino);
        }
        else if( ! isReadyOrder4 ){
            System.out.println("Got it"+pendingMessage);
        }
        System.out.println("-------------------Thanks for passing!---------------------");

        // ? Sam ordered 2 lattes
        System.out.println(generalGreeting + customer2 +"!");
        if (isReadyOrder3){
            double twoLatte = latte * 2;
            System.out.println(customer2+readyMessage);
            System.out.println("item: 2 x latte  " + displayTotalMessage + twoLatte);
        }
        else if( ! isReadyOrder3 ){
            System.out.println("Got it"+pendingMessage);
        }
        System.out.println("-------------------Thanks for passing!---------------------");

        // ? Jimmy just realized he was charged for coffee but had ordered latte
        System.out.println(generalGreeting + customer3 +"!");
        System.out.println("Oups my bad! let me check this real quick!");
        if (dripCoffee < latte ){
            double difference = latte - dripCoffee;
            System.out.println("Sorry for disturbance, you owe us :$" + difference);
        }
        else{
            double difference = dripCoffee - latte ;
            System.out.println("Sorry for disturbance, we owe you :$" + difference);
        }
        System.out.println("-------------------Thanks for passing!---------------------");
    }

}

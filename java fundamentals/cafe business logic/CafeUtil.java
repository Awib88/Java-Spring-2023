import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;


public class CafeUtil{
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 0;i <= numWeeks;i++){
            sum = sum +i;
        }
        return sum;
    }
/*
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for (int i=0; i < prices.length; i++){
            total += prices[i]; 
        }
        return total;
    } */
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for (double price : prices){
            total += price; 
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0;i<menuItems.size();i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();

        System.out.printf("hello, %s ! ", userName);

        System.out.printf("There are %d people in front of you.",customers.size());
        System.out.println("\n");
        
        customers.add(userName);
        System.out.println(customers);

    }

            // ninja bonuses!

    public void printPriceChart(String product, double price , int maxQuantity){
        System.out.println(product + ":");

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        
        for (int i=1;i <= maxQuantity;i++){
            double discount = (i - 1 )* 0.50; // discount
            // format price as currency
            String formattedPrice = currencyFormatter.format(price * i - discount);
            System.out.printf("%d - %s%n ",i,formattedPrice);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            System.out.println("Arrays are not the same size!");
            return false;
        }
        else{
            for (int i=0; i < menuItems.size(); i++ ){
                System.out.printf("%d %s -- %.2f \n", i ,menuItems.get(i), prices.get(i));
            }
        return true;
        }
    }

}
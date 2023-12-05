import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    
        Item item1 = new Item();
        item1.name = "moccha";
        item1.price=1.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price=2.50;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price=0.50;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price=3.50;

        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        order1.name = "Cindhuri";

        Orders order2 = new Orders();
        order2.name = "Jimmy";

        Orders order3 = new Orders();
        order3.name = "Noah";

        Orders order4 = new Orders();
        order4.name = "Sam";

    
        // Application Simulations
        order2.items.add(item1);
        order2.total += item1.price; 

        order3.items.add(item4);

        order4.items.add(item2);

        order1.isReady = true;

        order4.items.add(item2);
        order4.items.add(item2);

        order2.isReady = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Items: %s\n", order2.items); 
        System.out.printf("Total: %s\n", order2.total); 
        System.out.printf("Ready: %s\n", order2.isReady);
    }
}

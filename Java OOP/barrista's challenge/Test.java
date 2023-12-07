public class Test{
    public static void main(String[] args){
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Foden");
        Order order4 = new Order("Jack");
        Order order5 = new Order("Haaland");

        // Menu items
        Item item1 = new Item("Latte",1.50);
        Item item2 = new Item("Cappucino",4.0);
        Item item3 = new Item("Moccha",2.0);
        Item item4 = new Item("Drip coffee",1.0);
        Item item5 = new Item("Special",5.0);

        // 2 items for each order

        order1.addItem(item1);
        order1.addItem(item5);

        order2.addItem(item2);
        order2.addItem(item3);

        order3.addItem(item4);
        order3.addItem(item5);

        order4.addItem(item1);
        order4.addItem(item4);

        order5.addItem(item4);
        order5.addItem(item2);

        // ! Test cases

        //order3.display();

        order4.setIsReady(true);
        order1.setIsReady(true);
        //System.out.println(order4.getStatusMessage());

        //System.out.println(order3.getOrderTotal());

        Order[] ordersList = {order1,order2,order3,order4,order5};
        for( Order order : ordersList){
            order.display();
            System.out.println(order.getStatusMessage());
            System.out.println("--------------------");
        }
    }
}
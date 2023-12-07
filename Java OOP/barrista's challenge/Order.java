import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this("Guest");
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // getters 
    public String getName(){
        return name;
    }
    public boolean isReady(){
        return ready;
    }
    public ArrayList<Item> getItems(){
        return items;
    }

    // setters

    public void setName(String name){
        this.name = name;
    }
    public void setIsReady(boolean ready){
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    // #1 addItem

    public void addItem(Item item){
        items.add(item);
    }

    // #2 getStatusMessage

    public String getStatusMessage(){
        if(!ready){
            return "Thank you for waiting.Your order will be ready soon.";
        }
        return "Your order is ready.";
    }

    // #3 getOrderTotal

    public double getOrderTotal(){
        double total = 0.0;
        for ( Item item : items){
            total = total + item.getPrice();
        }
        return total;
    }

    // #4 display

    public void display(){
        System.out.println("Name : " + name);
        for(Item item : items){
            System.out.printf("%s - $%.2f \n",item.getName(),item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }
}
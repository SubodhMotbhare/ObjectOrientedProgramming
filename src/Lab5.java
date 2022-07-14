import java.util.ArrayList;

class Order{
    public int orderID;
    public ArrayList<String> itemNames;
    public boolean cashOnDelivery;

    public Order(int orderID, ArrayList<String> itemNames, boolean cashOnDelivery) {
        this.orderID = orderID;
        this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;
    }
}

public class Lab5 {

    public static ArrayList<String> getItems(ArrayList<Order> orders){
        ArrayList<String> items = new ArrayList<String>();
        for( Order order:orders) {
            items.addAll(order.itemNames);
        }
        return items;
    }

    public static void main(String[] args) {
        ArrayList<String> itemNames = new ArrayList<String>();
        itemNames.add("Jeans");
        itemNames.add("Shirt");
        itemNames.add("Belt");
        Order order1 =new Order( 101,itemNames,true);

        itemNames.clear();
        itemNames.add("Tie");
        itemNames.add("Shirt");
        Order order2 =new Order(102,itemNames,true);

        itemNames.clear();
        itemNames.add("Tshirt");
        itemNames.add("Socks");
        itemNames.add("Tie");
        Order order3 =new Order(103,itemNames,true);

        ArrayList<Order> orders = new ArrayList<Order>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        System.out.println(getItems(orders));
    }
}
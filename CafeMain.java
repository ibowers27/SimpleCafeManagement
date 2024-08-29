package Week1;

public class CafeMain {
    // main method for the Cafe Management System that tests the system
    public static void main(String[] args) {
        // create a new Cafe object
        Cafe cafe = new Cafe();

        // create 3 MenuItem objects and specify the name, price, and category
        MenuItem matcha = new MenuItem("Matcha", 3.99, "Tea");
        MenuItem macchiato = new MenuItem("Macchiato", 4.99, "Coffee");
        MenuItem poundCake = new MenuItem("Pound Cake", 5.55, "Dessert");

        // add the available menu items to the cafe
        cafe.addMenuItem1(matcha);
        cafe.addMenuItem2(macchiato);
        cafe.addMenuItem3(poundCake);

        // display the menu of available items
        cafe.displayMenu();

        // create a new Order object
        Order order = new Order();

        // add items to the order (you can mismatch the order of available items or pick multiples of one item)
        order.addItem1(macchiato);
        order.addItem2(poundCake);
        order.addItem3(matcha);

        // place the current order and calculate the total
        cafe.placeOrder(order);

        // display the order details of the current order
        order.displayOrderDetails();
    }
}

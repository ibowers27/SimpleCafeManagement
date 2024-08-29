package Week1;

public class Cafe {
    // attributes in Cafe representing the available items and the current order
    private MenuItem menuItem1;
    private MenuItem menuItem2;
    private MenuItem menuItem3;
    private Order currentOrder;

    // addMenuItem methods to add available items to the menu to specific slots
    public void addMenuItem1(MenuItem item) {
        this.menuItem1 = item;
    }

    public void addMenuItem2(MenuItem item) {
        this.menuItem2 = item;
    }

    public void addMenuItem3(MenuItem item) {
        this.menuItem3 = item;
    }

    // method to set the current order to this order and calculate the total of the current order
    public void placeOrder(Order order) {
        this.currentOrder = order;
        currentOrder.calculateAmount();
    }

    // method to display the menu items that are available
    public void displayMenu() {
        System.out.println("MENU");
        System.out.println("Menu Item 1: ");
        menuItem1.displayItemInfo();
        System.out.println("Menu Item 2: ");
        menuItem2.displayItemInfo();
        System.out.println("Menu Item 3: ");
        menuItem3.displayItemInfo();
        System.out.println(" ");
    }

}

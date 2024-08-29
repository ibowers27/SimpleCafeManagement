package Week1;

public class Order {
    // attributes in Order class (3 MenuItem objects and the total of the order)
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;

    // addItem methods that add an item  to the associated slot
    public void addItem1(MenuItem item) {
        this.item1 = item;
    }

    public void addItem2(MenuItem item) {
        this.item2 = item;
    }

    public void addItem3(MenuItem item) {
        this.item3 = item;
    }

    // method to calculate the total of the order based on the items added
    public void calculateAmount() {
        totalAmount = item1.getPrice() + item2.getPrice() + item3.getPrice();
    }

    // method to display the details of the order: each item and the final total
    public void displayOrderDetails() {
        System.out.println("ORDER DETAILS");
        System.out.println("Item 1: ");
        item1.displayItemInfo();
        System.out.println("Item 2: ");
        item2.displayItemInfo();
        System.out.println("Item 3: ");
        item3.displayItemInfo();
        System.out.println("Total: " + totalAmount);

    }
}

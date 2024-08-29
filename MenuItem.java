package Week1;

public class MenuItem {
    // attributes in MenuItem
    private String name;
    private double price;
    private String category;

    // MenuItem constructor initializing name, price, and category
    public MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // getters and setters for item name, price, and category
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // method to display each item's details
    public void displayItemInfo() {
        System.out.println("[" + category + "] " + name + ": $" + price);
    }
}


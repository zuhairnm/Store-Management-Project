/**
 * This superclass represents a product that would be available to buy in my store.
 * It has common attributes shared by all types of clothing, like name, price, and weather this product uses cotton.
 * The class provides constructors, accessors, mutator methods, and a toString() method
 */

public class ClothingStore {
    private String name;
    private double price; 
    private boolean onlyCotton;

    // Default constructor
    public ClothingStore() {
        this.name = "";
        this.price = 0.0;
        this.onlyCotton = true;
    }

    // Parameterized constructor 
    public ClothingStore(String name, double price, boolean onlyCotton) {
        this.name = name;
        this.price = price;
        this.onlyCotton = onlyCotton;
    }

    // Getter and setter 
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getOnlyCotton() {
        return onlyCotton;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOnlyCotton(boolean onlyCotton) {
        this.onlyCotton = onlyCotton;
    }

    // toString method 
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Only Cotton: " + onlyCotton;
    }
}
/**
 *The Jean subclass represents a product in my store that I will sell to my customers
 * This subclass does extend the Clothing store 
 * And has other attributes like length, width, and color of the jeans
 */

public class Jean extends ClothingStore {
    private double width;
    private double length;
    private String color;

    // Default constructor
    public Jean() {
        super();
        this.width = 0.0;
        this.length = 0.0;
        this.color = "";
    }

    // Parameterized constructor
    public Jean(String name, double price, boolean onlyCotton, double width, double length, String color) {
        super(name, price, onlyCotton); // Corrected call to the parent constructor
        this.width = width;
        this.length = length;
        this.color = color;
    }

    // Getter and setter methods for Jean class
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Overridden toString method for Jean
    public String toString() {
        return "Product: Jean\n" + "Name: " + super.getName() + ", Price: " + this.getPrice() + ", Only Cotton: " + this.getOnlyCotton() + ", Width of Jeans: " + width + ", Length of Jeans: " + length +  ", Color of Jeans: " + color;
    }
}
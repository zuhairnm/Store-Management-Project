/**
 * A sub Class that represents how  info about the shirts used in my clothing store
 * Such as the price, name, brand, size, and material
 */

public class Shirt extends ClothingStore {
    private String brand;
    private String size;

    // Default constructor
    public Shirt() {
        super();// super clas introduced 
        this.brand = "default";
        this.size = "default";
    }
   
    // Parameterized constructor that initializes the shirt with different values 
    public Shirt(String name, double price, boolean onlyCotton, String size, String brand) {
        super(name, price, onlyCotton); 
        this.size = size;
        this.brand = brand;
    }

    // Getter and setter methods for Shirt class
    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public void setBrand(String brandUpdate) {
        brand = brandUpdate;
    }

    public void setSize(String sizeUpdate) {
        size = sizeUpdate;
    }

    // Overridden toString method for Shirt
    public String toString() {
        return "Product: Shirt\n" +
               "Name: " + super.getName() + ", Price: " + this.getPrice() + ", Only Cotton: " + this.getOnlyCotton() + ", Size: " + size + ", Brand: " + brand;
    }
}
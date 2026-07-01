package Exercise1_Inventory;

/**
 * Represents a product inside our custom warehouse inventory system.
 * This model contains essential details required for tracking stocks and pricing.
 */
public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    /**
     * Parameterized constructor for initiating a new product entry.
     */
    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [" +
                "ID='" + productId + '\'' +
                ", Name='" + productName + '\'' +
                ", Qty=" + quantity +
                ", Price=$" + price +
                ']';
    }
}

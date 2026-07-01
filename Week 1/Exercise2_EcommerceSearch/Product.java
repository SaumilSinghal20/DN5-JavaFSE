public class Product implements Comparable<Product> {
    private String productId;
    private String productName;
    private String category;

    public Product(String id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
    
    public String getCategory() {
        return category;
    }

    // to print the object easily
    @Override
    public String toString() {
        return "Product[id=" + productId + ", name=" + productName + "]";
    }

    // needed for sorting to do binary search later
    @Override
    public int compareTo(Product other) {
        return this.productId.compareTo(other.productId);
    }
}

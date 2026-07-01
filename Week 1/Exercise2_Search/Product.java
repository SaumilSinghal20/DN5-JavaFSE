package Exercise2_Search;

/**
 * Represents a product specifically structured for an e-commerce platform.
 * Implements Comparable to facilitate sorting by Product ID for binary search requirements.
 */
public class Product implements Comparable<Product> {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
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

    @Override
    public int compareTo(Product otherProduct) {
        // We compare based on productId to sort properly
        return this.productId.compareTo(otherProduct.getProductId());
    }

    @Override
    public String toString() {
        return "EcommerceProduct [" +
               "ID='" + productId + '\'' +
               ", Name='" + productName + '\'' +
               ", Category='" + category + '\'' +
               ']';
    }
}

package Exercise1_Inventory;

import java.util.HashMap;
import java.util.Map;

/**
 * A warehouse inventory manager utilizing a HashMap for optimized operations.
 */
public class InventorySystem {
    
    // We use a HashMap because it provides O(1) average time complexity for both insertions and retrievals.
    private Map<String, Product> productDatabase;

    public InventorySystem() {
        this.productDatabase = new HashMap<>();
    }

    /**
     * Registers a new product into the database.
     */
    public void registerProduct(Product newProduct) {
        if (newProduct != null && newProduct.getProductId() != null) {
            productDatabase.put(newProduct.getProductId(), newProduct);
            System.out.println("Success: Product " + newProduct.getProductName() + " has been added.");
        } else {
            System.out.println("Error: Invalid product data provided.");
        }
    }

    /**
     * Modifies an existing product's stock count or price.
     */
    public void modifyProduct(String targetId, int updatedQuantity, double updatedPrice) {
        if (productDatabase.containsKey(targetId)) {
            Product existingEntry = productDatabase.get(targetId);
            existingEntry.setQuantity(updatedQuantity);
            existingEntry.setPrice(updatedPrice);
            System.out.println("Success: Information for product ID " + targetId + " updated.");
        } else {
            System.out.println("Notice: Product ID " + targetId + " does not exist in the database.");
        }
    }

    /**
     * Removes a product entirely from the warehouse records.
     */
    public void removeProduct(String targetId) {
        if (productDatabase.remove(targetId) != null) {
            System.out.println("Success: Product ID " + targetId + " has been successfully removed.");
        } else {
            System.out.println("Notice: Product ID " + targetId + " could not be found for removal.");
        }
    }

    /**
     * Retrieves and displays a product by its ID.
     */
    public void displayProduct(String targetId) {
        Product foundEntry = productDatabase.get(targetId);
        if (foundEntry != null) {
            System.out.println("Found: " + foundEntry);
        } else {
            System.out.println("Notice: No product matching ID " + targetId + " was found.");
        }
    }
}

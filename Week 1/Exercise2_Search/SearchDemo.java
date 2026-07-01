package Exercise2_Search;

import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        // Initialize an array of products for our e-commerce catalog
        Product[] ecomCatalog = {
            new Product("ECOM-004", "Wireless Mouse", "Electronics"),
            new Product("ECOM-001", "Desk Lamp", "Furniture"),
            new Product("ECOM-003", "Ergonomic Chair", "Furniture"),
            new Product("ECOM-002", "Notebook", "Stationery")
        };

        String targetProductId = "ECOM-003";

        System.out.println("--- Linear Search Demonstration ---");
        Product linearSearchResult = SearchLogic.performLinearSearch(ecomCatalog, targetProductId);
        System.out.println("Result: " + (linearSearchResult != null ? linearSearchResult : "Item Not Found"));

        System.out.println("\n--- Binary Search Demonstration ---");
        // Binary search requires a sorted array by the key (productId)
        Arrays.sort(ecomCatalog); 
        Product binarySearchResult = SearchLogic.performBinarySearch(ecomCatalog, targetProductId);
        System.out.println("Result: " + (binarySearchResult != null ? binarySearchResult : "Item Not Found"));
    }
}

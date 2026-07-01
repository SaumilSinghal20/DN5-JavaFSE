import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] inventory = {
            new Product("P05", "Gaming Mouse", "Electronics"),
            new Product("P01", "Laptop", "Electronics"),
            new Product("P04", "Desk Chair", "Furniture"),
            new Product("P02", "Coffee Mug", "Kitchen"),
            new Product("P03", "Notebook", "Stationery")
        };

        System.out.println("--- Linear Search ---");
        Product found1 = SearchLogic.doLinearSearch(inventory, "P04");
        System.out.println("Linear search found: " + (found1 != null ? found1 : "Nothing"));

        System.out.println("\n--- Binary Search ---");
        // we have to sort the array first based on productId
        Arrays.sort(inventory); 
        
        Product found2 = SearchLogic.doBinarySearch(inventory, "P04");
        System.out.println("Binary search found: " + (found2 != null ? found2 : "Nothing"));
    }
}

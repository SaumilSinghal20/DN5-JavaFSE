package Exercise1_Inventory;

public class InventorySystemDemo {
    public static void main(String[] args) {
        InventorySystem manager = new InventorySystem();

        Product p1 = new Product("P001", "Gaming Laptop", 15, 1200.50);
        Product p2 = new Product("P002", "Mechanical Keyboard", 50, 75.99);

        System.out.println("--- Registering Products ---");
        manager.registerProduct(p1);
        manager.registerProduct(p2);

        System.out.println("\n--- Fetching Product ---");
        manager.displayProduct("P001");

        System.out.println("\n--- Modifying Product ---");
        manager.modifyProduct("P002", 45, 70.00);
        manager.displayProduct("P002");

        System.out.println("\n--- Removing Product ---");
        manager.removeProduct("P001");
        manager.displayProduct("P001");
    }
}

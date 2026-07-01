public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger myLogger1 = Logger.getInstance();
        Logger myLogger2 = Logger.getInstance();
        
        myLogger1.log("App started");
        myLogger2.log("Checking singleton");
        
        // checking if both are exactly same object
        if (myLogger1 == myLogger2) {
            System.out.println("Singleton pattern is working fine. Both instances are the same.");
        } else {
            System.out.println("Something went wrong!");
        }
    }
}

public class MainLogger {
    public static void main(String[] args) {
        // trying to get two instances
        Logger l1 = Logger.getLoggerInstance();
        Logger l2 = Logger.getLoggerInstance();
        
        l1.logMsg("Starting the application");
        l2.logMsg("User logged in successfully");
        
        // checking if both point to the same memory
        if (l1 == l2) {
            System.out.println("Both loggers are the same instance. Singleton pattern verified!");
        } else {
            System.out.println("Wait, something is wrong, they are different.");
        }
    }
}

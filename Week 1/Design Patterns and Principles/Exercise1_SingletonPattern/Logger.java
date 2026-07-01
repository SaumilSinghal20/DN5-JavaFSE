public class Logger {
    // keeping it private static so only one gets created
    private static Logger instance;

    private Logger() {
        // private constructor
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log entry: " + message);
    }
}

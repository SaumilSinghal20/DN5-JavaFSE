public class Logger {
    // creating a single instance of Logger to be used everywhere
    private static Logger loggerInstance;

    // constructor is private so no one can create objects directly
    private Logger() {
    }

    // method to get the instance
    public static Logger getLoggerInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void logMsg(String msg) {
        System.out.println("[LOG]: " + msg);
    }
}

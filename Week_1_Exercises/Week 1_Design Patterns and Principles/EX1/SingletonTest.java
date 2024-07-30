public class SingletonTest {
    public static void main(String[] args) {
        // Get the singleton instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test the singleton property
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("logger1 and logger2 refer to different instances.");
        }

        // Use the logger to log messages
        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
}

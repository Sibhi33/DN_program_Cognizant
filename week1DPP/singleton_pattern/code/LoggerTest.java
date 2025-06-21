package week1DPP.singleton_pattern.code;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Logger instance 1");
        logger2.log("Logger instance 2");

        System.out.println(logger1 == logger2);
    }
}
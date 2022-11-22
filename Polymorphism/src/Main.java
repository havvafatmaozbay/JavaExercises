public class Main {
    public static void main(String[] args) {
        // all of them are the type of BaseLogger, so we can insert them in the same array
        /*BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabseLogger()};
        for(BaseLogger logger:loggers){
            logger.Log("Log message");
        }*/
        CustomerManager customerManager = new CustomerManager(new DatabseLogger());
        customerManager.Add();
    }
}
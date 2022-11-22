public class EmailLogger extends BaseLogger{
    public void Log(String message){ //Overriding the method from BaseLogger
        System.out.println("Logged to email : "+message);
    }
}

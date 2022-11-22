public class CustomerManager {
/*public void Add(){
System.out.println("Customer Added");
//Newlemekden uzaklaşmaya başlamalıyız,
// bi class'a başka class içinde new yapmak demek databaselogger'a iyice bağlandık demek
//bu bağlı bi sistem mesela bundan sonra File'a loglamak gerekicek ve tüm sistemden databaseleri kaldırmamız gerekicek
//bunun yerine:
/*DatabseLogger logger = new DatabseLogger();
logger.Log("Log message");*/
    private BaseLogger baseLogger; //bir tane attribute field oluşturduk
    public CustomerManager(BaseLogger logger){// Constructor, tamamen ana nesne ile çalışıyoruz bunu newlediğimizde BaseLogger vericek ve biz tüm inherit classları parametre olarak alabiliriz
        this.baseLogger = logger;
    }
    public void Add(){
        System.out.println("Customer Added");
        this.baseLogger.Log("Log message");
    }

}


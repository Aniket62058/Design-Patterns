public class DbSingleton {
//     For static loading of DbSingleton object
//    private static DbSingleton instance = new DbSingleton();

//    For Lazy loading
//    private static DbSingleton instance = null;

//    For Threadsafe
    private static volatile DbSingleton instance = null;

//    This additional check ensures that even if someone tries to create an instance of the DbSingleton
//    class through reflection (which can bypass the private constructor access),
//    the attempt will fail if an instance already exists
    private DbSingleton(){
        if(instance != null){
            throw new RuntimeException(" Use getInstance() method to create ");
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}

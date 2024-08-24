public class DbSingletonDemo {
    public static void main(String[] args) {
        // Cannot create direct instance. Because constructor is private
        // DbSingleton instance1 = new DbSingleton();

        DbSingleton instance1 = DbSingleton.getInstance();

        System.out.println(instance1);

        DbSingleton instance2 = DbSingleton.getInstance();

        System.out.println(instance2);

        if(instance1 == instance2){
            System.out.println("Both objects are accessing same memory");
        }
        else {
            System.out.println("Both objects are not accessing same memory");
        }
    }
}

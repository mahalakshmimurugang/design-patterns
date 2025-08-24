public class Main{
    public static void main(String[] args){
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        System.out.println("Singleton 1: " + singleton1);
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println("Singleton 2: " + singleton2);

        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
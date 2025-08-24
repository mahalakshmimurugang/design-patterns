package creational.factory;

public class Main {
    public static void main(String[] args){
        OperatingSystem os = Factory.getInstance("Linux", "/home/user");
        os.changeDir("/home/user");
        os.removeDir("/home/user");
        os.listDir("/home/user");
    }
}

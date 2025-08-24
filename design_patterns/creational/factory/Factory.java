package creational.factory;

public class Factory {
    private Factory() {}

    public static OperatingSystem getInstance(String type, String dir) {
        switch (type) {
            case "Linux":
                return new LinuxOperatingSystem(dir);
            case "Windows":
                return new WindowsOperatingSystem(dir);
            default:
                throw new IllegalArgumentException("Invalid operating system type: " + type);
        }
    }
}

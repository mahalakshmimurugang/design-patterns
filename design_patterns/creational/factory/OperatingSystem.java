package creational.factory;

public abstract class OperatingSystem {

    protected String dir;

    public abstract void changeDir(String dir);

    public abstract void removeDir(String dir);

    public abstract void listDir(String dir);
}
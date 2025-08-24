package creational.factory;

public class LinuxOperatingSystem extends OperatingSystem {
    public LinuxOperatingSystem(String dir){
        this.dir = dir;
    }

    @Override
    public void changeDir(String dir){
        //linux command to change directory
    }

    @Override
    public void removeDir(String dir){
        //linux command to remove directory
    }

    @Override
    public void listDir(String dir){
        //linux command to list directory
    }
}
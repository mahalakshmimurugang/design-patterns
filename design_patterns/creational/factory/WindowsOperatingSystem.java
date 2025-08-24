package creational.factory;

public class WindowsOperatingSystem extends OperatingSystem {

    public WindowsOperatingSystem(String dir){
        this.dir = dir;
    }

    @Override
    public void changeDir(String dir){
        //windows command to change directory
    }

    @Override
    public void removeDir(String dir){
        //windows command to remove directory
    }

    @Override
    public void listDir(String dir){
        //windows command to list directory
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Command Pattern Demo ===\n");
        
        // Create receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        
        // Create commands
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        
        // Create invoker
        RemoteControl remote = new RemoteControl();
        
        // Set commands
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        
        // Execute commands
        remote.onButtonPressed(0);
        remote.onButtonPressed(1);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();
    }
}

public class CommandPatternExample {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command on = new LightOnCommand(livingRoomLight);
        Command off = new LightOffCommand(livingRoomLight);
        
        RemoteControl remote = new RemoteControl();
        
        // turn on
        remote.setCommand(on);
        remote.pressButton();
        
        // turn off
        remote.setCommand(off);
        remote.pressButton();
    }
}

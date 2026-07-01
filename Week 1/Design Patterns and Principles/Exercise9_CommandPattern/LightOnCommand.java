public class LightOnCommand implements Command {
    private Light l;

    public LightOnCommand(Light light) {
        this.l = light;
    }

    @Override
    public void execute() {
        l.turnOn();
    }
}

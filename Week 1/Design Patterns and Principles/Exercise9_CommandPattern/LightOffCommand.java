public class LightOffCommand implements Command {
    private Light l;

    public LightOffCommand(Light light) {
        this.l = light;
    }

    @Override
    public void execute() {
        l.turnOff();
    }
}

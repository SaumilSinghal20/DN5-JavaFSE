public class Computer {
    // parts of computer
    private String cpu;
    private String ram;
    private String storage;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // private constructor so nobody creates it directly without builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
    
    public void showSpecs() {
        System.out.println("Computer Specs - CPU: " + cpu + ", RAM: " + ram + ", Storage: " + storage + ", GPU: " + isGraphicsCardEnabled + ", BT: " + isBluetoothEnabled);
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCardEnabled(boolean val) {
            this.isGraphicsCardEnabled = val;
            return this;
        }

        public Builder setBluetoothEnabled(boolean val) {
            this.isBluetoothEnabled = val;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

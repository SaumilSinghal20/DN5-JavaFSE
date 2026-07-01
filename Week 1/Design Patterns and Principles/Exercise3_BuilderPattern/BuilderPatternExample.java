public class BuilderPatternExample {
    public static void main(String[] args) {
        // building basic pc
        Computer pc1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .build();
                
        // gaming pc
        Computer gamerPc = new Computer.Builder()
                .setCpu("AMD Ryzen 7")
                .setRam("16GB")
                .setStorage("1TB NVMe")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
                
        pc1.showSpecs();
        gamerPc.showSpecs();
    }
}

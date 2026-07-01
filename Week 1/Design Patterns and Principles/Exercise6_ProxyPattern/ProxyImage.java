public class ProxyImage implements Image {
    private String filename;
    private RealImage actualImg;

    public ProxyImage(String fname) {
        this.filename = fname;
    }

    @Override
    public void display() {
        if (actualImg == null) {
            actualImg = new RealImage(filename);
        }
        actualImg.display();
    }
}

public class RealImage implements Image {
    private String file;

    public RealImage(String f) {
        this.file = f;
        loadFromServer(f);
    }
    
    private void loadFromServer(String f) {
        System.out.println("Fetching " + f + " from remote server... takes some time.");
    }

    @Override
    public void display() {
        System.out.println("Showing image: " + file);
    }
}

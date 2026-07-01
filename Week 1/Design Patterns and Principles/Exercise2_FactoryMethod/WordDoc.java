public class WordDoc implements AppDocument {
    @Override
    public void openDoc() {
        System.out.println("Microsoft Word Document is opening...");
    }

    @Override
    public void closeDoc() {
        System.out.println("Microsoft Word Document is closing.");
    }
}

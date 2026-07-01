public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF in Reader");
    }

    @Override
    public void close() {
        System.out.println("PDF closed");
    }
}

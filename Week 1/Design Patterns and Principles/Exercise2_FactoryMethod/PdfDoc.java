public class PdfDoc implements AppDocument {
    @Override
    public void openDoc() {
        System.out.println("PDF Reader is loading the document...");
    }

    @Override
    public void closeDoc() {
        System.out.println("PDF Reader closed.");
    }
}

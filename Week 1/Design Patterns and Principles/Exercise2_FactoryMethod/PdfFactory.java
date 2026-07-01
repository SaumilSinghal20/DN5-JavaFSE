public class PdfFactory extends DocFactory {
    @Override
    public AppDocument createNewDocument() {
        return new PdfDoc();
    }
}

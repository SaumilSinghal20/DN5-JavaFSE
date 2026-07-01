public class ExcelFactory extends DocFactory {
    @Override
    public AppDocument createNewDocument() {
        return new ExcelDoc();
    }
}

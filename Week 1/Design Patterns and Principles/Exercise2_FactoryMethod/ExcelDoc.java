public class ExcelDoc implements AppDocument {
    @Override
    public void openDoc() {
        System.out.println("Opening spreadsheet in Excel...");
    }

    @Override
    public void closeDoc() {
        System.out.println("Closing Excel.");
    }
}

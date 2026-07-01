public class FactoryMain {
    public static void main(String[] args) {
        
        // Let's create a word document using the factory
        DocFactory factory1 = new WordFactory();
        AppDocument myWord = factory1.createNewDocument();
        myWord.openDoc();
        myWord.closeDoc();
        
        System.out.println("-----------------");
        
        // Creating a PDF document
        DocFactory factory2 = new PdfFactory();
        AppDocument myPdf = factory2.createNewDocument();
        myPdf.openDoc();
        myPdf.closeDoc();
        
        System.out.println("-----------------");
        
        // Creating an Excel document
        DocFactory factory3 = new ExcelFactory();
        AppDocument myExcel = factory3.createNewDocument();
        myExcel.openDoc();
    }
}

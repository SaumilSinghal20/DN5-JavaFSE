public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // generating docs using factory
        DocumentFactory wordFac = new WordFactory();
        Document d1 = wordFac.createDocument();
        d1.open();
        d1.close();
        
        DocumentFactory pdfFac = new PdfFactory();
        Document d2 = pdfFac.createDocument();
        d2.open();
        
        DocumentFactory excelFac = new ExcelFactory();
        Document d3 = excelFac.createDocument();
        d3.open();
    }
}

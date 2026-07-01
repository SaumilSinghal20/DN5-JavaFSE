public class WordFactory extends DocFactory {
    @Override
    public AppDocument createNewDocument() {
        return new WordDoc();
    }
}

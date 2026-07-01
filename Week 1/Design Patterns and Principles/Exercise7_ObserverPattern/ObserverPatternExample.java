public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket appleStock = new StockMarket("AAPL", 150.0);
        
        Observer mob1 = new MobileApp("John");
        Observer webApp = new WebApp();
        
        appleStock.register(mob1);
        appleStock.register(webApp);
        
        appleStock.setPrice(152.5);
        
        appleStock.deregister(mob1);
        
        appleStock.setPrice(155.0);
    }
}

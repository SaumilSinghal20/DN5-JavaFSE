public class WebApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("Web Dashboard Update: Stock " + stockName + " updated to " + price);
    }
}

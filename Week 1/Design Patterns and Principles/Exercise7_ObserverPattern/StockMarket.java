import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> clients;
    private String stockId;
    private double currentPrice;

    public StockMarket(String id, double price) {
        this.stockId = id;
        this.currentPrice = price;
        this.clients = new ArrayList<>();
    }

    public void setPrice(double newP) {
        this.currentPrice = newP;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        clients.add(o);
    }

    @Override
    public void deregister(Observer o) {
        clients.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : clients) {
            ob.update(stockId, currentPrice);
        }
    }
}

public class MobileApp implements Observer {
    private String user;
    
    public MobileApp(String u) {
        this.user = u;
    }
    
    @Override
    public void update(String stockName, double price) {
        System.out.println("Mobile App (" + user + ") Notification: " + stockName + " price is now $" + price);
    }
}

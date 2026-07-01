public class ProxyPatternExample {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("pic2.png");
        
        System.out.println("First call, will load from server:");
        img1.display();
        
        System.out.println("Second call, won't load from server again:");
        img1.display();
        
        System.out.println("Calling img2:");
        img2.display();
    }
}

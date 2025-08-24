public class Main {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern Demo ===\n");
        
        NewsAgency newsAgency = new NewsAgency();
        
        NewsChannel channel1 = new NewsChannel("CNN");
        NewsChannel channel2 = new NewsChannel("BBC");
        NewsChannel channel3 = new NewsChannel("Fox News");
        
        newsAgency.registerObserver(channel1);
        newsAgency.registerObserver(channel2);
        newsAgency.registerObserver(channel3);
        
        newsAgency.setNews("Breaking: New technology breakthrough!");
        newsAgency.setNews("Update: Weather forecast for tomorrow");
    }
}

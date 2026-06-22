package Observer;

public class Main {

    public static void main(String[] args) {

        StockMarket market =
                new StockMarket();

        Observer mobile =
                new MobileApp();

        Observer web =
                new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStock("COGNI1", 4200);

        System.out.println();

        market.setStock("COGN12", 1800);
    }
}
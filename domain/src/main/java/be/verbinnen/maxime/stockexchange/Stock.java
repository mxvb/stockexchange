package be.verbinnen.maxime.stockexchange;

public class Stock {

    private final String id;
    private final String name;
    private  StockPrice price;

    public Stock(String id, String name) {
        this.id  = id;
        this.name = name;
    }
}

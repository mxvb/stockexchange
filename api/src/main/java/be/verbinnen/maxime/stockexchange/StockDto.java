package be.verbinnen.maxime.stockexchange;

public class StockDto {
    private final String name;
    private StockPrice stockPrice;

    public StockDto(Stock stock) {
        this.name = stock.getName();
        this.stockPrice = stock.getPrice();
    }

    @Override
    public String toString() {
        return "Stock:" + name + "Price: " + stockPrice;
    }
}

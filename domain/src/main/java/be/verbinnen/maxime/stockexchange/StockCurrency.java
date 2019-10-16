package be.verbinnen.maxime.stockexchange;

public enum StockCurrency {
    EUR("euro","€"),
    USD("dollar","$"),
    GBP("pound","£");

    private final String label;
    private final String symbol;

    StockCurrency(String label, String symbol) {
        this.label = label;
        this.symbol = symbol;

    }
}

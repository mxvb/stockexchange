package be.verbinnen.maxime.stockexchange;

public class StockService {

    public static Stock getStock(String stockId) {
        return StockRepository.getStockInformation(stockId);
    }
}

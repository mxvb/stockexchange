package be.verbinnen.maxime.stockexchange;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class StockRepository {

    private Map<String,Stock> stockRepo;

    public StockRepository() {
        this.stockRepo = new HashMap<String, Stock>();

        stockRepo.put("AA", new Stock("AA", "Ambro AN"));
        stockRepo.put("BB", new Stock("BB", "Belfius"));
        stockRepo.put("CC", new Stock("CC", "Crelan"));

    }

    public Stock getStockInformation(String stockId) {
        if (!doesRepoContainStockId(stockId)) {
            throw new IllegalArgumentException("StockId does not exist BITCH.");
        }
        BigDecimal stockPrice = ExternalStockInformationService.getPriceInEuroForStock(stockId);

        stockRepo.put(stockId, enrichStockwithPriceInformation(stockId,stockPrice));
        return stockRepo.get(stockId);

    }

    private boolean doesRepoContainStockId(String stockId) {
        return this.stockRepo.containsKey(stockId);
    }

    private Stock enrichStockwithPriceInformation(String stockId, BigDecimal stockPrice) {
        return new Stock(stockId,"lalala");
    }

    @Override
    public String toString() {
        return "StockRepository{" +
                "stockRepo=" + stockRepo +
                '}';
    }
}

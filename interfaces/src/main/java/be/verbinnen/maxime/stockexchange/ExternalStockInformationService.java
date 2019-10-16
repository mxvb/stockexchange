package be.verbinnen.maxime.stockexchange;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;

public class ExternalStockInformationService {

    private static final double MINIMUM_PRICE_FOR_STOCK = 10;
    private static final double MAXIMUM_PRICE_FOR_STOCK = 100;

    public static BigDecimal getPriceInEuroForStock(String stockId) {
        return BigDecimal.valueOf(RandomUtils.nextDouble(MINIMUM_PRICE_FOR_STOCK,MAXIMUM_PRICE_FOR_STOCK));
    }

}

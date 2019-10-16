package be.verbinnen.maxime.stockexchange;

public class MyCLI {
    public static void main(String[] args) {

        if (args.length == 1) {
            System.out.println(StockExchangeController.getStock(args[0]));
        }

    }
}

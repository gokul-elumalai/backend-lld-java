package main.java.design_patterns.strategy.stock_trading;

public class StockTradingManager {

    private TradingIndicatorStrategy strategy;

    public StockTradingManager(TradingIndicatorStrategy strategy) {
        this.strategy = strategy;
    }

    public Double calculateIndicator(Stock stock) {
        return strategy.calculateIndicator(stock);
    }
}
package main.java.design_patterns.strategy.stock_trading;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();
    Double calculateIndicator(Stock stock);
}

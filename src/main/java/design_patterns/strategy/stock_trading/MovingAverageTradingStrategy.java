package main.java.design_patterns.strategy.stock_trading;

public class MovingAverageTradingStrategy implements TradingIndicatorStrategy {
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    @Override
    public Double calculateIndicator(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
}

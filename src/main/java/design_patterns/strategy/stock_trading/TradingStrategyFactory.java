package main.java.design_patterns.strategy.stock_trading;


public class TradingStrategyFactory {
    public static TradingIndicatorStrategy getStrategy(TradingStrategyType strategyType){
        return switch (strategyType) {
            case MOVING_AVERAGES -> new MovingAverageTradingStrategy();
            case MOMENTUM -> new MomentumTradingStrategy();
            case VOLATILITY -> new VolatilityTradingStrategy();
        };
    }
}

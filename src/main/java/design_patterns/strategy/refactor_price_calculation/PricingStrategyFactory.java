package main.java.design_patterns.strategy.refactor_price_calculation;

public class PricingStrategyFactory {

    public static PricingStrategy getStrategy(PricingType pricingType){
        return switch (pricingType) {
            case DISTANCE_BASED -> new DistanceBasedPricingStrategy();
            case TIME_BASED -> new TimeBasedPricingStrategy();
            case SURGE -> new SurgePricingStrategy();
        };
    }
}

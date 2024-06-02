package main.java.design_patterns.strategy.refactor_price_calculation;

public class PricingManager {


    private PricingType pricingType;
    private PricingStrategy pricingStrategy;

    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingType = pricingType;
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        PricingStrategy strategy = PricingStrategyFactory.getStrategy(pricingType);
        return strategy.calculatePrice(rideDetails);
    }

}

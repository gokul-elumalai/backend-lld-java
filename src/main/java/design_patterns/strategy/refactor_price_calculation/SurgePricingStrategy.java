package main.java.design_patterns.strategy.refactor_price_calculation;

public class SurgePricingStrategy implements PricingStrategy {

    private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }

    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }
}

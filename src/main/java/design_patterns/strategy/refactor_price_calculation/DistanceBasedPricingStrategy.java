package main.java.design_patterns.strategy.refactor_price_calculation;

public class DistanceBasedPricingStrategy implements PricingStrategy {
    private static final double PER_KILOMETER_RATE = 2.0; // Rate per kilometer

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_KILOMETER_RATE * rideDetails.getDistance();
    }

    @Override
    public PricingType supportsType() {
        return PricingType.DISTANCE_BASED;
    }
}

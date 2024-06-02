package main.java.design_patterns.strategy.refactor_price_calculation;

public class TimeBasedPricingStrategy implements PricingStrategy {

    private static final double PER_MINUTE_RATE = 0.5; // Rate per minute

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
    }

    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }
}

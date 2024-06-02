package main.java.design_patterns.strategy.refactor_price_calculation;

public interface PricingStrategy {

    static final double BASE_FARE = 5.0; // Base fare amount

    public Double calculatePrice(RideDetails rideDetails);

    PricingType supportsType();
}

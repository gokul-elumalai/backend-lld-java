package main.java.design_patterns.adapter.insurance_provider_integration;

public interface TravelInsuranceAdapter {
    public void submitClaim(String id, Double amount);
    public TravelInsuranceStatus getClaimStatus(String id);
}

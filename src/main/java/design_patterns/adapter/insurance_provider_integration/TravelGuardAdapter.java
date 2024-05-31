package main.java.design_patterns.adapter.insurance_provider_integration;

import main.java.design_patterns.adapter.insurance_provider_integration.external.TravelGuardApi;

public class TravelGuardAdapter implements TravelInsuranceAdapter {

    TravelGuardApi travelGuardApi = new TravelGuardApi();

    @Override
    public void submitClaim(String id, Double amount) {
        travelGuardApi.submitClaim(id, amount);
    }

    @Override
    public TravelInsuranceStatus getClaimStatus(String id) {
        String status = travelGuardApi.getClaimStatus(id);
        if (status.equals("APPROVED")) return TravelInsuranceStatus.APPROVED;
        else return TravelInsuranceStatus.PENDING;
    }
}

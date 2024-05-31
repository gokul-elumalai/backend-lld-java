package main.java.design_patterns.adapter.insurance_provider_integration.external;

import main.java.design_patterns.adapter.insurance_provider_integration.ApiUtils;

public class TravelGuardApi {
    public void submitClaim(String id, Double amount) {
        ApiUtils.logTravelGuardClaimCall();
    }

    public String getClaimStatus(String id) {
        ApiUtils.logTravelGuardStatusCall();
        return "SUCCESS";
    }
}

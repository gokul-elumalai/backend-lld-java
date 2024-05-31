package main.java.design_patterns.adapter.insurance_provider_integration;

import main.java.design_patterns.adapter.insurance_provider_integration.external.AutoProtectApi;
import main.java.design_patterns.adapter.insurance_provider_integration.external.AutoProtectStatus;

public class AutoProtectAdapter implements TravelInsuranceAdapter {

    AutoProtectApi autoProtectApi = new AutoProtectApi();

    @Override
    public void submitClaim(String id, Double amount) {
        autoProtectApi.addClaim(amount);
    }

    @Override
    public TravelInsuranceStatus getClaimStatus(String id) {
        AutoProtectStatus status = autoProtectApi.getStatus(id);
        if (status == AutoProtectStatus.APPROVED) return TravelInsuranceStatus.APPROVED;
        else return TravelInsuranceStatus.PENDING;
    }
}

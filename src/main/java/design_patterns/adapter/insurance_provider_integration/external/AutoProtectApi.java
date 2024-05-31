package main.java.design_patterns.adapter.insurance_provider_integration.external;

import main.java.design_patterns.adapter.insurance_provider_integration.ApiUtils;

public class AutoProtectApi {

    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}

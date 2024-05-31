package main.java.design_patterns.adapter.language_translation;

import main.java.design_patterns.adapter.language_translation.external.GoogleTranslateApi;
import main.java.design_patterns.adapter.language_translation.external.GoogleTranslationRequest;
import main.java.design_patterns.adapter.language_translation.external.MicrosoftTranslateApi;

// this will be in a separate module
public class TranslationManager {

    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {

        if (provider.equals("google")) {
            GoogleTranslationRequest request = new GoogleTranslationRequest(text, sourceLanguage, targetLanguage, 0.8);
            return googleTranslateApi.convert(request);
        } else if (provider.equals("microsoft")) {
            return microsoftTranslateApi.translate(text, sourceLanguage, targetLanguage);
        } else {
            throw new RuntimeException("Invalid provider");
        }
    }

}

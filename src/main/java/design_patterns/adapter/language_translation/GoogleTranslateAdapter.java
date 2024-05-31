package main.java.design_patterns.adapter.language_translation;

import main.java.design_patterns.adapter.language_translation.external.GoogleTranslateApi;
import main.java.design_patterns.adapter.language_translation.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslateAdapter implements TranslationProviderAdapter {

    GoogleTranslateApi googleAPI = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest request) {
        return googleAPI.convert(new GoogleTranslationRequest(request.getText(), request.getSourceLanguage(),
                request.getTargetLanguage(), request.getConfidenceThreshold()));
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleAPI.getLanguages();
    }
}

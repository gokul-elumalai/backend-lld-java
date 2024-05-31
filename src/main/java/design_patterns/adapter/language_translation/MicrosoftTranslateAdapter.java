package main.java.design_patterns.adapter.language_translation;

import main.java.design_patterns.adapter.language_translation.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslateAdapter implements TranslationProviderAdapter {

    MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    @Override
    public String translate(TranslationRequest request) {
        return microsoftTranslateApi.translate(request.getText(), request.getSourceLanguage(),
                request.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}

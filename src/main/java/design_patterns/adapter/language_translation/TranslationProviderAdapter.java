package main.java.design_patterns.adapter.language_translation;

import java.util.List;

public interface TranslationProviderAdapter {
    String translate(TranslationRequest request);
    List<String> getSupportedLanguages();
}

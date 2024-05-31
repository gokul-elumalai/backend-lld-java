package main.java.design_patterns.adapter.language_translation;

import lombok.Getter;
import lombok.NoArgsConstructor;

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@Getter
@NoArgsConstructor
public class TranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;

}

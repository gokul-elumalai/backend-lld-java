package main.java.design_patterns.factory.abstract_factory.document_processing.processor;

import main.java.design_patterns.factory.abstract_factory.document_processing.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}

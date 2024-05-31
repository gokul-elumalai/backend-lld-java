package main.java.design_patterns.factory.abstract_factory.document_processing.parser;

import main.java.design_patterns.factory.abstract_factory.document_processing.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}

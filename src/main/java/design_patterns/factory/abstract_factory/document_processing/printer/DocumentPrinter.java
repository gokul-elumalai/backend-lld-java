package main.java.design_patterns.factory.abstract_factory.document_processing.printer;

import main.java.design_patterns.factory.abstract_factory.document_processing.DocumentType;
import main.java.design_patterns.factory.abstract_factory.document_processing.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}

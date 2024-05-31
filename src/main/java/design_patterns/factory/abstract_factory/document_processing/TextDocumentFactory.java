package main.java.design_patterns.factory.abstract_factory.document_processing;

import main.java.design_patterns.factory.abstract_factory.document_processing.parser.DocumentParser;
import main.java.design_patterns.factory.abstract_factory.document_processing.parser.TextDocumentParser;
import main.java.design_patterns.factory.abstract_factory.document_processing.printer.DocumentPrinter;
import main.java.design_patterns.factory.abstract_factory.document_processing.printer.TextDocumentPrinter;
import main.java.design_patterns.factory.abstract_factory.document_processing.processor.DocumentProcessor;
import main.java.design_patterns.factory.abstract_factory.document_processing.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }
}

package main.java.design_patterns.factory.abstract_factory.document_processing;

import main.java.design_patterns.factory.abstract_factory.document_processing.parser.DocumentParser;
import main.java.design_patterns.factory.abstract_factory.document_processing.parser.SpreadsheetDocumentParser;
import main.java.design_patterns.factory.abstract_factory.document_processing.printer.DocumentPrinter;
import main.java.design_patterns.factory.abstract_factory.document_processing.printer.SpreadsheetDocumentPrinter;
import main.java.design_patterns.factory.abstract_factory.document_processing.processor.DocumentProcessor;
import main.java.design_patterns.factory.abstract_factory.document_processing.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }
}

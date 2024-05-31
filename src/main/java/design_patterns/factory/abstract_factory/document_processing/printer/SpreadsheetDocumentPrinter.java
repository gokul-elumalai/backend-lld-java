package main.java.design_patterns.factory.abstract_factory.document_processing.printer;

import main.java.design_patterns.factory.abstract_factory.document_processing.DocumentType;
import main.java.design_patterns.factory.abstract_factory.document_processing.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}

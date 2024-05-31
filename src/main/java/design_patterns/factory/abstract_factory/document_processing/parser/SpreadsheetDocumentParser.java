package main.java.design_patterns.factory.abstract_factory.document_processing.parser;

import main.java.design_patterns.factory.abstract_factory.document_processing.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}

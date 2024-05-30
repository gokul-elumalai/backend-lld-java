package main.java.design_patterns.factory.simple_factory.document_processing;

public class DocumentProcessorFactory {

    public static DocumentProcessor getDocumentProcessor(DocumentType documentType, String documentName) {
        switch (documentType) {
            case PRESENTATION: return new PresentationDocumentProcessor(documentName);
            case SPREAD_SHEET: return new SpreadsheetDocumentProcessor(documentName);
            case TEXT: return new TextDocumentProcessor(documentName);
        }

        return null;
    }
}

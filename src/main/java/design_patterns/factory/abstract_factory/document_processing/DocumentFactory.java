package main.java.design_patterns.factory.abstract_factory.document_processing;

import main.java.design_patterns.factory.abstract_factory.document_processing.parser.DocumentParser;
import main.java.design_patterns.factory.abstract_factory.document_processing.printer.DocumentPrinter;
import main.java.design_patterns.factory.abstract_factory.document_processing.processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentType supportsType();
    
    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createDocumentProcessor(String documentName);
}

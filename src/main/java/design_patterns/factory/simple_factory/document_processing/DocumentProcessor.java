package main.java.design_patterns.factory.simple_factory.document_processing;

public abstract class DocumentProcessor {

    public String documentName;

    public abstract DocumentType supportsType();

    public abstract void processDocument();

}

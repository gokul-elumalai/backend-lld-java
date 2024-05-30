package main.java.design_patterns.prototype_registry.efficient_invoice_generation;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}

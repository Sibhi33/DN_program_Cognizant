package week1DPP.factoryMethod_pattern.code;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public ExcelDocument createDocument() {
        return new ExcelDocument();
    }
}

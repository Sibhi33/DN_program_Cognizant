package week1DPP.factoryMethod_pattern.code;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

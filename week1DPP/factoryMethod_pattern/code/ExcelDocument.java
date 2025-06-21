package week1DPP.factoryMethod_pattern.code;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document...");
    }
}

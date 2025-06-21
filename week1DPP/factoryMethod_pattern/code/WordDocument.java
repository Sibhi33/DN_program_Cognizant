package week1DPP.factoryMethod_pattern.code;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}

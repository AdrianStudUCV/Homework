
public class Main {
    public static void main(String[] args) {
        
        String filePath = "N:\\java\\Homework_1.13\\src\\numar";// Fisierul din care citim

        //String filePath = "numar.txt";

        int x = FileProcessor.readNumberFromFile(filePath);
        int result = Calculator.doubleValue(x);
        System.out.println("Rezultatul: " + result);
    }
}

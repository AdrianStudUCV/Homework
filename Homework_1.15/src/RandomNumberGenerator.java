
import java.util.ArrayList;
import java.util.Random;

public class RandomNumberGenerator
{
    public static void main(String[] args) {
        ArrayList<Double> results = generateValues(10); // Generam 10 valori
        System.out.println("Generated values: " + results);
    }

    public static ArrayList<Double> generateValues(int count) {
        ArrayList<Double> values = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            try {
                int x = random.nextInt(21) - 10; // Generam numere intre -10 si 10
                if (x == 0) {
                    throw new ArithmeticException("Division by zero attempt");
                }
                values.add(100.0 / x);
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Array index out of bounds: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("General exception: " + e.getMessage());
            }
        }
        return values;
    }
}

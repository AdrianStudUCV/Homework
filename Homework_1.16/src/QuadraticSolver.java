import java.util.Scanner;

public class QuadraticSolver {
    public static void solveQuadratic(double a, double b, double c) throws ComplexRootsException {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero (not a quadratic equation).");
        }

        double determinant = b * b - 4 * a * c;

        if (determinant < 0) {
            throw new ComplexRootsException("No real roots. The equation has complex roots.");
        }

        double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        double root2 = (-b - Math.sqrt(determinant)) / (2 * a);

        System.out.println("Roots of the equation: " + root1 + " and " + root2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        try {
            solveQuadratic(a, b, c);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ComplexRootsException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}

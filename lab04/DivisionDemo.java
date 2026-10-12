public class DivisionDemo {

    public static int safeDivide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + safeDivide(20, 4));
            System.out.println("Result: " + safeDivide(20, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}

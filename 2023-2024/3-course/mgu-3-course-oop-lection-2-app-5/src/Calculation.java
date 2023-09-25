public class Calculation {

    public void factorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {
        new Calculation().factorial(5);
    }
}

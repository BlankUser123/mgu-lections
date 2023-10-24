public class Adder {

    public static double add(int a, double b) {
        return a + b;
    }

    public static double add(double a, int b) {
        return a + b;
    }
}

class TestOverloading3 {

    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11.0));
        System.out.println(Adder.add(11.0, 11));
    }
}

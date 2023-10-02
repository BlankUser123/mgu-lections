public class Program {
    private static int count;

    public static void add(int number) {
        count = count + number;
    }

    public static void main(String[] args) {
        add(5);
        System.out.println(count);
    }
}

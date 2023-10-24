public class Program {
    public void print(byte a) {
        System.out.println("byte value: " + a);
    }

    public void print(short a) {
        System.out.println("short value: " + a);
    }

//    public void print(int a) {
//        System.out.println("int value: " + a);
//    }

//    public void print(long a) {
//        System.out.println("long value: " + a);
//    }
//
//    public void print(float a) {
//        System.out.println("float value: " + a);
//    }

    public void print(double a) {
        System.out.println("double value: " + a);
    }

    public static void main(String[] args) {
        new Program().print(1);
    }
}

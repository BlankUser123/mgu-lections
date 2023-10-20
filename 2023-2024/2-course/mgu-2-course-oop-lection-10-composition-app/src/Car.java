public class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void finalize() {
        System.out.println("Car is deleted");
    }
}

class Engine {
    public void finalize() {
        System.out.println("Engine is deleted");
    }
}

class TestCar {
    public static void main(String[] args) {
        Car car = new Car();

        car = null;

        System.gc();
    }
}
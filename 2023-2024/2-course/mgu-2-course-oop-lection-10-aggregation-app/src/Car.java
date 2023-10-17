public class Car {
    private Passenger passenger;

    public Car(Passenger passenger) {
        this.passenger = passenger;
    }

    public void finalize() {
        System.out.println("Car is deleted");
    }
}

class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void finalize() {
        System.out.println("Passenger is deleted");
    }
}

class TestCar {
    public static void main(String[] args) {
        Passenger tom = new Passenger("Tom");

        Car car = new Car(tom);

        car = null;

        System.gc();
    }
}
public class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    protected void run() {
        System.out.println("Bike is running");
    }
}

class Motobike extends Bike {
    @Override
    protected void run() {
        System.out.println("Motobike is running");
    }
}

class Program {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.run();

        Vehicle motobike = new Motobike();
        motobike.run();
    }
}

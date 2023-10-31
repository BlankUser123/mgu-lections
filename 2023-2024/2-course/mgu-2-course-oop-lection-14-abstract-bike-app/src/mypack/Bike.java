package mypack;

public abstract class Bike {
    protected Bike() {
        System.out.println("mypack.Bike is created");
    }

    protected abstract void run();

    protected void changeGear() {
        System.out.println("Gear changed");
    }
}

package pack;

import mypack.Bike;

public class Honda extends Bike {
    @Override
    protected void run() {
        System.out.println("running safely...");
    }
}

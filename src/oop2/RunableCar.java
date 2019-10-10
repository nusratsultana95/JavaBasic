package oop2;

public class RunableCar extends NewCar implements Vehicle {

    @Override
    public void start() {
        System.out.println("Runable Car Starts");
    }

    @Override
    public void stop() {
        System.out.println("Runable Car Stops");

    }

    @Override
    public void name() {
        System.out.println("Runable Car has a name");

    }

    @Override
    public void wheelss() {
        System.out.println("Runable Car has 4 wheels");
    }
}

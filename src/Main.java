/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

class Car{
    private String name;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("engine just startes vroom vroom...");
    }

    public void accelerate(){
        System.out.println("Car accelerating...");
    }

    public void brake(){
        System.out.println("Car brakes...");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    private boolean engine;
    private int cylinder;
    private int wheels;
}

class SUV extends Car{
    public SUV(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println("SUV engine starts...");
    }

    @Override
    public void accelerate() {
        System.out.println("SUV accelerates");
    }

    @Override
    public void brake() {
        System.out.println("SUV brakes");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cintroen",8);
        car.startEngine();
        car.accelerate();
        car.brake();
        Car suv = new SUV("Mitsubishi ASX",16);
        suv.startEngine();
        suv.accelerate();
        suv.brake();
        Car jeep = new Jeep("Vitara", 8);
        jeep.startEngine();
        jeep.accelerate();
        jeep.brake();

        Object kog = new String("kosmas");
        System.out.println(kog);
    }
}

/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

class Jeep extends Car {
    public Jeep(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println("Jeep engine starts...");
    }

    @Override
    public void accelerate() {
        System.out.println("Jeep accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Jeep brakes");
    }
}


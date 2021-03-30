package com.company.third;

public class Car extends Vehicle {
    private int currentGear;
    private int currentSpeed;
    private int currentVelocity;
    private int currentDirection;


    public Car(String name, String size) {
        super(name, size);
        currentGear = 0;
        currentSpeed = 0;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void changeGear(int newCurrentGear) {
        if (newCurrentGear >= 0 && newCurrentGear <= 8) {
            this.currentGear = newCurrentGear;
            System.out.println("Car.gear(): Changed gear to " + newCurrentGear);
        } else {
            throw new IllegalArgumentException("Car.gear(): incorrect value " + newCurrentGear + ". Please change it to value from 0 to 8");
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeSpeed(int newCurrentSpeed) {
        if (newCurrentSpeed >= 0 && newCurrentSpeed <= 200) {
            this.currentSpeed = newCurrentSpeed;
            System.out.println("Car.speed(): Speed changed to " + newCurrentSpeed);
        } else {
            if (newCurrentSpeed > 200) {
                throw new IllegalArgumentException("Car.speed(): your speed is " + newCurrentSpeed + ". You're driving too fast! Please, slow down");
            } else {
                throw new IllegalArgumentException("Car.speed(): speed value " + newCurrentSpeed + " is incorrect. Please, enter 0 speed value or above");
            }
        }

    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Car.steer(): Steering at " + currentDirection + "degrees.");
    }
    @Override
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Car.move(): Moving at "  + currentVelocity + " in direction " + currentDirection);

    }
}
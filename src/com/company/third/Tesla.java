package com.company.third;

public class Tesla extends Car {
    private int currentVelocity;
    private int currentDirection;
    private int currentGear;
    private int currentSpeed;
    private int chargeLevel;


    public Tesla(String name, String size) {
        super(name, size);
        currentVelocity = 100;
        currentDirection = 100;
        currentGear = 0;
        currentSpeed = 0;
        chargeLevel = 50;
    }

    @Override
    public int getCurrentVelocity() {
        return currentVelocity;
    }

    @Override
    public int getCurrentDirection() {
        return currentDirection;
    }

    @Override
    public void changeGear(int newCurrentGear) {
        if (newCurrentGear >= 0 && newCurrentGear <= 10) {
            this.currentGear = newCurrentGear;
            System.out.println("Tesla.gear(): Changed gear to " + newCurrentGear);
        } else {
            throw new IllegalArgumentException("Car.gear(): incorrect value " + newCurrentGear + ". Please change it to value from 0 to 10");
        }
    }

    @Override
    public int getCurrentGear() {
        return currentGear;
    }

    @Override
    public void changeSpeed(int newCurrentSpeed) {
        if (newCurrentSpeed >= 0 && newCurrentSpeed <= 250) {
            this.currentSpeed = newCurrentSpeed;
            System.out.println("Tesla.speed(): Speed changed to " + newCurrentSpeed);
        } else {
            if (newCurrentSpeed > 250) {
                throw new IllegalArgumentException("Tesla.speed(): your speed is " + newCurrentSpeed + ". You're driving too fast! Please, slow down");
            } else {
                throw new IllegalArgumentException("Tesla.speed(): speed value " + newCurrentSpeed + " is incorrect. Please, enter 0 speed value or above");
            }
        }

    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }


    @Override
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Tesla.steer(): Steering at " + currentDirection + "degrees.");
    }
    @Override
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Tesla.move(): Moving at "  + currentVelocity + " in direction " + currentDirection);

    }

    @Override
    public void stop(){
        this.currentVelocity = 0;

    }

    public void charge (int newChargeLevel) {
        if (newChargeLevel >= 1 && newChargeLevel <= 10) {
            this.chargeLevel = newChargeLevel;
            System.out.println("Tesla.chargeLevel(): Charge level " + newChargeLevel + " % is too low, please find Charging Station");
        } else {
            if (newChargeLevel >= 11 && newChargeLevel <= 100) {
                this.chargeLevel = newChargeLevel;
                System.out.println("Tesla.chargeLevel(): Charge level is " + newChargeLevel + " %");
            } else {
                if (newChargeLevel > 100) {
                    throw new IllegalArgumentException("Tesla.chargeLevel(): incorrect value " + newChargeLevel + " %. Please, call to Tesla support for help");
                } else {
                    throw new IllegalArgumentException("Car.gear(): your charge level is 0. Please call to Tesla support");
                }
            }
        }
    }

    public int getCurrentChargeLevel() {
        return chargeLevel;
    }

    public static void main(String[] args) {
        Tesla tesla = new Tesla("ModelS", "Sedan");

        tesla.move(30,80);
        System.out.println(tesla.getCurrentDirection());
        System.out.println(tesla.getCurrentVelocity());

        tesla.changeGear(8);
        System.out.println(tesla.getCurrentGear());

        tesla.changeSpeed(210);
        System.out.println(tesla.getCurrentSpeed());

        tesla.charge(100);
        System.out.println(tesla.getCurrentChargeLevel());

        tesla.stop();
        System.out.println(tesla.getCurrentVelocity());


    }
}
package com.company.fifth;

public class Circle extends Figure{
    double radius;

    public Circle (int wight, int height, int radius) {
        super(wight, height);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(12, 20, 5);
        System.out.println("Circle area = " + circle.calculateArea());
    }
}

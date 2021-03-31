package com.company.fifth;

public class Rectangle extends Figure{

    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle is " + rectangle.calculateArea());
    }
}

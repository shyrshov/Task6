package com.company.fifth;

public class Triangle extends Figure{
    double basis;
    public Triangle(double width, double height, double basis) {
        super(width, height);
        this.basis = basis;
    }

    @Override
    public double calculateArea() {
        return basis*height/2;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7, 10);
        System.out.println("Area of triangle is " + triangle.calculateArea());
    }
}

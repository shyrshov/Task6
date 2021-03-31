package com.company.fifth;

abstract class Figure {
    double width;
    double height;

    public Figure(double width, double height){
        this.width = width;
        this.height = height;
    }

    abstract public double calculateArea();
}

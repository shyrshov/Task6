package com.company.fourth;

public class DemoAB {
    public static void main(String[] args) {
        ClassA classA = new ClassA(10, 15, "pairs", 8.0);
        ClassB classB = new ClassB(4,5,"One", 5.0, 76,34);
        System.out.println(classA.calculate(10, 15));
        System.out.println(classA.toString("Some text ", 41.4));
        System.out.println(classB.calculate(55,1));
        System.out.println(classB.toString("Next Text ", 5.5));
    }
}

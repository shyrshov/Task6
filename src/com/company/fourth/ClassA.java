package com.company.fourth;

public class ClassA {
    int one;
    int two;
    String three;
    double four;

    public ClassA (int one, int two, String three, double four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        System.out.println("Constructor A called");
    }

    public int calculate (int one, int two) {
        return one + two;
    }

    public String toString (String three, double four) {
        return three + four;
    }
}

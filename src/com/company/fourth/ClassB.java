package com.company.fourth;

public class ClassB extends ClassA{
    int five;
    int six;

    public ClassB(int one, int two, String three, double four, int five, int six) {
        super(one, two, three, four);
        this.five = five;
        this.six = six;
        System.out.println("Constructor B called");
    }

    @Override
    public int calculate (int five, int six) {
        return five * six;
    }

    @Override
    public String toString (String three, double four) {
        System.out.println("In ClassB we use new function of toString method");
        return super.toString(three, four);
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB(5, 8, "text", 3.5, 13,99);
    }

}

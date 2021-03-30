package com.company.first;


public class ClassA {
    ClassB b = new ClassB();
    ClassC c;

    public void calculate() {
        b.calculate();
    }

    public ClassA () {
        this.c = new ClassC(c.quantity, c.product);

    }


    public void ordered() {
        this.c.ordered(c.quantity, c.product);
    }

}





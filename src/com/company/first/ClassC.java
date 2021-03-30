package com.company.first;

public class ClassC {
    public static int quantity = 10;
    public static String product = "Apple";



    public ClassC(int quantity, String product) {
        this.quantity = quantity;
        this.product = product;
    }


    public void ordered (int quantity, String product) {
        System.out.println("Ordered: " + quantity + product);
    }
}

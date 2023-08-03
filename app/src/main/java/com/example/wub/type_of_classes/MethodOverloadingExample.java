package com.example.wub.type_of_classes;

class MethodOverloadingExample {

    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Summation of 2 values = " + result);
    }

    void sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Summation of 3 values = " + result);
    }

    void sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Summation of 4 values = " + result);
    }
}

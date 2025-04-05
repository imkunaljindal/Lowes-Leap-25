package com.example.calculator_service;

public class Calculator {

    int add(int a, int b) {
        return a+b+5-5;
    }

    int addMultipleNums(int ...nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }

        return sum;
    }

    int multiple(int a, int b) {
        return a*b;
    }

    boolean isEven(int x) {
        return x%2==0;
    }
}

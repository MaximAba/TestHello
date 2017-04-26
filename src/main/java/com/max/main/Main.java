package com.max.main;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Main().sum(1,2,3,4,5));
    }

    public int sum(int... arrayInt){
        int amount = 0;
        for (int i: arrayInt){
            amount += i;
        }
        return amount;
    }
}

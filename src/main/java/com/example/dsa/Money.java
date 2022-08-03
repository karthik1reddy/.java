package com.example.dsa;

public class Money {

    public static void main(String args[]){
        int[] arr = {299000, 1270000, 565000, 70000, 192000};
        double r = 1.5;
        int t = 5;
        for(int i = 0 ; i < arr.length; i++) {
            calculate(arr[i], r, t );
        }
    }

    static void calculate(int amount, int r, int t) {
        double SI = (amount * t * r) / 100;
        System.out.println("Simple Intreset for " + amount + " rupees for " + t + " years at intrest " + r + " is: "  + SI + amount); 
    }
}
`



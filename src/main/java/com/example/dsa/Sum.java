package com.example.dsa;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

        static void sum(){
            int num1 , num2 ,sum;
            Scanner in = new Scanner(System.in);
            System.out.println("the first number");
            num1 =in.nextInt();
            System.out.println("the second number");
            num2 = in.nextInt();
            sum = num1 + num2;
            System.out.println("the sum = "+ sum);
        }
    }


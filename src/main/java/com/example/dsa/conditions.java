package com.example.dsa;

import static java.lang.System.*;

public class conditions {

    public static void main(String[] args) {
       // int a = 9;
        // int c = 10;
         // boolean b = a == c;
        int salary = 30000;
        if (salary > 10000){
            salary = salary + 2000;
        } else if (salary < 10000) {
           salary = salary - 20000;
        }
        System.out.println(salary);
    }

}



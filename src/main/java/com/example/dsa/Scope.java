package com.example.dsa;
//scope =  where we can access  variables
// it can axis variables through inside the function
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //System.out.println(a);
        {
            a = 100;
            System.out.println(a);
        }
        System.out.println(a);
    }
}
// Block scope = inisalation of value at once but u can change the value

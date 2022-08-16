package com.example.dsa;

public class Shodowing {

 //   Shodowing is a practice using two variable with the same name

    static int a = 10;
    public static void main(String[] args) {
        System.out.println( a );
        int a = 90; //these line will be shadowed
        System.out.println(a);
        thing ();
    }
    static void thing () {
        System.out.println(a);
    }
}

package com.example.dsa;

public class Stringex {
    public static void main(String[] args) {
        String personalised = myGreet("karthik");
        System.out.println(personalised);
    }
    static String myGreet (String name) {
        String message = "kk" + name;
            return(message);

    }
}


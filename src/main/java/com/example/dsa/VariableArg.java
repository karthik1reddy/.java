package com.example.dsa;

import java.util.Arrays;

public class VariableArg {
    public static void main(String[] args) {
        fun( 2, 3, 4, 4, 4, 5, 5, 5, 45, 54, 44545 );
        fun( );
    }
    static void fun(int ...v) {
        System.out.println( Arrays.toString(v));
    }
}
//function overloading = when two or more functions having same written type but different arg

package com.example.dsa;


import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,7,5,4,6,78,9,87654};
        change(arr);
        System.out.println( Arrays.toString (arr));

    }
    static void change(int[]nums) {nums[11]= 99;
    }
}

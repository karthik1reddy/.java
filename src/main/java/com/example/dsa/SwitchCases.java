package com.example.dsa;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String family = in.next();
        switch (family) {
            case "karthik":
                System.out.println("son");
                break;
            case "srisanth":
                System.out.println("the brother of karthik and son");
                break;
            case "hanumareddy":
                System.out.println("father of karthik and brother of srinivasareddy");
                break;
            case "venkataravanama":
                System.out.println("wife of hanumareddy and mother of karthik and srisanth");
                break;
            case "padhamavathi":
                System.out.println("wife of srinivasareddy");
                break;
            case "narendra":
                System.out.println("son of srinivasareddy and padhamavathi");
                break;
            case "krishna":
                System.out.println("son of srinivasareddy and padhamavathi and brother of narendra");
                break;
            default:
                System.out.println("please enter valid text");



        }

    }
}

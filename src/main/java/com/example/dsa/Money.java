package com.example.dsa;

/*
public class Money {


    //public static void main(String[] args) {
        //  int a = 30000 + 14000 + 15000 + 100000 + 120000 + 20000;
        // int b = 80000+100000+200000+210000+80000+70000+70000+460000;
        // int c = 35000+80000+100000+100000+50000+100000+100000;
       // int d = 70000;
       //int e = 50000+142000;

       // System.out.println(a);
       // System.out.println(b);
      //  System.out.println(c);
       // System.out.println(d);
       // System.out.println(e);

       // 299000
       // 1270000
       // 565000
      //  70000
      //  192000

    public static void main(String args[]){

        int a = 299000;
        int b = 1270000;
        int c = 565000;
        int d = 70000;
        int e = 192000;
        double R = 1.5,
                T = 12;

        double SI = (1 * T * R) / 100;
        double g = SI + 1;
        System.out.println(g);
         //double SI = (b * T * R) / 100;
         // double g = SI  + b;
         // System.out.println(g);
         // double SI = (c * T * R) / 100;
         //double g = SI + c;
         //System.out.println(g);
         //double SI = (d * T * R) / 100;
         //double g = SI + d;
         //System.out.println(g);
         //double SI = (e * T * R) / 100;
         //double g = SI + e;
         //System.out.println(g);
    }
}

 */

public class Money {

    public static void main(String args[]){
        int[] arr = {299000, 1270000, 565000, 70000, 192000};
        double r = 3;
        int t = 1;
        for (int i = 0 ; i < arr.length; i++) {
            calculate(arr[i], (int) r, t );
        }
    }

    static void calculate(int arr, int r, int t) {
        double SI = (arr * r * t) / 100;
        System.out.println("Simple Intreset for " + arr + " rupees for " + t + " years at intrest " + r + " is: "  + SI + arr);
    }

}





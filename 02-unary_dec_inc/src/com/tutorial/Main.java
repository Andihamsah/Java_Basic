package com.tutorial;

public class Main {

    public static void main(String[] args) {
        //unary = operasi yg dilakukan disuatu variable
        //unary + dan -
        int a = 5;
        System.out.printf("unary '+', %d menjadi  %d \n", a, +a);
        System.out.printf("unary '-', %d menjadi  %d \n", a, -a);

        //unary decrement dan increment
        //dec
        int d = 5;
        d++;
        System.out.println("nilai dengan '++'menjadi = " + d);
        //inc
        int i = 5 ;
        i--;
        System.out.println("nilai dengan '--' menjadi = " + i);

        //prefix dan postfix
        int prefix = 5 ;
        System.out.printf("nilai dengan '++' prefix menjadi  %d \n", ++prefix);
        int postfix = 5;
        System.out.printf("nilai dengan '++' postfix menjadi  %d \n", postfix++); // = 5 ++ hasilnya 5
        System.out.printf("nilai hasil dari postfix menjadi  %d \n", postfix); //disini hasil dari postfix di atas hasilnya 6

        //Bolean dengan tanda ! untuk negasi
        boolean jones = true;

        System.out.println("nilai boolean = " + jones);
        System.out.println("nilai boolean = " + !jones);

        /*
            negasi ! tidak bisa di pakai selain boolean,
            negasi plus dan minus tidak bisa dipakai di boolean
         */


    }
}

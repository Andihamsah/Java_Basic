package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input;
        float a, b, c, d;
        String userInput ;
        input = new Scanner(System.in);
        System.out.print("masukkan nilai a ");
        a = input.nextFloat();
        System.out.print("masukkan nilai b ");
        b = input.nextFloat();
        System.out.print("masukkan nilai c ");
        c = input.nextFloat();

        //Percabangan
        //If else
        System.out.print("Percabangan true false \n");
        if (a > b) {
            System.out.print("nilai a " + a + " > " + "nilai a "+b);
        }else {
            System.out.print("nilai a " + a + " < " + "nilai a "+b);
        }

        //If else elseif
        System.out.print(" \n Percabangan else if \n");

        if (a > b) {
            System.out.print("nilai a " + a + " > " + "nilai a "+b);
        }else if(a == b){
            System.out.print("nilai a " + a + " = " + "nilai a "+b);
        }else {
            System.out.print("nilai a " + a + " < " + "nilai a "+b);
        }

        //nested if
        System.out.print("\nPercabangan if bersarang \n");

        if (a > b) {
            if (a == c){
                System.out.print("nilai a " + a + " == " + "nilai c "+c);
            }
        }else {
            System.out.print("nilai a " + a + " < " + "nilai a "+b);
        }

        //Ternary
        //var x = (ekspresi) ? statement true : statement false;
        System.out.print("\nTernary\n");
        d = (a != b) ? (a  * b)  :  (a + b);
        System.out.println("\nhasilnya" + d);



        //switch case
        System.out.println("\nSiapa yang ingin kau nikahi");
        userInput = input.next();
        switch (userInput){
            case "iwa":
                System.out.println("Tunggu aku");
                break;
            case "risma":
                System.out.println("Dah ah males");
                break;
            default:
                System.out.println("wkwkwk Ngarep");
        }

        //Kalkulator Sederhana
        char operator;

        System.out.print("nilai pertama = ");
        a = input.nextFloat();
        System.out.print("operator ");
        operator = input.next().charAt(0);
        System.out.print("nilai kedua = ");
        b = input.nextFloat();

        if (operator == '+'){
            d = a + b;
            System.out.println("hasil = " + d);
        }else if (operator == '-'){
            d = a - b;
            System.out.println("hasil = " + d);
        }else if (operator == '*'){
            d = a * b;
            System.out.println("hasil = " + d);
        }else if (operator == '/'){
            if (b == 0){
                System.out.println("Tidak bisa dibagi 0");
            }else {
                d = a / b;
                System.out.println("hasil = " + d);
            }

        }else{
            System.out.println("operator tidak ditemukan !!!");
        }
    }
}

package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //While
//        int i = 0;
//        System.out.println("While");
//        while(i <= 10) {
//            System.out.println("perulangan ke " + i);
//            i++;
//        }
        //Do while

//        System.out.println("\n Do While");
//        do {
//            System.out.println("perulangan ke " + i);
//            i++;
//        }while(i <= 10);

        //for
//        System.out.println("For loop");
//        for (int i = 0; i <= 10; i ++){
//            System.out.println("loop ke" + i);
//        }

        //nested Loop
        for (int i = 0 ; i <= 10; i++){
            for (int j = 0; j <= 10; j++ ){
                //+X
//                if (i == j || (i+j) == 10 || i == 5 || j == 5){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("- ");
//                }

                //sgitiga kri kanan
//                if ((j + i) <= 10 && j <= i || j >= i && (j + i) >= 10){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("- ");
//                }

                //sgitiga atas bawah
//                if ((i + j) <= 10 && i <= j || (i+j) >= 10 && i >= j){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("- ");
//                }

                //sgitiga atas bawah garis datar tengah
                if ((i + j) <= 10 && i <= j || i == 5 || (i+j) >= 10 && i >= j){
                    System.out.print("* ");
                    //tambah - kebawah
                    if (j == 4 || j == 5){
                        System.out.print("- ");
//                        break;
                    }
                }else {
                    System.out.print("- ");
                }

            }
            System.out.print("\n");
        }

        //latihan loop sederhana
//
//        int nilaiAwal, nilaiAkhir, total;
//        System.out.println("Masukkan nilai Awal = ");
//        nilaiAwal = input.nextInt();
//        System.out.println("Masukkan nilai Akhir = ");
//        nilaiAkhir = input.nextInt();
//
//        total = 0;
        //for
//        for (nilaiAwal = nilaiAwal; nilaiAwal <= nilaiAkhir; nilaiAwal++){
//            System.out.println(total);
//            total = total + nilaiAwal;
//            System.out.println("+ " + nilaiAwal + " menjadi = " + total);
//        }

        //while
//        while(nilaiAwal <= nilaiAkhir){
//            System.out.println(total);
//            total = total + nilaiAwal;
//            System.out.println("+ " + nilaiAwal + " menjadi = " + total);
//            nilaiAwal++;
//        }

        //deret fibonacci

        //n0 = 0, n1 = 1, n2 = 2, n3 = 3
        //f-2 = 0, f-1 = 1,
        //f1 = n1 = f-1 + f-2... f1 = 1
        //
        int fn, fn_1,fn_2, n;
//        System.out.println("fibonacci ke - ");
//        n = input.nextInt();
        fn_2 = 0;
        fn_1 = 1;
        fn = 1;
        //for
//        for (int i = 1 ; i <= n; i ++){
//            System.out.println("nilai ke - " + i + " adalah " + fn);
//
//            fn = fn_1 + fn_2;
//            fn_2 = fn_1;
//            fn_1 = fn;
//        }
        //while
        int i = 1;
//        while (i <= n){
//            System.out.println("nilai ke - " + i + " adalah " + fn);
//            fn = fn_1 + fn_2;
//            fn_2 = fn_1;
//            fn_1 = fn;
//            i++;
//        }

        //Do while
//        do{
//            System.out.println("nilai ke - " + i + " adalah " + fn);
//            fn = fn_1 + fn_2;
//            fn_2 = fn_1;
//            fn_1 = fn;
//            i++;
//        }while (i <= n);

        //loop ke i itu adalah nilai dari hasil penjumlahan fibonacci -1 & -2
        //contoh
        //krna hasil dari f1 itu f-2 + f-1 dan default nya dari f-2=0 dan f-1=1, maka f5 = f-4 + f-3

        //jadi ini merupakan perhitangan deret menggunakan looping
        //jadi, Stiap kita ingin menyelesaikan masalah yg berpola, kita menggunakan looping

    }
}

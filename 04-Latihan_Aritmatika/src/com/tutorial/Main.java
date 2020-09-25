package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Luas dan keliling lingkaran
        System.out.println("Menghitung Luas & Keliling Lingkaran");
        float phi, luas, keliling, r, d, jum, x, rata;
        int i,n ;
        phi   = 3.14f;
        System.out.print("Jari-Jari = ");
        r       = userInput.nextFloat() ;
        d       = 2 * r;
        luas = r * r * phi;
        keliling = 2 * r * phi;
        System.out.println("diamater = " + d);
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);

        //Nilai Rata-Rata
        System.out.println("\nMenghitung Mean/Rata-Rata");
        System.out.print("Banyak Data = ");
        n   = userInput.nextInt();
        jum = 0;
        i   = 1;
        while(i <= n) {
            System.out.print("Data " + i + ":");
            x = userInput.nextFloat();
            jum += x;
            i++;
        }

        rata = jum / n ;

        System.out.println("Jumlah = " + jum);
        System.out.println("Rata-Rata = " + rata);

        //Operator Logika
        System.out.println("Operator Logika");
        int nilaiBenar, nilaiTebakan;
        boolean statusTebakan;
        nilaiBenar = 8;

        System.out.print("Masukkan Nilai Tebakan Anda : ");
        nilaiTebakan = userInput.nextInt();
        System.out.println("nilai Tebakan Anda = " + nilaiTebakan);

        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda = " + statusTebakan);

        //Operator Boolean
        System.out.println("Operator Boolean");
        System.out.print("Masukkan nilai antara 6 sampai  10 : ");
        nilaiTebakan = userInput.nextInt();

        statusTebakan = (nilaiTebakan > 6) && (nilaiTebakan < 10);
        System.out.println("Tebakan anda = " + statusTebakan);

    }
}

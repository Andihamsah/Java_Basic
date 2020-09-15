package com.tutorial;

public class Main {

    public static void main(String[] args) {
        int angkaAwal;
        int angkaAkhir;
        int hasil;

        System.out.println("====Tambah====");
        angkaAwal = 5;
        angkaAkhir = 11;
        hasil= angkaAwal+angkaAkhir;
        System.out.printf("%d + %d = %d \n",angkaAwal, angkaAkhir, hasil);

        System.out.println("====Kurang====");
        angkaAwal = 11;
        angkaAkhir = 5;
        hasil = angkaAwal - angkaAkhir;
        System.out.printf("%d - %d = %d \n", angkaAwal, angkaAkhir, hasil);

        System.out.println("====Kali====");
        angkaAwal = 11;
        angkaAkhir = 5;
        hasil = angkaAwal * angkaAkhir;
        System.out.printf("%d * %d = %d \n", angkaAwal, angkaAkhir, hasil);

        System.out.println("====Bagi====");
        angkaAwal = 11;
        angkaAkhir = 5;
        float hasilBagi = (float)angkaAwal / angkaAkhir;
        System.out.printf("%d / %d = %f \n", angkaAwal, angkaAkhir, hasilBagi);

        System.out.println("====Modulus====");
        angkaAwal = 11;
        angkaAkhir = 5;
        hasil = angkaAwal % angkaAkhir;
        System.out.printf("%d %% %d = %d \n", angkaAwal, angkaAkhir, hasil);
    }
}
 
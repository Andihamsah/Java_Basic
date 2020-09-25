package com.tutorial;

public class Main {

    public static void main(String[] args) {

        //Operator bitwise --> operator untuk melakukan operasi pada nilai bit
        //penjelasan ada di vidio java dasar-16 di channel sekolah terbuka
        //diapakai saat bertemu dengan banyak nilai bolean

        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;

        //Operator Shift Left
        System.out.println("=== Shift Left (<<) ===");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        //Operator Shift Right
        System.out.println("=== Shift Right (>>) ===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte)(a >> 2); //>> atau << geser ke kanan atw ke kiri
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        //Operator Bitwise OR
        System.out.println("=== Bitwise OR (|) ===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 32;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("-----------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);


        //Operator Bitwise AND
        System.out.println("=== Bitwise AND (&) ===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("-----------AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

        //Operator Bitwise XOR
        System.out.println("=== Bitwise XOR (^) ===");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("-----------XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

    }
}

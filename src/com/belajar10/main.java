// MEMAHAMI OPERATOR BITWISE
// Bitwise adalah operator yang digunakan untuk memanipulasi data pada lapisan bit suatu nilai.
package com.belajar10;

public class main {
    public static void main(String[] args){

        System.out.println("===============");
        System.out.println("OPERASI BITWISE");
        System.out.println("===============");

        //deklarasi
        byte a, b, hasil;
        String ke_bit;

        // jenis jsenis operator bitwise:

        // 1. Shift right (>>)
        System.out.println("\n1. OPERATOR SHIF RIGHT (>>)");
        System.out.println("-----------------------------");
        a = 10;
        // sebelum operasi
        ke_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.println( a + " = " + ke_bit );
        // proses bitwise
        hasil = (byte)(a >> 2);
        // mengubah ke dalam angka bit
        ke_bit = String.format("%8s",Integer.toBinaryString(hasil)).replace(' ','0');
        // menampilkan ke dalam konsol
        System.out.println( a + " >> 2 = " + ke_bit + " menjadi " + hasil );

        // 2. Shift left (<<)
        System.out.println("\n2. OPERATOR SHIF LEFT (<<)");
        System.out.println("-----------------------------");
        a = 10;
        // sebelum operasi
        ke_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.println( a + " = " + ke_bit );
        // proses bitwise
        hasil = (byte)(a << 2);
        // mengubah ke dalam angka bit
        ke_bit = String.format("%8s",Integer.toBinaryString(hasil)).replace(' ','0');
        // menampilkan ke dalam konsol
        System.out.println( a + " << 2 = " + ke_bit + " menjadi " + hasil );

        // 3. operator bitwise OR
        System.out.println("\n3. OPERATOR BITWISE OR (|)");
        System.out.println("-----------------------------");
        // penentuan nilai
        a = 121;
        b = 13;
        // menampilkan ke konsol
        ke_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.println(ke_bit + " = " + a );
        ke_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.println(ke_bit + " = " + b );
        System.out.println("------------------ or");
        // proses operasi
        hasil = (byte) (a | b);
        ke_bit = String.format("%8s",Integer.toBinaryString(hasil)).replace(' ','0');
        System.out.println(ke_bit + " = " + hasil);

        // 4. operator bitwise AND
        System.out.println("\n4. OPERATOR BITWISE AND (&)");
        System.out.println("-----------------------------");
        // penentuan nilai
        a = 121;
        b = 13;
        // menampilkan ke konsol
        ke_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.println(ke_bit + " = " + a );
        ke_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.println(ke_bit + " = " + b );
        System.out.println("------------------ and");
        // proses operasi
        hasil = (byte) (a & b);
        ke_bit = String.format("%8s",Integer.toBinaryString(hasil)).replace(' ','0');
        System.out.println(ke_bit + " = " + hasil);

        // 5. operator bitwise XOR
        System.out.println("\n5. OPERATOR BITWISE XOR (^)");
        System.out.println("-----------------------------");
        // penentuan nilai
        a = 121;
        b = 13;
        // menampilkan ke konsol
        ke_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.println(ke_bit + " = " + a );
        ke_bit = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.println(ke_bit + " = " + b );
        System.out.println("------------------ xor");
        // proses operasi
        hasil = (byte) (a ^ b);
        ke_bit = String.format("%8s",Integer.toBinaryString(hasil)).replace(' ','0');
        System.out.println(ke_bit + " = " + hasil);

        //6 operator bitwise NOT/ negasi
        System.out.println("\n6. OPERATOR BITWISE NOT (~)");
        System.out.println("-----------------------------");
        a = 123;
        ke_bit = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.println(ke_bit + " = " + a );
        System.out.println("------------------ not");
        // proses oerasi
        hasil = (byte)(~a);
        ke_bit = String.format("%8s",Integer.toBinaryString(hasil)).replace(' ','0');
        ke_bit = ke_bit.substring(24);// untuk membuat nilai menjadi 24 bit
        System.out.println(ke_bit + " = " + hasil );

    }
}

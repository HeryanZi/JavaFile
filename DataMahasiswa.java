package com_UTS_Heryan;
import java.util.Scanner;

public class DataMahasiswa{


    public static void main ( String[] args ){

        // tipe data yang di butuhkan beserta jenis 
        String Nama,Alamat,jurusan;
        float Semester,NomorHp,Umur,NPM;
        // membuat objek dari class scanner
        // untuk input apabila String menggunakan nextLine, Float menggunakan nextFloat, integer(int)
        // maka menggunakan nextint

        Scanner input = new scanner(system.in);
        // tampilan output pada program
        System.out.println("****** == PROGRAM DATA MAHASISWA == ******");
        System.out.println("****** == Universitas Banten Jaya == ******");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println();
        //tampilan output untuk simpan data
        System.out.println("Nama Mahasiswa : ");
        //input di simpan
        Nama = input.nextLine();
        //tampilan output untuk simpan data
        System.out.println("NPM : ");
        //input di simpan
        NPM = input.nextFloat();
        //tampilan output untuk simpan data
        System.out.println("Jurusan : ");
        //input di simpan
        jurusan = input.nextLine();
        //tampilan output untuk simpan data
        System.out.println("Semester : ");
        //input di simpan
        Semester = input.nextFloat();
        //tampilan output untuk simpan data
        System.out.println("Masukkan Alamat : ");
        //input di simpan
        Alamat = input.nextLine();
        //tampilan output untuk simpan data
        System.out.println("Umur : ");
        //input di simpan
        Umur = input.nextFloat();
        //tampilan output untuk simpan data
        System.out.println("Nomor Hp : ");
        //input di simpan
        NomorHp = input.nextFloat();

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Nama Mahasiswa : " + Nama);
        //tampilan output hasil 
        System.out.println("NPM : " + NPM);
        //tampilan output hasil
        System.out.println("Jurusan : " + jurusan);
        //tampilan output hasil
        System.out.println("Semester : " + Semester);
        //tampilan output hasil
        System.out.println("Masukkan Alamat : " + Alamat);
        //tampilan output hasil
        System.out.println("Umur : " + umur "Tahun");
        //tampilan output hasil
        System.out.println("Nomor Hp : " + NomorHp);

    // jika ingin menampilkan output hasil maka harus menambahkan + nama variabel agar input
    // data yang telah kita simpan bisa di panggil kembali


    }

    
}
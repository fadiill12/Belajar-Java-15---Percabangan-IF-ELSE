package com.belajar;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

        // STUDI KASUS : MENENTUKAN NILAI MAHASISWA. JIKA NILAI
        // KURANG DARI 75 MAKA TIDAK LULUS, LAIN JIKA NILAI MAHASISWA LEBIH DARI 75 MAKA LULUS

        int nilai;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("\n========== MENENTUKAN NILAI MAHASISWA ==========");
        System.out.print("MASUKAN NILAI MAHASISWA : ");
        nilai = inputUser.nextInt();

        if ((nilai >= 75) && (nilai <= 100)){
            System.out.println("MAHASISWA LULUSS 100%");
            System.out.println("========== MENENTUKAN NILAI MAHASISWA ==========");
        } else if ((nilai >= 0) && (nilai <=75)) {
            System.out.println("MAHASISWA TIDAK LULUSS!! NGULANGG!!");
            System.out.println("========== MENENTUKAN NILAI MAHASISWA ==========");
        } else {
            System.out.printf("MASUKAN NILAI YANG ANDA MASUKAN SALAHH!!!\n");
            System.out.println("========== MENENTUKAN NILAI MAHASISWA ==========");
        }


    }
}

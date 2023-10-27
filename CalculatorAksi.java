package Kalkulator;

import java.util.Scanner;
public class CalculatorAksi {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner (System.in);
        System.out.println("=====================");
        System.out.println("   KALKULATOR");
        System.out.println("   Pilihan: ");
        System.out.println("   1. Untuk Tipe Data Integer");
        System.out.println("   2. Untuk Tipe Data Double");
        System.out.println("=====================");

        int pilih = 0;
        System.out.print("Masukan Angka Pilihan 1 dan 2 : ");
        pilih = inputUser.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Penjumlahan Untuk Tipe Data Integer");
                System.out.print("Nilai 1= ");
                int nilai1 = inputUser.nextInt();
                System.out.print("Nilai 2 = ");
                int nilai2 = inputUser.nextInt();

                Hitung mtk = new Hitung();
                System.out.println("Hasil Pertambahan: " +mtk.tambah(nilai1, nilai2));
                System.out.println("Hasil Pengurangan: " +mtk.kurang(nilai1, nilai2));
                System.out.println("Hasil Perkalian: " +mtk.kali(nilai1, nilai2));
                System.out.println("Hasil Pembagian: " +mtk.bagi(nilai1, nilai2));
                break;
            case 2:
                System.out.println("Penjumlahan Untuk Tipe Data Double");
                System.out.print("Nilai 1 = ");
                double nilai3 = inputUser.nextDouble();

                System.out.print("Nilai 2 = ");
                double nilai4 = inputUser.nextDouble();

                Hitung MTK = new Hitung();
                System.out.println("Hasil Pertambahan: " +MTK.tambah(nilai3, nilai4));
                System.out.println("Hasil Pengurangan: " +MTK.kurang(nilai3, nilai4));
                System.out.println("Hasil Perkalian: " +MTK.kali(nilai3, nilai4));
                System.out.println("Hasil Pembagian: " +MTK.bagi(nilai3, nilai4));
                break;
            default:
                System.out.println("Salah Input, Input Angka Sesuai urutan Menu");
        }
    }
}
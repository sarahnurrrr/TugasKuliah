package BillLaptopUTS;

import java.text.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bill {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Lenovo lenovo = new Lenovo();
        HP hp = new HP();
        Asus asus = new Asus();
        Fujitsu fujitsu = new Fujitsu();
        GregorianCalendar date = new GregorianCalendar();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        Scanner input = new Scanner(System.in);
        System.out.println("======================================================================");
        System.out.println("                           TOKO XYZ (TIM 4)");
        System.out.println("======================================================================");

//      ATURAN BIAR RAPIH
//      INI UNTUK ATURAN WAKTU - START
        int detik, menit, jam, hari, bulan, tahun;
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
//      END ATURAN WAKTU


//      INI BIAR ANGKA RAPIH PAKE KARENSI GITU
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
//      SAMPE SINI KARENSI NYA
//      ATURAN BIAR RAPIH END

//        MENU
        System.out.printf("(1)"+apple.nama+"              %s %n", kursIndonesia.format(apple.harga));
        System.out.printf("(2)"+lenovo.nama+"       %s %n", kursIndonesia.format(lenovo.harga));
        System.out.printf("(3)"+hp.nama+"           %s %n", kursIndonesia.format(hp.harga));
        System.out.printf("(4)"+asus.nama+"              %s %n", kursIndonesia.format(asus.harga));
        System.out.printf("(5)"+fujitsu.nama+"         %s %n", kursIndonesia.format(fujitsu.harga));

        System.out.print("Pilih barang yang anda ingin Beli (Input 1 - 5) : ");
        int pil = input.nextInt();
        System.out.println("======================================================================");
//      MULAI SWITCH CASE
        switch (pil) {

            case 1:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Pembelian anda hari ini : ");
                System.out.println("Tanggal      : "+hari+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik+" WIB");
                System.out.println("Items        : "+apple.nama);
                System.out.printf("Harga        : "+"%s %n", kursIndonesia.format(apple.harga));
                if (jam >= 13 && jam <= 14){
                    apple.diskon = apple.harga * 0.05;
                    apple.harga = apple.harga-apple.diskon;
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(apple.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(apple.harga));
                }
                else {
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(apple.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(apple.harga));
                }
                System.out.println("Terima Kasih atas kunjungannya.");
                break;
            case 2:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Pembelian anda hari ini : ");
                System.out.println("Tanggal      : "+hari+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik+" WIB");
                System.out.println("Items        : "+lenovo.nama);
                System.out.printf("Harga        : "+"%s %n", kursIndonesia.format(lenovo.harga));
                if (jam >= 13 && jam <= 14){
                    lenovo.diskon = lenovo.harga * 0.05;
                    lenovo.harga = lenovo.harga-lenovo.diskon;
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(lenovo.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(lenovo.harga));
                }
                else {
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(lenovo.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(lenovo.harga));
                }
                System.out.println("Terima Kasih atas kunjungannya.");
                System.out.println("----------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Pembelian anda hari ini : ");
                System.out.println("Tanggal      : "+hari+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik+" WIB");
                System.out.println("Items        : "+hp.nama);
                System.out.printf("Harga        : "+"%s %n", kursIndonesia.format(hp.harga));
                if (jam >= 13 && jam <= 14){
                    hp.diskon = hp.harga * 0.05;
                    hp.harga = hp.harga-hp.diskon;
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(hp.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(hp.harga));
                }
                else {
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(hp.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(hp.harga));
                }
                System.out.println("Terima Kasih atas kunjungannya.");
                System.out.println("----------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Pembelian anda hari ini : ");
                System.out.println("Tanggal      : "+hari+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik+" WIB");
                System.out.println("Items        : "+asus.nama);
                System.out.printf("Harga        : "+"%s %n", kursIndonesia.format(asus.harga));
                if (jam >= 13 && jam <= 14){
                    asus.diskon = asus.harga * 0.05;
                    asus.harga = asus.harga-asus.diskon;
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(asus.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(asus.harga));
                }
                else {
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(asus.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(asus.harga));
                }
                System.out.println("Terima Kasih atas kunjungannya.");
                System.out.println("----------------------------------------------------------------------");
                break;
            case 5:
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Pembelian anda hari ini : ");
                System.out.println("Tanggal      : "+hari+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik+" WIB");
                System.out.println("Items        : "+fujitsu.nama);
                System.out.printf("Harga        : "+"%s %n", kursIndonesia.format(fujitsu.harga));
                if (jam >= 13 && jam <= 14){
                    fujitsu.diskon = fujitsu.harga * 0.05;
                    fujitsu.harga = fujitsu.harga-hp.diskon;
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(fujitsu.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(fujitsu.harga));
                }
                else {
                    System.out.printf("Potongan     : "+"%s %n", kursIndonesia.format(fujitsu.diskon));
                    System.out.printf("Total        : "+"%s %n", kursIndonesia.format(fujitsu.harga));
                }
                System.out.println("Terima Kasih atas kunjungannya.");
                System.out.println("----------------------------------------------------------------------");
                break;
            default:
                System.out.println("Tolong Input dengan benar");
                break;
        }
    }
}

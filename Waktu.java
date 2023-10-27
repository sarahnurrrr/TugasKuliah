package BillLaptopUTS;
import java.util.*;
class Waktu {
    public static void main(String[] args){
        int detik, menit, jam, hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        Apple apple = new Apple();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam =  date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        System.out.println("Tanggal sekarang: "+hari+" "+namabulan[bulan]+" "+tahun);
        System.out.println("Waktu sekarang: "+jam+":"+menit+":"+detik);
        System.out.println(jam);
        double harga = 100000;
        double diskon;
        if (jam >= 11){
            diskon = apple.harga * 0.05;
            apple.harga = apple.harga-diskon;
            System.out.println(apple.harga);
        }
        else {
            System.out.println(apple.harga);
        }

    }
}
package bbidealUTS;
import java.util.Scanner;
public class Hitung {
    public static void main(String[] args) {
        Lakilaki laki = new Lakilaki();
        Perempuan perem = new Perempuan();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jenis Kelamin (L/P) ");
        String pilih = input.next();
        switch (pilih) {
            case "L":
                System.out.print("Masukkan Tinggi Badan anda (cm) : ");
                laki.tinggi = input.nextInt();
                System.out.println("Berat Badan Ideal anda adalah (kg) : "+laki.hitungBeratIdeal());
                break;
            case "P":
                System.out.print("Masukan Tinggi Badan anda (cm) : ");
                perem.tinggi = input.nextInt();
                System.out.println("Berat Badan Ideal anda adalah (kg) : "+perem.hitungBeratIdeal());
                break;
            default:
                System.out.println("Salah Input Pilih L/P");
                break;
        }
        System.out.println("Terimakasih Telah Menggunakan Program ini!!");
    }
}
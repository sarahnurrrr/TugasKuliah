package SegitigaSiku;
import java.util.Scanner;
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga sgtg = new Segitiga();
        Scanner input = new Scanner(System.in);

        int pilih = 1;
        while (pilih != 5) {
            System.out.println(" ========= PROGRAM MENU OPERASI SEGITIGA SIKU-SIKU =========");
            System.out.println(" ===========================================================");
            System.out.println("|       1. INISIALISASI ALAS DAN TINGGI                    |");
            System.out.println("|       2. CARI SISI MIRING                                |");
            System.out.println("|       3. HITUNG LUAS DAN KELILING                        |");
            System.out.println("|       4. TAMPILKAN INFORMASI                             |");
            System.out.println("|       5. KELUAR PROGRAM                                  |");
            System.out.println(" ===========================================================");
            System.out.print("\nPilih Menu: ");

            pilih = input.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println(" ===========================================================");
                    System.out.println("                 INISIALISASI ALAS DAN TINGGI");
                    System.out.println(" ===========================================================");
                    System.out.print("Masukan nilai Alas : ");
                    sgtg.alas = input.nextDouble();
                    System.out.print("Masukan nilai tinggi : ");
                    sgtg.tinggi = input.nextDouble();
                    break;

                case 2:
                    System.out.println(" ===========================================================");
                    System.out.println("                         SISI MIRING");
                    System.out.println(" ===========================================================");
                    System.out.print("Alas = " + sgtg.alas);
                    System.out.print("\nTinggi = "+ sgtg.tinggi);
                    System.out.print("\nMaka Sisi miring nya adalah = ");
                    double s = sgtg.sisiMiring();
                    System.out.println(s);
                    break;

                case 3:
                    System.out.println(" ===========================================================");
                    System.out.println("                       LUAS DAN KELILING");
                    System.out.println(" ===========================================================");
                    double l = sgtg.luas();
                    double k = sgtg.keliling();
                    System.out.println("luasnya adalah : " +l);
                    System.out.println("kelilingnya adalah : " +k);
                    break;

                case 4:
                    System.out.println(" ===========================================================");
                    System.out.println("                 INFORMASI SEGITIGA SIKU-SIKU");
                    System.out.println(" ===========================================================");
                    System.out.println("Segitiga Siku-siku dengan...");
                    System.out.print("Alas = ");
                    System.out.print(sgtg.alas);
                    System.out.print("\nTinggi = ");
                    System.out.print(sgtg.tinggi);
                    System.out.println("\nDAN");
                    System.out.print("Sisi Miring = ");
                    s = sgtg.sisiMiring();
                    System.out.print(s);;
                    System.out.println("\nMaka...");
                    l = sgtg.luas();
                    k = sgtg.keliling();
                    System.out.print("Luas = ");
                    System.out.print(l);
                    System.out.print("\nKeliling = ");
                    System.out.println(k);
                    break;

                case 5:
                    System.out.println(" ===========================================================");
                    System.out.println("               SELEMAT TINGGAL DAN TERIMA KASIH");
                    System.out.println(" ===========================================================");
                    System.exit(0);

                    break;

                default:
                    System.out.println("Salah Input, Input Angka Sesuai urutan Menu");

            }
        }
    }
}
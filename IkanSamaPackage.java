package binatang;

public class IkanSamaPackage {
    public static void main(String[] args) {
        Ikan i = new Ikan();
        //variabel mata bisa dipanggil karena hak aksesnya public
            System.out.println ("Mata ikan="+i.mata);
        //variabel sirip bisa dipanggil karena 1 package
            System.out.println ("Sirip ikan="+i.sirip);
        //Method berenang pun bisa dipanggil
            System.out.println (i.berenang());
    }
}

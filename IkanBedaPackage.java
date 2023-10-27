import binatang.Ikan;
public class IkanBedaPackage {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        Ikan i = new Ikan();
    //variabel mata bisa dipanggil karena hak aksesnya public
        System.out.println ("Mata ikan="+i.mata);
    //variabel sirip tidak bisa dipanggil karena hak aksesnya protected
        System.out.println ("Sirip ikan="+i.sirip);
    }
}
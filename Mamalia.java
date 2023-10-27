package binatang;

public class Mamalia {
    private String nama;
    private int kaki;
    private int mata;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getKaki() {
        return kaki;
    }
    public void setKaki(int kaki) {
        this.kaki = kaki;
    }
    public int getMata() {
        return mata;
    }
    public void setMata(int mata) {
        this.mata = mata;
    }
    //method private
    private String Berjalan(){
        String s = "Mamalia Berjalan";
        return s;
    }
    //method public untuk memanggil method Berjalan();
    public String PanggilBerjalan(){
        return Berjalan();
    }
}

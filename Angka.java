public class Angka {
    int hitung(int x){
        int y = 20;
        int jumlah = x + y;
        return jumlah;//int
    }
    //Overloading
    double hitung (int x, double y){
        double jumlah = x * y;
        return jumlah;//double
    }
    String hitung(){
        double jumlah3 = hitung(20) + hitung (10, 0.5);
        String jumlahTotal = buatString(jumlah3);
        return jumlahTotal;//string
    }
    String buatString(double x){
        return "jumlah total adalah " + x;
    }

    public static void main(String[] args)
    {
        Angka angka = new Angka();
        System.out.println(angka.hitung());
    }
}
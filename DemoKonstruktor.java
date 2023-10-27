public class DemoKonstruktor {
    public static void main(String[] args) {
        System.out.println("\nPROGRAM DEMO KONSTRUKTOR");
        System.out.println("============================\n");

        //Membuat lingkaran dengan radius 10.0
        Lingkaran lingkaransatu = new Lingkaran(10.0);
        System.out.println("Luas lingkaran dengan radius "+lingkaransatu.radius+" : "+lingkaransatu.luas());

        //Membuat lingkaran dengan radius default
        Lingkaran lingkarandua = new Lingkaran();
        System.out.println("Luas lingkaran dengan radius default "+lingkarandua.radius+" : "+lingkarandua.luas());

        lingkarandua.radius = 15;
        System.out.println("Luas lingkaran dengan radius "+lingkarandua.radius+" : "+lingkarandua.luas());
    }
}
//mendefinisikan kelas lingkaran dengan dua konstruktor
class Lingkaran{
    double radius;
    //konstruktor default
    Lingkaran(){
        radius = 1.0;
    }
    //konstruktor dengan suatu radius
    Lingkaran (double r){
        radius = r;
    }
    //method mengembalikan Luas Lingkaran
    double luas(){
        return radius*radius*Math.PI;
    }
}

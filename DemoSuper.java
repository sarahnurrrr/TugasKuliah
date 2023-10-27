public class DemoSuper {
    public static void main(String[] args) {
        System.out.println("\nDEMO 'super' pada INHERITANCE");
        System.out.println("============================\n");
        KelasAnak KA = new KelasAnak();
        KA.methodAnak();

    }
}
class KelasAnak extends KelasInduk {
    public KelasAnak(){
        super();
    }
    public void methodAnak(){
        super.methodInduk();
    }
}
class KelasInduk{
    public KelasInduk(){
        System.out.println("Ini adalah konstruktor kelas Induk\n");
    }
    public void methodInduk(){
        System.out.println("Method ini dimiliki oleh kelas Induk\n");
    }
}
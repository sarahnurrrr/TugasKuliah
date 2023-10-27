import binatang.Mamalia;
public class PanggilMamalia {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Mamalia m = new Mamalia();
        m.setKaki(4);
        m.setMata(2);
        m.setNama("Singa");
        System.out.println("Mata ="+m.getMata());
        System.out.println("Kaki ="+m.getKaki());
        System.out.println("Nama ="+m.getNama());
        System.out.println(m.PanggilBerjalan());
    }
}


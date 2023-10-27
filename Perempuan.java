package bbidealUTS;

public class Perempuan extends  Orang {

    @Override
    public int getTinggi() {
        return tinggi;
    }

    @Override
    public int hitungBeratIdeal(){
        beratideal = (int) (0.8 * (tinggi-100));
        return beratideal;
    }
}

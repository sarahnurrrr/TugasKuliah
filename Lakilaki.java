package bbidealUTS;

public class Lakilaki extends Orang { // =Class laki2 sebagai anak dari orang

    @Override
    public int getTinggi() {
        return tinggi;
    }
    @Override
    public int hitungBeratIdeal(){
        beratideal = (int) (0.9 * (tinggi-100));
        return beratideal;
    }
}

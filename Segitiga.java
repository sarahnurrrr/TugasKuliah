package SegitigaSiku;

public class Segitiga {
    double alas, tinggi, sisiMiring, luas, keliling;

    public double sisiMiring(){
        sisiMiring = ((alas*alas) +(tinggi*tinggi));
        return Math.sqrt(sisiMiring);
    }
    public double luas(){
        luas = 0.5 * alas * tinggi;
        return luas;
    }
    public double keliling(){
        keliling = alas + tinggi + Math.sqrt(sisiMiring);
        return keliling;
    }
}
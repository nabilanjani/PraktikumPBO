package TugasTambahan2.Soal1.org.bangunruang;
import TugasTambahan2.Soal1.org.bangundatar.SegitigaSamaSisi;

//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2

public class LimasSegitiga {
    private double tinggiLimas;
    private SegitigaSamaSisi alas;

    public LimasSegitiga(SegitigaSamaSisi alas, double tinggiLimas){
        this.alas = alas;
        this.tinggiLimas = tinggiLimas;
    }
    public double getTinggiLimas() {
        return tinggiLimas;
    }
    public double hitungLP(){
        double luasSegitiga = alas.luasSegitiga();
        double tinggiLimas = getTinggiLimas();
        return (1.0/3.0) * luasSegitiga * tinggiLimas;
    }
}

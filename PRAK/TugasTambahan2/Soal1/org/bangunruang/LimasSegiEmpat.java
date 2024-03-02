package TugasTambahan2.Soal1.org.bangunruang;
import TugasTambahan2.Soal1.org.bangundatar.SegitigaSamaSisi;
import TugasTambahan2.Soal1.org.bangundatar.BujurSangkar;

//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2
public class LimasSegiEmpat {
    private SegitigaSamaSisi tinggiLimas4;
    private BujurSangkar alas;

    public LimasSegiEmpat(BujurSangkar alas, SegitigaSamaSisi tinggiLimas){
        this.alas = alas;
        this.tinggiLimas4 = tinggiLimas;
    }
    public double VolLimas4(){
        double luasAlas = alas.hitungLuas();
        double tinggi = tinggiLimas4.getTinggiSegitiga();
        return (1.0/3.0) * luasAlas * tinggi;
    }

}

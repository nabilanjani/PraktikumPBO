package TugasTambahan2.Soal1.org.bangundatar;
import TugasTambahan2.Soal1.org.poligon.Poligon;
//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2
public class SegitigaSamaSisi extends Poligon {
    private double pjSisiSegitiga;
    private double tinggiSegitiga;
    public int jumlahSisi;

    public SegitigaSamaSisi(double pjSisiSegitiga){
        this.jumlahSisi = 3;
        this.tinggiSegitiga = Math.sqrt(pjSisiSegitiga + pjSisiSegitiga - (0.5 * pjSisiSegitiga)*(0.5 * pjSisiSegitiga));
        this.pjSisiSegitiga = pjSisiSegitiga;
    }

    public double getPjSisiSegitiga(){

        return this.pjSisiSegitiga;
    }
    public double getTinggiSegitiga(){

        return this.tinggiSegitiga;
    }
    public double luasSegitiga(){
        double pjSisiSegitiga = getPjSisiSegitiga();
        double tinggiSegitiga = getTinggiSegitiga();
        return 0.5 * tinggiSegitiga * pjSisiSegitiga;
    }
}

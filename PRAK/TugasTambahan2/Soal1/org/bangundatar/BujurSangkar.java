package TugasTambahan2.Soal1.org.bangundatar;
import TugasTambahan2.Soal1.org.poligon.Poligon;
//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2
public class BujurSangkar extends Poligon {
    private double panjangSisi;
    private double jumlahSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {

        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() 
    {

        return this.panjangSisi;
    }
}

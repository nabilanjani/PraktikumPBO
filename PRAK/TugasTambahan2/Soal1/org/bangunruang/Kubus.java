package TugasTambahan2.Soal1.org.bangunruang;
import TugasTambahan2.Soal1.org.bangundatar.BujurSangkar;
//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2
public class Kubus
{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan)
    {
        this.permukaan = permukaan;
    }

    public double hitungVolume()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}

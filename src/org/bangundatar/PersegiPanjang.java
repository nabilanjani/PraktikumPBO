//Nabila Betari Anjani 24060122140169
//PBO C2 tugas modul 13 Maret 2023

package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang,lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas()
    {
        return panjang * lebar;
    }
    public void printInfo()
    {
        System.out.println("Bangun Persegi Panjang berisi " + this.getJumlahSisi());
    }
}

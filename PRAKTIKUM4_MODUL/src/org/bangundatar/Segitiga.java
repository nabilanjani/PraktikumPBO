//Nabila Betari Anjani 24060122140169
//PBO C2 tugas modul 13 Maret 2023

package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas,tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas()
    {
        return alas * tinggi / 2;
    }
    public void printInfo()
    {
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi());
    }

}

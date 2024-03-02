package TugasTambahan2.Soal1.org.main;

import TugasTambahan2.Soal1.org.bangundatar.BujurSangkar;
import TugasTambahan2.Soal1.org.bangundatar.SegitigaSamaSisi;
import TugasTambahan2.Soal1.org.bangunruang.LimasSegiEmpat;
import TugasTambahan2.Soal1.org.bangunruang.LimasSegitiga;
import TugasTambahan2.Soal1.org.bangunruang.Kubus;

//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2

public class Main {
    public static void main(String[] args) {
        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(4);
        LimasSegitiga limas = new LimasSegitiga(segitiga, 10);

        System.out.println("Luas segitiga sama sisi: " + segitiga.luasSegitiga());
        System.out.println("Luas Permukaan limas segitiga: " + limas.hitungLP());

        BujurSangkar persegi = new BujurSangkar(4);
        Kubus kubus = new Kubus(persegi);

        System.out.println("Luas bujur sangkar : " + persegi.hitungLuas());
        System.out.println("Volume kubus : " + kubus.hitungVolume());
        System.out.println("Luas alas : " + kubus.hitungLuasAlas());

        LimasSegiEmpat limas4 = new LimasSegiEmpat(persegi,segitiga);
        System.out.println("Volume limas segi empat : " + limas4.VolLimas4());
    }
}



package TugasTambahan2.Soal2.org.main;

import TugasTambahan2.Soal2.org.mahasiswa.Mahasiswa;
import TugasTambahan2.Soal2.org.walimahasiswa.Walimahasiswa;

//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2

public class mainMahasiswa {
    public static void main(String[] args) {
        Walimahasiswa wali = new Walimahasiswa("Adhe Setya", "3374", "085", "Tembalang");
        Mahasiswa mahasiswa = new Mahasiswa("Nabila Betari Anjani", "3375", "40169", "Informatika", wali);
        mahasiswa.cetak();
    }
}
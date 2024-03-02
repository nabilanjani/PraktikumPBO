package TugasTambahan2.Soal2.org.mahasiswa;
import TugasTambahan2.Soal2.org.walimahasiswa.Walimahasiswa;
//Nabila Betari Anjani
//24060122140169 - PBO C2
//Praktikum 2

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private String nik;
    private String nim;
    private Walimahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, Walimahasiswa wali){
        this.nama = nama;
        this.nik = nik;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getNik(){
        return nik;
    }
    public Walimahasiswa getWali(){
        return wali;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setWali(Walimahasiswa wali){
        this.wali = wali;
    }
    public void cetak(){
        System.out.println("Nama : " + this.getNama() +"\nNIK Mahasiswa : "+this.getNik()+ "\nNIM : " + this.getNim() + "\nJurusan : " + this.getJurusan()
                + "\nWali : " + this.getWali().getNama() +"\nNIK Wali : "+this.getWali().getNik() + "\nNomor HP Wali : "+this.getWali().getNomorHp()
                + "\nAlamat Wali : "+this.getWali().getAlamat());
    }

}
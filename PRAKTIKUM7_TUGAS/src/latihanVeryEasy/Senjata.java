package latihanVeryEasy;

public class Senjata {
    private int peluru;
    private String bunyi;
    public Senjata(String Bunyi){
        this.bunyi = Bunyi;
    }
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return peluru;
    }
    public void setBunyi(String bunyi){
        this.bunyi=bunyi;
    }
    public void setPeluru(int s){
        this.peluru = s;
    }
    public void menembak() {
        if (peluru > 0) {
            System.out.println(getBunyi());
            peluru--;
        } else {
            System.out.println("Peluru habis");
        }
    }

    public void cetakSisaPeluru() {
        System.out.println("Sisa Peluru: " + getPeluru());
    }
}

//Nabila Betari Anjani - 24060122140169 PBO C2
//Praktikum 5 - Abstract dan Interface

public abstract class BangunDatar {
    protected double luas;
    public abstract double hitungLuas(double sisi);
    public void setLuas(double l){
        luas = l;
    }
    public double getLuas(){
        return luas;
    }
}

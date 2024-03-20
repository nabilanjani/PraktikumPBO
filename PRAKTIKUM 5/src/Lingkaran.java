//Nabila Betari Anjani - 24060122140169 PBO C2
//Praktikum 5 - Abstract dan Interface

import static java.lang.Math.PI;
class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}


class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari>0): "jari jari tidak boleh 0";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
//Pertanyaan : Secara konsep, ada yang kurang tepat pada program Asersi2?
//Jawab : Secara konsep sudah benar, namun nilai inputan jari-jari = 0  bertentang dengan kondisi asersi yang diatur
// oleh karena itu asersi akan selalu gagal dan tidak akan menghaislkan objek lingkaran

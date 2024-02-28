/*
class MTitik
{
    public static void main(String[] args)
    {
        Titik t1, t2, t3;
        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        t3 = new Titik(5,6);


        System.out.println("T1 = " + "(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("T2 = " + "(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("T3 = " + "(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        System.out.println("Jarak pusat : " + t1.getJarakPusat());

        t1.refleksiX(t1);
        t1.refleksiY(t1);
        System.out.println("T1 = " + "(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
    }
}
*/

public class Main{
    public static void  main(String[] args)
    {
        Garis m1;
        Titik titikAwal = new Titik(0,1);
        Titik titikAkhir = new Titik(2,3);
        m1 = new Garis(titikAwal, titikAkhir);

        double panjangGaris = m1.getPanjang();
        System.out.println("Panjang garis : " + panjangGaris);
    }
}


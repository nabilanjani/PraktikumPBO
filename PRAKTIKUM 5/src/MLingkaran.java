//Nabila Betari Anjani - 24060122140169 PBO C2
//Praktikum 5 - Abstract dan Interface

import java.util.Scanner;
public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sisi lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + "adalah " + l.hitungLuas());
    }
}

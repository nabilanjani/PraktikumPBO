package org.Main;
import org.kendaraan.Kendaraan;
import org.mobil.Mobil;
import org.motor.Motor;
import org.truk.Truk;

//Nabila Betari Anjani
//24060122140169 / PBO C2

public class MKendaraan {
    public static void main(String[] args)
    {
        Kendaraan kendaraan1 = new Kendaraan("Kendaraan Nathan");
        Mobil mobil1 = new Mobil("Bugatti Chiron",2);
        Motor motor1 = new Motor("Ducati Panigale V4 R",998);
        Truk truk1 = new Truk("Mercedes-Benz Actros",20);

        kendaraan1.cetakInfo();
        kendaraan1.gas(50, 3);
        kendaraan1.klakson();
        System.out.println();

        mobil1.cetakInfo();
        mobil1.bukaPintu(1);
        mobil1.gas(140, 3);
        mobil1.klakson();
        System.out.println();

        motor1.cetakInfo();
        motor1.hitungHorsepower(17);
        motor1.gas(20, 4);
        motor1.klakson();
        System.out.println();

        truk1.cetakInfo();
        truk1.muatBarang(30);
        truk1.gas(70, 8);
        truk1.klakson();
    }
}

//Nabila Betari Anjani 24060122140169
// PBO C2 - Tugas Tambahan Praktikum 3

public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota = new Anggota("Nabila");
        Buku buku1 = new Buku("Pemrograman Berorientasi Objek");
        Buku buku2 = new Buku("Grafika dan Komputasi Visual");
        Buku buku3 = new Buku("Sistem Cerdas");
        Buku buku4 = new Buku("Rekayasa Perangkat Lunak");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        }
    }
}
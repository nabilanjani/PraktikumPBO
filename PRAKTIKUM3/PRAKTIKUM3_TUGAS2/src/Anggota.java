//Nabila Betari Anjani 24060122140169
// PBO C2 - Tugas Tambahan Praktikum 3
public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException {
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Maksimum buku yang dapat dipinjam telah tercapai.");
        }
        if (!buku.isTersedia()) {
            throw new IllegalArgumentException("Buku tidak tersedia untuk dipinjam.");
        }

        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }
}

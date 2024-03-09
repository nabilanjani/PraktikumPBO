//Nabila Betari Anjani 24060122140169
// PBO C2 - Tugas Tambahan Praktikum 3
public class Buku {
    private String judul;
    private boolean tersedia;

    public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

}

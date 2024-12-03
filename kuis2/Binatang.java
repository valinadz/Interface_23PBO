package kuis2;

public class Binatang {
    private String nama;
    private int umur;

    // Constructor
    public Binatang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Setter dan Getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
}

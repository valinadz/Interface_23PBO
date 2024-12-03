package kuis2;

public class Singa extends Binatang implements Karnivora {
    private double kecepatanBerburu;

    // Constructor
    public Singa(String nama, int umur, double kecepatanBerburu) {
        super(nama, umur);
        this.kecepatanBerburu = kecepatanBerburu;
    }

    // Getter dan Setter untuk kecepatan berburu
    public double getKecepatanBerburu() {
        return kecepatanBerburu;
    }

    public void setKecepatanBerburu(double kecepatanBerburu) {
        this.kecepatanBerburu = kecepatanBerburu;
    }

    @Override
    public void berburu() {
        System.out.println(getNama() + " sedang berburu dengan kecepatan: " + kecepatanBerburu + " km/jam.");
    }

    @Override
    public void makanDaging() {
        System.out.println(getNama() + " sedang makan daging hasil buruan.");
    }
}

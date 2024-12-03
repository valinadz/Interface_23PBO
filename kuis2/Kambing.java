package kuis2;

public class Kambing extends Binatang implements Herbivora {
    private String jenisTumbuhanFavorit;

    // Constructor
    public Kambing(String nama, int umur, String jenisTumbuhanFavorit) {
        super(nama, umur);
        this.jenisTumbuhanFavorit = jenisTumbuhanFavorit;
    }

    // Getter dan Setter untuk jenis tumbuhan favorit
    public String getJenisTumbuhanFavorit() {
        return jenisTumbuhanFavorit;
    }

    public void setJenisTumbuhanFavorit(String jenisTumbuhanFavorit) {
        this.jenisTumbuhanFavorit = jenisTumbuhanFavorit;
    }

    @Override
    public void mencariTumbuhan() {
        System.out.println(getNama() + " sedang mencari tumbuhan untuk dimakan.");
    }

    @Override
    public void makanTumbuhan() {
        System.out.println(getNama() + " sedang makan tumbuhan favorit: " + jenisTumbuhanFavorit);
    }
}

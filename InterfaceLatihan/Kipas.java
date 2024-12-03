package InterfaceLatihan;

public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    @Override
    public String getInfo() {
        return "Kipas - Merk: " + getMerk() + ", Jenis: " + jenis +
               ", Warna: " + getWarna() + ", Harga: " + getHarga();
    }
}

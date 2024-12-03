package InterfaceLatihan;

public abstract class AlatElektronik {
    private double harga;
    private String warna;
    private String merk;

    public AlatElektronik(double harga, String warna, String merk) {
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public String getWarna() {
        return warna;
    }

    public String getMerk() {
        return merk;
    }

    public abstract String getInfo();
}

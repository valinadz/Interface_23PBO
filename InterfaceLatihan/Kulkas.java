package InterfaceLatihan;

public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public String getInfo() {
        return "Kulkas - Merk: " + getMerk() + ", Jumlah Pintu: " + jumlahPintu +
               ", Warna: " + getWarna() + ", Harga: " + getHarga();
    }
}

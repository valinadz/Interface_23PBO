package InterfaceLatihan;

public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;

    public TV(String jenisLayar, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
    }

    @Override
    public void naikkanVolume() {
        System.out.println("Klik tombol volume sisi atas");
    }

    @Override
    public void turunkanVolume() {
        System.out.println("Klik tombol volume sisi bawah");
    }

    @Override
    public String getInfo() {
        return "TV - Merk: " + getMerk() + ", Jenis Layar: " + jenisLayar +
               ", Warna: " + getWarna() + ", Harga: " + getHarga();
    }
}

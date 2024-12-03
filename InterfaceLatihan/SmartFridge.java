package InterfaceLatihan;

public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume() {
        System.out.println("Menaikkan volume kulkas pintar");
    }

    @Override
    public void turunkanVolume() {
        System.out.println("Menurunkan volume kulkas pintar");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Volume: " + volume;
    }
}

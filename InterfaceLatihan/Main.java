package InterfaceLatihan;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("LED", 5000000, "Hitam", "Samsung");
        Kipas kipas = new Kipas("Angin", 150000, "Putih", "Miyako");
        Kulkas kulkas = new Kulkas(2, 3000000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(50, 3, 10000000, "Hitam", "Samsung");

        System.out.println(tv.getInfo());
        System.out.println(kipas.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());

        // Testing Audible features
        tv.naikkanVolume();
        smartFridge.naikkanVolume();
    }
}

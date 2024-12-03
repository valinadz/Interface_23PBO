package kuis2;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Kambing
        Kambing kambing = new Kambing("Kambing Etawa", 3, "Rumput");
        System.out.println("Nama: " + kambing.getNama());
        System.out.println("Umur: " + kambing.getUmur() + " tahun");
        kambing.mencariTumbuhan();
        kambing.makanTumbuhan();

        System.out.println();

        // Instansiasi objek Singa
        Singa singa = new Singa("Singa Afrika", 5, 60.0);
        System.out.println("Nama: " + singa.getNama());
        System.out.println("Umur: " + singa.getUmur() + " tahun");
        singa.berburu();
        singa.makanDaging();
    }
}

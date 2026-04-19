// CLASS: Motor (extends abstract class Kendaraan)
// Subclass pertama yang mengimplementasikan semua abstract method dari Kendaraan.
public class Motor extends Kendaraan {

    public Motor(String id, String merk, String tipe, int harga) {
        super(id, merk, tipe, harga);
    }

    // =============================================
    // IMPLEMENTASI ABSTRACT METHOD 1: hitungBiaya(int hari)
    // Motor biasa: tarif standar tanpa surcharge/diskon otomatis
    // =============================================
    @Override
    public double hitungBiaya(int hari) {
        return (double) harga * hari;
    }

    // =============================================
    // IMPLEMENTASI ABSTRACT METHOD 2: getJenisKendaraan()
    // =============================================
    @Override
    public String getJenisKendaraan() {
        return "Motor";
    }

    // OVERRIDE: tampil() dari Kendaraan
    @Override
    public void tampil() {
        System.out.println("--- Motor ---");
        super.tampil();
    }

    public void tampilMotor() {
        tampil();
    }
}
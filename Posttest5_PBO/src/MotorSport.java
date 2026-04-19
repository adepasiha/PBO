// CLASS: MotorSport (extends Motor)
// Motor sport dengan surcharge 10% dan kategori sewa "Premium".
public class MotorSport extends Motor {
    private int cc;

    public MotorSport(String id, String merk, String tipe, int harga, int cc) {
        super(id, merk, tipe, harga);
        this.cc = cc;
    }

    // OVERRIDE: hitungBiaya — surcharge 10% karena mesin besar
    @Override
    public double hitungBiaya(int hari) {
        double base = super.hitungBiaya(hari);
        return base + (base * 0.10); // surcharge 10%
    }

    // OVERRIDE: getJenisKendaraan
    @Override
    public String getJenisKendaraan() {
        return "Motor Sport";
    }

    // OVERRIDE: getKategoriSewa dari ISewable — Motor Sport masuk kategori Premium
    @Override
    public String getKategoriSewa() {
        return "Premium";
    }

    // OVERRIDE: tampil() — tambahkan info CC
    @Override
    public void tampil() {
        System.out.println("--- Motor Sport ---");
        super.tampil();
        System.out.println("CC    : " + cc + " cc");
    }

    @Override
    public void tampilMotor() {
        tampil();
    }
}
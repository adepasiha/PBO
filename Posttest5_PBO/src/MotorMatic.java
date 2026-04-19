// CLASS: MotorMatic (extends Motor)
// Motor matic dengan diskon efisiensi 5% dan kategori sewa "Ekonomis".
public class MotorMatic extends Motor {
    private String fitur;

    public MotorMatic(String id, String merk, String tipe, int harga, String fitur) {
        super(id, merk, tipe, harga);
        this.fitur = fitur;
    }

    // OVERRIDE: hitungBiaya — diskon otomatis 5% karena lebih hemat BBM
    @Override
    public double hitungBiaya(int hari) {
        double base = super.hitungBiaya(hari);
        return base - (base * 0.05); // diskon efisiensi 5%
    }

    // OVERRIDE: getJenisKendaraan
    @Override
    public String getJenisKendaraan() {
        return "Motor Matic";
    }

    // OVERRIDE: getKategoriSewa dari ISewable — Motor Matic masuk kategori Ekonomis
    @Override
    public String getKategoriSewa() {
        return "Ekonomis";
    }

    // OVERRIDE: tampil() — tambahkan info Fitur
    @Override
    public void tampil() {
        System.out.println("--- Motor Matic ---");
        super.tampil();
        System.out.println("Fitur : " + fitur);
    }

    @Override
    public void tampilMotor() {
        tampil();
    }
}
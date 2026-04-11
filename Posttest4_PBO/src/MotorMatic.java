public class MotorMatic extends Motor {
    private String fitur;

    public MotorMatic(String id, String merk, String tipe, int harga, String fitur) {
        super(id, merk, tipe, harga);
        this.fitur = fitur;
    }

    // OVERRIDE 4: tampil() dari Motor/Kendaraan
    // Menambahkan informasi Fitur milik MotorMatic
    @Override
    public void tampil() {
        System.out.println("--- Motor Matic ---");
        super.tampil();
        System.out.println("Fitur : " + fitur);
    }

    // OVERRIDE 5: hitungBiaya(int hari)
    // MotorMatic mendapat diskon otomatis 5% karena lebih hemat BBM
    @Override
    public double hitungBiaya(int hari) {
        double base = super.hitungBiaya(hari);
        return base - (base * 0.05); // diskon efisiensi 5%
    }

    @Override
    public void tampilMotor() {
        tampil();
    }
}
public class MotorSport extends Motor {
    private int cc;

    public MotorSport(String id, String merk, String tipe, int harga, int cc) {
        super(id, merk, tipe, harga);
        this.cc = cc;
    }
    // OVERRIDE 2: tampil() dari Motor/Kendaraan
    // Menambahkan informasi CC milik MotorSport
    @Override
    public void tampil() {
        System.out.println("--- Motor Sport ---");
        super.tampil();
        System.out.println("CC    : " + cc + " cc");
    }

    // OVERRIDE 3: hitungBiaya(int hari)
    // MotorSport punya surcharge 10% karena mesin besar
    @Override
    public double hitungBiaya(int hari) {
        double base = super.hitungBiaya(hari);
        return base + (base * 0.10); // surcharge 10%
    }

    @Override
    public void tampilMotor() {
        tampil();
    }
}
public class MotorSport extends Motor {
    private int cc;

    public MotorSport(String id, String merk, String tipe, int harga, int cc) {
        super(id, merk, tipe, harga);
        this.cc = cc;
    }

    @Override
    public void tampilMotor() {
        System.out.print("Motor Sport: ");
        tampil();
        System.out.println(" | CC: " + cc);
    }
}
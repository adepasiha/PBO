public class MotorMatic extends Motor {
    private String fitur;

    public MotorMatic(String id, String merk, String tipe, int harga, String fitur) {
        super(id, merk, tipe, harga);
        this.fitur = fitur;
    }

    @Override
    public void tampilMotor() {
        System.out.print("Motor Matic: ");
        tampil();
        System.out.println(" | Fitur: " + fitur);
    }
}
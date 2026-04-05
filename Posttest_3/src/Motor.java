public class Motor extends Kendaraan {

    public Motor(String id, String merk, String tipe, int harga) {
        super(id, merk, tipe, harga);
    }

    public void tampilMotor() {
        System.out.print("Motor: ");
        tampil();
    }
}
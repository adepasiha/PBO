public class Motor extends Kendaraan {

    public Motor(String id, String merk, String tipe, int harga) {
        super(id, merk, tipe, harga);
    }

    // OVERRIDE 1: tampil() dari Kendaraan
    // Menambahkan label "Motor" di output

    @Override
    public void tampil() {
        System.out.println("--- Motor ---");
        super.tampil();
    }

    public void tampilMotor() {
        tampil();
    }
}
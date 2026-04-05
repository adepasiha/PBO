public class Kendaraan {
    protected String id, merk, tipe;
    protected int harga;

    public Kendaraan(String id, String merk, String tipe, int harga) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tampil() {
        System.out.println(id + " | " + merk + " | " + tipe + " | " + harga);
    }
}
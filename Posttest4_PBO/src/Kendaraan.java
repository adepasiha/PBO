public class Kendaraan {
    protected String id, merk, tipe;
    protected int harga;

    public Kendaraan(String id, String merk, String tipe, int harga) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getId() { return id; }
    public void setMerk(String merk) { this.merk = merk; }
    public void setTipe(String tipe) { this.tipe = tipe; }
    public void setHarga(int harga) { this.harga = harga; }


    // OVERLOADING: hitungBiaya (3 variasi logis)
    // Overload 1: hitung biaya sewa murni berdasarkan jumlah hari
    public double hitungBiaya(int hari) {
        return (double) harga * hari;
    }

    // Overload 2: hitung biaya dengan diskon (misal promo akhir pekan)
    public double hitungBiaya(int hari, double diskon) {
        double total = (double) harga * hari;
        return total - (total * diskon / 100);
    }

    // Overload 3: hitung biaya dengan diskon + asuransi (Rp 20.000/hari)
    public double hitungBiaya(int hari, double diskon, boolean asuransi) {
        double total = hitungBiaya(hari, diskon);
        if (asuransi) {
            total += 20000 * hari;
        }
        return total;
    }


    // OVERRIDE target — method dasar tampil
    public void tampil() {
        System.out.println("ID    : " + id);
        System.out.println("Merk  : " + merk);
        System.out.println("Tipe  : " + tipe);
        System.out.printf( "Harga : Rp %,d / hari%n", harga);
    }
}
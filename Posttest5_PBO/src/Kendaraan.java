// ABSTRACT CLASS: Kendaraan
// Diubah menjadi abstract class karena:
// 1. Kendaraan hanyalah konsep umum — tidak masuk akal membuat objek "Kendaraan" secara langsung.
// 2. Setiap subclass (Motor, MotorSport, MotorMatic) WAJIB mengimplementasikan method abstract.
// Juga mengimplementasikan interface ISewable sebagai "kontrak" penyewaan.
public abstract class Kendaraan implements ISewable {
    protected String id, merk, tipe;
    protected int harga;
    protected boolean tersedia;

    public Kendaraan(String id, String merk, String tipe, int harga) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
        this.tersedia = true; // default: tersedia untuk disewa
    }

    public String getId() { return id; }
    public void setMerk(String merk) { this.merk = merk; }
    public void setTipe(String tipe) { this.tipe = tipe; }
    public void setHarga(int harga) { this.harga = harga; }
    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }


    // =============================================
    // ABSTRACT METHOD 1: hitungBiaya(int hari)
    // Setiap jenis kendaraan punya cara hitung biaya yang berbeda.
    // Dideklarasikan abstract agar subclass WAJIB mendefinisikan logikanya.
    // =============================================
    public abstract double hitungBiaya(int hari);


    // =============================================
    // ABSTRACT METHOD 2: getJenisKendaraan()
    // Setiap subclass wajib mengembalikan jenis kendaraannya sendiri.
    // =============================================
    public abstract String getJenisKendaraan();


    // OVERLOADING: hitungBiaya (2 variasi tambahan — concrete method)
    // Overload 2: hitung biaya dengan diskon
    public double hitungBiaya(int hari, double diskon) {
        double total = hitungBiaya(hari); // memanggil versi abstract (polimorfisme)
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


    // OVERRIDE target — method dasar tampil (concrete, bisa di-override subclass)
    public void tampil() {
        System.out.println("Jenis : " + getJenisKendaraan());
        System.out.println("ID    : " + id);
        System.out.println("Merk  : " + merk);
        System.out.println("Tipe  : " + tipe);
        System.out.printf( "Harga : Rp %,d / hari%n", harga);
    }


    // =============================================
    // IMPLEMENTASI Interface ISewable
    // =============================================

    // Method 1: cek ketersediaan
    @Override
    public boolean isTersedia() {
        return tersedia;
    }

    // Method 2: kategori sewa default (bisa di-override subclass jika perlu)
    @Override
    public String getKategoriSewa() {
        return "Harian";
    }

    // Method 3: tampil info sewa
    @Override
    public void tampilInfoSewa() {
        System.out.println(">>> Info Sewa <<<");
        System.out.println("ID        : " + id);
        System.out.println("Kendaraan : " + merk + " " + tipe);
        System.out.println("Kategori  : " + getKategoriSewa());
        System.out.println("Status    : " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
        System.out.printf( "Tarif     : Rp %,d / hari%n", harga);
    }
}
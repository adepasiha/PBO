// INTERFACE: ISewable
// Merupakan "kontrak" yang harus dipenuhi oleh setiap kendaraan yang bisa disewa.
// Menggunakan interface karena bersifat lintas-hierarki (bukan hubungan IS-A).
public interface ISewable {

    // Method 1: Mengembalikan status ketersediaan kendaraan untuk disewa
    boolean isTersedia();

    // Method 2: Mengembalikan kategori/tipe sewa kendaraan (misalnya: "Harian", "Mingguan")
    String getKategoriSewa();

    // Method 3: Menampilkan informasi sewa kendaraan
    void tampilInfoSewa();
}
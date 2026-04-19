public class Pelanggan {
    private String id, nama, hp;

    public Pelanggan(String id, String nama, String hp) {
        this.id = id;
        this.nama = nama;
        this.hp = hp;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }

    // Tampil data pelanggan dasar
    public void tampilPelanggan() {
        System.out.println("ID    : " + id);
        System.out.println("Nama  : " + nama);
        System.out.println("HP    : " + hp);
    }

    // OVERLOADING: tampilPelanggan

    // Overload: tampil + info motor yang sedang disewa
    public void tampilPelanggan(String motorId) {
        tampilPelanggan();
        System.out.println("Sewa  : Motor ID " + motorId);
    }

    // Overload: tampil + info motor + durasi sewa
    public void tampilPelanggan(String motorId, int hari) {
        tampilPelanggan(motorId);
        System.out.println("Durasi: " + hari + " hari");
    }
}
class Pelanggan {
    String idPelanggan;
    String nama;
    String noHp;

    Pelanggan(String idPelanggan, String nama, String noHp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHp = noHp;
    }

    void tampilPelanggan() {
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + nama);
        System.out.println("No HP        : " + noHp);
        System.out.println("------------------------");
    }
}
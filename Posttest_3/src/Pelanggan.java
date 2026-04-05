public class Pelanggan {
    private String id, nama, hp;

    public Pelanggan(String id, String nama, String hp) {
        this.id = id;
        this.nama = nama;
        this.hp = hp;
    }

    public void tampilPelanggan() {
        System.out.println(id + " | " + nama + " | " + hp);
    }
}
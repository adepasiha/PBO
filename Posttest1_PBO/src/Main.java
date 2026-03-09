import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Motor> daftarMotor = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN PENYEWAAN MOTOR ===");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Lihat Motor");
            System.out.println("3. Update Motor");
            System.out.println("4. Hapus Motor");
            System.out.println("5. Tambah Pelanggan");
            System.out.println("6. Lihat Pelanggan");
            System.out.println("7. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahMotor();
                    break;

                case 2:
                    lihatMotor();
                    break;

                case 3:
                    updateMotor();
                    break;

                case 4:
                    hapusMotor();
                    break;

                case 5:
                    tambahPelanggan();
                    break;

                case 6:
                    lihatPelanggan();
                    break;

                case 7:
                    System.out.println("Terima kasih...");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 7);
    }

    static void tambahMotor() {
        System.out.print("ID Motor: ");
        String id = input.nextLine();

        System.out.print("Merk: ");
        String merk = input.nextLine();

        System.out.print("Tipe: ");
        String tipe = input.nextLine();

        System.out.print("Harga Sewa: ");
        int harga = input.nextInt();
        input.nextLine();

        Motor motor = new Motor(id, merk, tipe, harga);
        daftarMotor.add(motor);

        System.out.println("Motor berhasil ditambahkan!");
    }

    static void lihatMotor() {
        if (daftarMotor.isEmpty()) {
            System.out.println("Data motor kosong!");
        } else {
            for (Motor m : daftarMotor) {
                m.tampilMotor();
            }
        }
    }

    static void updateMotor() {
        System.out.print("Masukkan ID Motor yang ingin diupdate: ");
        String id = input.nextLine();

        for (Motor m : daftarMotor) {
            if (m.idMotor.equals(id)) {

                System.out.print("Merk baru: ");
                m.merk = input.nextLine();

                System.out.print("Tipe baru: ");
                m.tipe = input.nextLine();

                System.out.print("Harga baru: ");
                m.hargaSewa = input.nextInt();
                input.nextLine();

                System.out.println("Data berhasil diupdate!");
                return;
            }
        }

        System.out.println("Motor tidak ditemukan!");
    }

    static void hapusMotor() {
        System.out.print("Masukkan ID Motor yang ingin dihapus: ");
        String id = input.nextLine();

        for (Motor m : daftarMotor) {
            if (m.idMotor.equals(id)) {
                daftarMotor.remove(m);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }

        System.out.println("Motor tidak ditemukan!");
    }

    static void tambahPelanggan() {
        System.out.print("ID Pelanggan: ");
        String id = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("No HP: ");
        String nohp = input.nextLine();

        Pelanggan p = new Pelanggan(id, nama, nohp);
        daftarPelanggan.add(p);

        System.out.println("Pelanggan berhasil ditambahkan!");
    }

    static void lihatPelanggan() {
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Data pelanggan kosong!");
        } else {
            for (Pelanggan p : daftarPelanggan) {
                p.tampilPelanggan();
            }
        }
    }
}
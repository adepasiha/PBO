import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Kendaraan> daftarMotor = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=============================");
            System.out.println("  SISTEM PENYEWAAN MOTOR");
            System.out.println("=============================");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Lihat Motor");
            System.out.println("3. Tambah Pelanggan");
            System.out.println("4. Lihat Pelanggan");
            System.out.println("5. Hitung Biaya Sewa");
            System.out.println("6. Cek Info Sewa (ISewable)");
            System.out.println("7. Exit");
            System.out.print("Pilih: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: tambahMotor(); break;
                case 2: lihatMotor(); break;
                case 3: tambahPelanggan(); break;
                case 4: lihatPelanggan(); break;
                case 5: hitungBiayaSewa(); break;
                case 6: cekInfoSewa(); break;
                case 7: System.out.println("Keluar dari program. Sampai jumpa!"); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 7);
    }

    // -----------------------------------------------
    static void tambahMotor() {
        System.out.println("\n[TAMBAH MOTOR]");
        System.out.println("1. Motor Biasa");
        System.out.println("2. Motor Sport");
        System.out.println("3. Motor Matic");
        System.out.print("Pilih jenis: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("ID    : ");
        String id = input.nextLine();
        System.out.print("Merk  : ");
        String merk = input.nextLine();
        System.out.print("Tipe  : ");
        String tipe = input.nextLine();
        System.out.print("Harga sewa/hari (Rp): ");
        int harga = input.nextInt();
        input.nextLine();

        switch (jenis) {
            case 1:
                daftarMotor.add(new Motor(id, merk, tipe, harga));
                break;
            case 2:
                System.out.print("CC    : ");
                int cc = input.nextInt();
                input.nextLine();
                daftarMotor.add(new MotorSport(id, merk, tipe, harga, cc));
                System.out.println("Info: Motor Sport dikenakan surcharge 10% (kategori: Premium).");
                break;
            case 3:
                System.out.print("Fitur : ");
                String fitur = input.nextLine();
                daftarMotor.add(new MotorMatic(id, merk, tipe, harga, fitur));
                System.out.println("Info: Motor Matic mendapat diskon efisiensi 5% (kategori: Ekonomis).");
                break;
            default:
                System.out.println("Jenis tidak valid.");
                return;
        }
        System.out.println("Motor berhasil ditambahkan!");
    }

    // -----------------------------------------------
    static void lihatMotor() {
        System.out.println("\n[DAFTAR MOTOR]");
        if (daftarMotor.isEmpty()) {
            System.out.println("Belum ada data motor.");
            return;
        }
        for (Kendaraan k : daftarMotor) {
            // POLYMORPHISM - override: tampilMotor() memanggil tampil()
            // yang sudah di-override di masing-masing subclass
            ((Motor) k).tampilMotor();
            System.out.println();
        }
    }

    // -----------------------------------------------
    static void tambahPelanggan() {
        System.out.println("\n[TAMBAH PELANGGAN]");
        System.out.print("ID   : ");
        String id = input.nextLine();
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("HP   : ");
        String hp = input.nextLine();
        daftarPelanggan.add(new Pelanggan(id, nama, hp));
        System.out.println("Pelanggan berhasil ditambahkan!");
    }

    // -----------------------------------------------
    static void lihatPelanggan() {
        System.out.println("\n[DAFTAR PELANGGAN]");
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
            return;
        }
        for (Pelanggan p : daftarPelanggan) {
            p.tampilPelanggan();
            System.out.println();
        }
    }

    // -----------------------------------------------
    // FITUR BARU: Memanfaatkan Interface ISewable
    // Menampilkan info sewa dan status ketersediaan setiap kendaraan
    static void cekInfoSewa() {
        System.out.println("\n[CEK INFO SEWA - ISewable]");
        if (daftarMotor.isEmpty()) {
            System.out.println("Belum ada data motor.");
            return;
        }

        // Kendaraan adalah abstract class yang implements ISewable,
        // sehingga setiap objek motor bisa diperlakukan sebagai ISewable (polymorphism interface)
        for (Kendaraan k : daftarMotor) {
            ISewable sewable = k; // upcasting ke interface
            sewable.tampilInfoSewa();
            System.out.println("Tersedia  : " + (sewable.isTersedia() ? "Ya" : "Tidak"));
            System.out.println("Kategori  : " + sewable.getKategoriSewa());
            System.out.println();
        }

        // Fitur ubah ketersediaan
        System.out.print("Ubah status ketersediaan motor? (y/n): ");
        if (input.nextLine().trim().equalsIgnoreCase("y")) {
            System.out.println("Pilih motor:");
            for (int i = 0; i < daftarMotor.size(); i++) {
                System.out.printf("%d. [%s] %s %s%n", i + 1,
                        daftarMotor.get(i).getId(),
                        daftarMotor.get(i).merk,
                        daftarMotor.get(i).tipe);
            }
            System.out.print("Pilih: ");
            int idx = input.nextInt() - 1;
            input.nextLine();
            if (idx >= 0 && idx < daftarMotor.size()) {
                boolean statusBaru = !daftarMotor.get(idx).isTersedia();
                daftarMotor.get(idx).setTersedia(statusBaru);
                System.out.println("Status diubah menjadi: " + (statusBaru ? "Tersedia" : "Tidak Tersedia"));
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // -----------------------------------------------
    static void hitungBiayaSewa() {
        System.out.println("\n[HITUNG BIAYA SEWA]");

        if (daftarMotor.isEmpty() || daftarPelanggan.isEmpty()) {
            System.out.println("Pastikan data motor dan pelanggan sudah ada.");
            return;
        }

        // Pilih pelanggan
        System.out.println("Pilih Pelanggan:");
        for (int i = 0; i < daftarPelanggan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPelanggan.get(i).getNama());
        }
        System.out.print("Pilih: ");
        int idxP = input.nextInt() - 1;
        input.nextLine();
        if (idxP < 0 || idxP >= daftarPelanggan.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        Pelanggan pelanggan = daftarPelanggan.get(idxP);

        // Pilih motor (hanya tampilkan yang tersedia)
        System.out.println("\nPilih Motor (tersedia):");
        boolean adaYangTersedia = false;
        for (int i = 0; i < daftarMotor.size(); i++) {
            Kendaraan k = daftarMotor.get(i);
            if (k.isTersedia()) {
                System.out.printf("%d. [%s] %s %s (%s) - Rp %,d/hari%n",
                        i + 1, k.getId(), k.merk, k.tipe,
                        k.getKategoriSewa(), k.harga);
                adaYangTersedia = true;
            }
        }
        if (!adaYangTersedia) {
            System.out.println("Tidak ada motor yang tersedia saat ini.");
            return;
        }

        System.out.print("Pilih (nomor urut daftar di atas): ");
        int idxM = input.nextInt() - 1;
        input.nextLine();
        if (idxM < 0 || idxM >= daftarMotor.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }
        Kendaraan motor = daftarMotor.get(idxM);
        if (!motor.isTersedia()) {
            System.out.println("Motor tersebut tidak tersedia.");
            return;
        }

        System.out.print("Lama sewa (hari): ");
        int hari = input.nextInt();
        input.nextLine();

        System.out.print("Ada diskon? (0 = tidak, masukkan angka % jika ada): ");
        double diskon = input.nextDouble();
        input.nextLine();

        System.out.print("Tambah asuransi Rp 20.000/hari? (y/n): ");
        boolean asuransi = input.nextLine().trim().equalsIgnoreCase("y");

        // =============================================
        // POLYMORPHISM - OVERLOADING hitungBiaya
        // hitungBiaya(int) adalah abstract method yang diimplementasikan
        // berbeda oleh Motor, MotorSport, dan MotorMatic
        // =============================================
        double totalBiaya;
        if (diskon == 0 && !asuransi) {
            totalBiaya = motor.hitungBiaya(hari);
        } else if (!asuransi) {
            totalBiaya = motor.hitungBiaya(hari, diskon);
        } else {
            totalBiaya = motor.hitungBiaya(hari, diskon, asuransi);
        }

        System.out.println("\n===== RINGKASAN SEWA =====");
        pelanggan.tampilPelanggan(motor.getId(), hari);
        System.out.println("Kategori  : " + motor.getKategoriSewa());
        System.out.printf("Total Biaya : Rp %,.0f%n", totalBiaya);
        System.out.println("==========================");
    }
}
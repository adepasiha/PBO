import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Kendaraan> daftarMotor = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PENYEWAAN MOTOR ===");
            System.out.println("1. Tambah Motor");
            System.out.println("2. Lihat Motor");
            System.out.println("3. Tambah Pelanggan");
            System.out.println("4. Lihat Pelanggan");
            System.out.println("5. Exit");
            System.out.print("Pilih: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: tambahMotor(); break;
                case 2: lihatMotor(); break;
                case 3: tambahPelanggan(); break;
                case 4: lihatPelanggan(); break;
            }

        } while (pilihan != 5);
    }

    static void tambahMotor() {
        System.out.println("1. Motor");
        System.out.println("2. Motor Sport");
        System.out.println("3. Motor Matic");
        System.out.print("Pilih: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("ID: ");
        String id = input.nextLine();
        System.out.print("Merk: ");
        String merk = input.nextLine();
        System.out.print("Tipe: ");
        String tipe = input.nextLine();
        System.out.print("Harga: ");
        int harga = input.nextInt();
        input.nextLine();

        switch (jenis) {
            case 1:
                daftarMotor.add(new Motor(id, merk, tipe, harga));
                break;
            case 2:
                System.out.print("CC: ");
                int cc = input.nextInt();
                input.nextLine();
                daftarMotor.add(new MotorSport(id, merk, tipe, harga, cc));
                break;
            case 3:
                System.out.print("Fitur: ");
                String fitur = input.nextLine();
                daftarMotor.add(new MotorMatic(id, merk, tipe, harga, fitur));
                break;
        }
    }

    static void lihatMotor() {
        for (Kendaraan k : daftarMotor) {
            ((Motor) k).tampilMotor();
        }
    }

    static void tambahPelanggan() {
        System.out.print("ID: ");
        String id = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("HP: ");
        String hp = input.nextLine();

        daftarPelanggan.add(new Pelanggan(id, nama, hp));
    }

    static void lihatPelanggan() {
        for (Pelanggan p : daftarPelanggan) {
            p.tampilPelanggan();
        }
    }
}

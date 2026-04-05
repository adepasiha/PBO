# Sistem Manajemen Penyewaan Motor

## Pembuat

Nama: (Ade Pasiha Tangke Allo)
NIM: (2409106109)
Kelas: (c2 PBO)

## Deskripsi

Program ini merupakan aplikasi berbasis Java yang digunakan untuk mengelola penyewaan motor.
Fitur utama dalam program ini meliputi pengelolaan data motor dan pelanggan.

Program ini dibuat sebagai bagian dari Posttest 3 dengan menerapkan konsep Object Oriented Programming (OOP), khususnya Inheritance (Pewarisan).

---

## Fitur Program

* Tambah Data Motor
* Lihat Data Motor
* Tambah Data Pelanggan
* Lihat Data Pelanggan
* Mendukung beberapa jenis motor:

    * Motor Biasa
    * Motor Sport
    * Motor Matic

---

## Struktur Class (OOP)

Program ini menggunakan konsep Inheritance dengan struktur sebagai berikut:

```
Kendaraan (Superclass)
   ↓
Motor
   ↓
├── MotorSport
└── MotorMatic
```

### Penjelasan:

* Kendaraan
  Class induk (superclass) yang menyimpan atribut umum seperti id, merk, tipe, dan harga.

* Motor
  Turunan dari Kendaraan yang merepresentasikan motor secara umum.

* MotorSport
  Turunan dari Motor yang memiliki atribut tambahan berupa cc.

* MotorMatic
  Turunan dari Motor yang memiliki atribut tambahan berupa fitur.

* Pelanggan
  Class terpisah yang digunakan untuk menyimpan data pelanggan.

---

## Jenis Inheritance

Jenis inheritance yang digunakan adalah Hierarchical Inheritance, yaitu satu superclass (Kendaraan) memiliki beberapa subclass yang dikembangkan lebih lanjut menjadi MotorSport dan MotorMatic.

---

## Struktur File

```
Main.java
Kendaraan.java
Motor.java
MotorSport.java
MotorMatic.java
Pelanggan.java
```

---

## Cara Menjalankan Program

### Menggunakan CMD atau Terminal

1. Compile semua file:

```
javac *.java
```

2. Jalankan program:

```
java Main
```

---

### Menggunakan NetBeans atau IntelliJ

1. Masukkan semua file ke dalam folder src
2. Pastikan semua file berada dalam package yang sama
3. Jalankan program melalui tombol Run

---

## Contoh Output

```
=== SISTEM PENYEWAAN MOTOR ===
1. Tambah Motor
2. Lihat Motor
3. Tambah Pelanggan
4. Lihat Pelanggan
5. Exit
```

---

## Konsep OOP yang Digunakan

* Inheritance (Pewarisan)
* Encapsulation
* Method Overriding
* Class dan Object



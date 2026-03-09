class Motor {
    String idMotor;
    String merk;
    String tipe;
    int hargaSewa;

    Motor(String idMotor, String merk, String tipe, int hargaSewa) {
        this.idMotor = idMotor;
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
    }

    void tampilMotor() {
        System.out.println("ID Motor   : " + idMotor);
        System.out.println("Merk       : " + merk);
        System.out.println("Tipe       : " + tipe);
        System.out.println("Harga Sewa : " + hargaSewa);
        System.out.println("------------------------");
    }
}
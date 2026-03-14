class Motor {

    private String idMotor;
    private String merk;
    private String tipe;
    private int hargaSewa;

    public Motor(String idMotor, String merk, String tipe, int hargaSewa) {
        this.idMotor = idMotor;
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
    }

    // Getter
    public String getIdMotor() {
        return idMotor;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    // Setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public void tampilMotor() {
        System.out.println("ID Motor   : " + idMotor);
        System.out.println("Merk       : " + merk);
        System.out.println("Tipe       : " + tipe);
        System.out.println("Harga Sewa : " + hargaSewa);
        System.out.println("------------------------");
    }
}
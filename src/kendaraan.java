public abstract class kendaraan {
    private String plat;
    private String merk;
    private String warna;
    private int jam;

    public kendaraan(String plat, String merk, String warna, int jam) {
        this.plat = plat;
        this.merk = merk;
        this.warna = warna;
        this.jam = jam;
    }

    public String getPlat() {
        return plat;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getJam() {
        return jam;
    }

    /* Abstraction */
    public abstract int getBiaya();

    /* Polymorphism */
    public int hitungParkir(int jamparkir) {
        return 0; }

}


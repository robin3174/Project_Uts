public abstract class kendaraan {
    private String plat;
    private String merk;
    private String warna;
    private int jam;

    public kendaraan() {
    }

    public kendaraan(String plat, String merk, String warna, int jam) {
        this.plat = plat;
        this.merk = merk;
        this.warna = warna;
        this.jam = jam;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

}

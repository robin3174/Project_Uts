public class mobil extends kendaraan {
    private int biayamobil = 4000;

    public mobil (String plat, String merk, String warna, int jam){
        super(plat,merk,warna,jam);
    }

    public mobil(){}

    public int getBiayamobil() {
        return biayamobil;
    }

    public void setBiayamobil(int biayamobil) {
        this.biayamobil = biayamobil;
    }

    int hitungparkirmobil (int jamparkirmobil){
        System.out.print("Biaya Parkir Mobil Anda Adalah = (Rp4000 x " + jamparkirmobil + " Jam) = Rp." );
        return(jamparkirmobil*biayamobil);
    }

}

public class mobil extends kendaraan {
    private int biayamobil = 4000;

    public mobil (String plat, String merk, String warna, int jam){
        super(plat,merk,warna,jam);
    }

    @Override
    public int getBiaya (){ return biayamobil; }

    public int hitungParkir (int jamparkir){
        return (jamparkir*biayamobil);
    }

}

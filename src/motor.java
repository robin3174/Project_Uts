public class motor extends kendaraan {
    private int biayamotor = 2000;

    public motor (String plat, String merk, String warna, int jam){
        super(plat,merk,warna,jam);
    }

    @Override
    public void setBiaya (int biaya) { this.biayamotor=biaya;}

    @Override
    public int getBiaya (){ return biayamotor; }

    public int hitungParkir (int jamparkir){
        return (jamparkir*biayamotor);
    }

}

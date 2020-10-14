public class motor extends kendaraan {
    private int biayamotor = 2000;

    public motor (String plat, String merk, String warna, int jam){
        super(plat,merk,warna,jam);
    }

    public motor(){}

    public int getBiayamotor() {
        return biayamotor;
    }

    public void setBiayamotor(int biayamotor) {
        this.biayamotor = biayamotor;
    }

    int hitungparkirmotor (int jamparkirmotor){
        System.out.print("Biaya Parkir Motor Anda Adalah = (Rp2000 x " + jamparkirmotor + " Jam) = Rp." );
        return(jamparkirmotor*biayamotor);
    }


}

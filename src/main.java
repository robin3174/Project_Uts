import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("\n--------------- Selamat Datang di Acara Peresmian Restoran Shangrila ---------------\n");
        System.out.println("Dikarenakan tempat parkir yang terbatas untuk saat ini, pelanggan diharapkan untuk membuat reservasi sewa tempat parkir terlebih dahulu  \n");

        Scanner datajenis = new Scanner(System.in);

        System.out.println("Silahkan Masukkan Jenis Kendaraan Anda Dalam Bentuk Nomor\n1.Mobil \n2.Motor");
        System.out.print("Jenis Kendaraan Saya adalah Kendaraan No = ");
        int jenis = datajenis.nextInt();

        if (jenis == 1) {
            System.out.println("\nBiaya Parkir Mobil Per Jam Adalah Rp.4000");
            Scanner datamobil = new Scanner(System.in);
            System.out.print("Silahkan Masukkan Plat Mobil Anda  = ");
            String plat = datamobil.nextLine();
            System.out.print("Silahkan Masukkan Merk Mobil Anda  = ");
            String merk = datamobil.nextLine();
            System.out.print("Silahkan Masukkan Warna Mobil Anda = ");
            String warna = datamobil.nextLine();
            System.out.print("Silahkan Masukkan Jumlah Jam Parkir yang Ingin Anda Sewa = ");
            int jam = datamobil.nextInt();

            mobil a = new mobil(plat,merk,warna,jam);

            System.out.println("\nPlat Mobil Anda Adalah         = " + a.getPlat());
            System.out.println("Merk Mobil Anda Adalah         = " + a.getMerk());
            System.out.println("Warna Mobil Anda Adalah        = " + a.getWarna());
            System.out.println("Jumlah Jam Parkir Anda Adalah  = " + a.getJam() + " Jam");
            System.out.println(a.hitungparkirmobil(jam));
            System.out.println("\n---------------------------- Terima Kasih Telah Datang ---------------------------\n");

        } else if (jenis == 2){
            System.out.println("\nBiaya Parkir Motor Per Jam Adalah Rp.2000");
            Scanner datamotor = new Scanner(System.in);
            System.out.print("Silahkan Masukkan Plat Motor Anda  = ");
            String plat = datamotor.nextLine();
            System.out.print("Silahkan Masukkan Merk Motor Anda  = ");
            String merk = datamotor.nextLine();
            System.out.print("Silahkan Masukkan Warna Motor Anda = ");
            String warna = datamotor.nextLine();
            System.out.print("Silahkan Masukkan Jumlah Jam Parkir yang Ingin Anda Sewa = ");
            int jam = datamotor.nextInt();

            motor a = new motor(plat,merk,warna,jam);

            System.out.println("\nPlat Motor Anda Adalah         = " + a.getPlat());
            System.out.println("Merk Motor Anda Adalah         = " + a.getMerk());
            System.out.println("Warna Motor Anda Adalah        = " + a.getWarna());
            System.out.println("Jumlah Jam Parkir Anda Adalah  = " + a.getJam() + " Jam");
            System.out.println(a.hitungparkirmotor(jam));
            System.out.println("\n---------------------------- Terima Kasih Telah Datang ---------------------------\n");
        } else {
            System.out.println("Pilihan tidak ada");
        }
    }
}

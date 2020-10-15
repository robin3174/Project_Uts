import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int totalhargajamparkir = 0;
        int hargaparkirsatuan = 0;

        System.out.println("\n--------------- Selamat Datang di Acara Peresmian Restoran Shangrila ---------------\n");
        System.out.println("Dikarenakan tempat parkir yang terbatas untuk saat ini, pelanggan diharapkan untuk melakukan proses sewa tempat parkir terlebih dahulu  \n");

        Scanner datajenis = new Scanner(System.in);
        Scanner datamobil = new Scanner(System.in);
        Scanner datamotor = new Scanner(System.in);

        System.out.println("Silahkan Masukkan Jenis Kendaraan Anda \n1.Mobil \n2.Motor");
        System.out.print("Jenis Kendaraan Anda adalah ? (1/2) = ");
        int jenis = datajenis.nextInt();
        kendaraan[] a_kendaraan;

        if (jenis == 1) {

            System.out.println("\nBiaya Parkir Mobil Per Jam Adalah Rp.4000");
            System.out.print("Masukkan Jumlah Tempat Parkir Mobil yang Akan Anda Sewa = ");
            int n = datamobil.nextInt();

            String platmobil ;
            String merkmobil ;
            String warnamobil ;
            int jamparkir;
            a_kendaraan = new mobil[n];

            for (int i=0;i<n; i++) {
                System.out.print("\nPlat Mobil Ke-" + (i+1) + " = " );
                platmobil  = datamobil.next();
                System.out.print("Merk Mobil Ke-" + (i+1) + " = " );
                merkmobil = datamobil.next();
                System.out.print("Warna Mobil Ke-" + (i+1) + " = " );
                warnamobil  = datamobil.next();
                System.out.print("Jumlah Jam Parkir Mobil Ke-" + (i+1) + " = ");
                jamparkir = Integer.parseInt(datamobil.next());
                a_kendaraan[i] = new mobil(platmobil,merkmobil,warnamobil,jamparkir);
            }

            System.out.println("\nData Mobil yang Didaftar untuk Tempat Parkir \n(Format : Plat - Merk - Warna - Waktu Parkir - Biaya Parkir)\n");
            for (int i=0; i<n; i++){
                kendaraan a = a_kendaraan[i];
                System.out.print((i+1) +". ");
                System.out.print(a.getPlat() + " - ");
                System.out.print(a.getMerk() + " - ");
                System.out.print(a.getWarna() + " - ");
                System.out.print(a.getJam() + " Jam - Rp.");
                System.out.println(a.hitungParkir(a.getJam()));
                totalhargajamparkir = totalhargajamparkir + a.hitungParkir(a.getJam()) ;
                hargaparkirsatuan = a.getBiaya();
            }

            System.out.println("\nBiaya Parkir Mobil Per Jam Adalah Rp." + hargaparkirsatuan);
            System.out.println("Total Harga Parkir untuk " + n + " Mobil Anda Adalah = Rp." + totalhargajamparkir);
            System.out.println("\n\n---------------------------- Terima Kasih Telah Datang ---------------------------");

        } else if (jenis == 2){
            System.out.println("\nBiaya Parkir Motor Per Jam Adalah Rp.2000");

            System.out.print("Masukkan Jumlah Tempat Parkir Motor yang Akan Anda Sewa = ");
            int n=datamotor.nextInt();

            String platmotor ;
            String merkmotor ;
            String warnamotor ;
            int jamparkir;
            a_kendaraan = new motor[n];

            for (int i=0;i<n; i++) {
                System.out.print("\nPlat Motor Ke-" + (i+1) + " = " );
                platmotor  = datamotor.next();
                System.out.print("Merk Motor Ke-" + (i+1) + " = " );
                merkmotor = datamotor.next();
                System.out.print("Warna Motor Ke-" + (i+1) + " = " );
                warnamotor  = datamotor.next();
                System.out.print("Jumlah Jam Parkir Motor Ke-" + (i+1) + " = ");
                jamparkir = Integer.parseInt(datamotor.next());
                a_kendaraan[i] = new motor(platmotor,merkmotor,warnamotor,jamparkir);
            }

            System.out.println("\nData Motor yang Didaftar untuk Tempat Parkir \n(Format : Plat - Merk - Warna - Waktu Parkir - Biaya Parkir)\n");
            for (int i=0; i<n; i++){
                kendaraan a = a_kendaraan[i];
                System.out.print((i+1) +". ");
                System.out.print(a.getPlat() + " - ");
                System.out.print(a.getMerk() + " - ");
                System.out.print(a.getWarna() + " - ");
                System.out.print(a.getJam() + " Jam - Rp.");
                System.out.println(a.hitungParkir(a.getJam()));
                totalhargajamparkir = totalhargajamparkir + a.hitungParkir(a.getJam()) ;
                hargaparkirsatuan = a.getBiaya();
            }

            System.out.println("\nBiaya Parkir Motor Per Jam Adalah Rp." + hargaparkirsatuan);
            System.out.println("Total Harga Parkir untuk " + n + " Motor Anda Adalah = Rp." + totalhargajamparkir);
            System.out.println("\n\n---------------------------- Terima Kasih Telah Datang ---------------------------");

        } else {
            System.out.println("\nPilihan tidak tersedia");
        }
    }
}

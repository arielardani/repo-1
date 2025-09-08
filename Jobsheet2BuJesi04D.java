import java.util.Scanner;
public class Jobsheet2BuJesi04D {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int gajiPokok, tunjangan, jumlahAnak;
         double danaPensiun = 0.05, gajiBersih;
         System.out.println("Berapa gaji pokok anda");
         gajiPokok = sc.nextInt();
         System.out.println("Berapa tunjangan anak per bulan anda");
         tunjangan = sc.nextInt();
         System.out.println("Berapa jumlah anak anda");
         jumlahAnak = sc.nextInt();
         gajiBersih = gajiPokok+tunjangan*jumlahAnak-gajiPokok*danaPensiun;
         System.out.println("Gaji bersih anda adalah " +gajiBersih);
}
}
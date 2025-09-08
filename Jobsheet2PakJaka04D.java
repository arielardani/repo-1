import java.util.Scanner;
public class Jobsheet2PakJaka04D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lebar, panjang, diameter, sisi,rusuk;
        double jmlKolamLingkaran = 2, luasKolamLingkaran, luasKolamPersegi, luasTaman;
        System.out.println("Berapa lebar tanah anda");
        lebar = sc.nextInt();
        System.out.println("Berapa panjang tanah anda");
        panjang = sc.nextInt();
        double luasTanah= lebar * panjang;
        System.out.println("luas tanah anda adalah " +luasTanah);
        System.out.println("Berapa meter diameter taman anda");
        diameter = sc.nextInt();
        rusuk = diameter /2;
        luasKolamLingkaran= 3.14*rusuk*rusuk*jmlKolamLingkaran;
        System.out.println("luas 2 kolam lingkaran anda adalah " +luasKolamLingkaran);
        System.out.println("Berapa meter sisi tanah anda anda");
        sisi = sc.nextInt();
        luasKolamPersegi= sisi*sisi;
        System.out.println("luas kolam persegi anda adalah" +luasKolamPersegi);
        luasTaman= luasTanah-luasKolamLingkaran-luasKolamPersegi;
        System.out.println("luas taman anda adalah " +luasTaman);
    }
}

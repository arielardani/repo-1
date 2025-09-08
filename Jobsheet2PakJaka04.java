public class Jobsheet2PakJaka04 {
    public static void main(String[] args) {
        byte lebar = 50;
        byte panjang = 100;
        int luasTanah = lebar*panjang ;
        byte diameter = 2;
        int rusuk = diameter / 2;
        byte jmlKolamIkanLingkaran = 2;
        double luasKolamIkanLingkaran = 3.14*rusuk*rusuk*jmlKolamIkanLingkaran;
        byte sisi = 2;
        int luasKolamIkanPersegi = sisi*sisi ;
        double luasTaman = luasTanah-luasKolamIkanLingkaran-luasKolamIkanPersegi ;
        System.out.println("Luas tanah Pak Jaka adalah " +luasTanah);
        System.out.println("Luas 2 kolam ikan lingkaran Pak Jaka adalah " +luasKolamIkanLingkaran);
        System.out.println("Luas kolam ikan persegi Pak Jaka Adalah " +luasKolamIkanPersegi);
        System.out.println("Luas taman Pak Jaka adalah " +luasTaman);
    }
}


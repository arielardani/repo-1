public class Jobsheet2BuJesi04 {
    public static void main(String[] args) {
        float gajiPokok = 3000000;
        float tunjangan = 150000;
        byte jumlahAnak = 3;
        double danaPensiun = 0.05;
        double gajiBersih = gajiPokok+tunjangan*jumlahAnak-gajiPokok*danaPensiun;
        System.out.println("Gaji pokok Bu Jesi Adalah " +gajiPokok);
        System.out.println("Tunjangan anak Bu Jesi Adalah " +tunjangan);
        System.out.println("Jumlah anak Bu Jesi Adalah " +jumlahAnak);
        System.out.println("potongan gaji pokok untuk dana pensiun Bu Jesi Adalah " +danaPensiun);
        System.out.println("Gaji bersih Bu Jesi adalah " + gajiBersih);
    }
}

public class matakuliahkel4 {
    String kodemk;
    String namamk;
    int sks;

    matakuliahkel4 (String kodemk, String namamk, int sks) {
        this.kodemk = kodemk;
        this.namamk = namamk;
        this.sks = sks;
    }

    void tampilmatkul() {
        System.out.println("Kode Matakuliah :  " + kodemk );
        System.out.println("Nama Matakuliah :  " + namamk);
        System.out.println("Jumlah SKS : " + sks );
        System.out.println("--------------------------------");
    }
}

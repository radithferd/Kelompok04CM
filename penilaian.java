public class penilaian {
    mahasiswa mahasiswa;
    matakuliahkel4 matakuliah;
    double tugas;
    double uts;
    double uas;
    double nilaiakhir;

    penilaian(mahasiswa mahasiswa, matakuliahkel4 matakuliah, double tugas, double uts, double uas, double nilaiakhir) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        hitungnilaiakhir();

    }

    void hitungnilaiakhir() {
        nilaiakhir = (tugas * 0.3) + (uts * 0.3) + (uas* 0.4);
    }   






    
}

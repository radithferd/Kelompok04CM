public class mahasiswa {
    String NIM;
    String nama;
    String prodi;

    mahasiswa(String NIM, String nama, String prodi){
        NIM = this.NIM;
        nama = this.nama;
        prodi = this.prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM   : " + NIM );
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("--------------------------------");
    }
}
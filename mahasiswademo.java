import java.util.Scanner;

public class mahasiswademo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        mahasiswa[] daftarMahasiswa = new mahasiswa[3];
        matakuliahkel4[] daftarMatkul = new matakuliahkel4[3] ;
        //Penilaian[] daftarNilai = new Penilaian[5];

        daftarMahasiswa[0] = new mahasiswa("22002", "Ali Rahman", "Informatika");
        daftarMahasiswa[1] = new mahasiswa ("22002", "Budi Sntoso", "Informatika");
        daftarMahasiswa[2] = new mahasiswa ("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        daftarMatkul [0] = new matakuliahkel4("MK001", "Struktur Data", 3);
        daftarMatkul [1] = new matakuliahkel4("MK002", "Basis Data", 3);
        daftarMatkul [2] = new matakuliahkel4("MK003", "Desain Web", 3);



        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Matakuliah");
            System.out.println("3. Tampilkan Data Penilaian ");
            System.out.println("4. Urutkan Mahasiswa Bedasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Bedasarkan NIM");
            System.out.println("0. Keluar");
            System.out.println("Pilih Menu");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            
            
            

            
        }
    }
    
}

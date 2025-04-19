import java.util.Scanner;

public class mahasiswademo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        mahasiswa[] daftarMahasiswa = new mahasiswa[3];
        matakuliahkel4[] daftarMatkul = new matakuliahkel4[3];

        penilaian daftarNilai [] = new penilaian[5];
        daftarNilai[0] = new penilaian(daftarMahasiswa[0], daftarMatkul[0], 80, 85, 90, 90.5);
        daftarNilai[0] = new penilaian(daftarMahasiswa[0], daftarMatkul[1], 60, 75, 70, 85.5);
        daftarNilai[1] = new penilaian(daftarMahasiswa[1], daftarMatkul[0], 75, 75, 80, 77.5);
        daftarNilai[2] = new penilaian(daftarMahasiswa[2], daftarMatkul[1], 85, 90, 95, 75.5);
        daftarNilai[2] = new penilaian(daftarMahasiswa[3], daftarMatkul[2], 80, 90, 65, 68.5);
        


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
            
            switch (pilihan) {
                case 1:
                    System.out.println("=== DAFTAR MAHASISWA ===");
                    for (mahasiswa m : daftarMahasiswa) {
                        m.tampilMahasiswa();  
                    }
                    break;

                case 2: 
                    System.out.println("=== DAFTAR MATAKULIAH ===");
                    for (matakuliahkel4 mk : daftarMatkul) {
                        mk.tampilmatkul();
                    }
                    break;

                case 3:
                    System.out.println("=== DATA PENILAIAN ===");
                    for (int i = 0; i < daftarNilai.length; i++) {
                        System.out.println("NIM: " + daftarNilai[i].mahasiswa.NIM);
                        System.out.println("Nama: " + daftarNilai[i].mahasiswa.nama);
                        System.out.println("Mata Kuliah: " + daftarNilai[i].matakuliah.namamk);
                        System.out.println("Nilai Akhir: " + daftarNilai[i].nilaiakhir);
                        System.out.println("--------------------");
                    }
                    

                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 0:
                    
                    break;
            
                default:
                    break;
            }   
        }
    }
    
}

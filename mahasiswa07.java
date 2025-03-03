public class mahasiswa07{

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
        } else {
            System.out.println("Nilai IPK tidak valid, mohon input ulang");
        } 
    }

    String nilaiKinerja(){
        if (ipk >= 3.5){
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0){
            return "Kinerja baik";
        } else if (ipk >= 2.0){
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public mahasiswa07(){
    }

    public mahasiswa07(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
}
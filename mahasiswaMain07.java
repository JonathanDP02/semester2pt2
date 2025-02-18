public class mahasiswaMain07 {
    public static void main(String[] args) {
        mahasiswa07 mhs1 = new mahasiswa07();
        mhs1.nama = "Jonathan Dwi Pangestu";
        mhs1.nim = "244107020197";
        mhs1.kelas = "TI 1H";
        mhs1.ipk = 3.80;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI 1F");
        mhs1.updateIpk(3.85);
        mhs1.tampilkanInformasi();

        mahasiswa07 mhs2 = new mahasiswa07("Jonathan Dwi Pangestu", "244107020197", 3.50, "TI 1F");
        mhs2.updateIpk(3.60);
        mhs2.tampilkanInformasi();

        mahasiswa07 mhsJonathan = new mahasiswa07("Jonathan Dwi Pangestu", "244107020197", 3.75, "TI 1F");
        mhsJonathan.tampilkanInformasi();
    }

    
}

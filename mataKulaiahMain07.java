public class mataKulaiahMain07 {
    public static void main(String[] args) {
        mataKuliah07 matkul1 = new mataKuliah07();
        matkul1.kodeMK = "ALSD";
        matkul1.nama = "Algoritma dan Struktur Data";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(4);
        matkul1.kurangiJam(2);
        matkul1.tampilInformasi();

        mataKuliah07 matkul2 = new mataKuliah07("ALSD", "Algoritma dan Struktur Data", 2, 4);
        matkul2.ubahSKS(5);
        matkul2.tambahJam(3);
        matkul2.kurangiJam(1);
    }
}

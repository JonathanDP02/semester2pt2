public class mataKuliah07 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks=sksBaru;
    }

    void tambahJam(int jam){
        if (jam > 0){
            jumlahJam += jam;
            System.out.println("Jam berhasil ditambahkan");
        } else {
            System.out.println("Input error mohon ulangi");
        }
    }

    void kurangiJam(int jam){
        if (jam > 0){
            if (jumlahJam >= jam){
                jumlahJam -= jam;
                System.out.println("Jam berhasil dikurangi");
            } else {
                System.out.println("Input error jumlah jam tidak mencukupi");
            }
        } else {
            System.out.println("Input error mohon ulangi");
        }
    }

    public mataKuliah07(String km, String nm, int sks, int jj){
        kodeMK = km;
        nama = nm;
        this.sks = sks;
        jumlahJam = jj;
    }

    public mataKuliah07(){
    }
}

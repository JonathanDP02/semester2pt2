public class dosenMain07 {
    public static void main(String[] args) {
        dosen07 dsn1 = new dosen07();
        dsn1.idDosen="JDP07";
        dsn1.nama="Jonathan Dwi Pangestu";
        dsn1.statusAktif=true;
        dsn1.tahunBergabung=2011;
        dsn1.bidangKeahlian="ALSD";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("desain");
        dsn1.tampilInformasi();

        dosen07 dsn2 = new dosen07("PDJ07", "Sumbul", true, 2010, "Matematika");
        dsn2.hitungMasaKerja(2005);
        dsn2.ubahKeahlian("Informatika");
    }
}

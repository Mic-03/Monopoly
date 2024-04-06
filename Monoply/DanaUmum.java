// Kelas untuk merepresentasikan kartu dana umum
class KartuDanaUmum extends Kartu {
    public KartuDanaUmum(String deskripsi, boolean bisaDijual) {
        super(deskripsi, "Dana Umum", bisaDijual);
    }

    // Implementasi aksi untuk kartu dana umum
    @Override
    public void eksekusiAksi(Player player) {
        // Implementasikan aksi yang sesuai dengan deskripsi kartu dana umum
        System.out.println("Kartu Dana Umum: " + deskripsi);
    }
}
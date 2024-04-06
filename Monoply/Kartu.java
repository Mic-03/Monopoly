// Kelas abstrak untuk merepresentasikan kartu dalam Monopoli
abstract class Kartu {
    String deskripsi;
    String kategori; // Kategori kartu (misalnya: Kesempatan, Dana Umum)
    boolean bisaDijual; // Apakah kartu bisa dijual atau tidak

    public Kartu(String deskripsi, String kategori, boolean bisaDijual) {
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.bisaDijual = bisaDijual;
    }

    // Metode untuk mengeksekusi aksi kartu
    public abstract void eksekusiAksi(Player player);
}
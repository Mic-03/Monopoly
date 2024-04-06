class Kesempatan extends Kartu {
    public KartuKesempatan(String deskripsi, boolean bisaDijual) {
        super(deskripsi, "Kesempatan", bisaDijual);
    }

    // Implementasi aksi untuk kartu kesempatan
    @Override
    public void eksekusiAksi(Player player) {
        // Implementasikan aksi yang sesuai dengan deskripsi kartu kesempatan
        System.out.println("Kartu Kesempatan: " + deskripsi);
    }
}

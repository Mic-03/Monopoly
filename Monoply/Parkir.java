// Kelas untuk merepresentasikan petak bebas parkir
class Parkir extends Board {
    public FreeParkingSquare(String name) {
        super(name);
    }

    @Override
    public void performAction(Player player) {
        System.out.println(player.name + " berada di " + name + " dan dapat pergi ke mana saja dalam peta.");
        // Di sini Anda dapat menambahkan logika untuk memindahkan pemain ke petak mana pun dalam peta
        // Misalnya, Anda bisa menampilkan menu dan meminta input dari pemain untuk memilih petak tujuan
    }
}


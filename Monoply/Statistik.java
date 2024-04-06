public class Statistik {
    public static void statistik(String[] args) {
        Boardgame board = new Boardgame();

        // Menambahkan pemain ke papan
        board.addPlayer(0, "Player 1", 1500);
        board.addPlayer(1, "Player 2", 2000);
        board.addPlayer(2, "Player 3", 1800);
        board.addPlayer(3, "Player 4", 1700);

        // Menampilkan informasi tentang semua pemain di papan
        board.displayPlayersInfo();
    }
}

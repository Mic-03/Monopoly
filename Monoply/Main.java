public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas-kelas
        Board[] board = new Board[40]; // Papan Monopoly biasanya memiliki 40 petak
        board[0] = new Start("Start");
        board[1] = new Property("Property 1", 100);
        // Tambahkan petak lainnya sesuai kebutuhan...

        //deklarasi objek perlu diganti
        Player player1 = new Player("Player 1", 1500);
        player1.takeTurn(board[0]); // Contoh: pemain 1 melakukan giliran dari petak start
    }
}
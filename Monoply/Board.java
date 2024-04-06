abstract class Board {
    String name;
    
    // Metode untuk menambahkan pemain ke papan
    public void addPlayer(int index, String name, int money) {
        if (index >= 0 && index < 4) {
            players[index] = new Player(name, money);
        } else {
            System.out.println("Invalid player index.");
        }
    }

    // Metode untuk menampilkan informasi tentang semua pemain di papan
    public void displayPlayersInfo() {
        System.out.println("Players on the board:");
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                players[i].displayInfo();
            }
        }
    }
    public Board(String name) {
        this.name = name;
    }

    public abstract void performAction(Player player);
}

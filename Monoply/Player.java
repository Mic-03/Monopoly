class Player {
    String name;
    int money;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void receiveMoney(int amount) {
        money += amount;
    }

    public void takeTurn(Board currentSquare) {
        // Implementasi logika untuk giliran pemain di petak tertentu
    }

    public void displayInfo() {
        
    }

}
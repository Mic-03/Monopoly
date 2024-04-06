class Start extends Board {
    public Start(String name) {
        super(name);
    }

    @Override
    public void performAction(Player player) {
        // Implementasi untuk tindakan di petak start
        player.receiveMoney(20000); // Mendapatkan uang 20.000 USD setiap kali melewati start
    }
}
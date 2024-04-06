class Property extends Board {
    int price;
    
    public Property(String name, int price) {
        super(name);
        this.price = price;
    }

    @Override
    public void performAction(Player player) {
        // Implementasi untuk tindakan di petak tanah
    }
}

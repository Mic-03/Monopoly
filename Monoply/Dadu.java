import java.util.Random;

// Kelas untuk merepresentasikan dadu
class Dice {
    private Random random;

    public Dice() {
        random = new Random();
    }

    // Metode untuk menggulung dadu dan mengembalikan hasilnya
    public int lempar() {
        int hasilPertama = random.nextInt(6) + 1; // Hasil dadu pertama
        int hasilKedua = random.nextInt(6) + 1; // Hasil dadu kedua
        return hasilPertama + hasilKedua; // Jumlahkan hasil dadu
    }
}

import java.lang.Math;

public class FlipNCoins {
    public static void main(String[] args) {
        flipNHeads(20);
    }

    public static void flipNHeads(int n) {
        int headsCount = 0;
        int flipCount = 0;

        while (headsCount != n) {
            double rando = Math.random();

            if (rando >= .5) {
                System.out.println("Heads");
                headsCount++;
                flipCount++;
            } else {
                System.out.println("Tails");
                flipCount++;
                headsCount = 0;
            }
        }
        System.out.println("It took " + flipCount + " flips to flip " + n + " heads in a row.");
    }
}
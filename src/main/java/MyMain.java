import java.util.Random;

public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        // REPLACE THIS WITH YOUR CODE
        return Math.max(Math.max(x, y), z);
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin(double coin_chance) {
        return (Math.random() >= coin_chance);
    }

    public static boolean flipCoin() {
        double coin = 0.5;
        return flipCoin(coin);
    }

    //     This method simulates the flip of a weighted coin,
//     that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        double coin = 0.2;
        return flipCoin(coin);
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        // REPLACE THIS WITH YOUR CODE
        return (int) Math.round(d);
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        Random r = new Random();
        return r.nextInt((6 - 1) + 1) + 1;

    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static void quadForm(int a, int b, int c) {
        return;
    }

    public static void main(String[] args) {
        // Test the add5 method
        int x = 2;
        int y = add5(x);
        System.out.println(y);
        int z = 19;
        int biggest_num = findBiggestNumber(x, y, z);
        System.out.println(biggest_num);
        System.out.println(flipCoin());
        System.out.println(flipWeightedCoin());
        System.out.println(rollDie());

    }
}
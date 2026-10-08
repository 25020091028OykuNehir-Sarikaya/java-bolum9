package tr.edu.istiklal;

public class Random {

    public void displayRandomNumbers(long seed, int count) {
        java.util.Random random = new java.util.Random(seed);

        for (int i = 0; i < count; i++) {
            System.out.print(random.nextInt(100) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
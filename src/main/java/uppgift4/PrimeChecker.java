package uppgift4;


public class PrimeChecker implements Runnable {

    private final int start;
    private final int end;
    private int sum = 0;


    public PrimeChecker(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public synchronized void primeMethod() {
        for (int n = start; n < end; n++) {

            boolean prime = true;

            int i = 2;

            while (i <= n / 2) {

                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                sum++;

            }

        }
    }

    @Override
    public void run() {

        primeMethod();

    }


    public int getSum() {
        return sum;
    }

}

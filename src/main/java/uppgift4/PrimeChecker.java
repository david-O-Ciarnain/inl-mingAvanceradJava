package uppgift4;

public class PrimeChecker implements Runnable {


    private int end;
    private int start;
    private int sum;
    boolean isPrime;

    public PrimeChecker(int start,int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        for (int i = start; i <= end; i++) {

            isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            sum++;
        }
    }

    public int getSum() {
        return sum;
    }
}

package uppgift4;

import java.util.List;
import java.util.stream.Collectors;

public class Four {


    public static void main(String[] args) throws InterruptedException {

        PrimeChecker primeChecker = new PrimeChecker(2,100000);
        PrimeChecker primeChecker1 = new PrimeChecker(100001,200000);
        Thread thread1 = new Thread(primeChecker);
        Thread thread2 = new Thread(primeChecker1);


        thread1.start();
        thread2.start();
       thread1.join();
       thread2.join();
        System.out.println(primeChecker.getSum() + primeChecker1.getSum());


    }


}

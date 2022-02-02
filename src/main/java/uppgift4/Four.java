package uppgift4;


public class Four {


    public static void main(String[] args) throws InterruptedException {


        PrimeChecker primeChecker = new PrimeChecker(2, 100000);
        PrimeChecker primeChecker1 = new PrimeChecker(100001, 200000);
        PrimeChecker primeChecker2 = new PrimeChecker(200001, 300000);
        PrimeChecker primeChecker3 = new PrimeChecker(300001, 400000);
        PrimeChecker primeChecker4 = new PrimeChecker(400001, 500000);

        Thread thread = new Thread(primeChecker);
        Thread thread1 = new Thread(primeChecker1);
        Thread thread2 = new Thread(primeChecker2);
        Thread thread3 = new Thread(primeChecker3);
        Thread thread4 = new Thread(primeChecker4);


        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        thread.join();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        int resultat = primeChecker.getSum() + primeChecker1.getSum() + primeChecker2.getSum() + primeChecker3.getSum()
                + primeChecker4.getSum();

        System.out.println("there is: " + resultat + " prime numbers between 2 and 500000");



    }


}

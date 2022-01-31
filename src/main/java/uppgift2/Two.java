package uppgift2;


import uppgift2.factory.AudiFactory;
import uppgift2.factory.CarFactory;

public class Two {

    public static void main(String[] args) {

        CarFactory carFactory = new AudiFactory();
        carFactory.assembleCar();

    }
}

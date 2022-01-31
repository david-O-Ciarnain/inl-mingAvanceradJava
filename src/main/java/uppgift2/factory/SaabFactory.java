package uppgift2.factory;

import uppgift2.produkt.Car;
import uppgift2.produkt.Saab;

public class SaabFactory extends CarFactory{
    @Override
    public Car creatCar() {
        return new Saab();
    }
}

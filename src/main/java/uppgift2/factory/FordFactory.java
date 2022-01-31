package uppgift2.factory;

import uppgift2.produkt.Car;
import uppgift2.produkt.Ford;

public class FordFactory extends CarFactory{
    @Override
    public Car creatCar() {
        return new Ford();
    }
}

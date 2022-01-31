package uppgift2.factory;

import uppgift2.produkt.Audi;
import uppgift2.produkt.Car;

public class AudiFactory extends CarFactory{
    @Override
    public Car creatCar() {
        return new Audi();
    }
}

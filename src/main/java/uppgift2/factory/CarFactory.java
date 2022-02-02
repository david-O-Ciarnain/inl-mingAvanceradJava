package uppgift2.factory;

import uppgift2.produkt.Car;

public abstract class CarFactory {

    public void assembleCar(){
        Car car = creatCar();
        car.prepare();
    }

   public abstract Car creatCar();
}

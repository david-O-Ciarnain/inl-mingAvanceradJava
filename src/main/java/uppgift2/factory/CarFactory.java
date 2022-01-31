package uppgift2.factory;

import uppgift2.produkt.Car;

public abstract class CarFactory {

    public Car assembleCar(){
        Car car = creatCar();
        car.prepare();
        return car;
    }

   public abstract Car creatCar();
}

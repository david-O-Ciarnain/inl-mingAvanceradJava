package uppgift2.factory;

import uppgift2.produkt.Burger;

public abstract class Restaurant {

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
    public  abstract Burger createBurger();
}


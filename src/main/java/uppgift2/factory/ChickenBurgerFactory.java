package uppgift2.factory;

import uppgift2.produkt.Burger;
import uppgift2.produkt.ChickenBurger;

public class ChickenBurgerFactory extends Restaurant{
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}

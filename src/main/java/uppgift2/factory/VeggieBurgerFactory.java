package uppgift2.factory;

import uppgift2.produkt.Burger;
import uppgift2.produkt.VeggieBurger;

public class VeggieBurgerFactory extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}

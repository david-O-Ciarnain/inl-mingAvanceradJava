package uppgift2.factory;

import uppgift2.produkt.BeefBurger;
import uppgift2.produkt.Burger;

public class BeefBurgerFactory extends Restaurant{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}

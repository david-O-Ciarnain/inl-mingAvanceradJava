package uppgift2;

import uppgift2.factory.BeefBurgerFactory;
import uppgift2.factory.Restaurant;

public class Two {

    public static void main(String[] args) {

        Restaurant restaurant = new BeefBurgerFactory();
        restaurant.createBurger().prepare();
    }
}

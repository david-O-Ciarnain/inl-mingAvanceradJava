package uppgift2.produkt;

public class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Your Veggie Burger is preparing");
    }
}

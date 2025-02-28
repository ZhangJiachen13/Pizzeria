public class app {

    public static void main(String[] args) throws Exception{
        Pizzeria pizzeria = new Pizzeria("DEF-SOH-099", "Mozzarella Cheese", 15.00, "Orange juice", "6");
       pizzeria.takeOrder("DEF-SOH-099","6","Orange juice", "6","Mozzarella Cheese", 15.00);
       pizzeria.special0fTheDay("Red sausage pizza", "cucumber", 3.99);
       pizzeria.processCardPayment("38465879376854");
    }
}

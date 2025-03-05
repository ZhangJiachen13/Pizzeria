public class app {
    public static void main(String[] args) throws Exception{
        Pizzeria pizzeria = new Pizzeria("DEF-SOH-099", "Mozzarella Cheese", 15.0, "6","Coke");
        pizzeria.takeOrder();
        
       pizzeria.special0fTheDay("Red sausage pizza", "cucumber", 3.99);
       

    }
}

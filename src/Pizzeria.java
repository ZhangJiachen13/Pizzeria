public class Pizzeria {
    public final String DFF_ORDER_ID = "DEF-SOH-099";
    public final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public final double DEF_ORDER_TOTAL = 15.00;
    
    public String storeAddress;
    public String storeEmail;
    public long storePhone;

    public String storeName;
    public String storeMenu;

    private String pizzaIngredients;
    private String pizzaPrice;
    private String sides;
    private String drinks;
    private String orderID;
    private double orderTotal;

    public Pizzeria(String DEF_ORDER_ID, String DEF_PIZZA_INGREDIENTS, double DEF_ORDER_TOTAL, String sides, String drinks){
           orderID = DEF_ORDER_ID;
           pizzaIngredients = DEF_PIZZA_INGREDIENTS;
           orderTotal = DEF_ORDER_TOTAL;
           this.sides = sides;
           this.drinks = drinks;

    }
    public void Pizza(String order_ID, String pizza_ingredients, double order_total){
           orderID = order_ID;
           pizzaIngredients = pizza_ingredients;
           orderTotal = order_total;

    }

    
    public String getPizzaIngredients(){
      return pizzaIngredients;
    }
    public void setPizzaIngredients(String pizzaIngredients){
      this.pizzaIngredients = pizzaIngredients;
    }
    public String getPizzaPrice(){
      return pizzaPrice;
    }
    public void setPizzaPrice(String pizzaPrice){
      this.pizzaPrice = pizzaPrice;
    }
    public String getSides(){
      return sides;
    }
    public void setSides(String sides){
      this.sides = sides;
    }
    public String getDrinks(){
      return drinks;
    }
    public void setDrinks(String drinks){
      this.drinks = drinks;
    }
    public String getOrderID(){
      return orderID;
    }
    public void setOrderID(String orderID){
      this.orderID = orderID;
    }
    public double getOrderTotal(){
      return orderTotal;
    }
    public void setOrderTotal(double orderTotal){
      this.orderTotal = orderTotal;
    }


    public void takeOrder(String id, String price,String Drinks, String Sides,String Ingredients, double total){
      
          orderID = id;
          pizzaIngredients = Ingredients;
            sides = Sides;
          pizzaPrice = price;
          drinks = Drinks;
          orderTotal = total;
          
     
          System.out.println("Order accepted!");

          System.out.println("Order is being prepared");

          try{
            Thread.sleep(5000);
          }catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
          }
          System.out.println("Your order is ready!");

          printReceipt();

    }
    public void makePizza(String Ingredients, String Sides){
            pizzaIngredients = Ingredients;
            sides = Sides;

    }
    private void printReceipt(){
      System.out.println("********RECEIPT********");

      System.out.println("Order ID:" + orderID);
      System.out.println("Order Ingredients:" + pizzaIngredients);
      System.out.println("Order Price:" + pizzaPrice);
      System.out.println("Order Sides:" + sides);
      System.out.println("Order Drinks:" + drinks);
      System.out.println("Order Total:" + orderTotal);
    }


    }


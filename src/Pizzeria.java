public class Pizzeria {
    
    
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


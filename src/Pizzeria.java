import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pizzeria {
    public final String DFF_ORDER_ID = "DEF-SOH-099";
    public final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public final double DEF_ORDER_TOTAL = 15.00;
    
   public String expiryDate;
   public int cvv;
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

    public void takeOrder(){
          Scanner input = new Scanner(System.in);
        
          
          System.out.println("Enter three ingredients for your pizza (use spaces to separate ingredients): ");
          
          String temp = input.nextLine();
          String ing1 = temp.split(" ")[0];
          String ing2 = temp.split(" ")[1];
          String ing3 = temp.split(" ")[2];
          
          System.out.println("Enter size of pizza (Small, Medium, Large): " );
          String pizzaSize = input.nextLine();
          
          System.out.println("Do you want extra cheese (Y/N): ");
          String extraCheese = input.nextLine();
          
          System.out.println("Enter one side dish (Calzone, Garlic bread, None): ");
          String sideDish = input.nextLine();
          
          System.out.println("Enter drinks(Cold Coffee, Cocoa drink, Coke, None): ");
          String drinks = input.nextLine();
          
          System.out.println("Would you like the chance to pay only half for your order? (Y/N): ");
          String wantDiscount = input.nextLine();
          if(wantDiscount.equalsIgnoreCase("Y") ){
            isItYourBirthday();
          }
            makeCardPayment();
          
           
          
        
     

          System.out.println("Order accepted!");

          System.out.println("Order is being prepared");

          try{
            Thread.sleep(5000);
          }catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
          }
          System.out.println("Your order is ready!");

          printReceipt(ing1, ing2, ing3,drinks,pizzaSize,extraCheese,sideDish);
    input.close();
    }




    public void isItYourBirthday(){
      Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate (YYYY-MM-DD):");
        String birthdate = input.nextLine();
        int year = Integer.parseInt(birthdate.substring(0, 4));
        int month = Integer.parseInt(birthdate.substring(5, 7));
        int day = Integer.parseInt(birthdate.substring(8, 10));
        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(dob,now);
        if(diff.getYears()<18&&dob.getMonthValue()==now.getMonthValue()&&dob.getDayOfMonth()==now.getDayOfMonth()){
          System.out.println("Congratulations! You pay only half the price for your order");
        }else{
          System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
        }
    
    }






    public void makeCardPayment(){
      Scanner scanner = new Scanner(System.in);
        
      System.out.println("Your card number: ");
      long cardNumber = scanner.nextLong();
      scanner.nextLine();
     
      
      System.out.println("Card's expiry date(YYYY-MM):");
      String expiryDate = scanner.nextLine();
       
      
      System.out.println("Card's cvv number: ");
      int cvv = scanner.nextInt();
    
      processCardPayment(cardNumber, expiryDate, cvv);
      scanner.close();
    }


    public void makePizza(String Ingredients, String Sides){
            pizzaIngredients = Ingredients;
            sides = Sides;

    }

    private void printReceipt(String ing1,String ing2,String ing3,String drinks,String pizzaSize,String extraCheese,String sideDish){
      System.out.println("********RECEIPT********");

      System.out.println("Order ID:" + orderID);
      System.out.println("Order Ingredients:" +ing1+" "+ing2+" "+ing3);
      System.out.println("Order Price:" + pizzaPrice);
      System.out.println("Order Sides:" + sides);
      System.out.println("Order Drinks:" + drinks);
      System.out.println("Order Total:" + orderTotal);
      System.out.println("Pizza Size: " + pizzaSize);
      System.out.println("Extra Cheese(Y/N): " + extraCheese);
      System.out.println("Side Dish: " + sideDish);
    }



          private int cardLength;
          private String blacklistedNumber = new String("12345678901234");
          private int firstCardDigit;
          private int lastFourDigits;
          private String cardNumberToDisplay;
          


    public void processCardPayment(long cardNumber,String expiryDate,int cvv){
        String cardNumberString = Long.toString(cardNumber);
        cardLength = cardNumberString.length();

            if(cardLength==14){

        System.out.println("Card accepted");
      }else{
        System.out.println("Invalid card");
      }
      
      char firstCard = cardNumberString.charAt(0);
      firstCardDigit = Integer.parseInt(String.valueOf(firstCard));
      
      if(cardNumberString.equals(blacklistedNumber)){
        System.out.println("Card is blacklisted,Please use another card");
        makeCardPayment();
        return;
      }

      String lastFourCard = cardNumberString.substring(cardNumberString.length() - 4);
      lastFourDigits = Integer.parseInt(String.valueOf(lastFourCard));
      cardNumberToDisplay =firstCardDigit+"*********" +lastFourDigits;
      System.out.println(cardNumberToDisplay);

    }
    public void special0fTheDay(String pizzaOfTheDay, String sideOfTheDay, double specialPrice){
      System.out.println("Special Of The Day");
      System.out.println("Pizza of the day:" + pizzaOfTheDay);
      System.out.println("Side of the day:" + sideOfTheDay);
      System.out.println("Special price:" + specialPrice);
    }


    }


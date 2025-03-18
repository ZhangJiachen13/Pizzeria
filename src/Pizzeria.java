import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

    //public Pizzeria(String DEF_ORDER_ID, String DEF_PIZZA_INGREDIENTS, double DEF_ORDER_TOTAL, String sides, String drinks){
         //  orderID = DEF_ORDER_ID;
           //pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        //   orderTotal = DEF_ORDER_TOTAL;
         //  this.sides = sides;
          // this.drinks = drinks;

   // }
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

    String ing1 =null;
    String ing2 = null;
    String ing3 = null;
    String pizzaSize = null;
    String extraCheese = null;
    String sideDish = null;

    enum PizzaSelection{
      PEPPERONI("Pepperoni", "Lots of pepperoni and extra cheese", 18),
      HAWAIIAN("Hawaiian", "Pineapple, ham, and extra cheese", 22),
      VEGGIE("Veggie", "Green pepper, onion, tomatoes, mushroom, and black olives", 25),
      BBQ_CHICKEN("BBQ Chicken", "Chicken in BBQ sauce, bacon, onion, green pepper, and cheddar cheese", 35),
      EXTRAVAGANZA("Extravaganza", "Pepperoni, ham, Italian sausage, beef, onions, green pepper, mushrooms, black olives, and extra cheese", 45);

      private  final String pizzaName;
      private  final String pizzaToppings;
      private  final int price;
         PizzaSelection(String pizzaName, String pizzaToppings, int price){
           this.pizzaName = pizzaName;
           this.pizzaToppings = pizzaToppings;
           this.price = price;
         }

          private String getPizzaName(){
            return pizzaName;
          }
          
          private String getPizzaToppings(){
            return pizzaToppings;
          }
         
          private int getPrice(){
            return price;
          }
          public String toString(){
            return "Pizza Name:"+ pizzaName+"\n"+"Pizza Toppings:"+pizzaToppings+"\n"+"price:"+price;
          }
      }
      enum PizzaToppings{
       
          HAM("Ham", 2), 
         PEPPERONI("Pepperoni", 2),
          BEEF("Beef", 2),
          CHICKEN("Chicken", 2), 
         SAUSAGE("Sausage", 2),
          PINEAPPLE("Pineapple", 1),
          ONION("Onion", 0.5), 
         TOMATOES("Tomatoes", 0.4), 
         GREEN_PEPPER("Green Pepper", 0.5), 
         BLACK_OLIVES("Black Olives", 0.5), 
         SPINACH("Spinach", 0.5), 
         CHEDDAR_CHEESE("Cheddar Cheese", 0.8), 
         MOZZARELLA_CHEESE("Mozzarella Cheese", 0.8), 
         FETA_CHEESE("Feta Cheese", 1), 
         PARMESAN_CHEESE("Parmesan Cheese", 1);
          
        private final String topping;
        private final double toppingPrice;
        
        PizzaToppings(String topping, double toppingPrice){
          this.topping = topping;
          this.toppingPrice = toppingPrice;
        }
        private String getTopping(){
          return topping;
        }
        
        private double getToppingPrice(){
          return toppingPrice;
        }
        public String toString(){
          return "Topping:"+topping+"\n"+"Topping Price:"+toppingPrice;
        }


      }
      enum PizzaSize{
        LARGE("Large", 10), 
        MEDIUM("Medium", 5),
         SMALL("Small", 0);

        private final String pizzaSize;
        private final int addToPizzaPrice;
        PizzaSize(String pizzaSize, int addToPizzaPrice){
          this.pizzaSize = pizzaSize;
          this.addToPizzaPrice = addToPizzaPrice;
        }
          private String getPizzaSize(){
          return pizzaSize;
        }
          private double getAddToPizzaPrice(){
          return addToPizzaPrice;
        }
        public String toString(){
          return "Pizza Size:"+pizzaSize+"\n"+"Add To Pizza Price:"+addToPizzaPrice;
        }
      }
      enum SideDish{
        CALZONE("Calzone", 15), 
       CHICKEN_PUFF("Chicken Puff", 20),
        MUFFIN("Muffin", 12),
        NOTHING("No side dish", 0);
        private final String sideDishName;
        private final int addToPizzaPrice;
        private String getSideDishName() {
          return sideDishName;
        }
        private int getAddToPizzaPrice() {
          return addToPizzaPrice;
        }
        SideDish(String sideDishName, int addToPizzaPrice){
          this.sideDishName = sideDishName;
          this.addToPizzaPrice = addToPizzaPrice;
        }
        public String toString(){
          return "Side Dish Name:"+sideDishName+"\n"+"Add To Pizza Price:"+addToPizzaPrice;
        }
        }
        
        enum Drinks{
        COCA_COLA("Coca Cola", 8), 
       COCOA_DRINK("Cocoa Drink", 10),
        NOTHING("No drinks", 0);

        private final String drinkName;
        private final int addToPizzaPrice;
        Drinks(String drinkName, int addToPizzaPrice){
          this.drinkName = drinkName;
          this.addToPizzaPrice = addToPizzaPrice;
        }
        private String getDrinkName() {
          return drinkName;
        }
        private int getAddToPizzaPrice() {
          return addToPizzaPrice;
        }
        public String toString(){
          return "Drink Name:"+drinkName+"\n"+"Add To Pizza Price: "+addToPizzaPrice;
        }
        }

        private final double PIZZA_BASE_PRICE = 10.0;

        private String[] pizzasOrdered = new String[10];
        private String[] pizzaSizesOrdered = new String[10];
        private String[] sideDishesOrdered = new String[10];
        private String[] drinksOrdered = new String[20];

        private double totalOrderPrice = 0.0;
  

    public void takeOrder(){
      Scanner input = new Scanner(System.in);
      boolean continueOrdering = true;
      int orderIndex = 0;
      System.out.println(" Welcome to Slice-o-Heaven Pizzeria. Here's what we serve:");
    int pizzaIndex = 1;
    for (PizzaSelection pizza : PizzaSelection.values()) {
        System.out.println(pizzaIndex + ". " + pizza.toString());
        pizzaIndex++;
    }
    System.out.println(pizzaIndex + ". Custom Pizza with a maximum of 10 toppings that you choose: ");
    System.out.println("Please enter your choice(1-6): ");

    int pizzaOrdered = input.nextInt();
    input.nextLine(); 
    if(pizzaOrdered>6||pizzaOrdered<1){
      System.out.println("Invalid choice. Please pick a valid choice:");
      pizzaOrdered = input.nextInt();
      
    }
    if(pizzaOrdered>=1 || pizzaOrdered<=6){
       if(pizzaOrdered==6){
      System.out.println("You have selscted Custom Pizza.");
      System.out.println("Please pick up to 10 toppings from the following list: ");
      int toppingIndex = 1;
      for (PizzaToppings topping : PizzaToppings.values()) {
          System.out.println(toppingIndex + ". " + topping.toString());
          toppingIndex++;
      }

                Set<PizzaToppings> selectedToppings = new HashSet<>();
                double customPizzaPrice = PIZZA_BASE_PRICE;
                while (selectedToppings.size() <= 10) {
                    System.out.println("Enter the number of the topping you want to add (or 'done' to finish):");
                    String choiceStr = input.next();
                    if (choiceStr.equalsIgnoreCase("done")) {
                        break;
                    }
                    int toppingChoice = Integer.parseInt(choiceStr);
                    if (toppingChoice < 1 || toppingChoice > PizzaToppings.values().length) {
                        System.out.println("Invalid choice. Please enter a valid topping number.");
                        continue;
                    }
                    PizzaToppings selectedTopping = PizzaToppings.values()[toppingChoice - 1];
                    if (selectedToppings.contains(selectedTopping)) {
                        System.out.println("You've already chosen this topping.");
                        continue;
                    }
                    selectedToppings.add(selectedTopping);
                    customPizzaPrice += selectedTopping.getToppingPrice();
                }
                StringBuilder pizzaDescription = new StringBuilder("Custom Pizza with ");
                for (PizzaToppings topping : selectedToppings) {
                    pizzaDescription.append(topping.getTopping()).append(", ");
                }
                pizzaDescription.setLength(pizzaDescription.length() - 2); 
                pizzaDescription.append(" for €").append(customPizzaPrice);
                pizzasOrdered[orderIndex] = pizzaDescription.toString();
                totalOrderPrice+=customPizzaPrice;
                System.out.println("Your order is: "+pizzasOrdered[orderIndex]);
               
      
    }else{
      PizzaSelection selectedPizza = PizzaSelection.values()[pizzaOrdered-1];
      System.out.println("You have selscted "+selectedPizza.getPizzaName()+".");
      String pizzaDetails = selectedPizza.getPizzaName() + " Pizza with " + selectedPizza.getPizzaToppings() + ", for €" + selectedPizza.getPrice();
                pizzasOrdered[orderIndex] = pizzaDetails;
                totalOrderPrice += selectedPizza.getPrice();
                System.out.println("Your order is: "+pizzaDetails);
    }
    }
       System.out.println("Choose a pizza size:");
       int index = 1;
       for (PizzaSize size : PizzaSize.values()) {
        System.out.println(index + ". " + size.getPizzaSize() + " (" + size.getAddToPizzaPrice() + "€)");
        index++;
    }
       System.out.println("Please enter your choice (1 - 3):");
       int sizeChoice = input.nextInt();
      if (sizeChoice >= 1 && sizeChoice <= 3) {
        double customPizzaPrice = PIZZA_BASE_PRICE;
        PizzaSize selectedSize = PizzaSize.values()[sizeChoice - 1];
        pizzaSizesOrdered[0] = selectedSize.getPizzaSize();
        totalOrderPrice += selectedSize.getAddToPizzaPrice();
        customPizzaPrice += selectedSize.getAddToPizzaPrice();
        System.out.println("You have chosen " + selectedSize.getPizzaSize() + " size.");
    } else {
        System.out.println("Invalid choice. Defaulting to Small size.");
    }

        System.out.println("Choose a side dish:");
        index = 1;
       for (SideDish sideDish : SideDish.values()) {
        System.out.println(index + ". " + sideDish.getSideDishName() + " (" + sideDish.getAddToPizzaPrice() + "€)");
        index++;
    }
          System.out.println("Please enter your choice (1 - 4):");
          int sideDishChoice = input.nextInt();
    if (sideDishChoice >= 1 && sideDishChoice <= 4) {
        SideDish selectedSideDish = SideDish.values()[sideDishChoice - 1];
        sideDishesOrdered[0] = selectedSideDish.getSideDishName();
        totalOrderPrice += selectedSideDish.getAddToPizzaPrice();
        System.out.println("You have chosen " + selectedSideDish.getSideDishName() + " as a side dish.");
    } else {
        System.out.println("Invalid choice. No side dish selected.");
    }

        System.out.println("Choose a drink:");
        index = 1;
    for (Drinks drink : Drinks.values()) {
         System.out.println(index + ". " + drink.getDrinkName() + " (" + drink.getAddToPizzaPrice() + "€)");
      index++;
  }
        System.out.println("Please enter your choice (1 - 3):");
        int drinkChoice = input.nextInt();
    if (drinkChoice >= 1 && drinkChoice <= 3) {
      Drinks selectedDrink = Drinks.values()[drinkChoice - 1];
      drinksOrdered[0] = selectedDrink.getDrinkName();
      totalOrderPrice += selectedDrink.getAddToPizzaPrice();
      System.out.println("You have chosen " + selectedDrink.getDrinkName() + " as a drink.");
  } else {
           System.out.println("Invalid choice. No drink selected.");
  }
  input.nextLine();
  System.out.println("Do you want to place another order?(Y/N): ");
  String anotherOrder = input.nextLine();
  if(!anotherOrder.equalsIgnoreCase("Y")){
    continueOrdering = false;
  }else{
    orderIndex++;
  }
    
          /*Scanner input = new Scanner(System.in);
        
          
          System.out.println("Please pick any three of the following ingredients:\r\n" + //
                        " 1. Mushroom\r\n" + //
                        " 2. Paprika\r\n" + //
                        " 3. Sun-dried tomatoes\r\n" + //
                        " 4. Chicken\r\n" + //
                        " 5. Pineapple\r\n" + //
                        " Enter any three choices (1, 2, 3,…) separated by spaces: ");
          
          int ingChoice1=input.nextInt();
          int ingChoice2=input.nextInt();
          int ingChoice3=input.nextInt();
          
          if(ingChoice1<1||ingChoice1>5||ingChoice2<1||ingChoice2>5||ingChoice3<1||ingChoice3>5){
            System.out.println("Invalid choice(s). Please pick only from the given list:");
            takeOrder();
          }
        
          switch (ingChoice1) {
            case 1:
              ing1="Mushroom";
              break;
            case 2:
              ing1="Paprika";
              break;
            case 3:
              ing1="Sun-dried tomatoes";
            case 4:
              ing1="Chicken";
            case 5:
              ing1="Pineapple";
              break;
            default:
              break;
          }
        
          switch (ingChoice2) {
            case 1:
              ing2="Mushroom";
              break;
            case 2:
              ing2="Paprika";
              break;
            case 3:
              ing2="Sun-dried tomatoes";
            case 4:
              ing2="Chicken";
            case 5:
              ing2="Pineapple";
              break;
            default:
              break;
          }
       
          switch (ingChoice3) {
            case 1:
              ing3="Mushroom";
              break;
            case 2:
              ing3="Paprika";
              break;
            case 3:
              ing3="Sun-dried tomatoes";
            case 4:
              ing3="Chicken";
            case 5:
              ing3="Pineapple";
              break;
            default:
              break;
          }


          System.out.println(" What size should your pizza be?\n" + //
                        "1. Large\n" + //
                        "2. Medium\n" + //
                        "3. Small\n" + //
                        "Enter only one choice (1, 2, or 3):" );
          int sizeChoice=input.nextInt();
          
          switch (sizeChoice) {
            case 1:
              pizzaSize="Large";
              break;
            case 2:
              pizzaSize="Medium";
              break;
            case 3:
              pizzaSize="Small";
              break;
            default:
              break;
          }
          input.nextLine();
          System.out.println("Do you want extra cheese (Y/N): ");
          extraCheese = input.nextLine();
          

          System.out.println("Following are the side dish that go well with your pizza:\n" + //
                        "1. Calzone\n" + //
                        "2. Garlic bread\n" + //
                        "3. Chicken puff\n" + //
                        "4. Muffin\n" + //
                        "5. Nothing for me\n" + //
                        "What would you like? Pick one (1, 2, 3,…): ");
          int sideDishChoice = input.nextInt();
          
          switch (sideDishChoice) {
            case 1:
              sideDish="Calzone";
              break;
            case 2:
              sideDish="Garlic bread";
              break;
            case 3:
              sideDish="Chicken puff";
              break;
            case 4:
              sideDish="Muffin";
              break;
            case 5:
              sideDish="Nothing for me";
              break;
            default:
              break;
          }
          
          System.out.println("”Choose from one of the drinks below. We recommend Coca Cola:\r\n" + //
                        " 1. Coca Cola\r\n" + //
                        " 2. Cold coffee\r\n" + //
                        " 3. Cocoa Drink\r\n" + //
                        " 4. No drinks for me\r\n" + //
                        " Enter your choice: ");
          int drinksChoice = input.nextInt();
          
          switch (drinksChoice) {
            case 1:
              drinks="Coca Cola";
              break;
            case 2:
              drinks="Cold coffee";
              break;
            case 3:
              drinks="Cocoa Drink";
              break;
            case 4:
              drinks="No drinks for me";
              break;
            default:
              break;
          }
          input.nextLine();
          System.out.println("Would you like the chance to pay only half for your order? (Y/N): ");
          String wantDiscount = input.nextLine();
          if(wantDiscount.equalsIgnoreCase("Y") ){
            isItYourBirthday();
           } makeCardPayment();*/
          
           
     

          System.out.println("Order accepted!");

          System.out.println("Order is being prepared");

          try{
            Thread.sleep(5000);
          }catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
          }
          System.out.println("Your order is ready!");

       //  System.out.println(toString(orderID,ing1, ing2, ing3,drinks,pizzaSize,extraCheese,sideDish));
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
        while(diff.getYears()<5||diff.getYears()>120){
          System.out.println("Invalid date. You are either too young or too dead to order. \n" + //
                        "Please enter a valid date");
                        System.out.println("Enter your birthdate (YYYY-MM-DD):");
                         birthdate = input.nextLine();
                         year = Integer.parseInt(birthdate.substring(0, 4));
                         month = Integer.parseInt(birthdate.substring(5, 7));
                         day = Integer.parseInt(birthdate.substring(8, 10));
                         dob = LocalDate.of(year, month, day);
                         now = LocalDate.now();
                         diff = Period.between(dob,now);
        
        }
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
      
      System.out.println("Card's expiry date(YYYY-MM):");
      String expiryDate = scanner.nextLine();
      scanner.nextLine();
      
      boolean validExpiryDate = false;
       while (!validExpiryDate) {
           try{
                 String[] parts = expiryDate.split("-");
                  int year = Integer.parseInt(parts[0]);
                    int month = Integer.parseInt(parts[1]); 

              LocalDate expiry = LocalDate.of(year, month, 1);
               LocalDate now = LocalDate.now();

               if (expiry.isBefore(now)) {
                 System.out.println("Invalid expiry date. The date must be in the future. Please enter a valid date (YYYY-MM):");
                       expiryDate = scanner.nextLine();
               } else {
                 validExpiryDate = true;
               }
             } catch (Exception e) {
               System.out.println("Invalid format. Please enter the expiry date in YYYY-MM format:");
              expiryDate = scanner.nextLine();
           }
          }
       
      
      
  
      
         System.out.println("Card's cvv number: ");
         int cvv = scanner.nextInt();
    
      processCardPayment(cardNumber, expiryDate, cvv);
      scanner.close();
      
    }


    public void makePizza(String Ingredients, String Sides){
            pizzaIngredients = Ingredients;
            sides = Sides;

    }

   
    public String toString(){
      StringBuilder receipt = new StringBuilder();
      receipt.append("********RECEIPT********");
      receipt.append("Thank you for dining with Slice-0-Heaven Pizzeria.Your order details are as follows:\n");

      for(int i = 0;i <10;i++){
        if(pizzasOrdered[i] !=null){
            receipt.append(i+1).append(". ").append(pizzasOrdered[i]).append("\n");
            receipt.append(pizzaSizesOrdered[i]).append("\n");
            receipt.append(sideDishesOrdered[i]).append("\n");
            receipt.append(drinksOrdered[i]).append("\n");
            receipt.append("--------------------\n");
        }
      }
      receipt.append("ORDER TOTAL: €").append(totalOrderPrice).append("\n");
      return receipt.toString();
    }

      /*orderID = cardNumberToDisplay;
      StringBuilder receipt =new StringBuilder();
      receipt.append("********RECEIPT********\n");
      receipt.append("Order ID: ").append(orderID).append("\n");
      receipt.append("Order Ingredients: ").append(ing1).append(" ").append(ing2).append(" ").append(ing3).append("\n");

      receipt.append("Order Drinks: ").append(drinks).append("\n");
     // receipt.append("Order Total: ").append(orderTotal).append("\n");
      receipt.append("Pizza Size: ").append(pizzaSize).append("\n");
      receipt.append("Extra Cheese(Y/N): ").append(extraCheese).append("\n");
      receipt.append("Side Dish: ").append(sideDish).append("\n");
  
      return receipt.toString();*/
     
    



          private int cardLength;
          private long blacklistedNumber = 12345678901234L;
          private int firstCardDigit;
          private int lastFourDigits;
          private String cardNumberToDisplay;
          

    public void processCardPayment(long cardNumber,String expiryDate,int cvv){
      Scanner scanner = new Scanner(System.in);
        String cardNumberString = Long.toString(cardNumber);
        String blacklistedNumberString = Long.toString(blacklistedNumber);
        cardLength = cardNumberString.length();
        if(cardNumberString.equals(blacklistedNumberString)){
          System.out.println("Card is blacklisted,Please use another card");
          
        }
        while(cardLength!=14||cardNumber==blacklistedNumber){
          System.out.println("Invalid card number, please enter a new card number:");
          cardNumber = scanner.nextLong();
        }

            if(cardLength==14){

        System.out.println("Card accepted");
      }else{
        System.out.println("Invalid card");
      }
      
      char firstCard = cardNumberString.charAt(0);
      firstCardDigit = Integer.parseInt(String.valueOf(firstCard));
      
      

      String lastFourCard = cardNumberString.substring(cardNumberString.length() - 4);
      lastFourDigits = Integer.parseInt(String.valueOf(lastFourCard));
      cardNumberToDisplay =firstCardDigit+"*********" +lastFourDigits;
      System.out.println(cardNumberToDisplay);

    }
    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, double specialPrice){
      System.out.println("Special Of The Day");
      System.out.println("Pizza of the day:" + pizzaOfTheDay);
      System.out.println("Side of the day:" + sideOfTheDay);
      System.out.println("Special price:" + specialPrice);
    }

  }
    


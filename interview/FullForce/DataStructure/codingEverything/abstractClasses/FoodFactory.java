package Interview.FullForce.DataStructure.codingEverything.abstractClasses;

import java.util.Scanner;

abstract class Cuisine {
  public abstract Cuisine serveFood(String dish);
}

class UnservableCuisineRequestException extends Exception {
  public UnservableCuisineRequestException(String message) {
    super(message);
  }
}

class FoodFactory {
  Cuisine chinese;
  Cuisine italian;
  Cuisine japanese;
  Cuisine mexican;
  static FoodFactory foodFactory = new FoodFactory();

  static FoodFactory getFactory() {
    return foodFactory;
  }

  public void registerCuisine(String cuisineName, Cuisine cuisine) {
    if (cuisine instanceof Chinese)
      chinese = cuisine;
    else if (cuisine instanceof Italian)
      italian = cuisine;
    else if (cuisine instanceof Japanese)
      japanese = cuisine;
    else if (cuisine instanceof Mexican)
      mexican = cuisine;
  }

  public Cuisine serveCuisine(String cuisineKey, String dish) throws UnservableCuisineRequestException {
    if (cuisineKey.equals("Chinese"))
      return chinese.serveFood(dish);
    else if (cuisineKey.equals("Italian"))
      return italian.serveFood(dish);
    else if (cuisineKey.equals("Japanese"))
      return japanese.serveFood(dish);
    else if (cuisineKey.equals("Mexican"))
      return mexican.serveFood(dish);
    else throw new UnservableCuisineRequestException("Unservable cuisine " + cuisineKey + " for dish " + dish);
  }
}

class Chinese extends Cuisine {
  String dish;

  @Override
  public Cuisine serveFood(String dish) {
    this.dish = dish;
    return this;
  }

  public String getDish() {
    return dish;
  }
}

class Italian extends Cuisine {

  String dish;

  @Override
  public Cuisine serveFood(String dish) {
    this.dish = dish;
    return this;
  }

  public String getDish() {
    return dish;
  }
}

class Japanese extends Cuisine {

  String dish;

  @Override
  public Cuisine serveFood(String dish) {
    this.dish = dish;
    return this;
  }

  public String getDish() {
    return dish;
  }
}

class Mexican extends Cuisine {

  String dish;

  @Override
  public Cuisine serveFood(String dish) {
    this.dish = dish;
    return this;
  }

  public String getDish() {
    return dish;
  }
}

class Solution {
  private static final Scanner INPUT_READER = new Scanner(System.in);
  private static final FoodFactory FOOD_FACTORY = FoodFactory.getFactory();

  static {
    FoodFactory.getFactory().registerCuisine("Chinese", new Chinese());
    FoodFactory.getFactory().registerCuisine("Italian", new Italian());
    FoodFactory.getFactory().registerCuisine("Japanese", new Japanese());
    FoodFactory.getFactory().registerCuisine("Mexican", new Mexican());
  }

  public static void main(String[] args) {
    int numOfOrders = Integer.parseInt(INPUT_READER.nextLine());
    while (numOfOrders-- > 0) {
      String[] food = INPUT_READER.nextLine().split(" ");
      String cuisine = food[0];
      String dish = food[1];
      try {
        if (FOOD_FACTORY.equals(FoodFactory.getFactory())) {
          Cuisine servedFood = FOOD_FACTORY.serveCuisine(cuisine, dish);
          switch (cuisine) {
            case "Chinese":
              Chinese chineseDish = (Chinese) servedFood;
              System.out.println("Serving " + chineseDish.getDish() + " (Chinese)");
              break;
            case "Italian":
              Italian italianDish = (Italian) servedFood;
              System.out.println("Serving " + italianDish.getDish() + " (Italian)");
              break;
            case "Japanese":
              Japanese japaneseDish = (Japanese) servedFood;
              System.out.println("Serving " + japaneseDish.getDish() + " (Japanese)");
              break;
            case "Mexican":
              Mexican mexicanDish = (Mexican) servedFood;
              System.out.println("Serving " + mexicanDish.getDish() + " (Mexican)");
              break;
            default:
              break;
          }
        }
      } catch (UnservableCuisineRequestException e) {
        System.out.println(e.getMessage());
      }
    }
  }

}


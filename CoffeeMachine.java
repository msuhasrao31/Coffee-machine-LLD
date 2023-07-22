import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
    private Map<String, Ingredient> stock;
    private Map<String, Beverage> beverages;

    public CoffeeMachine() {
        stock = new HashMap<>();
        beverages = new HashMap<>();
    }

    public void addStock(String name, int quantity) {
        if (stock.containsKey(name)) {
            stock.get(name).addQuantity(quantity);
        } else {
            stock.put(name, new Ingredient(name, quantity));
        }
        System.out.println(name + " added to stock. Current quantity: " + stock.get(name).getQuantity());
    }

    public void prepare(String beverageName) {
        Beverage beverage = beverages.get(beverageName);
        if (beverage == null) {
            System.out.println("Beverage " + beverageName + " is not available.");
            return;
        }

        Map<String, Integer> requiredIngredients = beverage.getIngredients();
        boolean ingredientsAvailable = true;

        for (String ingredientName : requiredIngredients.keySet()) {
            Ingredient ingredient = stock.get(ingredientName);
            int requiredQuantity = requiredIngredients.get(ingredientName);

            if (ingredient == null || !ingredient.consumeQuantity(requiredQuantity)) {
                ingredientsAvailable = false;
                System.out.println("Insufficient " + ingredientName + " for " + beverageName);
            }
        }

        if (ingredientsAvailable) {
            System.out.println("Preparing " + beverageName);
        } else {
            System.out.println(beverageName + " cannot be prepared due to insufficient ingredients.");
        }
    }

    public void addBeverage(String name, Beverage beverage) {
        beverages.put(name, beverage);
    }

    public void getStock() {
        System.out.println("Current Stock:");
        for (Ingredient ingredient : stock.values()) {
            System.out.println(ingredient.getName() + " - " + ingredient.getQuantity());
        }
    }
}

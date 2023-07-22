import java.util.HashMap;
import java.util.Map;

public class Beverage {
    private String name;
    private Map<String, Integer> ingredients;

    public Beverage(String name) {
        this.name = name;
        this.ingredients = new HashMap<>();
    }

    public void addIngredient(String ingredient, int quantity) {
        ingredients.put(ingredient, quantity);
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }
}

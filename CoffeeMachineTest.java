public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // Adding initial stock
        coffeeMachine.addStock("hot_water", 500);
        coffeeMachine.addStock("hot_milk", 500);
        coffeeMachine.addStock("coffee_decoction", 100);
        coffeeMachine.addStock("sugar_syrup", 100);
        coffeeMachine.addStock("tea_leaves_syrup", 100);
        coffeeMachine.addStock("green_tea_syrup", 100);

        // Adding beverages
        Beverage hotTea = new Beverage("hot_tea");
        hotTea.addIngredient("hot_water", 200);
        hotTea.addIngredient("hot_milk", 100);
        hotTea.addIngredient("sugar_syrup", 30);
        hotTea.addIngredient("tea_leaves_syrup", 30);
        coffeeMachine.addBeverage("hot_tea", hotTea);

        Beverage hotCoffee = new Beverage("hot_coffee");
        hotCoffee.addIngredient("hot_water", 100);
        hotCoffee.addIngredient("hot_milk", 400);
        hotCoffee.addIngredient("coffee_decoction", 50);
        hotCoffee.addIngredient("sugar_syrup", 30);
        coffeeMachine.addBeverage("hot_coffee", hotCoffee);

        Beverage blackTea = new Beverage("black_tea");
        blackTea.addIngredient("hot_water", 300);
        blackTea.addIngredient("sugar_syrup", 20);
        blackTea.addIngredient("tea_leaves_syrup", 30);
        coffeeMachine.addBeverage("black_tea", blackTea);

        Beverage greenTea = new Beverage("green_tea");
        greenTea.addIngredient("hot_water", 200);
        greenTea.addIngredient("sugar_syrup", 20);
        greenTea.addIngredient("green_tea_syrup", 3);
        coffeeMachine.addBeverage("green_tea", greenTea);

        // Test case: Prepare beverages and check stock
        coffeeMachine.addStock("hot_water", 100);
        coffeeMachine.addStock("sugar_syrup", 200);
        coffeeMachine.getStock();
        coffeeMachine.prepare("black_tea");
        coffeeMachine.prepare("hot_coffee");
        coffeeMachine.getStock();
        coffeeMachine.prepare("green_tea");
        coffeeMachine.getStock();
    }
}

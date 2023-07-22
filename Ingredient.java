public class Ingredient {
    private String name;
    private int quantity;

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public boolean consumeQuantity(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
            return true;
        }
        return false;
    }
}

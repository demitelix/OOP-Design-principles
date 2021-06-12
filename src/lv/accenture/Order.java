package lv.accenture;

public class Order {
    private int countOfPizzas;
    private int countOfSushi;

    public int getCountOfPizzas() {
        return countOfPizzas;
    }

    public int getCountOfSushi() {
        return countOfSushi;
    }

    public Order(int pizzas, int sushi) {
        this.countOfPizzas = pizzas;
        this.countOfSushi = sushi;
    }
}

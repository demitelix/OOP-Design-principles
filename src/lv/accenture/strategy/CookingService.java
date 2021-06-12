package lv.accenture.strategy;

public class CookingService {
    private CookingStrategy cookingStrategy;

    public void setCookingStrategy(CookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    public void cook(){
        cookingStrategy.createFood();
    }
}

package lv.accenture.singleobjects;

import lv.accenture.Order;
import lv.accenture.adapter.OrderTime;
import lv.accenture.adapter.OrderTimeImpl;
import lv.accenture.facade.CreateOrderFacade;
import lv.accenture.strategy.CookingService;
import lv.accenture.strategy.CookingStrategy;
import lv.accenture.strategy.PizzaFactory;
import lv.accenture.strategy.SushiFactory;

public final class CallCenter implements CreateOrderFacade {
    private static CallCenter callCenter;
    private boolean isPaused;
    private int sushiOrderTime;
    private int pizzaOrderTime;

    private CallCenter() {
    }

    public static CallCenter getCallCenter(){
        if (callCenter == null) {
            callCenter = new CallCenter();
        }
        return callCenter;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public boolean isPaused() {
        return isPaused;
    }

    @Override
    public boolean createNewOrder(Order order) {
        if (isPaused) return false;
        CookingService cookingService = new CookingService();
        if (order.getCountOfPizzas() > 0){
            PizzaFactory pizza = new PizzaFactory();
            cookingService.setCookingStrategy(pizza);
            cookingService.cook();
            OrderTime orderTime = new OrderTimeImpl(pizza);
            pizzaOrderTime = orderTime.getMinutesToReceive();
        }
        if (order.getCountOfSushi() > 0) {
            SushiFactory sushiFactory = new SushiFactory();
            cookingService.setCookingStrategy(sushiFactory);
            cookingService.cook();
            OrderTime orderTime = new OrderTimeImpl(sushiFactory);
            sushiOrderTime = orderTime.getMinutesToReceive();
        }
        System.out.println("Order time "+Math.max(pizzaOrderTime,sushiOrderTime));
        return true;
    }
}

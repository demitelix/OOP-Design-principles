package lv.accenture.strategy;

import lv.accenture.adapter.TicketTime;

public class PizzaFactory implements CookingStrategy, TicketTime {
    @Override
    public void createFood() {
        System.out.println("Cooking pizza");
    }

    @Override
    public int getMinutesToReceive() {
        return 30;
    }
}

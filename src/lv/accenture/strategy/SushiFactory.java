package lv.accenture.strategy;

import lv.accenture.adapter.TicketTime;

public class SushiFactory implements CookingStrategy, TicketTime {
    @Override
    public void createFood() {
        System.out.println("Making sushi");
    }

    @Override
    public int getMinutesToReceive() {
        return 20;
    }
}

package lv.accenture;

import lv.accenture.command.StartWork;
import lv.accenture.command.StopWork;
import lv.accenture.singleobjects.CallCenter;
import lv.accenture.singleobjects.Director;

public class Main {

    public static void main(String[] args) {
        Order orderAll = new Order(1,1);
        Order orderWithoutPizza = new Order(0,1);
        Order orderOnlyPizza = new Order(1,0);

        CallCenter callCenter = CallCenter.getCallCenter();
        Director director = Director.getDirector();

        director.sendCommand(new StartWork(callCenter));
        System.out.println("Order status: "+callCenter.createNewOrder(orderWithoutPizza));
        System.out.println("Order status: "+callCenter.createNewOrder(orderOnlyPizza));
        director.sendCommand(new StopWork(callCenter));
        System.out.println("Order status: "+callCenter.createNewOrder(orderAll));
    }
}

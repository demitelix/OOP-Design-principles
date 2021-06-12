package lv.accenture.adapter;

public class OrderTimeImpl implements OrderTime{
    private TicketTime structureWithTicketTime;

    public OrderTimeImpl(TicketTime structureWithTicketTime) {
        this.structureWithTicketTime = structureWithTicketTime;
    }

    @Override
    public int getMinutesToReceive() {
        return convertToOrderTime(structureWithTicketTime.getMinutesToReceive());
    }

    private int convertToOrderTime(int time){
        return 20+time;
    }
}

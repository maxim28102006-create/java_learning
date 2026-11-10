package control2;

public class VipTicket extends Ticket{
    private String seat;

    public VipTicket(String event, int price, String seat){
        super(event, price);
        this.seat = seat;
    }

    public String getSeat(){
        return seat;
    }

    @Override
    public boolean discount(int percent) {
        return false;
    }
}

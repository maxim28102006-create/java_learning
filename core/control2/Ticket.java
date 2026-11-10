package control2;

import review1.Phone;

import java.util.Objects;

public class Ticket {
    private String event;
    private int price;
    private boolean sold;
    static final int MIN_PRICE = 100;

    public Ticket(String event, int price){
        this.event = event;
        this.price = Math.max(price, MIN_PRICE);
        this.sold = false;
    }

    public String getEvent(){
        return event;
    }

    public int getPrice() {
        return price;
    }

    public boolean getSold(){
        return sold;
    }

    public boolean sell(){
        if(sold == true){
            return false;
        }
        sold = true;
        return true;
    }

    public boolean discount(int percent){
        if(percent <= 0 || percent >= 100 || sold == true){
            return false;
        }
        int newprice = price - (price * percent) / 100;
        if (newprice < MIN_PRICE){
            price = MIN_PRICE;
        }else {
            price = newprice;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Ticket{event='" + event + "', price=" + price + ", sold=" + sold + "}";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket other = (Ticket) o;
        return Objects.equals(event, other.event) && Objects.equals(price, other.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, price);
    }
}


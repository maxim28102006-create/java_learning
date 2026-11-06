package control1;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private int quantity;

    Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int totalCost(){
        return price * quantity;
    }

    public boolean sell(int n){
        if(n > 0 && quantity >= n){
            quantity = quantity - n;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product other = (Product) o;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package control1;

public class ProductDemo {
    public static void main(String[] args) {
        Product item = new Product("Хлеб", 50, 10);

        System.out.println(item);
        System.out.println("Общая стоимость: " + item.totalCost());

        boolean Sold1 = item.sell(3);
        System.out.println("Продажа 3 шт: " + Sold1 + ", остаток: " + item.getQuantity());

        boolean Sold2 = item.sell(15);
        System.out.println("Продажа 15 шт: " + Sold2 + ", остаток: " + item.getQuantity());

        Product item2 = new Product("Хлеб", 80, 2);
        System.out.println("Равны ли товары? " + item.equals(item2));
    }
}

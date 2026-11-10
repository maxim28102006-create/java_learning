package review1;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new SmartPhone("Galaxy", 50, 10);
        System.out.println(p.call(5));
        System.out.println(p.getBattery());
        System.out.println(p.call(10));

        Phone n = new Phone("Nokia", 50);
        System.out.println(n.call(5));
        System.out.println(n.getBattery());
    }
}
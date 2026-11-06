package review1;

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car("Lada", 300, 8);
        System.out.println(c);                              // ?
        System.out.println(c.drive(100));                   // ?
        System.out.println(c.getFuel());                    // ?
        System.out.println(c.drive(1000));                  // ?
        System.out.println(c.getFuel());                    // ?
        c.refuel(100);
        System.out.println(c.getFuel());                    // ?
        System.out.println(c.equals(new Car("Lada", 5, 6)));  // ?
    }
}
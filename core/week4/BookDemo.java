package week4;

public class BookDemo {
    public static void main(String[] args) {
        Book a = new Book("Дюна", 600);
        Book b = new Book("Дюна", 600);
        Book c = new Book("Дюна", 412);

        System.out.println(a);               // Book{title='Дюна', pages=600}
        System.out.println(a == b);          // false
        System.out.println(a.equals(b));     // true
        System.out.println(a.equals(c));     // false
        System.out.println(a.equals(null));  // false
        System.out.println(a.hashCode() == b.hashCode());          // true

        java.util.HashSet<Book> shelf = new java.util.HashSet<>();
        shelf.add(a);
        System.out.println(shelf.contains(new Book("Дюна", 600)));  // true
    }
}
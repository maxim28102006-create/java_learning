package week1;

public class Playground {
    static int square(int x){
        return x * x;
    }

    static boolean isEven(int x){
        return x % 2 == 0;
    }

    static void greet(String name){
        System.out.println("Привет " + name);
    }

    static int min(int a, int b){
        if (a < b){
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(square(5));          // 25
        System.out.println(isEven(4));          // true
        System.out.println(isEven(7));          // false
        greet("Максим");                        // Привет Максим
        greet("Аня");
        System.out.println(min(3, 7));          // 3
        System.out.println(min(-2, -9));        // -9
        System.out.println(square(min(3, 7)));  // 9
    }

}
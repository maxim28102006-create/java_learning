package week3;

public class Zoo {
    public static void main(String[] args){
        Animal[] zoo = {
                new Dog("Рекс"),
                new Cat("Мурка"),
                new Dog("Бобик"),
                new Animal("Зверь")

        };
        for (Animal a : zoo){
            a.sound();
        }
    }
}

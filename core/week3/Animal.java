package week3;

public class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    void sound(){
        System.out.println(name + " Издает звук");
    }
}

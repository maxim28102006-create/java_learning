package week3;

public class ShapesControl {
    public static void main(String[] args){
        Shape[] shapes = { new Circle(1), new Rect(3, 4), new Circle(2)};
        double sum = 0;
        for (Shape s: shapes){
            s.print();
            sum = sum + s.area();
        }
        System.out.println(sum);

    }
}

abstract class Shape{
    abstract double area();
    void print(){
        System.out.println("Площадь: " + area());
    }
}

class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    @Override
    double area(){
        return 3.14*r*r;
    }
}

class Rect extends Shape{
    double w;
    double h;
    Rect(double w, double h){
        this.h = h;
        this.w = w;
    }
    @Override
    double area(){
        return w * h;
    }
}

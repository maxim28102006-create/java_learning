package week3;

public class Rectangle {
    int width = 0;
    int height = 0;
    int area(){
        return width * height;
    }
    int perimeter(){
        return (width + height) * 2;
    }
    boolean isSquare(){
        if (width == height){
            return true;
        }
        return false;
    }
    void printInfo() {
        System.out.println(width + " x " + height + ", площадь " + area());
        System.out.println("периметр " + perimeter());
        System.out.println("квадрат: " + isSquare());
    }

}


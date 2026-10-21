package week3;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    Rectangle(int side){
        this.width = side;
        this.height = side;
    }

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


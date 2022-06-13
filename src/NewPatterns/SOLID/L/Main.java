package NewPatterns.SOLID.L;

public class Main {
    static Rectangle getRect() {
        return new Rectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(10);
        rectangle.setWidth(15);
        System.out.println(rectangle.getSquare());
    }
}

interface Shape {
    int getSquare();
}

class Rectangle implements Shape{
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquare() {
        return height * width;
    }
}

class Square implements Shape {
    int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getSquare() {
        return width * width;
    }
}
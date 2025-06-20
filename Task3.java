abstract class Shape {
    protected int numberOfLines;
    protected String penColor;
    protected String fillColor;

    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }

    public abstract void draw();
}

class Circle extends Shape {
    public Circle(String penColor, String fillColor) {
        super(0, penColor, fillColor); // A circle has no lines
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with pen color " + penColor + " and fill color " + fillColor);
    }
}

class Square extends Shape {
    public Square(String penColor, String fillColor) {
        super(4, penColor, fillColor); // A square has 4 lines
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with pen color " + penColor + " and fill color " + fillColor);
    }
}

class Triangle extends Shape {
    public Triangle(String penColor, String fillColor) {
        super(3, penColor, fillColor); // A triangle has 3 lines
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with pen color " + penColor + " and fill color " + fillColor);
    }
}

public class Task3{
    public static void main(String[] args) {
        Shape circle = new Circle("Red", "Blue");
        Shape square = new Square("Green", "Yellow");
        Shape triangle = new Triangle("Black", "White");

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
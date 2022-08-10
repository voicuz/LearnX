// Create an abstract class.
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // A default constructor.
    TwoDShape() {
        width = height = 0;
        name = "none";
    }

    // Parametrized constructor.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct an object with equal width and height.
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Construct an object from an object.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }


    void showDim() {
        System.out.println("Width and height are: " + width + " and " + height);
    }

    // Now area() is abstract.
    abstract double area();
}

// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w1, double h2) {
        super(w1, h2, "triangle"); // call superclass constructor
        style = s;
    }

    Triangle(double x) {
        super(x, "triangle");
        style = "filled";
    }

    // Construct an object from an object.
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        System.out.print("Area of triangle is: ");
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is: " + style);
    }
}

// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double w1, double h2) {
        super(w1, h2, "rectangle"); // call superclass constructor
    }

    // Construct a square
    Rectangle(double x) {
        super(x, "rectangle");
    }

    // Construct an object from an object.
    Rectangle(Triangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getHeight() == getWidth()) return true;
        return false;
    }

    // Override area() for Rectangle.
    double area() {
        System.out.print("Area of rectangle is: ");
        return getHeight() * getWidth();
    }
}

// A subclass of TwoDShape for circles.
class Circle extends TwoDShape {

    Circle() {
        super();
    }

    Circle(double r) {
        super(r, "circle");
    }

    Circle(Circle ob) {
        super(ob);
    }

    double area() {
        System.out.println("Area of circle is: ");
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }

}

/*
// Extend Triangle.
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, int w, int h) {
        super(s, w, h);

        color = c;
    }

    String getColor() { return color; }
    void showColor() {
        System.out.println("Color is " + color);
    }
}

 */


class DynShapes {
    public static void main(String[] args) {
        TwoDShape[] shapes = new TwoDShape[5];

        shapes[0] = new Triangle("outlined", 8, 12);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7);
        shapes[4] = new Circle(12);

        for(int i=0; i < shapes.length; i++) {
            System.out.println("Object is " + shapes[i].getName());
            System.out.println(shapes[i].area());
            System.out.println();
        }
    }
}



/*

class Shapes7 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("outlined", 8, 12);

        // make a copy of t1
        Triangle t2 = new Triangle(t1);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is: " + t2.area());

    }
}


class Shapes {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Blue", "filled", 8, 12);
        ColorTriangle t2 = new ColorTriangle("Red", "outlined", 2, 2);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is: " + t2.area());

    }
}

 */